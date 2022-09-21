import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Map<String,Integer> pills = new HashMap<>();

        Student student1 = new Student("Иванов", 8, true, Diagnosis.POISONING);
        Student student2 = new Student("Петров", 10, true, Diagnosis.POISONING);
        Student student3 = new Student("Сидоров", 11, false, Diagnosis.FEVER);
        Student student4 = new Student("Сергеева", 8, true, Diagnosis.MAIM);
        Student student5 = new Student("Баранов", 10, true, Diagnosis.FEVER);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        pills.put("Уголь", 10000);
        pills.put("Аспирин", 10);
        pills.put("Зеленка", 100);

        Nurse nurse = new Nurse("Екатерина Петровна", students, pills);

        nurse.goToCheckup(nurse.getStudents());
        System.out.println("--------------");
        nurse.giveAPill();

    }
}
