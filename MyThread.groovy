package com.practice

class Threadss extends Thread {
    private String message

    Threadss(String message) {
        this.message = message
    }

    void run() {
        println "${message}-running on ${Thread.currentThread().name}"
        //Thread.sleep(3000)
    }

}

static void main(String[] args) {
    def thread1 = new Threadss("Thread 1")
    def thread2 = new Threadss("Thread 2")
    def thread3 = new Threadss("Thread 3")
    def thread4 = new Threadss("Thread 4")
    def thread5 = new Threadss("Thread 5")
    thread1.start()
    thread1.sleep(2000)
    thread2.start()
    thread2.sleep(2000)
    thread3.start()
    thread3.sleep(2000)
    thread4.start()
    thread4.sleep(2000)
    thread5.start()
    thread5.sleep(2000)

//        thread.join()
//        thread1.join()
//        thread2.join()
//        thread3.join()
////        thread4.join()
//


}

