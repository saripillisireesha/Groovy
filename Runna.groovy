package com.practice

class Runna {
    void printName(String name) {
        println "Name:${name}- running on ${Thread.currentThread().name}"
        println "Name:${name}- runni ${Thread.currentThread().name}"
        println "Name:${name}- ifjiodjioj ${Thread.currentThread().name}"


    }

    void printName1(String name) {
        println "Name:${name}- running on ${Thread.currentThread().name}"

    }

    static void main(String[] args) {
        def runna = new Runna()
        def thread1 = new Thread(
                {
                    runna.printName("Evoke")

                })
                    def thread2 = new Thread(
                            {
                                runna.printName1("Evoke")

                            })

                    thread1.start()
                    thread1.join()
        thread1.sleep(5000)
                    thread2.start()
                    thread2.join()
        thread2.sleep(2000)




    }
    }
