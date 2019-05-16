import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        File file = new File("mytextfile.txt");
        try{
            FileWriter fw = new FileWriter(file);
            fw.write("hello text file");
            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}