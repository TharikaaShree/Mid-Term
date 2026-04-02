package com.util;
public class App {
    public static String checkOddEven(int n) { return (n % 2 == 0) ? "Even" : "Odd"; }
    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) { sum += Math.abs(n % 10); n /= 10; }
        return sum;
    }
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) { rev = rev * 10 + (n % 10); n /= 10; }
        return rev;
    }
}
