package ex04_abstract;

//다형성 : 하나의 타입으로 여러 객체를 관리하는 성질
//부모 타입으로 자식 객체를 관리할 수 있다!!!
//업캐스팅!
//자식 타입을 부모 타입으로 변환하는 것. (자동 형 변환 처리됨)
public class Main {
  public static void main(String[] args) {
  Coffee coffee1 = new Espresso("brazil");
  //형이 커피로 바꼈는데...자식 메서드 호출이 안되네???
  //해결책!!-> Coffee에도 taste를 써준다
  coffee1.taste();
  //실행전 Coffee의 메서드가 바인딩 -> 실행시점 Espresso의 메서드로 바인딩이 바뀐다!! -> 동적 바인딩

  //자식에게만 있는 메서드
  //-> 자식으로 다운캐스팅(instanceof 사용)
  
  if (coffee1 instanceof Espresso){
    ((Espresso)coffee1).drink();
    Espresso coffee2 = (Espresso) coffee1;
    coffee2.drink();
  }
  //추상 클래스는 객체를 생성할 수 없다. -> 미완성 상태이기때문!
  //미완성된 추상메서드를 만든다면, 객체를 생성할 수 있다.
  Coffee coffee3 = new Coffee("원두없음") {
    @Override
    public void taste() {
      System.out.println("기본 커피 맛보기");
    }
  };



  
  




  }
  
}
