package com.greatlearning.Question_1_DSA_Solution;

import java.io.IOException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		
		int totalFloors = sc.nextInt();
	    int[] floors = new int[totalFloors];
		
	   
		for(int i=0; i<totalFloors; i++) { 
		System.out.println("Enter the floor size given on day : "+i);
		floors[i] = sc.nextInt(); 
		}  
		System.out.println();
		
		Service service = new Service();
		service.printConstructionTable(floors, totalFloors);
	}

}
