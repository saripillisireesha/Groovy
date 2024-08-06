package com.practice

class EvenInList {
    static void main (String [] args){
        int numbers=[1,3,4,5,87,98,65,8,9]
        def list=numbers.stream().filter{it.number%2==0}
    }
}
