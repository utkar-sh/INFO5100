package edu.northeastern.utkarsh;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSafeLinkedList {

    private LinkedList<Integer> list = new LinkedList<>();

    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void add(int element) {
        lock.writeLock().lock();
        list.add(element);
        lock.writeLock().unlock();
    }

    public void addAtPosition(int index, Integer element) {
        lock.writeLock().lock();
        list.add(index, element);
        lock.writeLock().unlock();
    }

    public void removeAtPosition(Integer index){
        lock.writeLock().lock();
        list.remove(index);
        lock.writeLock().unlock();
    }

    public Integer getFirst() {
        Integer e;
        lock.readLock().lock();
        e = list.getFirst();
        lock.readLock().unlock();
        return e;
    }

    public Integer getLast() {
        Integer e;
        lock.readLock().lock();
        e = list.getLast();
        lock.readLock().unlock();
        return e;
    }

    public int size() {
        int size;
        lock.readLock().lock();
        size = list.size();
        lock.readLock().unlock();
        return size;

    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        ThreadSafeLinkedList threadSafeLinkedList = new ThreadSafeLinkedList();
        for(int val = 0; val < 3; val++) {
            service.submit(new Worker(threadSafeLinkedList, val));
        }
        service.shutdown();
        try {
            service.awaitTermination(10000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class Worker<Integer> implements Runnable{

        ThreadSafeLinkedList list;
        int value;

        public Worker(ThreadSafeLinkedList list, int val) {
            this.list = list;
            this.value = val;
        }

        @Override
        public void run() {
            for(int val = 0; val < 100; val++) {
                System.out.println(Thread.currentThread().getId());
                list.add(value);
            }

            list.addAtPosition(0, 4599);
            list.removeAtPosition(30);
            System.out.println(list.getFirst());
            list.addAtPosition(99, 999);
            System.out.println(list.getLast());

            System.out.println(list.size());
        }

    }
}