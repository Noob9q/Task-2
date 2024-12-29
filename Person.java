public class Person {
        protected String name;
        protected String surname;
        protected int age;
        protected boolean gender;

        public Person(String name, String surname, int age, boolean gender) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.gender = gender;
        }
        @Override
        public String toString() {
            return "My name is "+name+ " "+ surname+
                    "\nyears old "+age+" "+(gender? "male":"female");
        }
    }