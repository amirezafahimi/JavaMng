import java.io.FileNotFoundException;
import java.util.Formatter;

public class WriteFile {
    private static Formatter output;

    public static void writerecords(String filename){

        try{
            output=new Formatter(filename);
        }
        catch(FileNotFoundException fnfe){
            System.out.println("error...SecurityException");
            System.exit(1);
        }

        output.format("%10d %10d %10s %10d\n\n",20,1000, "mehrnoosh",100000 );

    }
    public static void closefile(){

        output.close();
    }
    public static void main(String[] args) {
        writerecords("ATM6.txt");
        closefile();
    }

}
