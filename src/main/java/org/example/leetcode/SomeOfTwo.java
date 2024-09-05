package org.example.leetcode;

import com.sun.jmx.remote.internal.ClientListenerInfo;

public class SomeOfTwo {
    public static void main(String[] args) {
        System.out.println(12/10);
        System.out.println(12%10);

        ListNode listNode=new ListNode(1);

        ListNode listNode1=new ListNode(1);

        ListNode listNode2=new ListNode(1);

        listNode.next=listNode1;
        listNode1.next=listNode2;
        listNode2.next=null;


        ListNode listNode3=new ListNode(1);

        ListNode listNode4=new ListNode(1);

        ListNode listNode5=new ListNode(1);

        listNode3.next=listNode4;
        listNode4.next=listNode5;
        listNode5.next=null;

        ListNode temp=new ListNode(0);
        int carry=0;
        while(listNode!=null || listNode3!=null)
        {
            int value=listNode.val+listNode3.val+carry;
            if(value>9) {
                carry = value / 10;
            }
           ListNode temp1=new ListNode(value/10);
            temp.next=temp1;
            temp=temp.next;

            listNode=listNode.next;
            listNode3=listNode3.next;

        }

       while (temp!=null)
       {
           System.out.println(temp.val);
           temp=temp.next;
       }

    }
}
