package com.northeastern.edu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Problem1 {
    public static void main(String args[]) throws ParseException {
        List<Student> listOfStudents = new ArrayList<Student>();

        Date birthDate1 = new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-18");
        listOfStudents.add(new Student(1, "Nitesh Kalra", 3.6, birthDate1));

        Date birthDate2 = new SimpleDateFormat("yyyy-MM-dd").parse("2020-04-27");
        listOfStudents.add(new Student(2, "Sahil Bansal", 3.5, birthDate2));

        Date birthDate3 = new SimpleDateFormat("yyyy-MM-dd").parse("2020-03-21");
        listOfStudents.add(new Student(3, "Ishan Dua", 3, birthDate3));

        Date birthDate4 = new SimpleDateFormat("yyyy-MM-dd").parse("2020-07-08");
        listOfStudents.add(new Student(4, "Abhisar Gautam", 3.2, birthDate4));

        Date birthDate5 = new SimpleDateFormat("yyyy-MM-dd").parse("2020-10-24");
        listOfStudents.add(new Student(5, "Gaurav Kansal", 3.4, birthDate5));

        Collections.sort(listOfStudents,new NameComparator());
        for(Student student1: listOfStudents) {
            System.out.println(student1.getName());
        }

        System.out.println("\n");
        Collections.sort(listOfStudents,new GPAComparator());
        for(Student sd1: listOfStudents){
            System.out.println(sd1.getGpa());
        }

        System.out.println("\n");
        Collections.sort(listOfStudents,new DOBComparator());
        for(Student sd1: listOfStudents){
            System.out.println(sd1.getDateOfBirth());
        }
    }
}
