package ex03_set;

import javax.annotation.processing.Generated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//생성자(constructor)
@AllArgsConstructor
//Getter
@Getter
//Setter
@Setter
//toString
@ToString
//equals(), hashCode()
@EqualsAndHashCode

@Data
public class Member {
  private String name;
  private int age;
  
}
