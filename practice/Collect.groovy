package com.practice

import com.practice.Person

class Collect {
    static void main(String[] args) {
        def people = [
                new Person("sireesha", 60000, "developer"),
                new Person("keerthana", 40000, "tester"),
                new Person("himaja", 50000, "developer"),
                new Person("naveen", 70000, "Hr"),
                new Person("joshith", 80000, "developer"),
                new Person("vedadri", 90000, "tester"),
                new Person("jaisri", 30000, "Hr"),
                new Person("latha", 70000, "tester"),
                new Person("srvani", 95000, "developer")
        ]
        List<Person> li = people.findAll { person -> person.salary >= 80000 && person.salary <= 100000 }
        System.out.println(li)
//        def li2=people.stream().max {a,b->a.name.length()<=> b.name.length()}
//        //li2.stream().forEach {System.out::println}
//        def li3=people.stream().min {a,b->a.name.length()<=> b.name.length()}
//        //li3.stream().forEach {System.out::println}
//        println "$li2"
//        println "$li3"
        def li2 = people.stream().max { a, b -> a.name.length() <=> b.name.length() }
        li2.stream().forEach { System.out::println }
        def li3 = people.stream().min { a, b -> a.name.length() <=> b.name.length() }
        li3.stream().forEach { System.out::println }
        println "$li2"
        println "$li3"
//        people.each { person ->
//            // Create a new Person with the name in uppercase for printing
//            def upperCasePerson = new Person(person.name.toUpperCase(), person.salary, person.role)
//            println upperCasePerson.toString()
//        }


    }
}
