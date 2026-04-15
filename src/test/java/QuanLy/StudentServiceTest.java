package QuanLy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    @Test
    void testIsAdult() {
        Student student = new Student("Phu", 20);
        StudentService service = new StudentService();

        assertEquals(true, service.isAdult(student)); // cố tình sai
    }
}