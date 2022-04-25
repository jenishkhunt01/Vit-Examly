package exam;

import java.util.*;


class ListNode {
    int val;
    ListNode next;
    ListNode first;
    ListNode last;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void push(int item){
        ListNode newNode = new ListNode(item);
        if(first == null){
            first=last=newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }

    }
    public int remove(){
        ListNode current  = first;
        first = first.next;
        return current.val;

    }

    public boolean isEmpty(){
        return first == null;
    }

}


class Solution {

    static Scanner sc = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1=0;
        int var=1;
        while (!l1.isEmpty()){
            num1 = num1+var* l1.remove();
            var = var*10;
        }

        int num2=0;
        var=1;
        while (!l2.isEmpty()){
            num2 = num2+var* l2.remove();
            var*=10;
        }
        num1 = num1+num2;
        System.out.println(num1);
        while (num1 > 0){
            l1.push(num1%10);
            num1/=10;
        }

        return l1;

    }

    public static void main(String[] args) {


        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();

        System.out.println("Enter l1");
        inputMethod(l1);
        System.out.println("Enter l2");
        inputMethod2(l2);

        Solution obj = new Solution();
        obj.addTwoNumbers(l1 , l2);
    }

    public static ListNode inputMethod(ListNode l){

        while(sc.hasNextInt()){
            l.push(sc.nextInt());
        }
        return l;
    }
    public static ListNode inputMethod2(ListNode l){
        while(scanner.hasNextInt()){
            l.push(scanner.nextInt());
        }
        return l;
    }
}
