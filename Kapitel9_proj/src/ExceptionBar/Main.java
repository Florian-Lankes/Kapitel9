package ExceptionBar;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Gebe die Temperatur eines kalten Getränkes ein:");
			int input = sc.nextInt();
			
			try {
				ServeDrink(input);
			} catch(DrinkToWarmException e) {
				System.out.println(e.getMessage());
			} catch(DrinkToColdException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void ServeDrink(int Temperature) throws DrinkToWarmException, DrinkToColdException{
		if(Temperature > 10) {
			throw new DrinkToWarmException("Getränk ist zu warm");
		}else if(Temperature < 6 ) {
			throw new DrinkToColdException("Getränk ist zu kalt");
		}
	}
}
