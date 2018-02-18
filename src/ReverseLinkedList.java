
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
		next = null;
	}
}

public class ReverseLinkedList {
	
	public static void reverseLL(LinkedListNode<Integer> prob, LinkedListNode<Integer> sol) {
		if (prob == null) {
			System.out.println("Linked list after reversing: ");
			printLinkedList(sol);
			return;
		}
		LinkedListNode<Integer> temp = prob;
		prob = prob.next;
		temp.next = sol;
		reverseLL(prob, temp);
	}
	
	public static void printLinkedList(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedListNode<Integer> head = new LinkedListNode<>(5);
		LinkedListNode<Integer> prob = head;
		head.next = new LinkedListNode<>(10);
		head = head.next;
		head.next = new LinkedListNode<>(15);
		head = head.next;
		head.next = new LinkedListNode<>(20);
		System.out.println("Linked list before reversing: ");
		printLinkedList(prob);
		reverseLL(prob, null);
	}
}
