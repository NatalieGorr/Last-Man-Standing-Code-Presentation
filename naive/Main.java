import java.lang.*;
import java.io.*;
import java.util.*;


class Main{
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int numberOfRuns= obj.nextInt();
		
		for(int j = 1; j <= numberOfRuns; j++ ) {
			
			int n = obj.nextInt();
			int k = obj.nextInt();	
			
			//populate the circle with numbers 1 to n
			Node head = new Node(1);
			Node current = head;
			for(int i = 2; i<=n; i++) {	
				current.next = new Node(i);
				current = current.next;
			}
			//point the end of the list back to the head
			current.next = head;
			
			
			Node lastMan = head;
			while(lastMan.next!=lastMan) {
				
				for(int i = 1; i < k-1; i++) {
					lastMan = lastMan.next;
				}		
				lastMan.next = lastMan.next.next;
				lastMan = lastMan.next;
			}
			
			System.out.println("case " + j +": " +lastMan.data);
			
			
			
			
		}
		
		
	}
		
	static class Node{
		int data;
		Node next = null;			
		Node(int n){
			this.data = n;
		}		
	}		
}
