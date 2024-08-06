//package com.practice
//
//class AlternatePrime {
//    static void main(String [] args){
//        def Scanner=new Scanner(System.in)
//        println "enter one number"
//
//        int number=Scanner.nextInt()
//         def array=[] as int
//        int k=0
//        for(int i=2; i<number; i++){
//            int count=0
//            for(int j=1; j<=i; j++){
//                if(i%j==0){
//                    count++
//                }
//            }
//
//        if(count==2) {
//            array[k]=i
//            k++
//            println  "${array[k]}"
//        }
//        }
//
//
//    }
//}




package com.practice

import java.util.Scanner

class AlternatePrime {
    static void main(String[] args) {
        def scanner = new Scanner(System.in)
        println "Enter a number:"

        int number = scanner.nextInt()
        def primes = [] // List to store prime numbers

        for (int i = 2; i < number; i++) {
            //boolean isPrime = true
            int count=1
            for (int j = 2; j <=i; j++) { // More efficient prime check     (or) we can use .add method
                if (i % j == 0) {
              //      isPrime = false
                    count++
                    //break
                }
            }

            if (count==2) {
                primes<<(i) // Store prime numbers in the list
            }
        }

        // Print all prime numbers
        println "Prime numbers up to ${number}:"
        primes.each { prime ->
            println prime
        }

        // Print alternate prime numbers
        println "Alternate prime numbers:"
        for (int i = 0; i < primes.size(); i += 2) {
            println primes[i]
        }
    }
}
