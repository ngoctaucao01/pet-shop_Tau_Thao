package handling;

import data.data;
import model.Account.Account;
import model.Customer.Customer;
import model.Manager.Manager;
import view.VCustomer;
import view.VManager;
import view.Vlogin;

import java.util.Scanner;

public class Start {
  public  int LOGIN= 1;
  public   int REGISTER=2;

  public Start(){
      data.init();
      start();
  }

   public void start(){
       //TODO: start
       Scanner input= new Scanner(System.in);
       Vlogin log= new Vlogin();
       int choose=input.nextInt();
       switch (choose){
           case 1: login();
                        break;
           case 2 : register();
                           break;
           default:  break;
       }
   }


   public void  login(){
       //TODO: check loged
        Scanner in= new Scanner(System.in);
       System.out.println("====================================================================================");
       System.out.print("user name: ");
        String name =in.nextLine();
       System.out.print("password: ");
        String pass=in.nextLine();
       Account account = data.getAccountByNameAndPass(name,pass);
       if(account==null){
            start();
           System.out.println("Your user name or password is incorrect!");
           System.out.println("====================================================================================");
           System.out.println("please enter again");
           System.out.print("--> ");
       }else{
           if(account.isManager){
               managerFrame(data.getManagerByAccount(account));

           }
           else{
              customerFrame(data.getCustomerByAccount(account));

           }
       }
   }


    public void register(){
       //TODO: register

    }

   public void managerFrame(Manager m){
       //TODO: Manager working space
       Scanner input =new Scanner(System.in);
       System.out.println("====================================================================================");
       System.out.println("Welcome.. "+m.managerName);
       VManager Vm= new VManager();
   }


   public  void customerFrame(Customer c){
       //TODO: Customer working space
       Scanner input = new Scanner(System.in);
       System.out.println("====================================================================================");
       System.out.println("Welcome.. "+c.customerName);
       VCustomer Vc= new VCustomer();
   }



}
