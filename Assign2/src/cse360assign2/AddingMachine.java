/*
Name: Joel Binu George
Class ID: 8515 F - 9:40 - 10:30 AM
Description: This program is a class file that adds subtracts, gets the total 
and also print out the expression in the form of a string
*/
package cse360assign2;

public class AddingMachine {

	private int total; //running total
	private StringBuffer history; //running history of expressions
	
	/**
	 * This method starts from 0 and appends 0 into the expression string
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = new StringBuffer("0"); //starts out with 0
	}
	
	/**
	 * This method gets the total of the operations and returns total
	 * @return returning the total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method adds the value that is inputted into the expressions
	 * @param value value that is used to be manipulated by the method
	 */
	public void add (int value) {
		total = total + value; //adds value to the total
		history.append((" + ") + value); //concatinates + to the value
	}
	
	/**
	 * This method subtracts the value that is inputted into the expressions
	 * @param value value that is used to be manipulated by the method
	 */
	public void subtract (int value) {
		total = total - value; // subtracts value to the total
		history.append((" - ") + value); // concatinates - to the value
	}
	
	/**
	 * This method returns all the expressions that were inputted as a string
	 */
	public String toString () {
		return history.toString(); //makes the expression into a string
	}

	/**
	 * This method clears the running total that was gotten before and turns in into 0
	 */
	public void clear() {
		total = 0; 
	}
}
