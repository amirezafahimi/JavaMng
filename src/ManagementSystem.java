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
    protected static ArrayList<WebProgrammer> WEBs = new ArrayList<>();
    protected WebProgrammer WEB;
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
        System.out.println("3) Web programmers" );
        int a=input1.nextInt();
        if(a==1){
            System.out.println("Enter his name:" );
            String name=input1.next();
            System.out.println("Enter his Id:" );
            int Id=input1.nextInt();
            System.out.println("Enter his work experience:" );
            int WorkExperience=input1.nextInt();
            System.out.println("Enter his degree:" );
            String degree=input1.next();
            ACC = new Accountants("Accountants",name,Id,WorkExperience,degree);
            output.format("%10s %10s %10d %10d %10s \n",ACC.getName(),"Accountants",ACC.getId(),ACC.getWorkExperience(),ACC.getDegree());
            ACCs.add(ACC);
        }
        else if(a==2){
            System.out.println("Enter his name:" );
            String name=input1.next();
            System.out.println("Enter his Id:" );
            int Id=input1.nextInt();
            System.out.println("Enter his work experience:" );
            int WorkExperience=input1.nextInt();
            System.out.println("Enter his Last job position:" );
            String lastJob=input1.next();
            System.out.println("Enter The programming language he usually uses:" );
            String languageUsed=input1.next();
            MOB = new MobileProgrammer("Mobile programmers",name,Id,WorkExperience,lastJob,languageUsed);
            output.format("%10s %10s %10d %10d %10s \n",MOB.getName(),"MobileProgrammer",MOB.getId(),MOB.getWorkExperience(),MOB.getLastJob(),MOB.getLanguageUsed());
            MOBs.add(MOB);
            M++;
        }
        else if(a==3){
            System.out.println("Enter his name:" );
            String name=input1.next();
            System.out.println("Enter his Id:" );
            int Id=input1.nextInt();
            System.out.println("Enter his work experience:" );
            int WorkExperience=input1.nextInt();
            System.out.println("Enter his Last job position:" );
            String lastJob=input1.next();
            System.out.println("Enter The number of his projects:" );
            String numberOfProjects=input1.next();
            WEB = new WebProgrammer("Web programmers",name,Id,WorkExperience,lastJob,numberOfProjects);
            output.format("%10s %10s %10d %10d %10s \n",WEB.getName(),"WebProgrammer",WEB.getId(),WEB.getWorkExperience(),WEB.getLastJob(),WEB.getNumberOfProjects());
            WEBs.add(WEB);
            M++;
        }
        output.close();
    }

    //***********************************************************

    public void viewInfo()throws NullPointerException{
        Scanner input1=new Scanner(System.in);
        System.out.println("Enter his Id:" );
        int Id=input1.nextInt();
        for(int i=0; i<ACCs.size(); i++)
            if (ACCs.get(i).getId() == Id) {
                System.out.println("Name: "+ACCs.get(i).getName());
                System.out.println("Type: "+ACCs.get(i).getType());
                System.out.println("Work experience: "+ACCs.get(i).getWorkExperience());
                System.out.println("Degree: "+ACCs.get(i).getDegree());
            }
        for(int i=0; i<MOBs.size(); i++){
            if(MOBs.get(i).getId()==Id){
                System.out.println("Name: "+MOBs.get(i).getName());
                System.out.println("Type: "+MOBs.get(i).getType());
                System.out.println("Work experience: "+MOBs.get(i).getWorkExperience());
                System.out.println("Last Job: "+MOBs.get(i).getLastJob());
                System.out.println("Language used: "+MOBs.get(i).getLastJob());
            }
        }
        for(int i=0; i<WEBs.size(); i++){
            if(WEBs.get(i).getId()==Id){
                System.out.println("Name: "+WEBs.get(i).getName());
                System.out.println("Type: "+WEBs.get(i).getType());
                System.out.println("Work experience: "+WEBs.get(i).getWorkExperience());
                System.out.println("Last Job: "+WEBs.get(i).getLastJob());
                System.out.println("Number of project: "+WEBs.get(i).getNumberOfProjects());
            }
        }
    }

    //***********************************************************

    public void viewAllInfo(){
        File file = new File("ATM6.txt");
        Scanner input= null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String AllInfo="";
        try{
            while(input.hasNext()){
                AllInfo += input.nextLine()+",";
                AllInfo += System.lineSeparator();
            }
        }
        catch(SecurityException se){
            System.out.println("error...SecurityException");
            System.exit(1);
        }
        System.out.println(AllInfo);
    }

    //***********************************************************

    public static void main(String args[]) throws FileNotFoundException {
        ManagementSystem man=new ManagementSystem();
        try{
            FileWriter f = new FileWriter("C:\\Users\\amirreza\\IdeaProjects\\Project1\\ATM6.txt", true);
            output = new Formatter(f);

        }
        catch(FileNotFoundException fnfe){
            System.out.println("error...SecurityException!");
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
        }

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