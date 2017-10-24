package com.company;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int palindrome = 0, checkPal = 0, count = 0 , num1, num2, num3, num4, num5, num6;
        for (int j = 999; j >= 100; j--) {
            for (int i = j; i >= 100; i--) {
                if (i*j < palindrome){ break;}
                num1 = i*j / 100000 % 10;
                num2 = i*j / 10000 % 10;
                num3 = i*j / 1000 % 10;
                num4 = i*j / 100 % 10;
                num5 = i*j / 10 % 10;
                num6 = i*j % 10;
                if ((num1 == num6) & (num2 == num5) & (num3 == num4)) {
                    checkPal = j * i;
                    break;
                }
            }
            if (checkPal > palindrome){ palindrome = checkPal;}
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("The largest palindrome is: " + Integer.toString(palindrome));
        System.out.println("The program was implemented " + timeSpent + " milliseconds");
    }
}
