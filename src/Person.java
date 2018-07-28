
/**
 *
 * @author amirreza
 */
public class Person {

    protected String type;
    protected String name;
    int Id;
    protected int work_experience;

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


    public void setWork_experience(int work_experience){
        this.work_experience=work_experience;
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


    public int getWork_experience(){
        return work_experience;
    }

}