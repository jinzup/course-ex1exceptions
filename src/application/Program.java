package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number account: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.next();
            System.out.print("Balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter the withdraw amount: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
            System.out.printf("New Balance: %.2f", account.getBalance());
        }
        catch (DomainException e){
            System.out.print("Withdraw Error: " + e.getMessage());
        }
    }
}
