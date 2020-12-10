package model.Account;

public class Account {
    public String accountName;
    public String accountPassword;
    public  boolean isManager;

    public Account(){}
    public Account(String accountName,String accountPassword,boolean isManager){
        this.accountName=accountName;
        this.accountPassword=accountPassword;
        this.isManager=isManager;
    }

}
