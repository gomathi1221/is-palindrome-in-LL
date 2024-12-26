class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        Node original=head;
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node l1=reverse(slow);
        Node l2=original;
        while(l1!=null&&l2!=null){
            if(l1.data!=l2.data){
                return false;
            }
            l1=l1.next;
            l2=l2.next;
        }
        return true;
    
        
    }
    public Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node newnode;
        while(curr!=null){
            newnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newnode;
            
        }
        return prev;
    }
}
