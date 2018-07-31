public class WebProgrammer extends Person {
    protected String lastJob;
    protected String numberOfProjects;
    public WebProgrammer(String type, String name, int Id, int WorkExperience, String lastJob, String numberOfProjects){
        super.type=type;
        super.name=name;
        super.Id=Id;
        super.WorkExperience=WorkExperience;
        this.lastJob=lastJob;
        this.numberOfProjects=numberOfProjects;

    }

    public void setLastJob(String lastJob) {

        this.lastJob=lastJob;
    }


    public String getLastJob() {

        return lastJob;
    }


    public void setNumberOfProjects(String lastJob) {

        this.lastJob=numberOfProjects;
    }


    public String getNumberOfProjects() {

        return numberOfProjects;
    }
}

