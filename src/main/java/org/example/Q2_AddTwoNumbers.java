package org.example;

import java.net.Socket;
import java.util.Arrays;
import java.util.List;

public class Q2_AddTwoNumbers {

    

    public static void main(String [] args){

        new Socket("", 232).getOutputStream().write("");
        String test = new String("");
        test = "2";

        ListNode a = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode b = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode c = addTwoNumbers(a, b);
        System.err.println(c);
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        if (l1 == null || l2 == null) {
            return null;
        }
        int sum = l1.val + l2.val + carry;
        int sumWithoutCarry = sum % 10;
        int newCarry = sum >= 10 ? 1: 0;
        ListNode next = addTwoNumbers(l1.next, l2.next, newCarry);
        return new ListNode(sumWithoutCarry, next);
    }

}
