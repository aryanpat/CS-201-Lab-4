package lab4;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the month: ");
		String month = input.next();
		
		switch(month) {
		case "1":
		case "3":
		case "5":
		case "7":
		case "8":
		case "10":
		case "12":
		case "January":
		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			System.out.println(month + " has31 days!");
			break;
		
		case "4":
		case "6":
		case "9":
		case "11":
		case "April":
		case "June":
		case "September":
		case "November":
			System.out.println(month + " has 30 days!");
			break;
		
		case "2":
		case "Febuary":
			System.out.println(month + "has 28 days!");
			
			default:
				System.out.print("Enter a vaild month, " + month + " is not vaild.");
		
		input.close();
		}
	}

}
