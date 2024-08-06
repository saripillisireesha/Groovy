package com.practice

class Armstrong {
    static boolean arms(int number){
        int sum=0
        int digits=String.valueOf(number).length()
        int temp=number
        while(temp>0){
            int r=temp%10
            sum=sum+r**digits
            temp=temp/10 as int
        }
        return sum==number

    }
    static void main(String []args ){
     def numbers=[424,9474,846,153,9865]
             numbers.each{num ->
                 if(arms(num)) {
                     println "$num is a armstrong number"
                 }
                     else{
                     println "$num is not a armstromg number"
                 }
             }
    }
}

