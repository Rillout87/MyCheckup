import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Nurse implements SpeakerPhone {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    private Map<String, Integer> pills;


    public Nurse(String name, ArrayList<Student> students, Map<String, Integer> pills) {
        this.name = name;
        for (Student student : students) {
            if (student.isIllness()){
                this.students.add(student);
            }
        }
        this.pills = pills;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Map<String, Integer> getPill() {
        return pills;
    }

    @Override
    public void goToCheckup(ArrayList<Student> students) {
        CompareByName compareByName = new CompareByName();
        students.sort(compareByName);

        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().getName() + " беги на медосмотр");
        }

    }

    public void giveAPill(){
        for (Student student : students) {
            System.out.println(student.getName() + " вот прими " + student.getDiagnosis().getDrug());
            this.pills.replace(student.getDiagnosis().getDrug(), this.pills.get(student.getDiagnosis().getDrug()) - 1);
            System.out.println("Остаток " + student.getDiagnosis().getDrug() + " = "
                    + this.pills.get(student.getDiagnosis().getDrug()));
        }

    }
}
