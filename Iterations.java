
import java.util.*; //using generic collections

/**
 * created interface class Collections that 
 * extends the action to iterate through objects
 */
public class Iterations {
	
	
	public static void main(String[] args) { //Main body of execution	
		
		LinkedHashMap<String,Integer> HighestScore = new LinkedHashMap<>(); //Creating a empty hash table for the highest scores

		
		
		/**
		 * creating a list of values to represent the highest score
		 * using HighestScore variable
		 */
		HighestScore.put("Smith",98);
		HighestScore.put("Alice",87);
		HighestScore.put("Jeremy",77);
		HighestScore.put("Trevor",44);
		HighestScore.put("Steffany",34);



		// mapping for a parameter
		ArrayList<String> students = new ArrayList<>();
		HighestScore.forEach((student, score) -> students.add(student));
		System.out.println("\nStudents: " +  students);
		
		/**
		 * creation of the first parameter
		 * iterates the values within the table
		 */
		System.out.println("Here are the list of students and their grades.\n");
		System.out.println("Iterating over entries: ");
		for(Map.Entry<String, Integer> entry : HighestScore.entrySet()) { //iterate through the entries
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		
		System.out.println("\n");
		/**
		 * creation of the second parameter:
		 * 
		 * Filtering the entries based on condition, therefore
		 * iterating and catching only the passing scores students got.
		 */
		
		System.out.println("Filtered entries (scores >= 75) \n"); //for values >= 75 iterate over the values within the specific condition
		System.out.println("Passing scores");
		for(Map.Entry<String, Integer> entry : HighestScore.entrySet()) {
			if(entry.getValue() >=75) { //Conditioned to only values >= 75
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
		System.out.println("\n");
		
		/**
		 * Creation of the 4th parameter: 
		 * 
		 * Filters the entries based on a condition, but this time
		 * lists values of failing scores students got.
		 * 
		 */
		System.out.println("Filtered entries (scores <= 75) \n"); //For values <= 75 iterate over the values within the specific condition
		System.out.println("Failing scores");
		for(Map.Entry<String, Integer> entry : HighestScore.entrySet()) {
			if(entry.getValue() <= 75) { //Conditioned to only values <= 75
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
		
	}
	
}
