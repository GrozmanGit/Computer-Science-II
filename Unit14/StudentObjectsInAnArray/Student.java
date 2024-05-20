StudentClass

```
import java.util.*;

public class Student 
{
  private String name;
  private int grades[];

  public Student(String name, int[] grades) 
  {
    this.name = name;
    this.grades = grades;
  }

  public void setGrade(int spot, int grade) 
  {
    grades[spot] = grade;
  }

  public String getName() 
  {
    return name;
  }

  public int getTotal() 
  {
    int total = 0;

    for (int j : grades) 
    { total += j; }
    return total;
  }

  public int getNGrades() 
  {
    return grades.length;
  }

  public double getAverage() 
  {
    return (double) getTotal() / getNGrades();
  }

  public double getAverageMinusLow() 
  {
    return (double) (getTotal() - getLowestGrade()) / (getNGrades() - 1);
  }

  public int getHighestGrade() 
  {
    int highest = Integer.MIN_VALUE;

    for (int j : grades) 
    {
      if (j > highest) 
      { highest = j; }
    }
    return highest;
  }

  public int getLowestGrade() 
  {
    int lowest = Integer.MAX_VALUE;

    for (int j : grades) 
    {
      if (j < lowest) 
      { lowest = j; }
    }
    return lowest;
  }

  public String toString() 
  {
    return getName() + " - " + Arrays.toString(grades);
  }
}
```
