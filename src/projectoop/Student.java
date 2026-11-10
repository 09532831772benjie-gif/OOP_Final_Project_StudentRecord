package projectoop;

public class Student extends Persons {

    private String studentID;
    private String course;
    private String yearLevel;
    private String email;
    private String contactNo;

    public Student(String studentID, String course, String yearLevel, String email, String contactNo, String Fname, String Lname) {
        super(Fname, Lname);
        this.studentID = studentID;
        this.course = course;
        this.yearLevel = yearLevel;
        this.email = email;
        this.contactNo = contactNo;
    }



    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String getRole() {
        return "Student";
    }
}