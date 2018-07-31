public class Accountants extends Person{

    private String degree;

    public Accountants(String type, String name, int Id, int WorkExperience, String degree){
        super.type=type;
        super.name=name;
        super.Id=Id;
        super.WorkExperience=WorkExperience;
        this.degree=degree;
    }

    public void setDegree(String degree) {
        this.degree=degree;
    }


    public String getDegree() {
        return degree;
    }
}
