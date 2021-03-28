package Practice.student;

public class Student {

    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(studentId);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student student = (Student) obj;
            if (this.studentId == student.studentId) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return studentId + ":" + name;
    }
}
