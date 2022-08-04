package lab2Part2;

import lab2Part2.Task.Status;
/**
 * This class represents our testing of all the methods in the project
 *@author Joshua Domzalski
 *Programming Project 2
 *Summer 2022
 */

public class Application {

	public static void main(String[] args) {
		//Creating two new Tasks objects
		Task t1 = new Task("Arrange", 8);
		Task t2 = new Task("Sync", 8);
		//Comparing the priorities of the two objects
		System.out.println(t1.compareTo(t2));
		//Creating two new Process objects
		Process p1 = new Process("Prepare", 7);
		Process p2 = new Process("Place", 10);
		//Comparing the priorities of the two objects
		System.out.println(p1.compareTo(p2));
		//Printing out the Maximum Priority
		System.out.println(t1.MAX_PRIORITY);
		//Printing out the Minimum priority
		System.out.println(t1.MIN_PRIORITY);
		//Printing out the Medium Prority
		System.out.println(t1.MED_PRIORITY);
		//Setting the Status of t1 to Not Started and printing the result
		t1.setStatus(Status.NOT_STARTED);
		System.out.println(t1.getStatus());
		//Creating two new Task objects
		Task t3 = new Task("Compute", 4);
		Task t4 = new Task("Run", 2);
		//Comparing the priorities of the two objects
		System.out.println(t3.compareTo(t4));
		//Changing the Status of t1 to Complete and printing the result
		t1.setStatus(Status.COMPLETE);
		System.out.println(t1.getStatus());
		t2.setStatus(Status.IN_PROCESS);
		System.out.println(t2.getStatus());
		
		
		
		

	}
	//end main

}
//end class
