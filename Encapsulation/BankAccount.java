package in.KGCoding.Encapsulation.geomertry;

class BankAccount {
    private String  accountNO;
    private String accHolderName;
    private double balance;

    public BankAccount(String accountNO, String accHolderName){
        this.accountNO = accountNO;
        this.accHolderName = accHolderName;
    }

    public void depositMoney( double money){
        if(money <= 0){
            System.out.println("Invalid Deposit");
        }else{
            balance += money;
        }

    }


    public double withdrawMoney(double money){
        if( money<=0){
            System.out.println("Invalid withdraw");
        }
        else if(balance >= money){
            balance -= money;
            System.out.println("You have successfully withdraw your money");
        }else{
            money = balance;
            balance = 0;
        }
        return money;
    }

}
