
public class Application {
	
	/**
	 * This is a class that is testing our Comparable interface implementation
	 * @author Joshua Domzalski
	 * Programming Project 2
	 * Summer 2022
	 */

	public static void main(String[] args) {
		//Creating a first RationalNumber object
		RationalNumber r1 = new RationalNumber (6,8);
		//Creating a second RationalNumber object
		RationalNumber r2 = new RationalNumber (3,4);
		//Comparing the first object to the second object
		System.out.println(r1.compareTo(r2));
		//Creating a third RationalNumber object
		RationalNumber r3 = new RationalNumber (1,2);
		//Creating a fourth RationalNumber object
		RationalNumber r4 = new RationalNumber(1,3);
		//Comparing the third object to the fourth object
		System.out.println(r3.compareTo(r4));
		//Creating a fifth RationalNumber object
		RationalNumber r5 = new RationalNumber(2,7);
		//Creating a sixth RationalNumber object
		RationalNumber r6 = new RationalNumber(8,11);
		//Comparing the fifth object to the sixth object
		System.out.println(r5.compareTo(r6));

	}
	//end main

}
//end class
