package ex03_stream_api;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    //원본 리스트
    List<String>  members = Arrays.asList("kim", "jessica", "john", "tomson", "tomas", "lee");

    //원본 리스트를 이용해 Stream 생성
    Stream<String> steam = members.stream();

    //최종연산 -> 소비됨. / 다시 사용x
    steam.forEach(memeber -> System.out.println(memeber));

    //다시 스트림 생성
    Stream<String> steam2 = members.stream();

    //중간연산
    List<String> list = steam2.filter(memeber -> memeber.length() > 3)
    .map(memeber -> memeber + "님")
    .collect(Collectors.toList());  
    System.out.println(list);  
  }

}
