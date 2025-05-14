import java.util.Scanner;

class Account {

    static private String AccNumber;
    static private String AccPin;
    static private double balance;

    public Account(String accNumber, String accPin, double bal) {
        Account.AccNumber = accNumber;
        Account.AccPin = accPin;
        Account.balance = bal;
    }

    public String getAccNumber() {
        return AccNumber;
    }

    public boolean validatePin(String inputPin) {
        return AccPin.equals(inputPin);
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdrawMoney(double amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

public class ATMSystemList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] accounts = new Account[2];
        accounts[0] = new Account("qwe123", "1001", 75021);
        accounts[1] = new Account("asd456", "0110", 47291);

        Account currentAccount = login(accounts, sc);

        if (currentAccount == null) {
            System.out.println("Invalid Login.... Check Acc Number and PIN entered!");
            return;
        }

        int choice;
        do {
            System.out.println("\n----ATM Menu----");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.println("5. Switch Account");
            System.out.print("Choose an Option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + currentAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the Amount to Withdraw: ");
                    double amount = sc.nextDouble();
                    if (currentAccount.withdrawMoney(amount)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the Amount to Deposit: ");
                    double depositMoney = sc.nextDouble();
                    currentAccount.deposit(depositMoney);
                    System.out.println("Amount Deposited Successfully...");
                    break;
                case 4:
                    System.out.println("Exiting...Thank You");
                    break;
                case 5:
                    sc.nextLine();
                    currentAccount = login(accounts, sc);
                    if (currentAccount == null) {
                        System.out.println("Switch failed. Staying in current session.");
                        currentAccount = login(accounts, sc);
                    }
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);
        sc.close();
    }

    public static Account login(Account[] accounts, Scanner sc) {
        System.out.print("Enter the Account Number: ");
        String enteredAccNum = sc.nextLine();

        System.out.print("Enter the PIN: ");
        String enteredAccPin = sc.nextLine();

        for (Account account : accounts) {
            if (account.getAccNumber().equals(enteredAccNum) && account.validatePin(enteredAccPin)) {
                System.out.println(enteredAccNum);
                System.out.println(enteredAccPin);
                System.out.println("Login Successful...");
                return account;
            }
        }
        return null;
    }
}
