package ex02_override;

public class Americano extends Espresso{
  public Americano(String coffeebean){
    super(coffeebean);
  }

  //부모가 가진 메서드를 자식이 사용할 수 없는 경우(사용하기 적합하지 않은 경우)
  //해당 메서드를 다시 만들면 된다. 
  //메서드 오버라이드라고 한다.(메서드 재정의, 덮어쓰기)
  //똑같이 만들것( 접근 제한자는 부모보다 좁아질 수 없다.)
  // 오버라이드 한 메서드라고 알릴 것.
  
  @Override
  public void taste(){
    System.out.println("고소한 맛");
  }
}
