// 13119138
// rcocia01@student.bbk.ac.uk

import java.io.*;
import java.util.*;

public class BoundedQueue {

    private final int maxsize;
    private ArrayList<String> queue;

    BoundedQueue(int maxsize )
    {
        this.maxsize = maxsize;
        this.queue = new ArrayList<>(maxsize);
    }


    synchronized void push( String s )
    {
        try{
            if(this.queue.size() == this.maxsize){
                wait();
            }
            else{
                this.queue.add(s);
                System.out.println("Pushed: " + s + " / " + this.queue.size());
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized String pop()
    {
        String toRemove = " ";

        try{
            if(this.queue.size() == 0){
                wait();
            }else{
                toRemove = this.queue.get(0);
                this.queue.remove(0);
                System.out.println("Popped: " + toRemove + " / " + this.queue.size());
                notifyAll();
            }
            return null;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }
}

