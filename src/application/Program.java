package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Operations;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int accountNumber;
        String holder;
        double balance;
        char resp;

        System.out.print("Enter account number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        resp = sc.next().charAt(0);

        Operations operations;
        
        if (resp == 'y') {
            System.out.print("Enter an initial deposit value: $ ");
            balance = sc.nextDouble();
            
            operations = new Operations(accountNumber, holder, balance);
            
        } else {
            operations = new Operations(accountNumber, holder, 0);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.printf("Account " + operations.getAccountNumber() 
        + ", Holder: " + operations.getHolder() 
        + ", Balance: $ %.2f%n",  operations.getBalance());
        
        System.out.println();
        System.out.print("Enter a deposit value: $ ");
        balance = sc.nextDouble();
        operations.depositValue(balance);
        
        
        System.out.println("Updated Account data: ");
        System.out.printf("Account " + operations.getAccountNumber() 
        + ", Holder: " + operations.getHolder() 
        + ", Balance: $ %.2f%n", operations.getBalance());
        
        System.out.println();
        System.out.print("Enter a withdraw value: $ ");
        balance = sc.nextDouble();
        operations.withdrawValue(balance);
        
        System.out.println("Updated Account data: ");
        System.out.printf("Account " + operations.getAccountNumber() 
        + ", Holder: " + operations.getHolder() 
        + ", Balance: $ %.2f%n", operations.getBalance());
        
        sc.close();
    }
}
