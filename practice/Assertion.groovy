package com.practice

class Assertion {
    static  void main(String [] args) {
        as1()
    }

        static void as1()
        {
            int number = -1
            //int number=5          //here no statement is printed because the condition is true then it runs successfully because of assert keyword
            assert number>0 : " the number should be greater than 0   $number"

        }

}
