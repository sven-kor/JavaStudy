package ex03_stream_api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//lombok으로 생성자, getter, setter, ToString 채우기
@AllArgsConstructor
@Getter
@Setter
@ToString

@Data
public class Article {

  private String title;
  private int viewCount;

}
