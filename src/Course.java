import java.util.ArrayList;
public class Course {
    private String courseName;
    private String grade;
    private String comment;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Course(String courseName, String grade, String comment){
        this.courseName = courseName;
        this.grade = grade;
        this.comment = comment;
        courses.add(this);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int calculateGPA(ArrayList<Course> courses){
        this.courses= courses;
        int count = 0;
        int total = 0;
        for(int i = 0; i < courses.size(); i++){
            total += Integer.parseInt(courses.get(i).getGrade());
            count++;
        }
        return total/count;
    }

    public String toString(){
        return "Course name: " + courseName + ", Teacher comment: " + comment + ", grade: " + grade;
    }
}