package com.company.linkedList;

public class LinkedList<T> {


    private Node<T> head; // head of the list
    private int size = 0;

    /* Linked list Node*/
    static class Node<T> {
        T data;
        Node<T> next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        public Node(T d) {
            this.data = d;
        }
    }


    public Node<T> getHead() {
        return head;
    }

    /* This function is in LinkedList class. Inserts a
           new Node at front of the list. This method is
           defined inside LinkedList class shown above */
    public void push(T new_data) {
    /* 1 & 2: Allocate the Node &
              Put in the data*/
        Node<T> new_node = new Node<T>(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
        size++;
    }

    /* This function is in LinkedList class.
   Inserts a new node after the given prev_node. This method is
   defined inside LinkedList class shown above */
    public void insertAfter(Node<T> prev_node, T new_data) {
        /* 1. Check if the given Node is null */
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

    /* 2. Allocate the Node &
    3. Put in the data*/
        Node<T> new_node = new Node<T>(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
        size++;

    }

    /* This function is in LinkedList class.
Inserts a new node at  the given index. This method is
defined inside LinkedList class shown above */
    public void insertAt(T data, int index) {
//        /* 1. Check if the given Node is null */

        if (getSize() < index) {
            return;
        }

    /* 2. Allocate the Node &
    3. Put in the data*/
        Node<T> new_node = new Node<T>(data);

        if (index == 1) {
            new_node.next = head;
            head = new_node;
            return;
        }

        Node<T> temp = head;

        for (int i = 0; i < index - 2; i++) {
            temp = temp.next;
        }

        new_node.next = temp.next;
        temp.next = new_node;
        size++;
    }

    /* This function prints contents of linked list starting from head */
    public void printList() {
        if (head != null) {
            Node<T> n = head;
            while (n != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
            System.out.println();
        }

    }


    /* Appends a new node at the end. This method is
defined inside LinkedList class shown above */
    public void append(T new_data) {
	/* 1. Allocate the Node &
	2. Put in the data
	3. Set next as null */
        Node<T> new_node = new Node<T>(new_data);

	/* 4. If the Linked List is empty, then make the
		new node as head */
        if (head == null) {
            head = new_node;
            return;
        }

        /* 5. Else traverse till the last node */
        Node<T> last = head;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;
        size++;

    }


    //Checks whether the value target is present in linked list
    public boolean search(T target) {
        if (isEmpty()) {
            return false;
        }

        Node<T> current = head;
        //Initialize current
        while (current.data != target && current.next != null) {//data found
            current = current.next;
        }

        return current.data == target;    //data not found
    }


    /* Given a key, deletes the first
     occurrence of key in
   * linked list */
    void deleteNode(T key) {
        // Store head node
        Node<T> temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
        size--;

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
