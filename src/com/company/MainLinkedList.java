package com.company;

class LinkedList {


    Node head; // head of the list

    /* Linked list Node*/
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        public Node(int d) {
            this.data = d;
        }
    }


    /* This function is in LinkedList class. Inserts a
       new Node at front of the list. This method is
       defined inside LinkedList class shown above */
    public void push(int new_data) {
    /* 1 & 2: Allocate the Node &
              Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* This function is in LinkedList class.
Inserts a new node after the given prev_node. This method is
defined inside LinkedList class shown above */
    public void insertAfter(Node prev_node, int new_data) {
        /* 1. Check if the given Node is null */
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

    /* 2. Allocate the Node &
    3. Put in the data*/
        Node new_node = new Node(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }

    /* This function prints contents of linked list starting from head */
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }


    /* Appends a new node at the end. This method is
defined inside LinkedList class shown above */
    public void append(int new_data) {
	/* 1. Allocate the Node &
	2. Put in the data
	3. Set next as null */
        Node new_node = new Node(new_data);

	/* 4. If the Linked List is empty, then make the
		new node as head */
        if (head == null) {
            head = new Node(new_data);
            return;
        }

	/* 4. This new node is going to be the last node, so
		make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }


    //Checks whether the value target is present in linked list
    public boolean search(int target) {
        if (isEmpty()) {
            return false;
        }

        Node current = head;
        //Initialize current
        while (current.data != target && current.next != null) {//data found
            current = current.next;
        }

        return current.data == target;    //data not found
    }


    /* Given a key, deletes the first
     occurrence of key in
   * linked list */
    void deleteNode(int key) {
        // Store head node
        Node temp = head, prev = null;

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
    }

    public boolean isEmpty() {
        return head == null;
    }

}


public class MainLinkedList {


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new LinkedList.Node(1);
        linkedList.push(2);
        linkedList.append(7);
        System.out.println(linkedList.search(17));
        linkedList.printList();
        linkedList.append(7);
        System.out.println(linkedList.search(1));
        linkedList.printList();


    }
}