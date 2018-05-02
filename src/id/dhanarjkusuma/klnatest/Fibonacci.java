package id.dhanarjkusuma.klnatest;

import java.util.Scanner;

public class Fibonacci {
    // first number
    private static int i = 0;
    // second number
    private static int j = 1;
    // string
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        if(length >= 0){
            sb.append(i).append(", ");
        }

        while(j <= length){
            sb.append(j).append(", ");
            int tmp = i;
            i = j;
            j += tmp;
        }
        System.out.println(sb.toString().substring(0, sb.length() - 2));
    }
}
