/*
 * Famous Producer Consumer problem for Thread Synchronisation.
 * We can synchronise threads by multiple methods.
 * We can do it without wait()/notify() also but,
 * Here we will use wait() and notify() method with a boolean variable set (like Turn).
 * Produer will keep producing/increasing value and Consumer will consuming/printing value.
 * We want a specific sequence like produce1,consume1,produce2,consume2.....produceN,ConsumeN
 */

class Counter{
    int counter;
    boolean set = false;
    public synchronized void setData(){
        while(set){
            try { wait(); } catch (Exception e) {}
        }
        counter++;
        set = true;
        notify();
    }
    public synchronized int getData(){
        while(!set){
            try { wait(); } catch (Exception e) {}
        }
        set = false;
        notify();
        return counter;
    }
}

class Producer extends Thread{
    Counter counter;
    public Producer(String name, Counter c){
        super(name);
        this.counter = c;
    }
    public void run(){
        while(true){
            counter.setData();
            try { sleep(500); } catch (Exception e) { }
       }
    }
}

class Consumer extends Thread{
    Counter counter;
    public Consumer(String name, Counter c){
        super(name);
        this.counter = c;
    }
    public void run(){
        while(true){
            System.out.println("Count: " + counter.getData());
            try {  sleep(500); } catch (Exception e) { }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        
        Producer producer = new Producer("Thread producer", counter);
        Consumer consumer = new Consumer("Thread consumer", counter);

        producer.start();
        consumer.start();
    }
}