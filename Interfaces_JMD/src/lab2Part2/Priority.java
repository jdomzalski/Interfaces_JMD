package lab2Part2;
/**
 * This interface is used to create some variables as well as a getter and setter that all relate to priority
 * @author Joshua Domzalski
 * Programming Project 2
 * Summer 2022
 */

public interface Priority {
	//Declaring a value for the medium priority
	static final int MED_PRIORITY = 5;
	//Declaring a value for the minimum priority
	static final int MIN_PRIORITY = 1;
	//Declaring a value for the maximum priority
	static final int MAX_PRIORITY = 10;
	//Creating a method that allows us to set the priority of the object
	public void setPriority(int priority);
	//Creating a method that allows us to see what the priority of an object is
	public int getPriority();
}
//end interface