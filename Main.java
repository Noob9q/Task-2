import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
                ArrayList<Integer> Grades=new ArrayList<>();
                Grades.add(70);
                Grades.add(70);
                Grades.add(70);
                Grades.add(70);
                int sum=0;
                for(int grade:Grades){
                        sum+=grade;
                }

                Student student1 = new Student("Azamat", "Oralkhanov",
                        17, true,sum);
                System.out.println(student1);
                System.out.println("\n");
                Teacher teacher1=new Teacher("Adil","Rakhmanov",
                        "Intriduction to programming",32,
                        10,450000,true);
                teacher1.giveArise(10);
                System.out.println(teacher1);
        }
}
