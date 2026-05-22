package ex05_Constructor;

public class Car {

  //생성자
  // 객체 생성할 때만, 자동으로 호출되는 특별한 메서드
  //안 만들면, 자바 컴파일러가 코드를 넣어줌(기본 생성자: Default Constructor)
  //핵심 규칙 2가지 : 반환 개념자체가 없음 + 메서드 명이 클래스 명과 동일
  String model;
  int price;
  int oil;

  Car(String model, int price, int oil){
    this.model = model;
    this.price = price;
    this.oil = oil;
    System.out.println("You got a car!!");
  }
  Car(){
    //생성자 내 this -> 다른 생성자 호출
    this("무기명",0,0);
    //기본 생성자, 생성자 오버로딩 가능
  }

  void drive(){
    System.out.println("붕붕붕 " + this.model + "이(가) 나간다");
  }


}

