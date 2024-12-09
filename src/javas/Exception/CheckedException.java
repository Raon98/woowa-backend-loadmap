package javas.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            System.out.println(br.readLine());
            br.close();
        }catch (IOException e){
            /* 주요 Checked Exception Ex
                1. IOException
                2. SQLException
                3. ClassNotFoundException
                4. FileNotFoundException
             */
            e.printStackTrace();
        }
    }
}
