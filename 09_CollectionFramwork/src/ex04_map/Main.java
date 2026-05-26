package ex04_map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.jar.Attributes.Name;

public class Main {
  public static void main(String[] args) {
    // 1. HashMap 객체 생성
    Map<String, Object> map = new HashMap<>();
    // 2.Entry 저장 (Key + Value => Entry)
    map.put("name", "김형준");
    map.put("age", 30);
    map.put("hobbies", new String[] { "운동", "게임", "독서" });
    // 3. Entry 수정(기존에 사용하던 Key를 다시 사용하면 기존 Value가 수정됨)
    map.put("age", 36);
    // 4. 정보 확인(Value 확인 -> Key를 이용해Value확인)
    System.out.println("이름 : " + map.get("name"));
    System.out.println("나이: " + map.get("age"));
    // map에서 value값이 현재 object라서 Arrays의 toString() 쓰려면 다운캐스팅해줘야함.
    System.out.println("취미 : " + Arrays.toString((String[]) map.get("hobbies")));
    System.out.println("생일 : " + map.getOrDefault("birthday", "생일정보 없음"));

    // 5. Entry 순회1(Key를 이용한 순회 방식)
    Set<String> keys = map.keySet();
    for (String key : keys) {
      if (key == "hobbies") {
        System.out.println("Key: " + key + "Value: " + Arrays.toString((String[]) map.get(key)));
      } else {
        System.out.println("Key: " + key + "Value: " + map.get(key));
      }

    }
    // 6.Entry 순회2(entrySet()이용! -> Entry 인터페이스를 이용한 순회 방식 - 추천)
    for (Map.Entry<String, Object> entry : map.entrySet()) {
      if (entry.getKey() == "hobbies") {
        System.out.println("Key: " + entry.getKey() + "Value: " + Arrays.toString((String[]) entry.getValue()));
      } else {
        System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue());
      }

    }

    //7. Map.of() -> return Map.of(..)로 사용하면 좋겠다~~
    //정적 팩토리 메서드 of() : new 대신 사용하는 객체 생성 메서드
    //이렇게 만든 Map객체는 수정 불가능(Immutable: put(),remove() 등 호출 시 오류 발생) -> 데이터 훼손의 걱정이 없다.
    Map<String, Object> map2 = Map.of("Name", "홍길동", "age", 40);
    System.out.println(map2);

  }

}
