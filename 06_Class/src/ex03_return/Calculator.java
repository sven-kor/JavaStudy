package ex03_return;

public class Calculator {
int add(int a, int b){
  return a+b;
}
//반환 값이 없는 메서드의 return
/**
 * 두 double값을 더하는 메서드(리턴값이 없이 출력)
 * @param a 더블값1
 * @param b 더블값2
 */
void add(double a, double b){
  if(a < 0 || b<0) return;
  //메서드의 실행 종료 -> 오직 리턴 값이 없는 메서드에서만!
  System.out.println(a+b);
}

}
