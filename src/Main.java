public class Main {
    public static void main(String[] args) {
        Student s = Student.getBuilder().setName("Omkar").setAge(25).setWeight(68).setCity("Pune").build();
        System.out.println(s);
        Order o = Order.getInstance().setDiscount(29).build();
    }
}