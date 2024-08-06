package com.practice
class Calculator {
        static int Calculate(int num1, int num2, String operator ){
            switch(operator){
                case '+':
                    return num1+num2
                case '-':
                    return num1-num2
                case '*':
                    return num1*num2
                case '/':
                    try{
                        num2==0
                    }
                    catch(ArithmeticException e){
                        println "$e"
                    }
                    return num1/num2
                case '%':
                    return num1%num2
                default:
                    print "Invalid operator"
            }
        }
    static void main(String[] args){
        def Scanner =new Scanner(System.in)
        println "enter rhe first number"
        def num1=Scanner.nextInt()
        println "enter rhe operator(+,-,*,/,%):"
        def operator=Scanner.next()
        println "enter the second number"
        def num2=Scanner.nextInt()
        def result =Calculate(num1, num2,operator)
                print "$result"
    }
}
