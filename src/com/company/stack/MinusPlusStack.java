package com.company.stack;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MinusPlusStack {

    static class Stack {
        private int MAX = 1000;
        int top;
        int stack[];

        boolean isEmpty() {
            return (top < 0);
        }

        public Stack(int size) {
            top = -1;
            MAX = size;
            stack = new int[MAX];
        }


        public boolean push(int value) {
            if (top >= (MAX - 1)) {
                return false;
            } else {
                stack[++top] = value;
                return true;
            }
        }

        public int pop() {
            if (top < 0) {
                return 0;
            } else {
                int x = stack[top--];
                return x;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        try (Scanner in = new Scanner(new File("input.txt"));
             PrintWriter out = new PrintWriter("output.txt")) {
            int n = in.nextInt();
            Stack stack = new Stack(n);

            while (in.hasNext()) {
                String operation = in.next();
                if (operation.equals("+")) {
                    int number = in.nextInt();
                    stack.push(number);
                } else {
                    out.println(stack.pop());
                }
            }

        }
    }
}
