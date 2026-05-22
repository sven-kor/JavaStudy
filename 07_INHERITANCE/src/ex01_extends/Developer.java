package ex01_extends;
//상속 extends
//자식은 부모의 멤버를 내것처럼 다룰 수 있다.
//부모 : Person(super, 상위)
//자식 : Developer(sub, 하위)
//자식 생성자는 부모 생성자를 호출해야한다. 
//부모 만들어야 자식만드는 것! 
//super() : 부모 생성자 호출하는 코드.
public class Developer extends Person {
  //이거는 결국 skill을 내부에서만 사용한다는 듯.(외부에서 직접 사용불가-> public 메서드를 이용해서 사용)  
  private String skill;


  public Developer(String name, String skill) {
    super(name);
    this.skill = skill;
  }


  void develop(){
    System.out.println("개발하기");
  }
}
