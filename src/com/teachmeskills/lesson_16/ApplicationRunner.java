package com.teachmeskills.lesson_16;

import com.teachmeskills.lesson_16.model.Student;

import java.util.*;
/*
Create a collection of passport numbers (String format).
Create a collection of students from our group.
Each collection should not contain duplicate elements.
Create a key-value collection, where the key is the passport number from the first collection, and the value is an object of the Student class from the second collection.
Loop through the key-value of the collection with a for-each loop and display the collection's elements on the screen.
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        Set<String> passportNumbers = new HashSet<>();
        Set<Student> students = new HashSet<>();

        for (; ; ) {
            passportNumbers.add("KH" + generateRandomDigits(7));
            if (passportNumbers.size() == 15) {
                break;
            }
        }
        students.add(new Student("Dmitriy"));
        students.add(new Student("Ilya"));
        students.add(new Student("Bogdan"));
        students.add(new Student("Igor"));
        students.add(new Student("Marina"));
        students.add(new Student("Daniil"));
        students.add(new Student("Sultan"));
        students.add(new Student("Georgi"));
        students.add(new Student("Kirill"));
        students.add(new Student("Kate"));
        students.add(new Student("Dmitry"));
        students.add(new Student("Rita"));
        students.add(new Student("Vlad"));
        students.add(new Student("Sergio"));
        students.add(new Student("Oleg"));

        Iterator<String> passportNumberIterator = passportNumbers.iterator();
        Iterator<Student> studentIterator = students.iterator();
        Map<String, Student> studentsData = new HashMap<>();

        while (passportNumberIterator.hasNext()) {
            studentsData.put(passportNumberIterator.next(), studentIterator.next());
        }

        studentsData.forEach((k, v) -> System.out.println(k + " -> " + v.getName()));

    }

    public static int generateRandomDigits(int n) {
        int m = (int) Math.pow(10, n - 1);
        return m + new Random().nextInt(9 * m);
    }
}
