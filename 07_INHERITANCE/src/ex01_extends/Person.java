package ex01_extends;

public class Person {
  
  public Person(String name) {
    this.name = name;
  }

  private String name;
  
  public void eat(){
    System.out.println("밥먹기");
  }
}
