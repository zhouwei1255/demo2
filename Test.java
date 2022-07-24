/**
 * @author 12556
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("周围");
        student.setAge(23);
        Student student1 = new Student("周静",23);
        System.out.println(student.getName());
        System.out.println(student1);
    }
}
