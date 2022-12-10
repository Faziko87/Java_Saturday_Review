package week11_review.inheritanceTask;

public class CydeoStudent extends Student{

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade, int batchNum, String groupName, String progLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
        setBatchNum(batchNum);
        setGroupName(groupName);
        setProgLanguage(progLanguage);
    }

    private String groupName, progLanguage;
    private int batchNum;

    public int getBatchNum() {
        return batchNum;
    }

    public void setBatchNum(int batchNum) {
        if(batchNum<=0){
            System.err.println("Batch number can not be zero or negative");
            System.exit(1);
        }
        this.batchNum = batchNum;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        if(getGroupName().isEmpty() || getGroupName()==null ) {
            System.err.println("Group Name can not be empty or unknown");
            System.exit(1);
        }
        if(Character.isDigit(groupName.charAt(0)) || !Character.isLetterOrDigit(groupName.charAt(0))){
            System.err.println("Group name can not start with a digit or special character");
            System.exit(1);
        }
        this.groupName = groupName;
    }

    public String getProgLanguage() {
        return progLanguage;
    }

    public void setProgLanguage(String progLanguage) {
        if(progLanguage.equalsIgnoreCase("java")||progLanguage.equalsIgnoreCase("javaScript")||progLanguage.equalsIgnoreCase("python")){
            System.out.println("you are selected "+progLanguage);
        }else{
            System.err.println("Wrong selection ");
            System.exit(1);
        }
        this.progLanguage = progLanguage;
    }

    @Override
    public void study() {
        System.out.println(getBatchNum()+" are studying");
    }

    @Override
    public String toString() {
        return super.toString().replace("{", "")+
                "groupName='" + groupName + '\'' +
                ", progLanguage='" + progLanguage + '\'' +
                ", batchNum=" + batchNum +
                '}';
    }
}
