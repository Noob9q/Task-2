import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
                Student student1 = new Student("Azamat", "Oralkhanov",
                        17, true);
                student1.addGrade(70);
                student1.addGrade(80);
                student1.addGrade(90);
                student1.addGrade(95);
                student1.GPA();
                System.out.println(student1);
                System.out.println("\n");
                Teacher teacher1=new Teacher("Adil","Rakhmanov",
                        32,true,
                        "OOP",10,450000);
                teacher1.giveArise(10);
                System.out.println(teacher1);
        }
}
