package codewithrushi;

import java.util.Scanner;

public class Nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        boolean flag = true;
        System.out.println("Welcome Rushi!");
        while (flag) {
            try {

                try {
                    Scanner sc = new Scanner(System.in);
                    int ind = sc.nextInt();
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program!");
    }
}
