package ex03_set;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    //1. HashSet (해시 기반 Set : 인덱스 없음(저장 순서 없음), 데이터 중복 불가)
    Set<String> members = new HashSet<>();
    // 2. 요소 추가
    members.add("사나");
    members.add("나연");
    members.add("모모");
    members.add("쯔위");
    members.add("미나");
    members.add("정연");
    //3.요소 하나씩 가져오기 -> 안됨...
    //4. 요소 삭제
    boolean isRemoved = members.remove("정연");
    System.out.println(isRemoved);
    //5. 요소 존재 확인
    if (members.contains("사나")) {
      System.out.println("존재한다");
    } else {
      System.out.println("존재하지 않는다");
    }
    //6. for 문 순회
    for (String member : members) {
      System.out.println(member);
    }
    
    

  }

}
