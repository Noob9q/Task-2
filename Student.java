import java.util.List;
import java.util.ArrayList;
public class Student extends Person {
    private static int id=0;
    private int id_gen;
    private List<Integer> grades = new ArrayList<>();
    public void addGrade(int grade) {
        grades.add(grade);
    }

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.id_gen = id++;
    }
    double GPA;
    public void GPA() {
        double sum=0;
        for(Integer grade:grades) {
            sum += grade;
        }
        this.GPA = sum/grades.size();
    }
    int x1=0;
    public String toString() {
            return super.toString()+" I'm student "+id+
                    "\nmy GPA is: "+GPA;
        }
    }

