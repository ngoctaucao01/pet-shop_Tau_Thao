package model.Manager;

import model.Account.Account;

public class Manager {
    public String managerName;
    public  String managerAddress;
    public Account account;

    public Manager(){}
    public  Manager(String managerName,String managerAddress,Account account){
        this.managerName=managerName;
        this.managerAddress=managerAddress;
        this.account=account;
    }
}
