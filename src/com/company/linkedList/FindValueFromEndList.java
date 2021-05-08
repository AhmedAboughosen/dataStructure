package com.company.linkedList;

public class FindValueFromEndList {


        /*
 Given a Linked List and a number n,
 write a function that returns the value at the n’th node from the end of the Linked List.

  For example, if the input is below list and n = 3, then output is “B”
  input : 1 2 3 4
  output :  2
     */


    /**
     * using e ( length - k)
     *
     * @param list
     * @param index
     * @param <T>
     * @return
     */
    public static <T> T findValue(LinkedList<T> list, int index) {

        LinkedList.Node<T> upperNode = list.getHead();

        index = (list.getSize() + 1) - index;
        for (int i = 1; i <= index; i++) {
            upperNode = upperNode.next;
        }

        return upperNode.data;

    }

    public static <T> int findValueUsingRecursive(LinkedList.Node<T> node, int k) {

        if (node == null) return 0;

        int index = findValueUsingRecursive(node.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + node.data);
        }
        return index;
    }
}
