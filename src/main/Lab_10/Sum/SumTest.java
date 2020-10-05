package main.Lab_10.Sum;

import java.util.Scanner;

public class SumTest {
    public static void main(String[] args) {
        Sum sum = new Sum();
        Scanner console = new Scanner(System.in);
        System.out.print("K: ");
        int k = console.nextInt();
        sum.setK(k);
        System.out.print("S: ");
        int s = console.nextInt();
        sum.setS(s);

        sum.Count();
    }
}
