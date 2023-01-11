package ExceptionBar;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		int[] stock = new int[1];
		stock[0] = 10;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Gebe die Temperatur eines kalten Getränkes ein: ");
			int input = sc.nextInt();
			
			try {
				ServeDrink(input, stock);
				System.out.println("Das Getränk ist optimal und der Kunde ist zufrieden");
			} catch(DrinkToWarmException e) {
				System.out.println(e.getMessage());
			} catch(DrinkToColdException e) {
				System.out.println(e.getMessage());
			} catch(OutOfStockException e) {
				System.out.println(e.getMessage());
			}finally {
				System.out.println();
			}
		}
	}
	
	public static void ServeDrink(int Temperature, int[] stock) throws DrinkToWarmException, DrinkToColdException, OutOfStockException{
		//Wenn das Getränk zu warm/kalt ist werden automatisch zwei Getränke aus dem Vorrat abgezogen, da der Kunde ein neues Getränk Serviert bekommt
		//6°C liegen noch in der Tolerant von +-2°C (ist den dem Beispiel aus der Aufgabenstellung falsch dargestellt)
		if(stock[0] <= 0) {
			throw new OutOfStockException("Vorrat im Lager ist leer");
		}
		stock[0]-=1;
		if(Temperature > 10) {
			stock[0]-=1;
			System.out.println("Neuer Vorrat: " + stock[0]);
			throw new DrinkToWarmException("Getränk ist zu warm");
		}else if(Temperature < 6 ) {
			stock[0]-=1;
			System.out.println("Neuer Vorrat: " + stock[0]);
			throw new DrinkToColdException("Getränk ist zu kalt");
		}
		System.out.println("Neuer Vorrat: " + stock[0]);
	}
}
