public class LinkedList<T> implements List<T>{
	private Node head;
	private T data;
	public static int size = 0;

	Object[] tempArray = new Object[size];
	T[] array = (T[]) tempArray;

	public LinkedList(){
		head = new Node(null);
	}

	public static class Node<T>{
		T data;
		Node next;

		public Node(T data){
			this.data = data;
			next = null;
		}
		public void setNext(Node next){
			this.next = next;
		}
		public Node getNext(){
			return next;
		}
		public void setData(T data){
			this.data = data;
		}
		public T getData(){
			return data;
		}
	}

	@Override
	public void add(T item){
		Node prev = head;
		Node <T> newNode = new Node(item);	
		if (head == null) { //if list is empty
			head = newNode;
			return; 
		}

 		while (prev.getNext() != null) {
 			prev = prev.getNext();
 		}
		prev.setNext(newNode);
		size++;
	}

	@Override
	public void add(int pos, T item){
		Node <T> newNode = new Node(item);
		size++;
		if(pos>size || pos < 0){
			throw new ArrayIndexOutOfBoundsException();
		}
		else{
			Node prev = head;
			for(int i=0; i<pos; i++){
				prev = prev.getNext();
			}
			prev.setNext(newNode);
		}
	}


	@Override
	public T get(int pos){
		if(pos>=0 && pos<size == false){
			throw new ArrayIndexOutOfBoundsException();
		}
		Node curr = new Node(null);
		if(head != null){
			curr = head.getNext();
			for(int i=0; i<pos; i++){
				if(curr.getNext() == null){
					return null;
				}
				curr = curr.getNext();
			}
			return (T) curr.getData();
		}
		return (T) curr;
	}

	@Override
	public T remove(int pos){
		if(pos>size-1 || pos < 0){
			throw new ArrayIndexOutOfBoundsException();
		}
		if(pos == 0){
			Node curr = head.getNext();
			head = null;
			--size;
			return (T) curr.getData();
		}
		else{
			Node prev = head;
			for(int i=0; i<pos; i++){
				prev = prev.getNext();
			}
			Node curr = prev.getNext();
			if(pos == size - 1){
				prev.setNext(null);
			}
			else{
				prev.setNext(curr.getNext());
			}
			--size;
			return (T) curr.getData();
		}
	}

	@Override
	public int size(){
		return size;
	}
}