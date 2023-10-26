/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
       return  helper(head,0,n);
    }
    public static int helper(LinkedListNode<Integer> head,int index,int n){
        if(head==null)
            return -1;
        if(head.data==n)
            return index;
       int ans= helper(head.next,index+1,n);
      return ans;
	}
}
