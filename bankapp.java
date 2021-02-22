import bank.*;
import java.util.*;

class bankapp {
    public static void main(String args[])
    {
        System.out.println("Hello");
        String Name, phone, dob;
        char option;
        int i=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name, Phone, DOB");
        Name = scanner.nextLine();
        phone = scanner.nextLine();
        dob = scanner.nextLine();
        BankAccount c1 = new BankAccount(Name, phone, dob, i);
        
        System.out.println("A : Check Your Balance");
		System.out.println("B : Deposit");
		System.out.println("C : Withdraw");
		System.out.println("D : Previous Transaction");
		System.out.println("E : Exit The System");
		
		do {
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			System.out.println("Enter Your Option");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
			option = scanner.next().charAt(0);

			
			switch (option) {
			
                case 'A':
                    System.out.println("-------------------------------------------------------");
                    c1.display();
                    System.out.println("Balance = "+c1.getbalance());
                    System.out.println("-------------------------------------------------------");
                    break;
                    
                case 'B':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Enter an amount to deposit ");
                    System.out.println("-------------------------------------------------------");
                    float amount; amount =  scanner.nextFloat();
                    c1.deposit(amount);
                    break;
                    
                case 'C':
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Enter an amount to withdraw ");
                    System.out.println("-------------------------------------------------------");
                    float amount2 = scanner.nextFloat();
                    c1.withdraw(amount2);
                    break;
                    
                case 'D':
                    System.out.println("-------------------------------------------------------");
                    System.out.println(c1.prevTran);
                    System.out.println("-------------------------------------------------------");
                    System.out.println("\n");
                    break;
                    
                case 'E' :
                    System.out.println("=========================================================================================================");
                    break;

                default:
                    System.out.println("Invalid Option!! Please Enter Correct Opton...");
                    break;
			}			
		}while(option != 'E');
			System.out.println("Thank You for Using our Services.....!!");
	}
}
