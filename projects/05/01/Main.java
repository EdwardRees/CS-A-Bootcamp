public class Main {
  public static void main(String[] args) {
    Student s = new Student("Edward", "erees");
    System.out.println(s);
    Student s1 = new Student("Edward", "erees");
   Student s2 = new Student("Edward", "erees");
    System.out.println(Student.getCount());
  } 
}
