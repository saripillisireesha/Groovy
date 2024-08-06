package com.practice

class Perfect {
//    static boolean per(number){
//        def i
//        def sum=0
//        for(i=1; i<=number/2;i++ ){
//           if(number%i==0){
//               sum=sum+i
//           }
//        }
//        return sum==number
//    }
//    static void main(String []args){
//        def number=6
//        if(per(number)){
//            println "$number is a perfect number"
//
//        }
//        else{
//            println "$number is not a perfect number"
//        }


enum Classification {
PERFECT, ABUNDANT, DEFICIENT
}

static Classification classify(int number) {
if (number <= 0) {
throw new IllegalArgumentException("Number must be positive")
}

int sum = 0
for (int i = 1; i <= number / 2; i++) {
if (number % i == 0) {
sum += i
}
}

if (sum == number) {
return Classification.PERFECT
} else if (sum > number) {
return Classification.ABUNDANT
} else {
return Classification.DEFICIENT
}
}
static void main(String []args){
println classify(6)
}
}


