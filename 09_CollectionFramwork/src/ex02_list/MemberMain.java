package ex02_list;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {
  public static void main(String[] args) {
    //1. ArrayList 생성
    List<Member> members = new ArrayList<>();
    //2. 요소추가
    members.add(new Member("형준", 36));
    members.add(new Member("경석", 32));
    members.add(new Member("범훈", 26));
    members.add(new Member("경태샘", 49));

    //3. 요소 확인
    System.out.println(members.get(0));
    System.out.println(members.get(1));
    System.out.println(members.get(2));
    System.out.println(members.get(3));

    //4.요소 삭제
    boolean isRemoved = members.remove(new Member("형준", 36));
    System.out.println(isRemoved);

    //5. 요소 존재 확인
    Member target = new Member("범훈", 26);
    if (members.contains(target)) {
      System.out.println(target + "있다");
    } else {
      System.out.println(target + "없다");
    }
    //6.for문 순회
    for (int i = 0, length = members.size(); i < length; i++) {
      Member foundMember = members.get(i);
      System.out.println(foundMember.getName() + foundMember.getAge());
    }





  }

}
