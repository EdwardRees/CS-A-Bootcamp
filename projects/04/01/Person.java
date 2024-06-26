public class Person {
  private String firstName;
  private String lastName;
  private int age;
  private boolean isStudent;

  public Person(String firstName, String lastName, int age, boolean isStudent){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.isStudent = isStudent;
  }

  // Create this later to demonstrate method overrides
  public Person(String firstName, String lastName, int age){
    this(firstName, lastName, age, true);
  }


  public String getFirstName(){
    return this.firstName;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public boolean getIsStudent(){
    return this.isStudent;
  }

  public void setIsStudent(boolean isStudent){
    this.isStudent = isStudent;
  }

  public String getFullName(){
    return this.firstName + " " + this.lastName;
  }

  public String getEmail(){
    return this.firstName.charAt(0) + this.lastName + "@gmail.com";
  }

  @Override
  public String toString(){
    return this.getFullName() + "\nAge: " + this.getAge();
  }
}
