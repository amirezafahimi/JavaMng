import java.util.Scanner;

/**
 *
 * @author amirreza
 */
public class ManagementSystem2 extends ManagementSystem{



    //***********************************************************
    public static int checkusername(int u){
        int m=0;
        for(int i=0;i<ManagementSystemTest.ACCs.length;i++)
            if(ManagementSystemTest.ACCs[i].getId()==u)
                m++;
        return m;
    }
    //***********************************************************
    public static int checkpassword(int u,int p){
        int m=0;
        for(int i=0;i<ManagementSystemTest.ACCs.length;i++)
            if(ManagementSystemTest.ACCs[i].getId()==u)
                if(ManagementSystemTest.ACCs[i].getpassword()==p){
                    System.out.printf("Hello %s\n\n",ManagementSystemTest.ACCs[i].getName());
                    m++;
                }
        return m;
    }
    //***********************************************************
    public void viewbalance(int p){
        for(int i=0;i<ManagementSystemTest.ACCs.length;i++)
            if(ManagementSystemTest.ACCs[i].getpassword()==p)
                System.out.printf("your balance is:%d\n\n",ManagementSystemTest.user[i].getbalance() );
    }
    //***********************************************************
    public static void cashtransfer(int p){
        System.out.println("Enter the amount of money to transfer :");
        Scanner input=new Scanner(System.in);
        int amount=input.nextInt();
        System.out.println("Enter the  acountnumber of person:");
        int n=input.nextInt();
        for(int i=0;i<ManagementSystemTest.ACCs.length;i++)
            if(ManagementSystemTest.ACCs[i].getpassword()==p)
                if(ManagementSystemTest.ACCs[i].getbalance()>=amount){
                    for(int j=0;j<ManagementSystemTest.ACCs.length;j++)
                        if(ManagementSystemTest.ACCs[j].getId()==n){
                            System.out.printf("do you want to transfer money to %s ?\nEnter yes or no:\n\n ",ManagementSystemTest.ACCs[j].getName());
                            String m=input.next();
                            if(m.equals("yes")){
                                ManagementSystemTest.ACCs[j].setbalance(ManagementSystemTest.ACCs[j].getbalance()+amount);
                                ManagementSystemTest.ACCs[i].setbalance(ManagementSystemTest.ACCs[i].getbalance()-amount);
                                System.out.printf("%d rial was transfered to %s\n\n",amount,ManagementSystemTest.ACCs[j].getName());
                                break;
                            }
                        }
                        else
                        if(j==ManagementSystemTest.ACCs.length-1)
                            System.out.println("wrong username!!you cant transfer money to this person");
                }
                else{
                    System.out.println("your dont have enough money in your account!!");
                    break;
                }

    }
    //***********************************************************
    public static void withdraw(int p){
        System.out.println("Enter the amount of money you want to withdraw:");
        Scanner input=new Scanner(System.in);
        int amount=input.nextInt();
        for(int i=0;i<ManagementSystemTest.ACCs.length;i++)
            if(ManagementSystemTest.ACCs[i].getpassword()==p)
                if(ManagementSystemTest.ACCs[i].getbalance()>=amount){
                    ManagementSystemTest.ACCs[i].setbalance(ManagementSystemTest.user[i].getbalance()-amount);
                    System.out.printf("%d rial was withdrawn from your account\n\n",amount);
                }
                else{
                    System.out.println("your dont have enough money in your account!!\n");
                    break;
                }
    }
    //***********************************************************
    public static void deposit(int p){
        System.out.println("Enter the amount of money you want to deposit:");
        Scanner input=new Scanner(System.in);
        int amount=input.nextInt();
        for(int i=0;i<ManagementSystemTest.ACCs.length;i++)
            if(ManagementSystemTest.ACCs[i].getpassword()==p){
                ManagementSystemTest.ACCs[i].setbalance(ManagementSystemTest.ACCs[i].getbalance()+amount);
                System.out.printf("%d rial was deposited to your account\n\n",amount);
            }
    }

}