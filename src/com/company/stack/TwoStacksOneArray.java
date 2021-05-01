package com.company.stack;


class ContainerStack {
    static final int MAX = 10;
    int fTop, sTop;
    int a[] = new int[MAX]; // Maximum size of Stack


    ContainerStack() {
        fTop = -1;
        sTop = a.length;
    }

    boolean isEmpty() {
        return (fTop < 0 && sTop >= MAX);
    }

    boolean pushFirstStack(int x) {
        if (fTop >= (sTop - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++fTop] = x;
            System.out.println(x + " pushed into First stack");
            return true;
        }
    }

    boolean pushSecondStack(int x) {
        if (sTop <= (fTop)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[--sTop] = x;
            System.out.println(x + " pushed into Second stack");
            return true;
        }
    }

    int popFromFirstStack() {
        if (fTop < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[fTop--];
            return x;
        }
    }

    int popFromSecondStack() {
        if (sTop >= MAX) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[sTop++];
            return x;
        }
    }

    public void print() {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

public class TwoStacksOneArray {


    public static void main(String[] args) {
        ContainerStack s = new ContainerStack();
        s.pushFirstStack(10);
        s.pushFirstStack(20);
        s.pushFirstStack(30);
        s.pushFirstStack(40);
        s.pushFirstStack(50);
        s.pushSecondStack(-10);
        s.pushSecondStack(-20);
        s.pushSecondStack(-30);
        s.pushSecondStack(-40);
        s.pushFirstStack(60);
        s.pushFirstStack(50);
        s.pushFirstStack(50);

        System.out.println(s.popFromFirstStack() + " Popped from First stack");
        System.out.println(s.popFromSecondStack() + " Popped from Second stack");
        System.out.println(s.popFromSecondStack() + " Popped from Second stack");
        System.out.println(s.popFromFirstStack() + " Popped from First stack");
        System.out.println(s.popFromSecondStack() + " Popped from Second stack");
        System.out.println(s.popFromFirstStack() + " Popped from First stack");
        System.out.println(s.popFromSecondStack() + " Popped from Second stack");
        System.out.println(s.popFromSecondStack() + " Popped from Second stack");
        System.out.println(s.popFromFirstStack() + " Popped from First stack");
        System.out.println(s.popFromFirstStack() + " Popped from First stack");
        System.out.println(s.popFromFirstStack() + " Popped from First stack");
        System.out.println(s.popFromFirstStack() + " Popped from First stack");

    }
}
