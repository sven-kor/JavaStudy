package ex03_input;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    // File 객체 (우리가 읽으려는 대상)
    File dir = new File("storage"); 
    
    // parent, child
    File file = new File(dir, "test.txt");
    
 //파일 데이터를 읽는 스트림 : 통로(입력 스트림)
    try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
      //데이터 읽기 
      //어떤 단위로 읽을 지 결정(int, byte[]) -> 한번에 여러바이터씩 읽는게 성능 좋음.
      byte[] b = new byte[4];
      //실제로 읽은 바이트 수 (bid.read()의 return값이 읽은 바이트수 int임)
      int readByte = 0;
      //파일이 끝날 때 까지 읽기 -> 파일이 끝나면 -1반환
      while((readByte = bis.read(b)) != -1) {
        //실제로 읽은 바이트 수 만큼 처리하기 //한글은 처리 잘 안됨!
        System.out.print(new String(b, 0, readByte));
      }
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
