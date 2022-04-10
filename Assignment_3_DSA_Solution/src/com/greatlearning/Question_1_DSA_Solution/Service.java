package com.greatlearning.Question_1_DSA_Solution;

import java.util.PriorityQueue;

public class Service {
	public void printConstructionTable(int[] floors, int totalFloors) {
		System.out.println("The order of construction is as follows");
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(java.util.Collections.reverseOrder());

		int[] tempArray = new int[totalFloors];
		int max = totalFloors;

		System.out.println();
		for (int i = 0; i < totalFloors; i++) {
			System.out.println("Day: "+(i+1));
			
			tempArray[i] = floors[i];
			queue.add(tempArray[i]);
			
			while (!queue.isEmpty() && queue.peek() == max) {
				System.out.print(queue.poll() + " ");
				max--;
			}
			
			System.out.println();

		}

	  }

}
