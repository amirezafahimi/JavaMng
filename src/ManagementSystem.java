import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
/**
 *
 * @author amirreza
 */
public class ManagementSystem{
    protected static ArrayList<Accountants> ACCs = new ArrayList<>();
    protected Accountants ACC;
    protected static ArrayList<MobileProgrammer> MOBs = new ArrayList<>();
    protected MobileProgrammer MOB;
    protected static Formatter output;
    protected static int A=0;
    protected static int M=0;
    //***********************************************************

    public void save(){

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

        Scanner input1=new Scanner(System.in);

        System.out.println("Add to:" );
        System.out.println("1) Accountants" );
        System.out.println("2) Mobile programmers" );
        int a=input1.nextInt();
        if(a==1){
            System.out.println("Enter his name:" );
            String name=input1.next();
            System.out.println("Enter his Id:" );
            int Id=input1.nextInt();
            System.out.println("Enter his work experience:" );
            int work_experience=input1.nextInt();
            System.out.println("Enter his degree:" );
            String degree=input1.next();
            ACC = new Accountants("Accountants",name,Id,work_experience,degree);
            output.format("%10s %10s %10d %10d %10s \n",ACC.getName(),"Accountants",ACC.getId(),ACC.getWork_experience(),ACC.getDegree());
            ACCs.add(ACC);
        }
        else if(a==2){
            System.out.println("Enter his name:" );
            String name=input1.next();
            System.out.println("Enter his Id:" );
            int Id=input1.nextInt();
            System.out.println("Enter his work experience:" );
            int work_experience=input1.nextInt();
            System.out.println("Enter his lastJob:" );
            String lastJob=input1.next();
            MOB = new MobileProgrammer("Mobile programmers",name,Id,work_experience,lastJob);
            output.format("%10s %10s %10d %10d %10s \n",MOB.getName(),"MobileProgrammer",MOB.getId(),MOB.getWork_experience(),MOB.getLastJob());
            MOBs.add(MOB);
            M++;
        }
        output.close();
    }
}