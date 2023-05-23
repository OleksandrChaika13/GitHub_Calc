package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculator for ants!");
        System.out.println("Version 1.0");
        int a = 13;
        int b = 5;
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }
}
