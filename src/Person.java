
/**
 *
 * @author amirreza
 */
public class Person {

    protected String type;
    protected String name;
    int Id;
    protected int WorkExperience;

    /**
     *
     *
     */
    public void setType(String type){
        this.type=type;
    }

    public void setName(String name) {
        this.name=name;
    }


    public void setId(int Id) {
        this.Id=Id;
    }


    public void setWorkExperience(int WorkExperience){
        this.WorkExperience=WorkExperience;
    }


    public String getType(){
        return type;
    }

    public String getName() {
        return name;
    }


    public int getId() {
        return Id;
    }


    public int getWorkExperience(){
        return WorkExperience;
    }

}