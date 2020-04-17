package eg.edu.alexu.csd.datastructure.queue.cs02_cs18_cs19;

import org.junit.Test;



import static org.junit.Assert.assertEquals;



public class LinkedListBasedTest {

    @Test

    public void LinkedListTest(){

        LinkedListBasedQueue L = new LinkedListBasedQueue();

        L.enqueue(1);

        L.enqueue('a');

        L.enqueue(2);

        L.enqueue('b');

        L.enqueue(3);

        L.enqueue('c');



        assertEquals(false, L.isEmpty());

        assertEquals(6, L.size());

        assertEquals(1, L.dequeue());

        assertEquals('a', L.dequeue());

        assertEquals(2, L.dequeue());

        assertEquals('b', L.dequeue());

        assertEquals(3, L.dequeue());

        assertEquals('c', L.dequeue());

        assertEquals(0, L.size());

        assertEquals(true, L.isEmpty());

    }

}