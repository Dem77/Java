package single;

public class SLinkedList {
   protected Node head;
   protected long size;
   protected Node tail;
   
public SLinkedList() {
	head = tail = null;
    size = 0;
}

public void addFirst(Node n){
	n.setNext(head);
	head=n;
	if (tail == null) tail=n; //or if size == 0
	size++;
}

 public void addLast(Node n){
	 n.setNext(null);
	 tail.setNext(n);
	 tail=n;
	 size++;
 }
 
 public boolean removeFirst(){
	 if (head == null)  return false;
	 else {
		 Node temp = head;
		 head = head.getNext();
		 temp.setNext(null);
		 size--;	
		 return true;
	 }
	 
 }
 

/**
 * @return the head
 */
public Node getHead() {
	return head;
}

/**
 * @return the size
 */
public long getSize() {
	return size;
}

/**
 * @return the tail
 */
public Node getTail() {
	return tail;
}
 
 
}
