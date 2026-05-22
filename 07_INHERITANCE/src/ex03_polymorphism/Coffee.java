package ex03_polymorphism;

public class Coffee {
  public String coffeebean;

  public Coffee(String coffeebean){
    this.coffeebean = coffeebean;
  }

  public void taste(){

  }
  public void info() {
    System.out.println("원산지: "+ coffeebean);
  }
}
