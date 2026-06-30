/*1. Question: ATM Machine Simulator
Write a program to simulate basic ATM operations. Your program should perform the following tasks:
Requirements:
1.	Prompt the user to enter a 4-digit PIN.
2.	If the PIN is correct (assume the correct PIN is "1234"), display a menu with the following options:
o	1. Check Balance
o	2. Withdraw Money
o	3. Deposit Money
o      4. Exit
3.	Based on the user's choice:
o	If the user selects 1, display the current balance (assume the initial balance is ₹10,000).
o	If the user selects 2, prompt the user to enter a withdrawal amount. Deduct the amount from the 
balance only if the withdrawal 
amount is less than or equal to the balance and multiple of 100.
o	If the user selects 3, prompt the user to enter a deposit amount and add it to the balance. 
(multiple of 100 and less than 40000)
4.	If the PIN entered is incorrect, deny access with an appropriate message.
5.	Handle invalid menu choices gracefully.
________________________________________
Test Case:
Input:
Enter your 4 digit pin:- 1234
Welcome
1.Check Balance 
2. Withdraw Money
3. Deposit Money 
4. Exit
Enter your choice (1/2/3/4):
1
Your current balance is: 10000
Enter your choice (1/2/3/4):
2
Enter your withdraw amount:5400
Withdraw successful
Enter your choice (1/2/3/4):
1
Your current balance is: 4600

Enter your choice (1/2/3/4):
2
Enter your withdraw amount:5000
Insufficient Balance
Enter your choice (1/2/3/4):
2
Enter your withdraw amount:4020
Please enter valid amount
Enter your choice (1/2/3/4):
3
Enter your Deposit amount:2500
Deposit successful
Enter your choice (1/2/3/4):
1
Your current balance is: ?7100
Enter your choice (1/2/3/4):
5
Invalid Option
Enter your choice (1/2/3/4):
4
Thank you*/

import java.util.*;
public class Atm
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 4-digit pin: ");
		int n = sc.nextInt();
		int initialbalance = 10000;
		
		if(n == 1234){
		    int choice = 0;
		    while(choice != 4) {
		    System.out.println("What do you want to do?");
		    System.out.println("1. Check Balance \n2. Withdraw Money\n3. Deposit Money\n4. Exit");
		 
		System.out.println("Enter a choice: (1/2/3/4)");   
		choice = sc.nextInt();
		switch(choice){
		    case 1:
		        System.out.println("The current balance is "+initialbalance);
		        break;
		    case 2:
		        System.out.print("Enter the amount to be withdrawn: ");
		        int amount = sc.nextInt();
		        if(amount <= initialbalance){
		            if(amount %100 == 0){
		            System.out.print("Now the total balance is: ");
		            int balance = initialbalance - amount;
		            System.out.println(balance);
		            }
		        }
		        else{
		            System.out.println("Enter an amount that is multiple of 100 and less than initial balance.");
		        }
		        break;
		     case 3:
		         System.out.print("Enter the amount to be deposited: ");
		         int depositamount = sc.nextInt();
		         if(depositamount == 40000){
		             if(depositamount%100 == 0){
		             int current = depositamount + initialbalance;
		             System.out.println("The amount after deposit is "+current);
		             }
		         }
		         else{
		             System.out.println("Enter an amount that is multiple of 100 and less than 40000.");
		         }
		         break;
		      case 4:
		          System.out.println("Thank you");
		          break;
		      default:
		          System.out.println("Enter the any of the choice from given.");
		}
		    }
		}
		else{
		    System.out.println("Enter pin correctly");
		}
	}
}