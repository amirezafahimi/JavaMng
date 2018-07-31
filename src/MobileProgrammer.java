/**
 *
 * @author amirreza
 */
public class MobileProgrammer extends Person{
    protected String lastJob;
    protected String languageUsed;

    public MobileProgrammer(String type, String name, int Id, int WorkExperience, String lastJob, String languageUsed){
        super.type=type;
        super.name=name;
        super.Id=Id;
        super.WorkExperience=WorkExperience;
        this.lastJob=lastJob;
        this.languageUsed=languageUsed;
    }

    public void setLastJob(String lastJob) {
        this.lastJob=lastJob;
    }


    public String getLastJob() {
        return lastJob;
    }


    public void setLanguageUsed(String lastJob) {

        this.lastJob=languageUsed;
    }


    public String getLanguageUsed() {

        return languageUsed;
    }
}