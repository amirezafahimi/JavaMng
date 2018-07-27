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
    public void viewInfo(){

    }
    //***********************************************************
    public void viewAllInfo(){
        int a;
    }
    //***********************************************************


}