package ex03_set;

import java.util.*;

public class MemberMain {
  public static void main(String[] args) {
    Set<Member> members = new HashSet<>();
    // Check Point
    // 1. 중복 저장해보기
    members.add(new Member("형준", 36));
    members.add(new Member("경석", 32));
    members.add(new Member("범훈", 26));
    // 중복저장(순서가 없으므로 이미 있는것은 그냥 패스됨)
    members.add(new Member("형준", 36));

    // 2. 존재여부 확인
    if (members.contains(new Member("경석", 32))) {
      System.out.println("존재한다.");
    } else {
      System.out.println("존재하지 않는다");
    }

    // 3. 객체 정보 출력해보기

    for (Member member : members) {
      System.out.println(member);
      System.out.println("main수정");
    }

  }

}
