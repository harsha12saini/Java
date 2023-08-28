package mypkg;
import java.util.*;

public class RentCars {
public static void addCar(int plateNumber, Stack<Integer> driveAway) {
	driveAway.push(plateNumber);
}

public static void removeCar(int plateNumber,Stack<Integer> driveAway, Stack<Integer> street ) {
	boolean carFound=false;
	plateNumber=Math.abs(plateNumber);
	while(!driveAway.isEmpty()) {
		if(driveAway.peek()!=plateNumber) {
			street.push(driveAway.pop());
		}
		else {
			driveAway.pop();
			carFound=true;
			break;
		}
	}
	if(!carFound) {
		System.out.println("requested car not found in driveaway");
	}
}

	public static void backToDriveAway(Stack<Integer> driveAway, Stack<Integer> street) {
		while(!street.isEmpty())
			driveAway.push(street.pop());
	}
	
	public static void printStack(Stack<Integer> stack) {
		for(int carNumber: stack) {
			System.out.println(carNumber + " ");
		}
	}
}
