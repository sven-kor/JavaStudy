package ex01_File;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws IOException {

    // 정보확인
    File javaHome = new File("/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home");

    System.out.println("이름 : " + javaHome.getName());
    System.out.println("절대경로 : " + javaHome.getAbsolutePath());
    System.out.println("상대경로 : " + javaHome.getCanonicalPath());
    System.out.println(javaHome.isDirectory() ? "디렉토리" : "파일");
    System.out.println("크기 : " + javaHome.length() + "Byte");
    System.out.println("최종수정일 : " + javaHome.lastModified());

    File[] files = javaHome.listFiles();
    Arrays.stream(files)
        // 파일만 필터링
        .filter(file -> file.isFile())
        // 개인 출력
        .forEach(file -> {
          System.out.println("이름 : " + file.getName());
          System.out.println("크기 : " + file.length() + "Byte");
        });

    // 디렉터리 조작(생성, 삭제)
    File dir = new File("/Users/macair0521/Documents/JavaStudy/IOTest");
    if (dir.exists()) {
      System.out.println(dir.getAbsolutePath() + "존재합니다");
    } else {
      dir.mkdirs(); // 폴더 만들기(하위폴더까지 만듬)
      System.out.println(dir.getAbsolutePath() + "생성했습니다.");
    }

    dir.delete(); //폴더 지우기 - 비어있는 폴더만 지울 수 있다.

  }

}
