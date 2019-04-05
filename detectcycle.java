/*
 *program to detect cycle in a linkedlist
 *@author:Preethi
*/

static boolean hasCycle(SinglyLinkedListNode head) {
           if(head==null){
               return false;
           }
           else{
               SinglyLinkedListNode slow=head;
               SinglyLinkedListNode fast=head.next;
               while(slow!=fast){
                   if(fast==null||fast.next==null){
                       return false;
                   }
                   slow=slow.next;
                   fast=fast.next.next;
               }
           }
           return true;
    }