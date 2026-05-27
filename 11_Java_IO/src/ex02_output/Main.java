package ex02_output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    // File 객체 (우리가 만드려는 대상)
    File dir = new File("storage"); //맥에서는 /라는 절대경로는 실패! / 없이 상대경로로!
    if (!dir.exists()) {
      dir.mkdirs();
    }
    //parent, child
    File file = new File(dir, "test.txt");
    

    //파일로 데이터를 내보내는 스트림:통로(출력 스트림)
    //try with resources -> 자동으로 close()해준다. 
    try (BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(file, true))){

      //실제로 데이터 내보내기(int, byte[])
      int c = 'A';
      byte[] b = "pple3".getBytes();
      fos.write(c);
      fos.write(b);

    } catch (Exception e) {
      System.err.println(e.getMessage());
    } 
  }
}
