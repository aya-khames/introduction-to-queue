package eg.edu.alexu.csd.datastructure.queue.cs02_cs18_cs19;



public class ArrayBasedQueue implements IQueue,IArrayBased {

    public int f, r, n, s;

    public Object[] Q ;

    ArrayBasedQueue(){

        f = r = s = 0;

        n = 10;

        Q = new Object[n];

    }



    @Override

    public void enqueue(Object item) {

        if (s == n)

            throw new RuntimeException("Queue if Full!");

        Q[r] = item;

        s++;

        if (r == (n-1))

            r = 0;

        else

            r++;

    }



    @Override

    public Object dequeue() {

        if (isEmpty())

            throw new RuntimeException("Queue is Empty!");

        Object item = Q[f];

        Q[f] = null;

        s--;

        if (f == (n-1))

            f = 0;

        else

            f++;

        return item;

    }



    @Override

    public boolean isEmpty() {

        return (s == 0);

    }



    @Override

    public int size() {

        return s;

    }





    public void showQueue(){

        for (int i = 0; i<s; i++){

            System.out.println(Q[(i+f) % n] + " ");

        }



    }

}