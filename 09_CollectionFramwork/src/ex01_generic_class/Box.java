package ex01_generic_class;

public class Box<T> {
  //제너릭 클래스
  //정해지지 않은 타입 T를 사용 <- 객체 생성 시점에 정해짐(구체화)
  //Diamond Operator를 이용
  //필드
  private T content;
  public Object setContent;

  public T getContent() {
    return content;

  }

  public void setContent(T content){
    this.content = content;
  }


}
