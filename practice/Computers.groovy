package com.practice

import java.util.stream.Collectors

class Computers {
    String name
    String company
    int price

    Computers(String name, String company, int price) {
        this.name = name
        this.company = company
        this.price = price
    }

    String toString() {
        return "Name: ${name}, Company: ${company}, Price: ${price}"
    }

    static void main(String[] args) {
        def computers = [
                new Computers("XPS 13", "Dell", 999),
                new Computers("MacBook Pro", "Apple", 2399),
                new Computers("Spectre x360", "HP", 1299),
                new Computers("ThinkPad X1 Carbon", "Lenovo", 1449),
                new Computers("Carbon", "Dell", 2500)

        ]
//        println "Computer Inventory:"
  //      computers.each { computer -> println(computer)}
        def items = computers.stream().filter {
            it.company.equalsIgnoreCase("DELL")}.filter { it.price > 2000 }.collect(Collectors.toList())
            println items
        }
    }
