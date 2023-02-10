package model.entities;

import model.exceptions.AccountException;

import java.util.Locale;

import static java.util.Locale.JAPAN;
import static java.util.Locale.US;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    //==============================================================
    //construct
    public Account(){
        super();
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    //==============================================================
    //getters e setters

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    //==============================================================
    //metodos

    public void deposit(double depo){
        balance += depo;
    }

    public void withdraw(double with){
        withCheck(with);
        balance -= with;
    }

    private void withCheck(double wc){
        Locale loc = Locale.getDefault();

        if (wc > getWithdrawLimit() && wc > getBalance()){
            if (loc.equals(US) ){
                throw new AccountException("Withdrawal error: The amount exceeds the withdrawal limit and account balance");
            }else{
                throw new AccountException("Erro de saque: A quantia excede o limite de saque e saldo na conta ");
            }
        }
        //-----------------------------------------------------------------------------
        if (wc > getWithdrawLimit()){
            if (loc.equals(US)){
                throw new AccountException("Withdraw error: The amount exceeds withdraw limit");
            }else {
                throw new AccountException("Erro de retirada: o valor excede o limite de retirada");
            }
        }
        //----------------------------------------------------------------------------
        if (wc > getBalance()){
            if (loc.equals(US)){
                throw new AccountException("Withdraw error: Not enough balance");
            }else {
                throw new AccountException("Erro de saque: saldo insuficiente");
            }

        }

    }
}
