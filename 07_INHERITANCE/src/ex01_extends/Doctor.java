package ex01_extends;

public class Doctor extends Person{

  private String hospital;

  public Doctor(String name, String hospital){
    super(name);
    this.hospital = hospital;
  }
  void heal(){
    System.out.println("치료한다!");
  }
  


}
