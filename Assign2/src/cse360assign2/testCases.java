package cse360assign2;

public class testCases {
	
	public static void main(String[] args) {
		
		AddingMachine myCalculator = new AddingMachine();
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		myCalculator.add(0);
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		myCalculator.add(0);
		
		System.out.println(myCalculator.toString());
	}
}
