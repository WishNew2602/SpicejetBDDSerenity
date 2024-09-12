
// THIS CODE GOES IN YOUR LINKEDLIST CLASS:
// ----------------------------------------
      
package PracticeDSA;


public class LinkedList{

	// CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
	Node head;
	Node tail;
	int length;
	
	class Node{
		int value;
		Node node;
		Node next;
		
		public Node(int value) {
			this.value=value;
			this.next = null;
		}
	}
	
	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length =1;
	}
	
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }
    
    public void makeEmpty() {
    	head = null;
    	tail= null;
    	length =0;
    }
    public void append(int value) {
    	Node newNode = new Node(value);
    	if(head == null) {
    		head =newNode;
    		tail=newNode;
    	}else {
    		tail.next = newNode;
    		tail=newNode;
    	}
    	length++;
    }
    
    public Node removeLast() {
    	Node temp = head;
    	Node pre = head;
    	if(length==0) return null;
    	
    	while(temp.next != null) {
    		pre = temp;
    		temp = temp.next;
    	}
    	tail = pre;
    	tail.next = null;
    	length--;
    	if(length==0) {
    		head=null;
    		tail=null;
    	}
		return temp;
    	
    }
    
    public void prepend(int value) {
    	
    	Node newNode = new Node(value);
    	if(head==null) {
    		head = newNode;
    		tail=newNode;
    	}else {
    		newNode.next = head;
    		head = newNode;
    	}
    	length++;
    }
    
    public Node removeFirst() {
    	Node temp;
    	
    	if(head==null) return null;
    	
    	temp = head;
    	head = head.next;
    	temp.next = null;
    	length--;
    	if(length == 0) {
    		tail =null;
    	}
		return temp;
    }
    
     public Node get(int index) {
    	 Node temp = head;
    	 if(index <0 || index >= length) return null;
    	 for(int i =0;i<index;i++) {
    		 temp = temp.next;
    	 }
		return temp;	 
     }
     
     public boolean insert(int index, int value) {
    	 if(index < 0 || index >=length) return false;
    	 if(index == 0) {
    		 prepend(value);
    		 return true;
    	 }
    	 if(index == length) {
    		 append(value);
    		 return true;
    	 }
    	 Node newNode = new Node(value);
    	 Node temp = get(index - 1);
    	 newNode.next = temp.next;
    	 temp.next = newNode;
    	 length++;
    	 return true;
     }
     
     public boolean set(int index, int value) {
    	 Node temp = get(index);
    	 if(temp != null) {
    		 temp.value = value;
    		 return true;
    	 }
    	 return false;
     }
     public Node remove(int index) {
    	 Node temp;
    	 Node temp2;
    	 if(index < 0 || index >=length) return null;
    	 if(index == 0) return removeFirst();
    	 if(index == length-1) return removeLast();
    	 temp2 = get(index-1);
    	 temp = temp2.next;
    	 temp2.next = temp.next;
    	 temp.next = null;
    	 length--;
		return temp; 
     }
     public void reverse() {
    	 Node temp = head;
    	 head = tail;
    	 tail = temp;
    	 Node after = temp.next;
    	 Node before = null;
    	 for(int i =0; i<length;i++) {
    		 after = temp.next;
    		 temp.next = before;
    		 before = temp;
    		 temp = after;
    	 }
     }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}

