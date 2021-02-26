package bank;
import java.util.*;

public class deposit {
    int depositType;
    double depoAmount, interest, rate_i, months;
    public double finalAmount;
    public deposit(float amount,int dp, int months)
    {
        depoAmount = amount;
        depositType = dp;
        rate_i = 5.5f;
        this.months = months/12;
    }
    public void calculateInterest()
    {
        if(depositType == 1){
            interest = (depoAmount*rate_i*months)/100;
            finalAmount=depoAmount+interest;
            System.out.println("At Maturity "+finalAmount);}
        else{
            Scanner s = new Scanner(System.in);
            int n;
            System.out.println("1.Quarterly(4) 2.half-yearly(2) 3.monthly(12)\n");
            n = s.nextInt();
            finalAmount = depoAmount * Math.pow(1 + (0.08 / n), n * months);
            interest = finalAmount - depoAmount;
            System.out.println("Compound Interest after " + months + " years: "+interest);
            System.out.println("Amount after " + months + " years: "+finalAmount);
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input Amount, deposit type(1.FD 2.RD), Months");
        int a = s.nextInt();
        int t = s.nextInt();
        int m = s.nextInt();
        deposit d = new deposit(a, t, m);
        d.calculateInterest();
    }
}
