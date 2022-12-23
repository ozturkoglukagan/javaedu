public class Account {
    //attribute = özellik
    int accountNumber;
    String name;
    String currency;
    double initDeposit;
    boolean accountStatus;

    //constructor = yapim elemani
    public Account(int acn, String n, String cur, double intD){
        this.accountNumber=acn;
        this.name=n;
        this.currency=cur;
        this.initDeposit=intD;
        this.accountStatus=true;

    }

    public Account(int acn, String cur, double intD){
        this.accountNumber=acn;
        this.name="Jane Doe";
        this.currency=cur;
        this.initDeposit=intD;
        this.accountStatus=true;
    }
    public Account(int acn, String n, String cur){
        this.accountNumber=acn;
        this.name=n;
        this.currency=cur;
        this.initDeposit = 0;
        this.accountStatus=true;

    }
    // Within this account, you should be able to deposit any amount,

//    withdraw as much as your balance, and close the account, which resets the balance amount to 0, 
//    and does not allow any deposit or withdrawal actions.
    
    //behaviour = davranis yani özellik
    public void deposit(double money) {
        this.initDeposit+=money;
        message();
    }

    public void withdraw(double money) {
        if (this.initDeposit<money) {
            System.out.println("There isnt enough balance in your acc. Please try again.");
            
        }else{
            this.initDeposit-=money;
            System.out.println("Money withdrawn: "+money);

        }
        message();
    }

    public void close() {
        this.accountStatus=false;
        this.initDeposit=0;
        System.out.println("Account Deactivated.");
        message();
    }


    private void message() {
        System.out.println("Account Balance: " + this.initDeposit);
    }
}
