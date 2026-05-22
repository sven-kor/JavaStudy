package ex02_override;

public class Espresso extends Coffee {
  public Espresso(String coffeebean){
    super(coffeebean);
  }
  public void taste(){
    System.out.println("쓰다!");
  }
}
