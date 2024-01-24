import java.util.List;
import java.util.Scanner;

public class TeacherController {
        private TeacherModel teacherModel;
        private TeacherView teacherView;
        private Scanner scanner;

        public TeacherController() {
            this.teacherModel = new TeacherModel();
            this.teacherView = new TeacherView();
            this.scanner = new Scanner(System.in);
        }

        public void run() {
            while (true) {
                System.out.println("\nВыберите опцию:");
                System.out.println("1. Отобразить список всех учителей");
                System.out.println("2. Добавить учителя");
                System.out.println("3. Редактировать запись");
                System.out.println("4. Выход");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        displayAllTeachers();
                        break;
                    case 2:
                        addTeacher();
                        break;
                    case 3:
                        editTeacher();
                        break;
                    case 4:
                        System.out.println("Выход из программы");
                        System.exit(0);
                    default:
                        System.out.println("Такой опции нет");
                }
            }
        }

        private void addTeacher() {
            System.out.println("Введите имя учителя:");
            String name = scanner.nextLine();
            System.out.println("Введите название предмета:");
            String subject = scanner.nextLine();
            System.out.println("Введите стаж работы:");
            int experience = scanner.nextInt();

            Teacher teacher = new Teacher(name, subject, experience);
            teacherModel.addTeacher(teacher);
            System.out.println("Добавление прошло успешно!");
        }

        private void editTeacher() {
            displayAllTeachers();

            System.out.println("Выберите номер записи, которую хотите отредактировать:");
            int index = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Введите имя учителя:");
            String newName = scanner.nextLine();

            System.out.println("Введите название предмета:");
            String newSubject = scanner.nextLine();

            System.out.println("Введите стаж работы:");
            int newExperience = scanner.nextInt();

            teacherModel.editTeacher(index - 1, newName, newSubject, newExperience);
            System.out.println("Редактирование прошло успешно!");
        }
        private void displayAllTeachers() {
            List<Teacher> teachers = teacherModel.getTeachers();
            teacherView.displayTeachers(teachers);
        }
    }
