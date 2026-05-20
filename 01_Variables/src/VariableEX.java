public class VariableEX {
  public static void main(String[] args) {
    // 6가지 기본타입
    // boolean hasPen = true;
    // byte a = 127;
    // int b = 36;
    // long c = 10000000000L;
    // double d = 1.0;
    // char e = 'a';
    // System.out.println(hasPen);
    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);
    // System.out.println(d);
    // System.out.println(e);
    // // 문자열
    // String string = "HelloWorld";
    // System.out.println(string);
  
    //자동 형 변환


    //강제 형 변환
    // int -> byte 변환
    int i = 256;
    byte byteI = (byte)i;
    System.out.println(byteI);//-- 비트값 : X 0 0 0 0 0 0 0 0 (상위 비트 손실로 값이 달라짐)
    //double -> long 변환
    double d = 1.9;
    long l = (long)d;//-- 실수 -> 정수 변환 시 소수부 아래는 모두 손실
    System.out.println(d);
    System.out.println(l);

    //int -> char 변환
    int iNUM = 65; //--------- 48('0'), 65('A'), 97('a')
    char ch = (char)iNUM;//-- 정수 -> 문자 변환 시 정수를 코드값으로 가지는 문자로 변환
    System.out.println(iNUM);
    System.out.println(ch);

    




  }
}
