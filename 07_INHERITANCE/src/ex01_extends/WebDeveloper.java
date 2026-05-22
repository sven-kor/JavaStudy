package ex01_extends;

public class WebDeveloper extends Developer {
//자체 필드가 없기 때문에 부모에게 넘기면 됨!
  public WebDeveloper(String name, String skill){
    super(name, skill);
  }

  public void webDevelop(){
    System.out.println("web develop!!");
  }
}
