package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

import Array.Array;


public class Stackandqueue {
	// priority queue , queue, dequeue, enqueue, block queue
	//lifo=>last in first out  
	public void stack() {
		Stack<Integer> ticketbookings=new Stack<Integer>();
		ticketbookings.push(25);
		ticketbookings.push(30);
		ticketbookings.push(40);
		ticketbookings.push(80);
		ticketbookings.pop();// removes last elements
		ticketbookings.push(35);
		System.out.println(ticketbookings);
		System.out.println(ticketbookings.peek());// prints the last element
		

	}
	
	
	// queue
	
	public void queue() {
		// first in first out
		Queue<String> foodordering=new LinkedList<String>();
		foodordering.add("krish");
		foodordering.add("shree");
		foodordering.add("kumar");
		foodordering.add("kumar");
		foodordering.poll();
		foodordering.peek();
		foodordering.remove();
		foodordering.peek();
		
		System.out.println(foodordering);
	}
	
	public void Dequeue() {
		// dequeue we can add both front and last
		// allows duplicates in because it is an arraydequque
		ArrayDeque<Integer> trainbooking=new ArrayDeque<Integer>();
		trainbooking.add(20);
		trainbooking.add(30);
		trainbooking.addFirst(40);
		trainbooking.addLast(60);
		trainbooking.removeLast();
		
		
		trainbooking.removeAll(trainbooking);
		trainbooking.poll();// removes first element
		trainbooking.pollLast();//removes last one
		trainbooking.offer(10);//inserts in the end of the dequeue
		trainbooking.offerFirst(30);
		trainbooking.offerLast(45);
		trainbooking.remove();// removes the head of hte dequeu smae as poll but it will through as exception if it is empty
		trainbooking.remove();
		trainbooking.remove();
//		trainbooking.remove();// for this last one it throws exception that no such elelmet exception
		trainbooking.push(25);// removes first term
		trainbooking.push(35);
		trainbooking.push(38);
		trainbooking.pop();
		System.out.println("arraydequeue"+trainbooking);
		
	}
	
	public void blockedqueue() {
		// we have to give fixed vvalue of size if size exceeds shows exception
		Queue<Integer> fixedsize=new LinkedBlockingQueue<Integer>(3);
		fixedsize.add(1);
		fixedsize.add(2);
//		fixedsize.add(5);
		fixedsize.offer(30);
//		fixedsize.offer(40);
//		fixedsize.add(40);
		System.out.println(fixedsize);
	}
	public void blockeddeque() {
		Deque<Integer> fixed=new LinkedBlockingDeque<Integer>(4);
		fixed.add(25);
		fixed.addFirst(30);
		fixed.addLast(45);
		System.out.println(fixed.peek());// see the first element;
		fixed.add(654);
		fixed.removeFirst();
		System.out.println(fixed.contains(25));
		System.out.println(fixed);
		System.out.println(fixed.size());
		
		
	}
	// mostly asked question priority queue;
	public void Priorityqueue() {
		// 
		
		
		// based on priority it tries to push with lowest pririty
		// it follows the lowest value insertion tree method use that is your note;
		
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		queue.add(5);
		queue.add(7);
		queue.add(3);
		queue.add(9);
		queue.add(4);
		
		System.out.println(queue);
		// it also follows sam min heap structure and alphabetical order
		PriorityQueue<String> queues=new PriorityQueue<String>();
		queues.add("shree");
		queues.add("anu");
		queues.add("krishna");
		queues.add("jskdjjhdjff");
		queues.add("hi");
		
		System.out.println(queues);
		
		
	}
	public static void main(String[] args) {
		
		
		
		Stackandqueue stacks=new Stackandqueue();
		stacks.stack();
		stacks.queue();
		stacks.Dequeue();
		System.out.println("blockedqueue");
		stacks.blockedqueue();
		stacks.blockeddeque();
		System.out.println("priority queue");
		stacks.Priorityqueue();
		
	}

}
