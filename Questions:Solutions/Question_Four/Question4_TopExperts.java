import java.util.HashMap;
import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("My Bruh please enter a note:");
		
		while(scan.hasNext())
		{
			String input = convert(scan.next());
			
			if(input == null)
			{
				System.out.println("UNIQUE");
				input = scan.next();
			}
			else
			{
				System.out.println(input + ' ' + scan.next());
			}
		}
		
		scan.close();
	}
	
	public static String convert(String note) {
		String returnString = "";
		
		HashMap<String, String> noteMap;
		noteMap = new HashMap<String, String>();
		
		noteMap.put("A#", "Bb");
		noteMap.put("Bb", "A#");
		noteMap.put("C#", "Db");
		noteMap.put("Db", "C#");
		noteMap.put("D#", "Eb");
		noteMap.put("Eb", "D#");
		noteMap.put("F#", "Gb");
		noteMap.put("Gb", "F#");
		noteMap.put("G#", "Ab");
		noteMap.put("Ab", "G#");
		
		returnString = noteMap.get(note);
		
		return returnString;
	}
}
