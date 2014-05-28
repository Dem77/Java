package single;

import java.util.Random;

public class TestSLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime, endTime;
		startTime = System.nanoTime();
		long freeMemory, totalMemory;
		long freeMemory2, totalMemory2;
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		freeMemory = (long) runtime.freeMemory();
		totalMemory = (long) runtime.totalMemory();
		
		
		SLinkedList myList = new SLinkedList();
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		int randomLetter;
		
		for (int i =1 ; i<=4500000; i++) {
			randomLetter = rand.nextInt(26) + 65; 
			myList.addFirst(new Node( (char)randomLetter+"" , null));
		}
		
		Node current = myList.getHead();
		for (int i=1; i<=myList.getSize(); i++) {
			System.out.print(current.getElement());
			current=current.getNext();
			if (i%40==0) System.out.println("");
		}
		
		System.out.println("---------------------------");
		
	    endTime = System.nanoTime();
		System.out.println("Total Memory1 : " + totalMemory);
		System.out.println("Free Memory1 : " + freeMemory);
		System.out.println("Program Usage1 : " + (totalMemory-freeMemory));
		freeMemory = (long) runtime.freeMemory();
		totalMemory = (long) runtime.totalMemory();
		System.out.println("Total Memory2 : " + totalMemory);
		System.out.println("Free Memory2 : " + freeMemory);
		System.out.println("Program Usage2 : " + (totalMemory-freeMemory));
		System.out.println ("Program Execution Time " + (endTime-startTime));
	}

}
