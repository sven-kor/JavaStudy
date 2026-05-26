package ex02_throw;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    while (true){
    //try with resources: 자동으로 close()처리함
    //try (자원생성){} catch {}
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("점수(0~100)를 입력하세요");
      int score = sc.nextInt();
      if (score > 100) {
        throw new InputMismatchException("점수는 100보다 클 수 없다.");
      } else if (score < 0) {
        throw new InputMismatchException("점수는 0보다 작을 수 없다.");
      }
      System.out.println(score >= 69?"합격":"불합격");

    } catch (Exception e) {
      System.out.println(e.getMessage());
      
    } 
  }

  }

}
