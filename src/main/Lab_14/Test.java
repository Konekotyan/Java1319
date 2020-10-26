package main.Lab_14;

import java.util.Random;

public class Test {
    public static void main(String []args){
        Random random = new Random();
        SortS sort = new SortS();
        Student found;
        Student a = new Student(2000);

        System.out.println("Быстрая сортировка.");
        int k = random.nextInt(20);
        Student[] students = new Student[k];
        for (int i = 0;i < students.length;i++){
            int m = random.nextInt(100);
            students[i]= new Student(m);
        }
        sort.quicksort(students,0,students.length-1);
        System.out.println("Отсортированный массив по убыванию");

        for (Student student : students) {
            System.out.print(student.getID() + " ");
        }
        System.out.println();
        if (sort.recursialinearSearch(students,a,0)== null)
            System.out.println("Такого числа не нашлось");
        else{
            found =(Student)sort.recursialinearSearch(students,a,0);
            System.out.println("Число нашлось "+found.getID());
        }
        int l = 4000;
        students = new Student[l];

        for (int i = 0; i < students.length;i++){

            students[i] = new Student(i);
        }

        sort.quicksort(students,0,students.length-1);
        long start = System.nanoTime();
        found = (Student)sort.binarySearch(students,a);
        long finish = System.nanoTime();
        long time = finish - start;
        System.out.println("Бинарный = "+ String.format("%,2d",time)+"ns");

        start = System.nanoTime();
        found = (Student)sort.recursialinearSearch(students,a,0);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Рекурсивный бинарный = "+ String.format("%,2d",time)+"ns");

        start = System.nanoTime();
        found = (Student)sort.linearSearch(students,a);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Линейный = "+ String.format("%,2d",time)+"ns");

        start = System.nanoTime();
        found = (Student)sort.recursialinearSearch(students,a,0);
        finish = System.nanoTime();
        time = finish - start;
        System.out.println("Рекурсивный линейный = "+ String.format("%,2d",time)+"ns");
    }
}

