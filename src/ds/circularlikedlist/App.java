package ds.circularlikedlist;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList myList = new CircularLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(99);
		myList.insertFirst(88);
		myList.insertLast(111111);   
		myList.displaylist();
	}

}
