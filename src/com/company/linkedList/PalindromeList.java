package com.company.linkedList;

public class PalindromeList {

    /*
: Implement a function to check if a linked list is a palindrome.
     */


    static int res = 1;

    /**
     * @param head
     * @param firstHead
     * @param <T>
     */
    public static <T> boolean isPalindrome(LinkedList.Node<T> head, LinkedList.Node<T> firstHead) {


        palindromeList(head , firstHead);
        return res == 1;
    }

    /**
     *
     * @param head
     * @param firstHead
     * @param <T>
     * @return
     */
    public static <T> LinkedList.Node<T> palindromeList(LinkedList.Node<T> head, LinkedList.Node<T> firstHead) {


        if (head == null)
            return firstHead;

        LinkedList.Node<T> palindrome = palindromeList(head.next, firstHead);
        int data = (Integer) palindrome.data;

        res = (res == 0) ? 0 : ((Integer) head.data != data) ? 0 : 1;

        return palindrome.next;
    }

}
