package com.practice

class RevesreOfNumber {
    static void main(String [] args){
        def number
        def Scanner =new Scanner(System.in)
        println "Enter number"

        number=Scanner.nextInt()
        int sum=0
        while(number>0){
            def r=number%10
            sum=sum*10+r
            //number=number/10                // it is normal way but in groovy we use below method
        //    number=(number/10).toInteger()          //here all values are in def or int your wish
            number=number.intdiv(10)
        }
        println sum
    }
}
