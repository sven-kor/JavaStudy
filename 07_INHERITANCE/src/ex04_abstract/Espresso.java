package ex04_abstract;

public class Espresso extends Coffee {
  public Espresso(String coffeebean){
    super(coffeebean);
  }
  public void taste(){
    System.out.println("쓰다!");
  }
  @Override
  public void info(){
    System.out.println("나는 에스프레소");
    super.info();
  }
  //Coffee에는 없는 에스프레소 전용 메서드 
  //부모에는 없는 자식 전용 메서드
  public void drink(){
    System.out.println("싸구려 커피를 마신다~");
  }
  
}
