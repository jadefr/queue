package com.company;

public class Queue {
    Node head;
    Node tail;

    public void enqueue(int data) {
        if (head != null) {
            Node newTail = new Node(data);
            tail.next = newTail;
            tail = newTail;
        } else { // empty queue
            Node firstNode = new Node(data);
            head = firstNode;
            tail = head;
        }

    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("");
    }

    public void dequeue() {
        //deletes first element by taking away its reference
        head = head.next;
    }
}
