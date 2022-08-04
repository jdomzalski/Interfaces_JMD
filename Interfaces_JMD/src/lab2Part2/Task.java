package lab2Part2;
/**
 * This class represents Task
 * @author Joshua Domzalski
 * Programming Project 2
 * Summer 2022
 */

//Implementing the Comparable and Priority interfaces into the class

public class Task implements Priority, Comparable<Task>{
	
	//Creating an enum that lists different Status options that a Task could be in
	enum Status{
		NOT_STARTED, IN_PROCESS, COMPLETE
	}
	
	//Creating a Status variable that will allows us to create getters and setters for the enum
	private Status myStatus;
	
	//Creating two variables for the Task; name and priority
	private String name;
	private int priority;
	
	/**
	 * Creating an empty constructor for Task
	 */
	
	public Task() {
		this.name = " ";
		this.priority = 0;
	}
	
	/**
	 * //Creating a preferred Task constructor that allows us to pass in the name of the task as well as it's priority
	 * @param name
	 * @param priority
	 */
	public Task(String name, int priority) {
		this.name=name;
		this.priority = priority;
	}
	
	/**
	 * //Returns the name of the Task
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * //Allows us to set the name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * //Returns the Status of a given Task
	 * @return
	 */
	public Status getStatus() {
		return myStatus;
	}
	
	/**
	 * //Allows us to set the Status of a Task
	 * @param s
	 */
	public void setStatus(Status s) {
		myStatus = s;
	}
	
	/**
	 * //Allows us to set the priority of a task
	 */
	public void setPriority(int priority) {
		
		this.priority = priority;
	}
	
	
	/**
	 * //Returns the priority of a task
	 */
	public int getPriority() {
		return priority;
		
	}
	
	
	/**
	 * //compareTo method that allows us to compare the priority of one Task object with the priority of another Task object
	 */
	@Override
	public int compareTo(Task o) {
		
		if(this.priority == o.priority) {
			return 1;
		}
		else {
		return -1;
	}
	}

	
	/**
	 *toString method
	 */
	@Override
	public String toString() {
		return "Task [myStatus=" + myStatus + ", name=" + name + ", priority=" + priority + "]";
	}

	


	
}
//end class





	
