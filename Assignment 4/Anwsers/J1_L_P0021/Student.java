public class Student implements Comparable <Student>{
    private String id;
    private String studentName;
    private String semester;
    private String courseName;

    public Student(){

    }

    public Student(String id, String studentName, String semester, String courseName){
        this.id = id;
        this.studentName = studentName;
        this.semester =semester;
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    public String getId() {
        return id;
    }
    public String getSemester() {
        return semester;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public int compareTo(Student t){
        return t.studentName.compareTo(this.studentName);
    }

    public void print(){
        System.out.printf("%-15s%-15s%-15s\n", studentName, semester, courseName);
    }
}
