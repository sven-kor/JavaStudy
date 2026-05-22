package ex06_encapsulation;

public class Car {
  private String model;
  private int price;


  //메서드 정의(만들기)

  //model명 설정 -> 인자 받아서 필드에 저장하기
  public void setModel(String model){
    this.model = model;
  }

  //model명 접근 ->필드에 저장된 값 반환하기
  public String getMoel(){
    return this.model;
  }
  public void setPrice(int price){
    this.price = price;
  }
  


}
