import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main
{
	public static int[] getInlineData(String line)
	{
		String split[] = line.trim().split(" ");

		int playerData[] = new int[split.length];

		for (int j = 0; j < split.length; j++)
		{ playerData[j] = Integer.parseInt(split[j]); }

		return playerData;
	}

	public static int findIndex(int[] data, int ID)
	{
		for (int j = 0; j < data.length; j++)
		{
			if (data[j] == ID)
			{ return j; }
		}
		return -1;
	}
	
	public static int[] substitutePlayerID(int[] data, String input)
	{	
		int players[] = data; 
		
		String substitute = input + " "; 
		
		int space = substitute.indexOf(" ");
		int dash = substitute.indexOf("-");
		int inIndex = 0; 
		
		while (space != -1)
		{
			int curID = Integer.parseInt(substitute.substring(0, dash));  
			int subID = Integer.parseInt(substitute.substring(dash + 1, space)); 
			inIndex = findIndex(data, curID); 
			
			if (inIndex != -1)
			{
				data[inIndex] = subID; 
				
				substitute = substitute.substring(space + 1); 
				space = substitute.indexOf(" ");
				dash = substitute.indexOf("-"); 
			}
			else
			{ continue; }
		}

		Arrays.toString(players); 
		return players;
	}
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("Ashton Naicker\n");
			
		Scanner input = new Scanner(new File("Substitution.dat"));
		
		int lines = input.nextInt();
		input.nextLine(); 
		
		for (int i = 0; i < lines; i++)
		{		      
			int players[] = getInlineData(input.nextLine());	
			players = substitutePlayerID(players, input.nextLine()); 
			
			Arrays.sort(players);
			System.out.println(Arrays.toString(players));  
		}
		
		input.close();
	}
}
