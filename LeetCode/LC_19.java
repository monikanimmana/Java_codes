public class LC_19{
    class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public ListNode convertlist(int[] arr){
        ListNode head=new ListNode(arr[0]);
        ListNode temp=head;
        for(int i=1;i<arr.length;i++){
            temp.next=new ListNode(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    static void traversal(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->" );
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    static ListNode removeendlist(ListNode head,int N){
        ListNode fast=head;
        for(int i=0;i<N;i++){
            fast=fast.next;
        }
        ListNode slow=head;
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        LC_19 obj=new LC_19();
        int arr[]=new int[]{1,2,3,4,5};
        ListNode list= obj.convertlist(arr);
        traversal(list);
        int N=5;
        ListNode head=removeendlist(list,N);
        traversal(head);
    }

}