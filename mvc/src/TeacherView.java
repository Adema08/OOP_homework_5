import java.util.List;

public class TeacherView {
    public void displayTeachers(List<Teacher> teachers) {
        System.out.println("Список учителей:");
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println((i + 1) + ". " + teachers.get(i));
        }
    }
}