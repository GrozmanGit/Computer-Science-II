StudentObjectsInAnArray

```
public class Main 
{
  public static void main(String args[]) 
  {
    System.out.println("\u001B[32m" + 
      "Student Objects in an Array"  + 
      "\u001B[33m\n");

    System.out.println("\u001B[32m" + 
      "Name: Teresh/GrozmanGit" + 
      "\u001B[33m");

    System.out.println("\u001B[37m\n");
    
    Student students[] = new Student[3];

    int[] vals1 = { 90, 85, 95, 77, 88 };
    Student stu = new Student("Billy Bob", vals1);
    students[0] = stu;

    int[] vals2 = { 100, 100, 99 };
    stu = new Student("Sally Sue", vals2);
    students[1] = stu;

    int[] vals3 = { 100, 100, 100 };
    stu = new Student("Sam Smith", vals3);
    students[2] = stu;

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
```
