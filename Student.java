public class Student {
        private String name;
        private String surname;
        private int age;
        private boolean gender;
        private int id_gen;
        private static int id=1;

        public Student(){
            id_gen=id++;
        }
        public double GPA;
        public void setGPA(int GPA){
            this.GPA=GPA;
        }
        public double getGPA(){
            return GPA;
        }
        public Student(String name, String surname, int age, boolean gender, double GPA) {
            this();
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.gender = gender;
            this.GPA = GPA;
        }
        public String getName() {
            return name;
        }
        public String getSurname() {
            return surname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public boolean isGender() {
            return gender;
        }
        public void setGender(boolean gender) {
            this.gender = gender;
        }


        public String toString() {
            return "I'm student with id "+id_gen+" "+ name+ " "+ surname+
                    "\nyears old "+age+" GPA is: "+GPA/4+" "+(gender? "male":"female");
        }
    }

