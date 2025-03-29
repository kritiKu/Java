package in.KGCoding.Encapsulation.geomertry;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AXIS1234", "Santosh");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(0);
    }
}
