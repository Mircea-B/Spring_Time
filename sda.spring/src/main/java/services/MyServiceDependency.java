package services;

public class MyServiceDependency {

  private String name;
  private int age;

  public MyServiceDependency(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "services.MyServiceDependency{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}