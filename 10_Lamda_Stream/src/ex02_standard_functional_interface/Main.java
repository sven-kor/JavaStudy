package ex02_standard_functional_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import lombok.val;

//매개변수가 함수형 인터페이스인 경우 : 람다식을 전달합니다.

public class Main {
  public static void main(String[] args) {
    executeConsumer("박범훈", name -> System.out.println(name));
    executeSupplier(() -> "supplier return값");
    executeFunction("홍길동이다다다다", name -> name.length());
    executePredicate(30, value -> value > 0 );
    executePredicate(-49, value -> value > 0);
  }
  /**
   * 
   * @param param 람다식에 전달할 값
   * @param predicate 값(param)을 받아서 체크한뒤 boolean값을 반환하는 함수
   */
  public static void executePredicate(Integer param, Predicate<Integer> predicate) {
    if (predicate.test(param)) {
      System.out.println(param +"은 양수");
    } else {
      System.out.println(param +"은 음수");
    }
    
  }
  /**
   * 
   * @param param 람다식에 전달할 값
   * @param function param값을 받아서 가공하여 반환하는 함수
   */
  public static void executeFunction(String param, Function<String, Integer> function){
    Integer result = function.apply(param);
    System.out.println(result);
  }
  /**
   * 
   * @param supplier 값을 반환하는 함수(람다식)
   */
  public static void executeSupplier(Supplier<String> supplier){
    String result = supplier.get();
    System.out.println("suplier 결과 : "+ result);
  }

  //java doc
/**
 * 
 * @param param 람다식에 전달할 값
 * @param consumer 값(param)을 받아서 사용하는 함수(람다식)
 */

/* */
  //이미 존재하는 인터페이스인, Comsumer를 매개변수로 받는 메서드 -> 람다식사용
  public static void executeConsumer(String param, Consumer<String> consumer) {
    consumer.accept(param);

  }

}
