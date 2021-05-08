package com.company.linkedList;

public class RemoveDupNode {

    /*
    Remove Dups! Write code to remove duplicates from an unsorted linked list.
    example
    input : 1  2 3 3 2 2 5
    output 1 5
     */


    /**
     * using brute force algorithm.
     *
     * @param list
     * @param <T>
     */
    public static <T> void RemoveDup(LinkedList<T> list) {

        LinkedList.Node<T> upperNode = list.getHead();
        if (upperNode != null) {

            while (upperNode != null) {
                LinkedList.Node<T> temp = upperNode;
                LinkedList.Node<T> preNode = temp;
                T data = upperNode.data;
                temp = temp.next;
                while (temp != null) {
                    if (temp.data == data) {
                        preNode.next = temp.next;
                        temp = preNode.next;
                    } else {
                        preNode = temp;
                        temp = temp.next;
                    }
                }
                upperNode = upperNode.next;
            }
            System.out.println();
        }

    }
}
