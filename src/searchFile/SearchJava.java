package searchFile;

import java.io.File;
import java.util.List;

public class SearchJava {

  public String search(String pattern, File folder, List<String> result) {
    String allFile = "";
    for (final File f : folder.listFiles()) {

      if (f.isDirectory()) {
        search(pattern, f, result);
      }

      if (f.isFile()) {
        if (f.getName().matches(pattern)) {
          result.add(f.getAbsolutePath());
        }
      }
    }
    allFile = getFileName(result.get(0));

    return allFile;
  }

  public String getFileName(String completePath) {
    String fileName = "";
    int sepPos = completePath.lastIndexOf(File.separator);
    fileName = completePath.substring(sepPos + 1);

    return fileName;
  }
}
