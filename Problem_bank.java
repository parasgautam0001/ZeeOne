class Account{
    String name;
    int acc_no;
    float amount;
    void insert(String n,int ac,float amt){
        name=n;
        acc_no=ac;
        amount=amt;
        System.out.println("Data inserted successfully!");
    }
    void deposit(float am)
    {
        amount+=am;
        System.out.println("Rs."+am+" has been added to your account.");
    }
    void withdraw(float am)
    {
        if(am>amount)
        {
            System.out.println("Insufficient balance!");
        }
        else
        {
            amount-=am;
            System.out.println("Rs."+am+" deducted successfully");
        }
    }
    void check_balance(){
        System.out.println("Your account balance is "+amount);
    }
}
public class Problem_bank {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.insert("sujit", 6969,0);
        a1.deposit(100);
        a1.withdraw(80);
        a1.check_balance();
        a1.withdraw(150);
        a1.check_balance();
    }
}
