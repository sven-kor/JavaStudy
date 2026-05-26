package ex02_list;
//extends안써져 있는것은 사실 다 object써져있는 것임
public class Member extends Object {

  //필드
  private String name;
  private int age;
    //생성자 2개 
  public Member(){

  }
  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }
   public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
 
 
  //object에 있는, toString, equals 새로 override에서 사용해야됨.
  
  //객체 정보 출력을 위한 toString Override 
   @Override
  public String toString() {
    return "Member [name=" + name + ", age=" + age + "]";
  }
  //객체 비교를 위한 equals, hashcode Override
   @Override
   public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + age;
    return result;
   }
   @Override
   public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Member other = (Member) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (age != other.age)
      return false;
    return true;
   }

  
  
  

}
