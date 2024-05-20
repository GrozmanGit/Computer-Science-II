TotalingDigits

```
import java.util.*;
import java.io.*;

class Main 
{
  public static void main(String[] args) throws Exception 
  {
    System.out.println("\u001B[32m" + 
       "Array Review 1"  + 
       "\u001B[33m\n");

    System.out.println("\u001B[32m" + 
    "Name: Teresh/GrozmanGit" + 
       "\u001B[33m");

    System.out.println("\u001B[37m\n\n");
    
    Scanner file = new Scanner(new File("digits.dat"));

    int dataSets = file.nextInt();
    file.nextLine();

    for (int j = 0; j < dataSets; j++) 
    {
      int dat = file.nextInt();
      file.nextLine();

      System.out.println("Value = " + dat);

      int total = 0;

      boolean singleDigitTotal = false;

      while (!singleDigitTotal) 
      {
        while (dat > 0) 
        {
          int rightDigit = dat % 10;
          total += rightDigit;
          dat /= 10;
        }

        System.out.println("Total = " + total);

        if ((total >= 0) && (total <= 9)) 
        { singleDigitTotal = true; } 
        else 
        {
          dat = total;
          total = 0;
        }
      }
      System.out.println("Answer = " + total + "\n");
    }
    System.out.println("\n");
  }
}
```
