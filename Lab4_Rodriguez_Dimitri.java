//Dimitri Rodriguez
//P6.7
//CS 234
import java.util.Scanner;
public class Lab4_Rodriguez_Dimitri{
	public static void printSeats(int[][] seats){
		Scanner in = new Scanner(System.in);
		int[][] newSeats = seats;
		System.out.println(newSeats);
	}
	
	public static void sellSeatByPrice(int[][] seats, int price){
		Scanner in = new Scanner(System.in);
		for (int i = 0; i == 91; i++) {
			for (int e = 0; e == 10; e++){
			if (seats[i][e] == price){
				seats[i][e] = 0;
				printSeats(seats);
			}
			else if (i == 91){
				System.out.println("Sorry, seat already occupied");
			}
			}
		}
		printSeats(seats);
	}
	
	public static void sellSeatByNumber(int[][] seats){
		Scanner in = new Scanner(System.in);
		System.out.println("Chose row");
		int row = in.nextInt();
		System.out.println("Now Column");
		int column = in.nextInt();
		if (column > 0){
			if (seats[row][column] != 0){
				System.out.println("Are you sure? (y/n)");
				String opt = in.nextLine();
				if ("y".equals(opt)){
					seats[row][column] = 0;
					printSeats(seats);
				}
				if ("n".equals(opt)){
					System.out.println("Sale canceled");
				}
			}
		}
	}
	
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		String priceString = "p";
		String salePrice = "s";
		String quitString = "q";
		String opt = in.nextLine();
		System.out.println("Welcome to the theater (y/n)");
		int[][] seats = {{10,10,10,10,10,10,10,10,10,10},
			             {10,10,10,10,10,10,10,10,10,10},
						 {10,10,10,10,10,10,10,10,10,10},
						 {10,10,20,20,20,20,20,20,10,10},
						 {10,10,20,20,20,20,20,20,10,10},
						 {10,10,20,20,20,20,20,20,10,10},
						 {20,20,30,30,40,40,30,30,20,20},
						 {20,30,30,40,50,50,40,30,30,20},
						 {30,40,50,50,50,50,50,50,40,30}};
		/*
		do {
			System.out.println("Would you like to purchase by price or by seat? Or would you like to quit? (Use p,s, and q)");
			opt = in.nextLine();
		}
		while (opt != priceString || opt != salePrice || opt != quitString);
		*/
		if ("s".equals(opt)){
			System.out.println("Are you sure?");
			opt = in.nextLine();
			if ("y".equals(opt)){
				sellSeatByNumber(seats);
			}
		}
		if ("p".equals(opt)){
			System.out.println("Are you sure?");
			opt = in.nextLine();
			if ("y".equals(opt)){
				System.out.print("Select a price");
				int price = in.nextInt();
				sellSeatByPrice(seats, price);
			}
		}
		if("q".equals(opt)){
			System.out.println("Program terminated");
		}
		printSeats(seats);
	}
}