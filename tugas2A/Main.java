package tugas2A;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("1122334455", 5000.0, "M Hasan", "hasan@mail.com", "0822-1234-5678");

        //method deposit
        account.deposit(200.0);
        //method withdraw
        account.withdraw(100.0);
        //withdraw dengan jumlah yang lebih besar dari saldo
        account.withdraw(7500.0);

    }

}
