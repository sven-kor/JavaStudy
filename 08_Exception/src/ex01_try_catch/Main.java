package ex01_try_catch;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a, b;

    while (true) {

      try {
        System.out.println("첫 번째 숫자 입력");
        a = sc.nextInt();
        System.out.println("두 번째 숫자 입력");
        b = sc.nextInt();
        // 0으로 나누면 예외발생! -> 처리 안하면 웹 먹통 되는 것!
        System.out.println("몫:" + a / b + "나머지:" + a % b);
      } catch (ArithmeticException e) {
        // err문 출력시
        // System.err.println("에러 발생 : " + e.getMessage());
        e.printStackTrace();
      } catch (InputMismatchException e) {
        System.out.println("정수만 입력할 수 있습니다.");
        sc.nextLine();
      } finally {
        System.out.println("다시 입력하세요.");
      }
    }
  }

}
