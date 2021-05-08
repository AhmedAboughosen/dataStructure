package com.company.linkedList;


public class MainLinkedList {


    public static void main(String[] args) {

//        testPushValueToLinkedList();
//        testRemoveDupInLinkedList();
//        testFindValueInLinkedList();
//        sumList();
        palindromeList();
    }


    private static void testPushValueToLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(2);
        linkedList.append(7);
        System.out.println(linkedList.search(17));
        linkedList.printList();
        linkedList.append(7);
        System.out.println(linkedList.search(1));
        linkedList.printList();

        linkedList.insertAt(-2, 3);
        linkedList.printList();


    }

    private static void testRemoveDupInLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(1);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(2);
        linkedList.append(2);
        linkedList.append(5);
        linkedList.append(3);
        RemoveDupNode.RemoveDup(linkedList);
        linkedList.printList();

    }

    private static void testFindValueInLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(8);
        linkedList.append(9);
        linkedList.append(10);
        FindValueFromEndList.findValueUsingRecursive(linkedList.getHead(), 5);
    }

    private static void sumList() {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList1.append(7);
        linkedList1.append(1);
        linkedList1.append(6);
        linkedList2.append(5);
        linkedList2.append(9);
        linkedList2.append(2);

        System.out.println(SumList.sumList(linkedList1.getHead(), linkedList2.getHead()));

    }

    private static void palindromeList() {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.append(7);
        linkedList1.append(1);
        linkedList1.append(1);
        linkedList1.append(7);
        System.out.println(PalindromeList.isPalindrome(linkedList1.getHead(), linkedList1.getHead()));

    }
}