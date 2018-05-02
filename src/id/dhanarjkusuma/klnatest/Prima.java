package id.dhanarjkusuma.klnatest;

import java.util.Scanner;

public class Prima {
    private static int i = 1;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        while(i <= length){
            if(checkPrima(i)){
                sb.append(i).append(", ");
            }
            i++;
        }
        System.out.println(sb.toString().substring(0, sb.length() - 2));

    }

    private static boolean checkPrima(int number){
        if(number == 1){
            return true;
        }
        int i = 2;
        while(i < number){
            if(number % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
