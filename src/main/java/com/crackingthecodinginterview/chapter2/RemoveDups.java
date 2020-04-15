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
		Node head = new Node();
		Node curr = new Node();
		String[] values = br.readLine().split(" ");
		head.value = Integer.valueOf(values[0]);
		head.next = curr;

		for (int i = 1; i < values.length; i++) {
			curr.value = Integer.valueOf(values[i]);
			curr.next = new Node();
			curr = curr.next;
		}
		
		printList(head);
		System.out.println("Head points to: " + head.value);
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
}