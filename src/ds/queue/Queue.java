package ds.queue;

public class Queue {
private int maxSize;// initialize the set number of slots
private long[] queueArray;//slots to main the data
private int front;;//index position for the element in the front
private int rear;//index position for the element at the back of the queue
private int nItems;
public Queue(int size) {
	this.maxSize = size;
	this.queueArray = new long[size];
	front = 0;//index of the first slot of the array
	rear = -1;//no item in the array 
	nItems =0;// no elements in the array yet	
}

public void insert(long i) {
	if(rear == maxSize-1) {
		rear = -1;
	}
	rear++;
	queueArray[rear]=i;
	nItems++;
}
public long remove() {
	long temp =queueArray[front];
	front++;
	if(front == maxSize) {
		front =0;
	}
	nItems--;

	return temp;	
}

public long peekFront() {
	return queueArray[front];
}
public boolean isEmpty() {
	return(nItems==0);
}
public boolean isFull() {
	return(nItems==maxSize);
}
public void view() {
	System.out.println("[ ");
	for(int j=0;j<queueArray.length;j++) {
		System.out.print(queueArray[j] + " ");
	}
	System.out.print("]");
}

}
