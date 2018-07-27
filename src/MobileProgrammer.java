/**
 *
 * @author amirreza
 */
public class MobileProgrammer extends Person{
    protected String lastJob;

    public MobileProgrammer(String type, String name, int Id, int work_experience, String lastJob){
        super.type=type;
        super.name=name;
        super.Id=Id;
        super.work_experience=work_experience;
        this.lastJob=lastJob;

    }

    public String getlastJob() {
        return name;
    }
}
