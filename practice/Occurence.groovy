package com.practice

class Occurence {
    static void main(String[] args) {

        int i, j
        def Scanner = new Scanner(System.in)
        println "enter the array size:"
        int number = Scanner.nextInt()
        println "enter numbers"
        def arr = new int[100]
        for (i = 0; i < number; i++) {
            arr[i] = Scanner.nextInt()
        }
        for (i = 0; i < number; i++) {
            int count = 0;

            for (j = 0; j < number; j++) {
                if (arr[i] == arr[j]) {
                    count++
                }
            }
            for (j = 0; j < number; j++) {
                if (arr[i] == arr[j] && i > j) {
                    break
                }
                if (arr[i] == arr[j]) {
                    println "Element: ${arr[i]}, Count: ${count}"
                    break;
                }
            }
        }
    }
}