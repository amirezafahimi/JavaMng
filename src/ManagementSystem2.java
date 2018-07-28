import java.io.File;
import java.io.FileNotFoundException;
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
    public void viewInfo()throws NullPointerException{
        Scanner input1=new Scanner(System.in);
        System.out.println("Enter his Id:" );
        int Id=input1.nextInt();
        for(int i=0; i<ACCs.size(); i++)
            if (ACCs.get(i).getId() == Id) {
                System.out.println("Name: "+ACCs.get(i).getName());
                System.out.println("Type: "+ACCs.get(i).getType());
                System.out.println("Work experience: "+ACCs.get(i).getWork_experience());
                System.out.println("Degree: "+ACCs.get(i).getDegree());
            }
        for(int i=0; i<MOBs.size(); i++){
            if(MOBs.get(i).getId()==Id){
                System.out.println("Name: "+MOBs.get(i).getName());
                System.out.println("Type: "+MOBs.get(i).getType());
                System.out.println("Work experience: "+MOBs.get(i).getWork_experience());
                System.out.println("LastJob: "+MOBs.get(i).getLastJob());
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
                AllInfo += input.nextLine();
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


}