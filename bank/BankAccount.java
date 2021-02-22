package bank;

class details
{
    String Name;
    String phone;
    String dob;
    details(String Name, String dob, String phone)
    {
        this.Name = Name;
        this.phone = phone;
        this.dob = dob;
    }
    void display()
    {
        System.out.println("Name: "+Name+"\nPhone: "+phone+"\nDOB: "+dob);
    }
}
class LowBalanceException extends Exception
{
    LowBalanceException(String messageOfException)
    {  
        super(messageOfException); // message passing to super class which is Exception  
    }  
}
public class BankAccount extends details
{
    public int cId ;
    public float balance;
    static int lowBalance = 100;
    public float prevTran;
    public BankAccount(String Name, String phone, String dob, int i)
    {
        super(Name, phone, dob);
        cId = (i);
        balance = 100;
    }
    public float getbalance()
    {
        return balance;
    }
    public void deposit(float amount)
    {
        balance += amount;
    }

	public void withdraw(float amount)
    {
        if(amount <  lowBalance)
        {
            try
            {
                throw new LowBalanceException("You can't withdraw your amount if amount is less than 1000");
            }
            catch(LowBalanceException e) 
            {
                e.printStackTrace();
            }
        }
        else  
        {
            balance = balance - amount;
            prevTran = -amount;
        }
    }
    public void display()
    {
        System.out.println("\nCustomerID: "+cId);
        super.display();
    }
}
