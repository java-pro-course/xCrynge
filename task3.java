package com.company;
import java.util.Scanner;

public class Main {
    static String isPrime(int i){
        int c = 0;
        for(int j = 1; j < i;j++){
            if(i % j == 0){
                c++;
            }
        }
        if(c <= 2){
            return "Prime";
        }
        return "Not prime";
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
    }       System.out.println(isPrime(i));
    }

}
