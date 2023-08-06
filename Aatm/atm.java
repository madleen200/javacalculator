package Aatm;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class atm {
	
	static double balance = 1000;
 public static void main(String[] args) {
	 Scanner Scanner = new Scanner(System.in);
	 Usr madleen = new Usr();
   
	Acc a = new Acc("economic");
   atm m =new atm();
		
		List<Acc> Accounts = new ArrayList<Acc>();

		Accounts.add(a);

		madleen.setName("Madleen");
		madleen.setAccount(Accounts);
	
	 int choice=4;
		do {
			System.out.println("What would you like to do?");
			System.out.println("1. Check balance");
			System.out.println("2. Deposit money");
			System.out.println("3. Withdraw money");
			System.out.println("4. Exit");
			choice = Scanner.nextInt();
			int amount =0;
			switch (choice) {
		case 1:
			Acc.checkBalance(a, balance);;
				break;
			case 2:
				Acc.depositMoney(a, amount);
				break;
			case 3:
				Acc.withdraw(a, amount);
				break;
		
			case 4:
		         Acc.Exit(a);
				break;
			default:
				System.out.println("Invalid choice.");
			}
		} while (choice != 4);
	
		System.out.println("Login failed!");
	} 
		}
		

