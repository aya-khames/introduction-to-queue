package eg.edu.alexu.csd.datastructure.queue.cs02_cs18_cs19;



public class LinkedListBasedQueue implements IQueue, ILinkedBased {

    private class Node {

        Object element;

        Node next;

    }

    private Node head, tail;

    private int size;

    LinkedListBasedQueue(){

        head = tail = null;

        size = 0;

    }



    @Override

    public void enqueue(Object item) {

        Node node = new Node();

        node.element = item;

        if (size == 0){

            node.next = null;

            head = node;

        }

        else{

            tail.next = node;

            node.next = null;

        }

        tail = node;

        size++;

    }



    @Override

    public Object dequeue() throws RuntimeException {

        if (size == 0)

            throw new RuntimeException("Queue is Empty!");

        else {

            Object temp = head.element;

            head = head.next;

            size--;

            return temp;

        }

    }



    @Override

    public boolean isEmpty() {

        return (size == 0);

    }



    @Override

    public int size() {

        return size;

    }



}