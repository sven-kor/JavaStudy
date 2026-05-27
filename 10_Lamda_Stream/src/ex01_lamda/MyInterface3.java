package ex01_lamda;

@FunctionalInterface //함수형 인터페이스라고 체크
public interface MyInterface3 {
  //public abstract 생략된 것임. 원래 클래스는 접근제한자 생략하면 default 
  String  method();
}
