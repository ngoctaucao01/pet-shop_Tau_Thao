package data;

import model.Account.Account;
import model.Customer.Customer;
import model.Manager.Manager;

import java.util.ArrayList;

public class data {

  public static   ArrayList<Account> listAcount= new ArrayList<Account>();
  public static  ArrayList<Customer> listCustomer= new ArrayList<Customer>();
  public static  ArrayList<Manager> listManager=new ArrayList<Manager>();

  public static void init(){
      Account admin= new Account("admin","admin",true);
      Manager m1= new Manager("Nguyen Ngoc Thao","Quang Binh",admin);
      Account customer= new Account("customer","customer",false);
      Customer c1= new Customer("Cao Ngoc Tau","Quang binh",customer);
      listAcount.add(admin);
      listAcount.add(customer);
      listManager.add(m1);
      listCustomer.add(c1);
  }

  public static Account getAccountByNameAndPass(String name,String pass) {

      for (int i = 0; i < listAcount.size(); i++) {
         if(listAcount.get(i).accountName.equals(name)&&listAcount.get(i).accountPassword.equals(pass)){
             return listAcount.get(i);
         }
      }
      return null;
  }

  public static  Manager getManagerByAccount(Account ac){
      for (int i=0;i<listManager.size();i++){
          if(listManager.get(i).account.equals(ac)){
              return listManager.get(i);
          }
      }
      return null;
  }

  public  static Customer getCustomerByAccount(Account cs){
      for(int i=0;i<listCustomer.size();i++){
          if(listCustomer.get(i).account.equals(cs)){
              return listCustomer.get(i);
          }
      }
      return null;
  }
}
