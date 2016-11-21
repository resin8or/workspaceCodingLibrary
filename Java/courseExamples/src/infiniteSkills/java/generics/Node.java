package infiniteSkills.java.generics;

public class Node <T> {

	// can create nodes of any type required
	private T data;
	public Node next;
	
	public Node (T data){
		this.data = data;
		next = null;
	}
	
	T getData() {
		return data;
	}
}
