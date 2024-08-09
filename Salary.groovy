package com.practice

import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.function.Predicate
import java.util.stream.Collectors

class Salary {
    static void main(String []args)
    {
        List<Salary1> salary=Arrays.asList(
                new Salary1("sireesha", 56000, "Hr", 292),
                new Salary1("Jaisri", 60000, "Manager", 21),
                new Salary1("Vedadri", 76000, "Developer", 30),
                new Salary1("Keerthana", 80000, "Hr", 28),
                new Salary1("Joshith", 60000, "TeamLead", 24),
                new Salary1("Himaja", 40000, "Tester", 22),
                new Salary1("Naveen", 25000, "Developer", 21),
                new Salary1("Hema", 35000, "Manager", 20),
                new Salary1("Shiva", 56000, "Hr", 43),
                new Salary1("Mani", 78000, "Tester", 31),
                new Salary1("Bhavani", 55000, "TeamLead", 25),
                new Salary1("Latha", 80000, "Manager", 27),
                new Salary1("Naidu", 20000, "Developer", 32),
                new Salary1("Bhushan", 90000, "Tester", 42)
        )
        def executor= Executors.newFixedThreadPool(4)
        def task1= {
            println Thread.currentThread().name
            String dep = "Hr"
            Predicate<Salary1> li = e -> !e.getDepartment().equalsIgnoreCase(dep)
            salary.stream().filter(li).forEach(System.out::println)
            println Thread.currentThread().name +"waiting task1"
            Thread.sleep(4000)
            println Thread.currentThread().name +"Task1 Completed"
        }
        def task2={

            println Thread.currentThread().name
            Map<String,List<Salary1>> li1=salary.groupBy {it.department}
            li1.forEach(department, emplist)->{
                println "${department} ${emplist}"
            }
            println Thread.currentThread().name +"waiting task2"
            Thread.sleep(4000)
            println Thread.currentThread().name +"task2 is completed"

        }
        def task3 = {
            println Thread.currentThread().name

            def averageSalaries = salary.groupBy { it.department}
                    .collectEntries { department, employees ->
                        def avgSalary = employees.collect { it.salary }.sum() / employees.size()
                        [department, avgSalary]
                    }
            averageSalaries.each { department, avgSalary ->
                println "${department}: ${String.format('%.3f', avgSalary)}"
            }
            println Thread.currentThread().name +"waiting task3"
            Thread.sleep(4000)
            println Thread.currentThread().name +"task3 is completed"
        }
        def task4 = {
            def highestSalaryEmployees = salary.groupBy { it.department }
                    .collectEntries { department, employees ->
                        def highestPaid = employees.max { a, b -> a.salary <=> b.salary }
                        [department, highestPaid]
                    }
            highestSalaryEmployees.each { department, employee ->
                println "${department}: ${employee != null ? employee : 'no employee'}"
            }
        }


        Future<?> firstTask=executor.submit(task1)
        firstTask.get()
        Future<?> secondTak=executor.submit (task2)
        secondTak.get()
        Future<?> thirdTak=executor.submit (task3)
        thirdTak.get()
        Future<?> fourTak=executor.submit (task4)
        fourTak.get()

        executor.shutdown()

    }
}
