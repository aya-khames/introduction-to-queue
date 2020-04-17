package eg.edu.alexu.csd.datastructure.queue.cs02_cs18_cs19;



import org.junit.Test;



import static org.junit.Assert.assertEquals;



public class ArrayBasedTest {

    @Test

    public void ArrayTest(){

        ArrayBasedQueue Q = new ArrayBasedQueue();

        Q.enqueue(1);

        Q.enqueue('a');

        Q.enqueue(2);

        Q.enqueue('b');

        Q.enqueue(3);

        Q.enqueue('c');



        assertEquals(false, Q.isEmpty());

        assertEquals(6, Q.size());

        assertEquals(1, Q.dequeue());

        assertEquals('a', Q.dequeue());

        assertEquals(2, Q.dequeue());

        assertEquals('b', Q.dequeue());

        assertEquals(3, Q.dequeue());

        assertEquals('c', Q.dequeue());

        assertEquals(0, Q.size());

        assertEquals(true, Q.isEmpty());

    }

}