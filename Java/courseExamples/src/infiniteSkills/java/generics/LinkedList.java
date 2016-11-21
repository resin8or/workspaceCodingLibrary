package infiniteSkills.java.generics;

public class LinkedList {
	
	public static void main (String args[]){
		Node<String> node1 = new Node("Jamie");
		Node<String> node2 = new Node("Alex");
		Node<String> node3 = new Node("Nicola");
		Node<String> footer = new Node("footer");
		Node<String> dummy;
		
		node1.next = node2;
		node2.next = node3;
		node3.next = footer;
		dummy = node1;
		
		while(dummy.next != null){
			System.out.println(dummy.getData());
			dummy = dummy.next;
		}
		
	}
	
}
