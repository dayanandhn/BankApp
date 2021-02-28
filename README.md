Introduction
	The problem statement chosen here is to simulate the functions of a simple banking application. The application can be used to create an account, add and withdraw money to and from the account, check balance, deposit money in terms of Fixed Deposit or Recurring deposit and print passbook with the transactions held. The application is built using Java and can be executed in terminal or command prompt.
Github link : https://github.com/dayanandhn/BankApp

Requirements
    • JDK 11  or above.
    • Command prompt if windows or Terminal if linux to run the program.

Packages
	Bank package is created with details, BankAccount, deposit and LowBalanceException classes. The Bank package is imported to utilize the functions of the defined classes. 

Menu
	The program starts with the bankapp.java file which provides a menu-driven interface for the project. The user is prompted to enter name, phone number and date of birth. The menu has options to check balance, add money into his account, withdraw money from his account, check the previous transactions and print his passbook.

BankAccount
	It has a base class details which stores the customer name, phone and dob details. A parameterized constructor details is used to initialize values. A display method to display the customer details.
	LowBalanceException class inherits the Exception class and is used to display messages related to low balance activities.
	BankAccount class inherits the details class and has members balance and customer id with static low balance value of 100. The BankAccount constructor initializes the customer id and balances. An array to record the previous transactions which is also used to print the passbook. addAmount method adds amount to the account and records the transaction. Withdraw method is used to withdraw amount from the account only if the withdrawal amount is greater than balance amount and exception to ensure that after withdrawal, the balance does not reach a low balance and the transaction is recorded. PrintPassbook method prints the transactions held in the account.

Deposit
	Deposit class is used to deposit a particular value of amount from the current account for a fixed term or recurring term. The user is prompted to enter the deposit details as FD or RD, the amount to be deposited, and duration of the deposit. The deposit amount specified will be deduced from the current account and the matured amount including the interest will be reflected back into the current account. These transactions will also be recorded. The interest rate is fixed at 5.5% per annum for fixed deposit and 8% per annum for recurring deposit.

Program flow
	The Bank package is imported and the user details are collected and an object is created. 
    • The menu will be displayed with the options.
    • The user has to input an option.
    • If the input is to check balance, the balance will be displayed. 
    • If the input is to add an amount, the amount will be read and the addAmount method of the BankAccount class will be invoked and the amount passed will be added to the account balance. The transaction will be recorded.
    • If the input is to withdraw an amount, the amount will be read and the withdraw method of the BankAccount class will be invoked. If the condition for low balance is true, an exception is raised and a LowBalanceException will be thrown else, amount will be deducted from the account balance. The transaction will be recorded.
    • If the user wants to deposit, deposit amount, deposit type (FD or RD) and duration is read, a deposit object is created. The amount is withdrawn from the account, interest is calculated, and the maturity amount is added to the account balance.
    • If the user wants to print the passbook, the previous transaction array is traversed and the deposit and withdrawals held in the account are printed.
    • The user can exit from the system, if specified exit option.

Usage of OOPS
	The project coding is done with the help of OOPS concepts. BankAccount details are inherited from the details class, Exception handling mechanisms to prevent illegal low balance transactions, the bankaccount, details and deposit classes are converted into a package so that they can be utilized in other projects too, proper use of constructors to initialize values with the usage of super classes.

Conclusion
	Thus by implementing the OOPS in Java, the banking application has been built.

Contribution
	Aravind. R(1817105) - created the exception, details class and bank account class.
	Dayanandh. N(1817110) - connected all the three classes in the main file and created the package bank.
	Sanjay Kumar. V(1817142) - created the deposit class and added to the package.
