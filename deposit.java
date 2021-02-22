import java.util.*;

public class deposit {
    int depositType;
    float depoAmount, interest, ip;
    int months;
    deposit(float amount,int dp, int months)
    {
        depoAmount = amount;
        depositType = dp;
        ip = 5.5f;
        this.months = months;
    }
    float calculateInterest()
    {
        float i = (depoAmount*ip*months)/100;
        System.out.print(i);
        return i;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input Months, deposit type(1.FD 2.RD)");
        int c = s.nextInt();
        int t = s.nextInt();
        deposit d = new deposit(2000,t, c);
        d.interest = d.calculateInterest();
        System.out.print("Final Amount: "+d.interest);
    }
}
