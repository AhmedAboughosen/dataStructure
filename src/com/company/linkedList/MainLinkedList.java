package com.company.linkedList;


public class MainLinkedList {


    public static void main(String[] args) {

//        testPushValueToLinkedList();
        testRemoveDupInLinkedList();
    }


    private static void testPushValueToLinkedList(){
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
    private static void testRemoveDupInLinkedList(){
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
}