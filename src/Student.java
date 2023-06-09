public class Student {
    private String studentName;
    private String year;
    private String onTrack;
    private int GPA;

    public Student(String studentName, String year, String onTrack){
        this.studentName = studentName;
        this.year = year;
        this.onTrack = onTrack;
        GPA = 0;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setOnTrack(String onTrack) {
        this.onTrack = onTrack;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getYear() {
        return year;
    }

    public String  getOnTrack() {
        return onTrack;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public void checkIfFailing(){
        if(GPA < 65){
            onTrack = "not on";
        }
        else{
            onTrack = "on";
        }
    }

    public String toString(){
        return studentName + " is in the " + year + " grade and is " + onTrack + " track for college with a GPA of: " + getGPA() ;
    }

}
