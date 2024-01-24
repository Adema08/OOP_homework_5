import java.util.ArrayList;
import java.util.List;

public class TeacherModel {
    private List<Teacher> teachers;
    public TeacherModel() {
        this.teachers = new ArrayList<>();
    }
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void editTeacher(int index, String name, String subject, int experience) {
        if (index >= 0 && index < teachers.size()) {
            Teacher teacher = teachers.get(index);
            teacher.setName(name);
            teacher.setSubject(subject);
            teacher.setExperience(experience);
        } else {
            System.out.println("Такой опции нет");
        }
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
}

