package com.practice

class Salary1 {
    String name
    int salary
    String department
    int age

    Salary1(String name, int salary, String department, int age){
        this.name=name
        this.salary=salary
        this.department=department
        this.age=age
    }
    @Override
    public String toString() {
        return "Salary1{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}
