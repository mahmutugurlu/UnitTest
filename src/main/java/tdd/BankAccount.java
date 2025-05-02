package tdd;

/*
        ***********************************
               Banka Hesap Uygulamasi
        ***********************************
        Uygulamada yazilacak metodlar(işlevleri):
            *   Hesap Olusturma
            *   Para Cekme ( Bakiye yetersiz kontrolu, Gunluk Cekim Limiti Kontrolu, Negatif Giris kontrolu )
            *   Para Yatirma ( Negatif Giris kontrolu )
            *   Hesap Gecmisi Alabilme kontrolu
 */

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private double dailyWithdrawLimit;
    private double dailyWithdrawAmount;
    private List<String> accountHistory=new ArrayList<>();

    public BankAccount(String accountNumber, double balance, double dailyWithdrawLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dailyWithdrawLimit = dailyWithdrawLimit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDailyWithdrawLimit() {
        return dailyWithdrawLimit;
    }

    public void setDailyWithdrawLimit(double dailyWithdrawLimit) {
        this.dailyWithdrawLimit = dailyWithdrawLimit;
    }

    public double getDailyWithdrawAmount() {
        return dailyWithdrawAmount;
    }

    public void setDailyWithdrawAmount(double dailyWithdrawAmount) {
        this.dailyWithdrawAmount = dailyWithdrawAmount;
    }

    public List<String> getAccountHistory() {
        return accountHistory;
    }

    public void setAccountHistory(List<String> accountHistory) {
        this.accountHistory = accountHistory;
    }

    //işlevsel metodlar
    //para çekme
    public Boolean withdraw(double amount){
        return null;
    }
    //para yatırma
    public Boolean deposit(double amount){
        if (amount>0){
            this.balance+=amount;
            this.accountHistory.add("Para yatırma : "+amount);
            return true;
        }else {
            throw new RuntimeException("Miktar pozitif olmalı!");
        }
    }


}