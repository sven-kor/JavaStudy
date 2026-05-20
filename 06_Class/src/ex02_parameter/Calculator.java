package ex02_parameter;

class Main1 {
  public static void main(String[] args) {
    Calculator myCalc;
    myCalc = new Calculator();
    myCalc.add(1, 2);
    myCalc.add(1.5, 2.5);
    int[] arr = {1,2,3,4,5};
    myCalc.add(new int[]{1,2,3,4,5});
    myCalc.mutiply(1,2,4,5);
  }
}


public class Calculator {

  void add(int a, int b) {
    System.out.println(a + b);
  }
//메서드 오버로딩(overloading)
//같은 이름의 메서드 + 개수나 타입이 다른 매개변수
  void add(double a, double b) {
    System.out.println(a + b);
  }
  //가변인자 처리를 위한 말줄임표(...) 최소 2개 넣게 만들기
  void mutiply(int a, int b, int...nums){
    //가변 인자는 실제로는 배열로 처리됩니다.
    int result1 = a*b;
    for (int i : nums) {
      result1 *= i;
    }
    System.out.println(result1);
  }
 //오버로딩과 가변인자를 동시에 써서 쓸데없는 코드 만들지 말 것.
void add(int[] nums){
  int result = 0;
  for (int i : nums) {
    result += i;
  }
  System.out.println(result);
  for (int i = 0; i < nums.length; i++) {
    
  }
}

}
