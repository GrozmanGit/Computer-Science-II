ThrowingPercentage

```
import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner kb = new Scanner(System.in);

    System.out.println("\u001B[32m" + 
       "Throwing Percentage"  + 
       "\u001B[33m\n");

    System.out.println("\u001B[32m" + 
    "Name: Teresh/GrozmanGit" + 
       "\u001B[33m");

    System.out.print("Enter # of complete passes: "); 
    int passesCompleted = kb.nextInt();
    kb.nextLine();

    System.out.print("Enter # of total passes: ");
    int passesTotal = kb.nextInt();
    kb.nextLine();

    double throwingPCT = (double)passesCompleted / passesTotal;
    System.out.println("\nThe throwing percentage is " + throwingPCT + "\n");
  }
}
```
