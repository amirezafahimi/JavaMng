import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amirreza
 */
public class ManagementSystemTest extends ManagementSystem2 {
    protected static Accountants ACCs[];
    protected static MobileProgrammer MOBs[];


    public static void main(String args[]) throws FileNotFoundException{
        ManagementSystem2 man=new ManagementSystem2();


        //***********************************************************
        //read from file
        for(k=0;k<ACCs.length;k++)
            ACCs[k]=man.read();

        //***********************************************************
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Choose an action:" );
            System.out.println("1) Add a person:" );
            System.out.println("2) See one person's info:" );
            System.out.println("3) See all info:" );
            int u=input.nextInt();
            if(u==1){
                man.save();
            }else if(u==2){
                man.viewInfo();
            }else if(u==3){
                man.viewAllInfo();
            }else {}
        }
    }
}