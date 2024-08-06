package com.practice
import java.util.*;
class BigEvenDigit {
    static void main(String[] args){
        def scanner=new Scanner(System.in)
        println "enter the number"
        def number=scanner.nextInt()
        int max=0
        while(number>0){
            int r=number%10
            if(r%2==0) {
                if (r > max) {
                    max = r
                }
            }
            number=number/10 as int
        }
            println "$max"
        }
    }

