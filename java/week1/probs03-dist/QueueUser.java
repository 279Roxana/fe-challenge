// 13119138
// rcocia01@student.bbk.ac.uk


class Pusher implements Runnable
{
    BoundedQueue q;
    int iterations;
    String name;

    Pusher( BoundedQueue q, String name, int iterations )
    {
        this.q = q;
        this.name = name;
        this.iterations = iterations;
    }
    public void run()
    {
        for(int i=1; i <= this.iterations; i++){
            this.q.push(i + " " + name);
        }
    }
}

class Popper implements Runnable
{
    BoundedQueue q;
    int iterations;

    Popper( BoundedQueue q, int iterations )
    {
        this.q = q;
        this.iterations = iterations;

    }
    public void run()
    {
        for (int i = 1; i <= this.iterations; i++){
            this.q.pop();
        }
    }
}

public class QueueUser {
    public static void main(String[] args) {
        BoundedQueue q = new BoundedQueue(2);
        Pusher pushA = new Pusher(q, "a", 8);
        Pusher pushB = new Pusher(q, "b", 8);
        Popper popper = new Popper(q, 16);

        Thread threadA = new Thread(pushA);
        Thread threadB = new Thread(pushB);
        Thread threadPop = new Thread(popper);

        threadA.start();
        threadB.start();
        threadPop.start();
    }
}
