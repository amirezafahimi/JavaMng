import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Formatter;

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


    public static void main(String args[]) throws FileNotFoundException {
        ManagementSystem2 man=new ManagementSystem2();
        try{

            FileWriter f = new FileWriter("C:\\Users\\amirreza\\IdeaProjects\\Project1\\ATM6.txt", true);
            output = new Formatter(f);
            //output=new Formatter("ATM6.txt");

        }
        catch(FileNotFoundException fnfe){
            System.out.println("error...SecurityException");
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //***********************************************************
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Choose an action:" );
            System.out.println("1) Add a person" );
            System.out.println("2) See one person's info" );
            System.out.println("3) See all info" );
            int u=input.nextInt();
            System.out.println(


            );
            if(u==1){
                man.save();
                System.out.println();
            }else if(u==2){
                man.viewInfo();
                System.out.println();
            }else if(u==3){
                man.viewAllInfo();
                System.out.println();
            }else {}
        }
    }
}