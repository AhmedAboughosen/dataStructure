package com.company.linkedList;

public class SumList {

    /*
  Sum Lists: You have two numbers represented by a linked list, where each node contains a single
digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
function that adds the two numbers and returns the sum as a linked list.
EXAMPLE
Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
Output: 2 -> 1 -> 9. That is, 912.
     */

    static String value = "";

    /**
     * @param list1
     * @param list2
     * @param <T>
     */
    public static <T> String sumList(LinkedList.Node<T> list1, LinkedList.Node<T> list2) {


        int remaining = 0;
        int div = 0;
        StringBuilder value = new StringBuilder();
        while (list1 != null && list2 != null) {
            int sum = (((Integer) list1.data + (Integer) list2.data) + div);
            remaining = sum % 10;
            div = sum / 10;
            value.append(remaining);
            list1 = list1.next;
            list2 = list2.next;
        }

        return value.toString();
    }
}
