package main.Lab_13;

import java.util.Arrays;
import java.util.Random;

public class Tester {

    private static int a;

    public static Student getStudent() {
        Random random = new Random();
        return new Student(random.nextInt(500),
                random.nextInt(100) % 5,
                random.nextInt(100) % 5,
                random.nextInt(100) % 5,
                "name " + (a++),
                "group " + (a % 4));
    }

    public static void main(String[] args) {

        System.out.println(" ----------------- 1 -----------------");
        IDNumber arr1 = new IDNumber(10);
        for (int i = 0; i < 10; i++) {
            Student student = getStudent();

            arr1.add(student);
        }
        System.out.println(arr1);
        arr1.sort();
        System.out.println(arr1);

        System.out.println(" ----------------- 2 -----------------");
        Student[] arr2 = new Student[10];

        for (int i = 0; i < 10; i++) {
            Student student = getStudent();

            arr2[i] = student;
        }
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2, new SortingStudentsByGPA());
        System.out.println(Arrays.toString(arr2));
        }
}
