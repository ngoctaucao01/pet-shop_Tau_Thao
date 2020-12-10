package model.Customer;

import model.Account.Account;

public class Customer {
    public String customerName;
    public  String customerAddress;
    public Account account;

    public Customer(){}
    public Customer(String customerName,String customerAddress,Account account){
        this.customerName=customerName;
        this.customerAddress=customerAddress;
        this.account=account;
    }
}
