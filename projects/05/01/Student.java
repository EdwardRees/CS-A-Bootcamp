public class Student {
  private String name;
  private String id;
  private String email; // generate from ID
  private static int count = 0; // a static variable that exists on the class itself

  public Student(String name, String id){
    this.name = name;
    this.id = id;
    this.email = this.generateEmail();
    count++;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getId() {
      return id;
  }

  public void setId(String id) {
      this.id = id;
  }

  public String getEmail() {
      return email;
  }

  private String generateEmail(){
    return this.id + "@sfusd.edu";
  }

  public static int getCount(){
    return count;
  }


  @Override
  public String toString() {
    return this.name + "\n" + this.id + "\n" + this.email;
  }
}
