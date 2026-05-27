package ex03_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArticleMain {
  public static void main(String[] args) {
    List<Article> articles = Arrays.asList(
      new Article("오늘날씨", 15),
      new Article("이란 전쟁", 115),
      new Article("축구", 55),
      new Article("스타벅스", 515),
      new Article("gtx-a 철근", 815)
    );
  
    //스트림 API 이용
    //조회수가 100이상인 기사의 제목을 리스트에 저장하세요. 
    List<String> titles = articles.stream()
    //조회수 필터링
    .filter(article -> article.getViewCount() >= 100)
    //제목으로 요소 형태 변환
    .map(article -> article.getTitle())
    //리스트로 수집
    .collect(Collectors.toList());

    System.out.println(titles);

  }

}
