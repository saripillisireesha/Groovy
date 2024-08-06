package com.practice

class Closures {
    static void main(String []args) {
        //closure1()
       // closure2()
        //closure3()
        closure4()
    }
    static void closure1(){
        def clo={println "hello welcome to groovy"}
        clo()
    }
     static void closure2() {
         def clo1 = { name -> println "hello $name" }
         clo1("sireesha")
     }
 //       def clos={name-> println "hello $name" }       // these two lines are in main method it is also works
  //      clos("keerthana")
     //}

    static void closure3(){
        def col2={a,b-> a+b}
        def result= col2(5,8)
        print result
    }
    static void closure4(){
        def x=10
        def result1={y->  println x+=y}
        result1(6)
    }
}
