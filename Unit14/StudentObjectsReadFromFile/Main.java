import java.util.List;
import java.util.ArrayList.*;
import java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main 
{
  public static List<Integer> data;

  public static int[] pushToArray(Scanner file) 
  {
    data = new ArrayList<Integer>();

    while (file.hasNextInt()) 
    { data.add(file.nextInt()); }

    int grades[] = new int[data.size()];
    for (int j = 0; j < data.size(); j++) 
    { grades[j] = data.get(j); }

    return grades;
  }

  public static void main(String args[]) throws Exception 
  {
    System.out.println("\u001B[32m" + 
       "Student Objects "  + 
       "\u001B[33m\n");

    System.out.println("\u001B[32m" + 
    "Name: Teresh/GrozmanGit" + 
       "\u001B[33m");

    System.out.println("\u001B[37m\n");

    Scanner file = new Scanner(new File("Data.dat"));
    Student students[] = new Student[file.nextInt()];
    file.nextLine();

    int grades[];
    String name = "";

    for (int j = 0; j < students.length; j++) 
    {
      name = file.nextLine();
      grades = pushToArray(file);
      data.clear();

      students[j] = new Student(name, grades);
      file.nextLine();
    }

    for (int i = 0; i < students.length; i++) 
    {
      System.out.println("Name\t\t\t= " + students[i].getName());
      System.out.println("total\t\t\t= " + students[i].getTotal());

      System.out.println("# of grades\t\t= " + students[i].getNGrades());

      System.out.printf("Average\t\t\t= %.5f", students[i].getAverage() + "\n");
      System.out.printf("Average - Low\t= %.5f", students[i].getAverageMinusLow() + "\n");

      System.out.println("Lowest grade\t= " + students[i].getLowestGrade());
      System.out.println("Highest grade\t= " + students[i].getHighestGrade() + "\n");
    }
  }
}
