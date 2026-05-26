package ex02_list;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    // 배열 리스트 (ArrayList) 다루기
    // 배열과 같은 원리도 동작

    // 1. 생성(생성시점에 타입결정-generic)
    List<String> members = new ArrayList<>();
    // 2. 요소 추가하기
    members.add("지수");
    members.add("리사");
    members.add("제니");
    members.add("로제");
    // 3. 요소 확인
    System.out.println(members);
    System.out.println(members.get(0));
    System.out.println(members.get(1));
    System.out.println(members.get(2));
    System.out.println(members.get(3));
    //4.길이 확인
    System.out.println(members.size());

    //5. 요소 삭제
    String removed = members.remove(0);//( 반환값은 삭제된 요소)
    System.out.println(removed);
    boolean isRemoved = members.remove("지수");//반환값은 boolean
    System.out.println(isRemoved);
    System.out.println(members);

    //6.요소 존재 확인
    String target = "윤아";
    if (members.contains(target)) {
      System.out.println(target + "있다");
    } else {
      System.out.println(target + "없다");
    }
    //7.for문 순회하기(같은 값을 반환하는 반복적인 메서드 호출 지양)
    for (int i = 0, length = members.size(); i < length; i++) { //초기화 블럭 int 쪽이 한번만 호출됨 따라서 members.size()를 앞쪽에 쓰기
      System.out.println(members.get(i));
    }



  }




}
