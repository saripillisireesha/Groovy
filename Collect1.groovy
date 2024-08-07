package com.practice

import java.util.concurrent.ExecutionException
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

class Collect1 {
    static void main(String[] args) {
        def people1 = [
                new Person1("sireesha", 60000, "developer"),
                new Person1("keerthana", 40000, "tester"),
                new Person1("himaja", 50000, "developer"),
                new Person1("naveen", 70000, "Hr"),
                new Person1("joshith", 80000, "developer"),
                new Person1("vedadri", 90000, "tester"),
                new Person1("jaisri", 30000, "Hr"),
                new Person1("latha", 70000, "tester"),
                new Person1("srvani", 95000, "developer")
        ]

        def executor = Executors.newFixedThreadPool(2)

        def task1 = {
            try {
                println Thread.currentThread().name
                def li2 = people1.stream().max { a, b -> a.name.length() <=> b.name.length() }
                li2.stream().forEach { System.out::println }
                println "$li2"

                // Simulate long computation
                TimeUnit.SECONDS.sleep(10) // Long sleep to simulate a long-running task

                // Check if the thread was interrupted
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException("Task was interrupted")
                }

            } catch (InterruptedException e) {
                println "Caught InterruptedException: "
                // Optional: handle the interruption here
            }
        }

        def task2 = {
            println Thread.currentThread().name

            def li3 = people1.stream().min { a, b -> a.name.length() <=> b.name.length() }
            li3.stream().forEach { System.out::println }

            println "$li3"
        }
        def task3= {
            List<Person1> li = people1.findAll { person -> person.salary >= 80000 && person.salary <= 100000 }
            System.out.println(li)
        }
        Future<?> future1 = executor.submit(task1)
        println "Submitted task1"


        // Wait a bit before interrupting
        Thread.sleep(2000) // Allow task1 to start

        // Interrupt the thread running task1
        executor.shutdownNow() // This will attempt to cancel all running tasks
        println "Shutdown initiated"


            future1.get()

        // Submit task2 after task1
        Future<?> future2 = executor.submit(task2)
       future2.get()
        Future<?> future3 = executor.submit(task3)

        future3.get()


        executor.shutdown()
    }
}


