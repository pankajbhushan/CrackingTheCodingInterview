package com.crackingthecodinginterview.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 *@author Pankaj
 *
 * Write code to remove duplicates from an unsorted linked list.
 *
 */
public class RemoveDups {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Node head = null;
		Node curr = null;
		String[] values = br.readLine().split(" ");
		head = new Node(Integer.valueOf(values[0]));
		head.next = curr;

		for (int i = 1; i < values.length; i++) {
			curr = new Node(Integer.valueOf(values[i]));
			curr = curr.next;
		}
		
		removeDups(head);
		printList(head);
		System.out.println("Head points to: " + head.value);
	}
	
	private static void removeDups(Node head) {
		Node curr = head;
		Node next = curr.next;
		while(null != next) {
			if(curr.value > next.value) {
				//TODO Implement sorting logic here
			}
		}
		
	}

	private static void printList(Node node) {
		while(node.next != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}

}

class Node{
	int value;
	Node next;
	
	public Node(int value) {
		this.value = value;
	}
}