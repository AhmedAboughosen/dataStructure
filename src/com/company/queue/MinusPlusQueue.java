package com.company.queue;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MinusPlusQueue {

    /*
    Implement a queue which supports push and pop operations. For every pop operation, output its result.

Input
The ﬁrst line of the input ﬁle contains a single integer number N (1≤N≤106) – the number of commands. N lines follow,
each line contains exactly one command. There are the following commands:
+ x: push x to the queue. Every x will be an integer such that |x|≤109. The symbol + and the number will be separated by exactly one white space.
-: pop an element from the queue. It is guaranteed that this operation will never be executed on an empty queue. There will be at least one such operation.
Output
Output the integers popped from the queue, one per line, in the order they were popped

     */
    static class Queue {
        int front, rear, size;
        int capacity;
        int array[];

        public Queue(int capacity) {
            this.capacity = capacity;
            front = this.size = 0;
            rear = capacity - 1;
            array = new int[this.capacity];
        }

        // Queue is full when size becomes
        // equal to the capacity
        boolean isFull() {
            return (this.size == this.capacity);
        }

        // Queue is empty when size is 0
        boolean isEmpty() {
            return (this.size == 0);
        }

        // Method to add an item to the queue.
        // It changes rear and size
        void enqueue(int item) {
            if (isFull())
                return;
            this.rear = (this.rear + 1) % this.capacity;
            this.array[this.rear] = item;
            this.size++;
        }

        // Method to remove an item from queue.
        // It changes front and size
        int dequeue() {
            if (isEmpty())
                return Integer.MIN_VALUE;

            int item = this.array[this.front];
            this.front = (this.front + 1) % this.capacity;
            this.size = this.size - 1;
            return item;
        }

    }


    public static void main(String[] args) throws IOException {

        try (Scanner in = new Scanner(new File("input.txt"));
             PrintWriter out = new PrintWriter("output.txt")) {
            int n = in.nextInt();
            Queue stack = new Queue(n);

            while (in.hasNext()) {
                String operation = in.next();
                if (operation.equals("+")) {
                    int number = in.nextInt();
                    stack.enqueue(number);
                } else {
                    out.println(stack.dequeue());
                }
            }

        }
    }
}
