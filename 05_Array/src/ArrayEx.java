import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
  public static void main(String[] args) {
    //배열: 여러 변수를 하나의 이름으로 관리
    //선언
    String[] blackPink;

    //사용자 콘솔 입력
    Scanner sc = new Scanner(System.in);
    System.out.println("4를 입력하세요");
    int a = sc.nextInt();


    //생성 (실행 중에 메모리를 할당하는 것 : 동적 할당 -> Heap 영역)
    blackPink =  new String[4];
    //요소 (Element : 각 변수를 의미)
    blackPink[0] = "리사";
    blackPink[1] = "로제";
    blackPink[2] = "제니";
    blackPink[3] = "지수";

    for (int i = 0; i < blackPink.length; i++) {
      System.out.println(blackPink[i]);
    }

    //정적 초기화 (배열 선언 시에만 가능한 초기화)
    String[] seasons = {"봄", "여름", "가을", "겨울"};
    for (String string : seasons) {
      System.out.println(string);
    }

    //동적 초기화(배열 선언과 분리가 가능한 초기화)
    String[] hobbies;
    hobbies = new String[]{"게임", "독서"};
    for (String hobby : hobbies){
      System.out.println(hobby);
    }

    //배열의 길이는 수정불가 -> 배열 길이 늘리기는 : 새 배열 만들어서 이사시키기
    String[] names = {"김철수", "홍길동"};
    String[] newArray = new String[5];
    System.arraycopy(names, 0, newArray, 0, names.length);
    names = newArray;
    System.out.println(Arrays.toString(names));
  }
}
