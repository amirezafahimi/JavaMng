import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author amirreza
 */
public class ManagementSystem{
    protected static Accountants ACCs[];
    protected static MobileProgrammer MOBs[];
    private static  Scanner input1;
    private static Formatter output;
    protected static int k=0;
    //***********************************************************
    public static Accountants read() throws FileNotFoundException{

        File myfile=new File("ATM6.txt");
        input1=new Scanner(myfile);
        while(input1.hasNext()){
            try{
                ACCs=new Accountants[20];
                for (int i = 0; i < ACCs.length; i++) {
                    ACCs[i]=new Accountants(input1.next(),input1.next(),input1.nextInt(),input1.nextInt(),input1.next());

                }

            }
            catch(SecurityException se){
                System.out.println("error...SecurityException");
                System.exit(1);
            }
        }
        return ACCs[k];
    }
    //***********************************************************
    public void save(){
        try{
            output=new Formatter("ATM6.txt");

        }
        catch(FileNotFoundException fnfe){
            System.out.println("error...SecurityException");
            System.exit(1);
        }
        for (int i = 0; i < ACCs.length; i++) {
            output.format("%10s %10d %10s %10d \n",ManagementSystemTest.ACCs[i].getType(),ManagementSystemTest.ACCs[i].getId(),ManagementSystemTest.ACCs[i].getName(),ManagementSystemTest.ACCs[i].getWork_experience());
        }

        output.close();
        System.exit(1);
    }
    //***********************************************************
    public void closefile(){

        output.close();
    }

}