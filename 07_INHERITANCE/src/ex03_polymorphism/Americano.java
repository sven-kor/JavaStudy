package ex03_polymorphism;

public class Americano extends Espresso{
  public Americano(String coffeebean){
    super(coffeebean);
  }
  
  public void taste(){
    System.out.println("고소한 맛");
  }
}
