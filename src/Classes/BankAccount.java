package Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    private int id;
    private static int nextId = 1;
    private double balance;

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    private static final ArrayList<BankAccount> BankAccounts = new ArrayList<>();

    public static ArrayList<BankAccount> getBankAccounts() {
        return BankAccounts;
    }


    public BankAccount() {
        this.id = nextId++;
        this.balance = 0;
    }

    public static void Create() {
        BankAccounts.add(new BankAccount());
    }


    private static double interest = 0.02;

    public static void setInterestRate(double interest) {
        BankAccount.interest = interest;
    }

    public static double getInterest(int id, int Years) {
        for (int i = 0; i < BankAccounts.size(); i++) {
            BankAccount account = BankAccounts.get(i);
            if (id == account.getId()) {
                double currentBalance = account.getBalance();
                return currentBalance * Math.pow(1 + BankAccount.interest, Years) - currentBalance;
            }
        }
        return -1.0;

    }


    public static void deposit(int id, double amount) {
        for (int i = 0; i < BankAccounts.size(); i++) {
            BankAccount account = BankAccounts.get(i);
            if (id == account.getId()) {
                System.out.println("Deposited " + amount + " to ID" + id);
                account.setBalance(account.getBalance() + amount);
                return;
            }
        }
        System.out.println("Account does not exist");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> list = BankAccount.getBankAccounts();

        String[] arr;
        do {
            arr = sc.nextLine().split("\\s* \\s*");
            switch (arr[0]) {
                case "Create" -> Create();
                case "Deposit" -> {
                    BankAccount.deposit(Integer.parseInt(arr[1]), Double.parseDouble(arr[2]));
                }
                case "GetInterest" -> {
                    double result = BankAccount.getInterest(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
                    if (result == -1.0) {
                        System.out.println("Account does not exist");
                    } else {
                        System.out.println(result);
                    }
                }
                case "SetInterest" -> setInterestRate(Double.parseDouble(arr[1]));
            }
        } while (!arr[0].equals("End"));
        System.out.println(list.get(0).getBalance());
    }
}


