/*
 * MCA 2 external exam program of Thread Synchronization
 */
import java.util.*;

class Holder {
    private int value=0, turn=0;

    public int getTurn(){
        return turn;
    }
    public void setTurn(int turn){
        this.turn = turn;
    }
    public void setValue(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}

class Printer extends Thread{
    Holder holder;
    final int TURN = 0;
    
    public Printer(Holder holder){
        this.holder = holder;
    }
    public void run(){
        for(int i=0 ; i<30 ; i++){
            while(holder.getTurn() != TURN){}
            System.out.println(holder.getValue());
            holder.setTurn(1);
            try{    sleep(200); } catch(Exception e){}
        }
    }
}

class Counter extends Thread{
    Holder holder;
    final int TURN = 1;

    public Counter(Holder holder){
        this.holder = holder;
    }
    public void run(){
        for(int i=0 ; i<30 ; i++){
            while(holder.getTurn() != TURN){}
            holder.setValue(holder.getValue()+1);
            holder.setTurn(0);
            try{    sleep(200);  } catch(Exception e){}
        }
    }
}

public class MCA2 {
    public static void main(String[] args) throws Exception {
        Holder holder = new Holder();
        Printer printer = new Printer(holder);
        Counter counter = new Counter(holder);

        printer.start();
        counter.start();
        printer.join();
        counter.join();
    }
}