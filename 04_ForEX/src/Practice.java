public class Practice {
  public static void main(String[] args) {
    // 실습
    // 1. 정수형 변수 a와 b에 임의의 값을 저장한 뒤, 두 수의 합과 차를 출력하세요.
    // 단, 차는 항상 양수 값으로 출력하세요.
    int a = (int) (Math.random() * 10);
    int b = (int) (Math.random() * 10);
    System.out.println("a : " + a);
    System.out.println("b : " + b);
    System.out.println(a > b ? a - b : b - a);

    // 2. 정수형 변수 num1, num2를 선언하고 임의의 값을 저장합니다.
    // 연산자('+', '-', '*', '/', '%')를 저장할 문자형 변수 op를 선언하고,
    // 변수 op에 저장된 값에 따라 num1, num2의 연산을 수행하세요. (switch 문 문제)

    int num1 = 10;
    int num2 = 9;
    char op = '*';

    switch (op) {
      case '+':
        System.out.println(num1 + num2);
        break;
      case '-':
        System.out.println(num1 - num2);
        break;
      case '*':
        System.out.println(num1 * num2);
        break;
      case '/':
        System.out.println(num1 / num2);
        break;
      case '%':
        System.out.println(num1 % num2);
        break;
      default:
        System.out.println("연산자가 잘못 되었습니다.");
    }

    // 3. 점수와 학년에 따른 합격 여부를 출력하세요.
    // 1~2학년은 60점 이상이면 "합격"이고, 3~4학년은 70점 이상이어야 "합격"입니다.
    int score = 70;
    int year = 4;
    int cutLine = 0;

    if (year >= 3) {
      cutLine = 70;
    } else {
      cutLine = 60;
    }
    System.out.println(score >= cutLine ? "합격" : "불합격");

    // 4. 100,000원 이상 모금될때까지 계속해서 money를 모금하는 코드를 구현하세요.
    // money는 70원으로 처리하세요.
    // [출력 예시]
    // 1회 모금액 70원
    // 2회 모금액 140원
    // 3회 모금액 210원
    // ...
    // 1429회 모금액 100030원
    int money = 0;
    while (money < 100000) {
      money += 7000;
      System.out.println("7000원이 모금되었습니다. 모금액 : " + money);
    }

    // 5. 100부터 1까지 역순으로 값을 출력하세요.
    // 각 숫자들 사이에는 공백을 출력하고, 한 줄에 숫자를 10개씩만 출력하세요.
    for (int i = 10; i > 0; i--) {
      for (int j = 0; j < 10; j++) {
        System.out.print(i * 10 - j + " ");
      }
      System.out.println("");
    }

    // 6. 정수형 변수 n을 이용하여 n!(팩토리얼) 값을 구하세요.
    // n은 1 ~ 20 사이의 값을 가져야 합니다. 값은 스스로 정하세요.
    // 만약, 20 초과되는 값을 사용하면 기본 타입을 이용해 결과 값을 저장할 수 없습니다.

    // 7. 전체 구구단을 세로 방향으로 출력하세요.
    // [출력 예시]
    // 2x1=2
    // 2x2=4
    // ...
    // 9x9=81

    // 8. 전체 구구단을 가로 방향으로 출력하세요.
    // [출력 예시]
    // 2x1=2 3x1=3 ... 9x1=9
    // 2x2=4 3x2=6 ... 9x2=18
    // ...
    // 2x9=18 3x9=27 ... 9x9=81

    // 9. 별(*)을 반복하여 출력하여 피라미드 모양을 만들어 출력하세요. for문을 사용하세요.
    // [출력 예시]
    // *
    // **
    // ***
    // ****
    // *****

    // 10. 별(*)을 반복하여 출력하여 역피라미드 모양을 만들어 출력하세요. for문을 사용하세요.
    // [출력 예시]
    // *****
    // ****
    // ***
    // **
    // *
  }
}
