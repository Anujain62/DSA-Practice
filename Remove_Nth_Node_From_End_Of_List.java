import java.util.Scanner;

class ListNode {
 int val;
 ListNode next;

 ListNode(int val) {
  this.val = val;
 }

}

 public class Remove_Nth_Node_From_End_Of_List {

  // Utility: Print linked list
 public static void printList(ListNode head) {
  while (head != null) {
   System.out.print(head.val + " ");
   head = head.next;
  }
  System.out.println();
 }

  public ListNode removeNthFromEnd(ListNode head, int n) {
   ListNode curr = head;
   int len = 0;
   while (curr != null) {
    len += 1;
    curr = curr.next;
   }
   int d = len - n;
   if (d == 0) {
    return head.next;
   }
   ListNode prev = null;
   curr = head;
   int i = 0;
   while (i < d) {
    prev = curr;
    curr = curr.next;
    i++;
   }
   prev.next = curr.next;
   return head;
  }

  public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   Remove_Nth_Node_From_End_Of_List obj = new Remove_Nth_Node_From_End_Of_List();

   // Input size
   System.out.print("Enter number of nodes: ");
   int size = sc.nextInt();

   // Build linked list
   System.out.println("Enter the nodes:");
   ListNode head = null, tail = null;

   for (int i = 0; i < size; i++) {
    int value = sc.nextInt();
    ListNode newNode = new ListNode(value);

    if (head == null) {
     head = newNode;
     tail = newNode;
    } else {
     tail.next = newNode;
     tail = tail.next;
    }
   }

   // Input n
   System.out.print("Enter n (node to remove from end): ");
   int n = sc.nextInt();

   // Remove and print output
   head = obj.removeNthFromEnd(head, n);

   System.out.println("List after removing " + n + "th node from end:");
   printList(head);
  }

 }
