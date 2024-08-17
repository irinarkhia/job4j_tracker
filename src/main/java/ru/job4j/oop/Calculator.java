package ru.job4j.tracker.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int a) {
        return x + a;
    }

    public static int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        result = multiply(5);
        System.out.println(result);
        result = minus(89);
        System.out.println(result);
        Calculator asd = new Calculator();
        result = asd.divide(6);
        System.out.println(result);
        result = asd.sumAllOperation(7);
        System.out.println(result);
    }
}
