package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");
        int total = 202 + 118 + 2250 + 1680 + 1075 + 80;
        System.out.println("Income: " + total);
        System.out.println("Staff expenses:");
        Scanner sc = new Scanner(System.in);
        int se = sc.nextInt();
        System.out.println("Other expenses:");
        int oth = sc.nextInt();
        int totCost = total - se - oth;
        System.out.println("Net income: " + totCost);
    }
}
