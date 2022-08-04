package lab2Part2;
/**
 * This class represents Process
 * @author Joshua Domzalski
 * Programming Project 2
 * Summer 2022
 */


//Implementing the Comparable and Priority interfaces into the class

public class Process implements Comparable<Process>, Priority{
	
	//Declaring two variables; processID and priority

	private String processID;
	private int priority;
	
	/**
	 * Creating an empty constructor for Process
	 */
	
	public Process() {
		this.processID = " ";
		this.priority = 0;
	}
	
	/**
	 * //Creating a Process constructor that allows us to pass in the ID of the process as well as the process's priority
	 * @param processID
	 * @param priority
	 */
	
	public Process(String processID, int priority) {
		this.processID = processID;
		this.priority = priority;
		
	}
	
	/**
	 * //Method that allows us to set the priority
	 */
	@Override
	public void setPriority(int priority) {
		this.priority = priority;
		
	}
	
	/**
	 * //Method that returns priority
	 */

	@Override
	public int getPriority() {
	
		return priority;
	}
	
	/**
	 * //Method that returns ProcessID
	 * @return
	 */

	public String getProcessID() {
		return processID;
	}
	/**
	 * //Method that allows us to set processID
	 * @param processID
	 */
	public void setProcessID(String processID) {
		this.processID = processID;
	}


	/**
	 * //toString method
	 */
	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}

	/**
	 * //compareTo method that compares the priority of a Process object to the priority of another Process object
	 */
	@Override
	public int compareTo(Process o) {
		if(this.priority ==o.priority) {
			return 1;
		}
		else {
		return -1;
	}
	

}

	
}
//end class
