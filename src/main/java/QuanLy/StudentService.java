package QuanLy;

public class StudentService {

    public boolean isAdult(Student student) {
        return student.getAge() >= 18;
    }
}