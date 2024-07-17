package Java_School.Java_School.Test5;

public class Account {
    private int id;//账户
    private double balance;//余额
    private double  annualInterestRate;//年利率
    public Account(int id,double balance,double annualInterestRate)
    {
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }
    public void withdraw (double amount)
    {
        if(amount>balance)
        {
            System.out.println("余额不足");
        }
        else
        {
            balance=this.balance-amount;
            System.out.println("取款成功,余额为："+balance);
        }
    }
    public void deposit (double amount)
    {
        balance=balance+amount;
        System.out.println("存款成功，余额为："+balance);
    }

}
