package edu.northeastern.utkarsh;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//The code snippet which is commented out is coarse grained locking which can be substituted by using the keyword "synchronized"

public class ThreadSafeLinkedList {

    private LinkedList<Integer> list = new LinkedList<>();

//    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public synchronized void add(int element) {
        list.add(element);
//        lock.writeLock().lock();
//        list.add(element);
//        lock.writeLock().unlock();
    }

    public synchronized void addAtPosition(int index, Integer element) {
        list.add(index, element);
//        lock.writeLock().lock();
//        list.add(index, element);
//        lock.writeLock().unlock();
    }

    public synchronized void removeAtPosition(Integer index){
        if (index >= 0 && list.size() >= index) {
            list.remove(index);
        }
//        lock.writeLock().lock();
//        list.remove(index);
//        lock.writeLock().unlock();
    }

    public synchronized Integer getFirst() {
        if (!list.isEmpty()) {
            return list.getFirst();
        }
        return null;
//        Integer e;
//        lock.readLock().lock();
//        e = list.getFirst();
//        lock.readLock().unlock();
//        return e;
    }

    public synchronized Integer getLast() {
        if (!list.isEmpty()) {
            return list.getLast();
        }
        return null;
//        Integer e;
//        lock.readLock().lock();
//        e = list.getLast();
//        lock.readLock().unlock();
//        return e;
    }

    public synchronized int size() {
        return list.size();
//        int size;
//        lock.readLock().lock();
//        size = list.size();
//        lock.readLock().unlock();
//        return size;
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