package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<>() ;

		queue.add("Dhaka");
		queue.add("Khulna");
		queue.add("Rajshahi");
		queue.add("Syshet");
		queue.add("Chittagong");

		System.out.println(queue);

		System.out.println(" ");

		for(String st: queue){
			System.out.println(st);
		}
		System.out.println(" ");

		Iterator it = queue.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(" ");
		System.out.println(((LinkedList<String>) queue).pop());

		System.out.println(queue.remove());
	}

}




