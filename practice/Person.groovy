package com.practice
class Person {
    String name
    int salary
    String role
    Person(String name, int salary, String role){
        this.name=name
        this.salary=salary
        this.role=role
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", role='" + role + '\'' +
                '}';
    }
}
