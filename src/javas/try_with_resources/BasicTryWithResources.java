package javas.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;

public class BasicTryWithResources {
    public static void main(String[] args) {
        try (BufferedReader  br = new BufferedReader(new FileReader("input.txt"))){
            //리소스 선언 : Try 괄호안에 BufferedReader 객체(AutoCloseable Interface) 선언
            String line;
            while ((line = br.readLine()) !=null){
                System.out.println(line);
            }
            // Try가 끝나면 BufferedReader는 자동으로 Close() 메서드 호출
        }catch (Exception e){
            e.printStackTrace();
            // 예외처리
        }

    }
}
