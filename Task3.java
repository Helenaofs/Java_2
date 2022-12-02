// В файле содержится строка с данными:

// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:

// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Task3 {



  public static void main(String[] args) {
    try {
      File file = new File("file.txt");
      Scanner scanner = new Scanner(file);
      String line = scanner.nextLine();

      String[] arr = line.replace("{", "").replace("}", "").replace("[", "")
          .replace("]", "").replace("\"", "")
          .replace(":", ",").replace(" ", "").split(",");

          StringBuilder key = new StringBuilder();
          for (int i = 1, j = 3, q = 5; i < arr.length; i+= 6,j+= 6,q+= 6) {
            
            key.append("Студент "+ arr[i]+ " получил "+ arr[j]+ " по предмету "+ arr[q]); 
            System.out.println(key);
            key.setLength(0);
          }

    } catch (FileNotFoundException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
