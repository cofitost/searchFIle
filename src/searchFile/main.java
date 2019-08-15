package searchFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    SearchJava searchJava = new SearchJava();
    String pattern = ".*\\.java";
    File folder = new File("C:\\Users\\Wen Ren Jiang\\Downloads\\test\\4Javac");
    List<String> result = new ArrayList<>();

    System.out.print(searchJava.search(pattern, folder, result));

    // for (String s : result) {
    // System.out.println(s);
    // }
  }

}
