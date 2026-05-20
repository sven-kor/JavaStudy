import java.util.Arrays;

public class ArrayPractice {
  public static void main(String[] args) {
    // 1. 다음 정수형 배열에 저장된 모든 요소의 합계와 평균을 출력하세요.
    int[] numbers = { 4, 7, 9, 12, 17, 19, 24, 28, 30 };
    int sum = 0;

    for (int i : numbers) {
      sum += i;
    }
    double avg = (double) sum / numbers.length;
    System.out.println(sum);
    System.out.println(avg);

    // 2. 다음 정수형 배열에 저장된 모든 요소 중 최대값과 최소값을 출력하세요.
    int[] numbers2 = { 42, 17, 93, 120, 117, 59, 24, 28, 39 };
    int maxNum = 1;
    int minNum = 99999;
    for (int i : numbers2) {
      maxNum = maxNum > i ? maxNum : i;
      minNum = minNum < i ? minNum : i;
    }
    System.out.println("최대값 :" + maxNum + "\n" + "최소값 :" + minNum);

    // 3. 다음 배열의 길이를 4로 늘려서 "autumn", "winter"를 저장하세요.
    String[] seasons = { "spring", "summer" };
    String[] seasonsLong = new String[4];
    System.arraycopy(seasons, 0, seasonsLong, 0, seasons.length);
    seasons = seasonsLong;
    seasons[2] = "spring";
    seasons[3] = "summer";
    System.out.println(Arrays.toString(seasons));

    // 4. 다음 정수형 배열의 모든 요소들의 저장 순서를 뒤집으세요.
    int[] numbers1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
    int[] numbersCopy = new int[8];
    // 반으로 나눠서 1대1교환하면 절반만 돌 수 있다.
    for (int i = 0; i < numbers1.length; i++) {
      numbersCopy[numbersCopy.length - 1 - i] = numbers1[i];
    }
    numbers1 = numbersCopy;
    System.out.println(Arrays.toString(numbers1));

    // 5. 다음 정수형 배열이 오름차순으로 정렬되어 있으면 true, 아니면 false를 boolean result 변수에 저장하세요.
    int[] numbers5 = { 1, 2, 3, 4, 5 };
    boolean result = true;
    // 다 돌필요없이 전까지만 + false되면 break걸기
    for (int i = 0; i < numbers5.length - 1; i++) {
      if (numbers5[i] > numbers5[i + 1]) {
        result = false;
        break;
      }
    }
    System.out.println(result);

    // 6. uppers 배열에는 대문자를 순서대로 저장하고, lowers 배열에는 소문자를 순서대로 저장하세요.
    // 배열의 타입은 char[]로 처리하세요.65~90 대문자.97~122
    char[] uppers = new char[26];
    char[] lowers = new char[26];
    // for (int i = 65; i < 91; i++) {
    // uppers[i - 65] = (char) i;
    // lowers[i - 65] = (char) (i + 32);
    // }
    for (int i = 0; i < lowers.length; i++) {
      uppers[i] = (char) ('A' + i);
      lowers[i] = (char) (uppers[i] + 32);
    }
    System.out.println(Arrays.toString(uppers));
    System.out.println(Arrays.toString(lowers));

    // 7. 10진수(number)를 2진수로 변환한 결과를 int[] binary에 저장하세요.

    int n = 13;
    int[] binary = new int[12];
    for (int i = binary.length - 1; i >= 0; i--) {
      binary[i] = n % 2;
      n /= 2;
      if (n == 0)
        break;
    }
    System.out.println(Arrays.toString(binary));
    int i = binary.length - 1;
    // i++를 쓰면 포문을 아낄 수 있다.
    while (n > 0) {
      binary[i--] = n % 2;
      n /= 2;
    }
    System.out.println(Arrays.toString(binary));

    // 8. 아래 apt 배열에는 각 가구당 인원수가 저장되어 있습니다.
    // 각 층마다 총 몇 명이 거주하는지 출력하세요.
    int[][] apt = {
        { 2, 5 }, // 1층: 1호에 2명, 2호에 5명 거주
        { 3, 4 }, // 2층: 1호에 3명, 2호에 4명 거주
        { 1, 4 },
        { 2, 3 },
        { 3, 3 }
    };
    // [출력 예시]
    // 1층 : 7명
    // 2층 : 7명
    // ...
    for (int j = 0; j < apt.length; j++) {
      int people = 0;
      for (int j2 = 0; j2 < apt[j].length; j2++) {
        people += apt[j][j2];
      }
      System.out.println(j + 1 + "층 : " + people);
    }

    // 9. 2단부터 9단까지 구구단을 String[][] gugudan 2차원 배열에 저장하세요.

    // 10. 다음 2차원 배열 T의 모든 요소를 시계 방향으로 90도 회전한 상태로 바꾸세요.
    int[][] T = {
        { 1, 1, 1, 1, 1 },
        { 0, 0, 1, 0, 0 },
        { 0, 0, 1, 0, 0 },
        { 0, 0, 1, 0, 0 },
        { 0, 0, 1, 0, 0 }
    };
    int[][] t = new int[5][5];
    for (int j = 0; j < t.length; j++) {
      for (int j2 = 0; j2 < t[j].length; j2++) {
        t[j2][4-j] = T[j][j2];
      }
    }
    for (int j = 0; j < t.length; j++) {
      for (int j2 = 0; j2 < t[j].length; j2++) {
        System.out.print(t[j][j2]);
      }
      System.out.println();
    }
    

    // 추가 공부
    // //Comparator 정렬 기준을 정의하는 인터페이스
    // //정의할 때
    // //익명클래스
    // Comparator<String> c3 = new Comparator<String>() {
    // @Override
    // public int compare(String a, String b){
    // return a.length() - b.length();
    // }
    // };
    // //람다식
    // Comparator<String> c = (a,b) -> a.length() - b.length();
    // Comparator<Integer> c1 = (a,b) -> a - b;
    // //오버플로우 위험때문에 아래처럼쓴다.
    // Comparator<Integer> c2 = (a,b) -> Integer.compare(a, b);
    // //메서드사용(실무)
    // list.sort(Comparator.naturalOrder());
    // Comparator<Person> c =
    // Comparator.comparingInt(p -> p.age);
    // list.sort(c);

  }
}
