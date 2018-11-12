public class LinkedList implements List{
	public int size;
	public Node head;
	public LinkedList(){
		this.size = 0;
	}


	public void add(Object obj) throws Exception{
		if(head == null){
			addFirst(obj);
			this.size++;
		}else{
			Node n = new Node(obj, null);
			Node temp = head;
			while(temp != null){
				temp = temp.next;
			}
			temp.next = n;
			this.size++;
		}
		
		// for int i = 0; i < size; i++){
		// 	if(nextNode(i, this.head) == null){
		// 		nextNode(i, this.head) = n;
		// 	}
		// }
	}

	public void add(int pos, Object obj)throws Exception{
		if(pos < 0 || pos>this.size){
			throw new Exception();
		}
		Node temp = head;
		for(int i = 0; i < pos-1; i++){
			temp = temp.next;
		}
		temp.next = new Node(obj, temp.next);
		this.size++;
	}

	public Object get(int pos)throws Exception{
		if(pos <= size){
			Node temp = head;
			for(int i = 0; i < pos; i++){
				temp = temp.next;
			}
			return temp.data;
		}else{
			throw new Exception();
		}
	}

	public Object remove(int pos)throws Exception{
		if(pos <= this.size){
			Node temp = head;
			for(int i = 0; i < pos-1; i++){
				temp = temp.next;
			}
			Node deletedItem = temp.next;
			temp.next = temp.next.next;
			return deletedItem.data;
		}else{
			throw new Exception();
		}
	}

	private static class Node{
		private Object data;
		private Node next;

		public Node(Object data1, Node next1){
			this.data = data1;
			this.next = next1;
		}
	}

	public void addFirst(Object obj){
		head = new Node(obj, head);
	}

	public int size(){
		return this.size;
	}








	// public Object nextNode(int pos, int start){
	// 	if(start == pos){
	// 		return this.next;
	// 	}
	// 	for(int i = start; i < pos; i++){
	// 		return nextNode(pos, start+1);
	// 	}
	// }


}