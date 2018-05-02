package id.dhanarjkusuma.klnatest;

import java.util.Scanner;

public class SplitCurrency {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(input.matches(".*[a-zA-Z]+.*")){
            System.out.println("Error Input !");
        }else{
            input = input.replace(".", "");
            char[] strings = input.toCharArray();
            for(int i=0; i<strings.length; i++){
                System.out.print(strings[i]);
                for(int j=0; j<strings.length-(i+1); j++){
                    System.out.print(0);
                }
                System.out.print("\n");
            }
        }
    }
}
