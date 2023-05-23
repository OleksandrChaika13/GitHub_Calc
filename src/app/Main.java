package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello GitHub world! It`s feeling great!");

        int a = 13;
        int b = 5;
        int c = add(a, b);
        System.out.println(c);
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
