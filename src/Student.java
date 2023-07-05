public class Student {
    private String name;
    private int age;
    private double psp;
    private String email;
    private String city;
    private int height;
    private int weight;
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
    private Student(StudentBuilder sb){
        this.city = sb.city;
        this.name = sb.name;
        this.height = sb.height;
        this.age = sb.age;
        this.psp = sb.psp;
        this.email = sb.email;
        this.weight = sb.weight;
    }
    static class StudentBuilder{
        private String name;
        private int age;
        private double psp;
        private String email;
        private String city;
        private int height;
        private int weight;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public StudentBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public StudentBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }



        public Student build(){
            return new Student(this);
        }
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
}
