//import utilities needed for scanner class
import java.util.Scanner;

public class Mad_Libs {

	public static void main(String[]arg)
	{

	    // Create a Scanner object for keyboard input.
		Scanner MadLibs = new Scanner (System.in);
		Scanner strScan = new Scanner (System.in);
		
		 //adjective_1, color_1, color_2, adjective_2, animal_1, verb_1, noun_1, verbing_1, pluralnoun_1, pluralnoun_2, pluralnoun_3;
		// two int and one char and one double
		
	    
		
		// Get the 1st variable.
		System.out.print("Welcome to Mad Libs!!! Please enter an adjective");
		String adjective_1 = MadLibs.nextLine();
		// Get the 2nd variable.
		System.out.print("Please enter a color");
		String color_1 = MadLibs.nextLine();
		// Get the 3rd variable.
		System.out.print("Please enter another color");
		String color_2 = MadLibs.nextLine();
		// Get the 4th variable.
		System.out.print("Please enter an adjective");
		String adjective_2 = MadLibs.nextLine();
		// Get the 5th variable.
		System.out.print("Please enter a name of an animal");
		String animal_1 = MadLibs.nextLine();
		// Get the 6th variable.
		System.out.print("Please enter a verb");
		String verb_1 = MadLibs.nextLine();
		// Get the 7th variable.
		System.out.print("Please enter a noun");
		String noun_1 = MadLibs.nextLine();
		// Get the 8th variable.
		System.out.print("Please enter a verb ending with ing");
		String verbing_1 = MadLibs.nextLine();
		// Get the 9th variable.
		System.out.print("Please enter a pluralnoun");
		String pluralnoun_1 = MadLibs.nextLine();
		// Get the 10th variable.
		System.out.print("Please enter a pluralnoun");
		String pluralnoun_2 = MadLibs.nextLine();
		// Get the 11th variable.
		System.out.print("Please enter a pluralnoun");
		String pluralnoun_3 = MadLibs.nextLine();
		// Get the 12th variable.
		System.out.print("Please enter a noun");
		String noun_2 = MadLibs.nextLine();
		// Get the 13th variable.
		System.out.print("Please enter a number");
		int number_1 = MadLibs.nextInt();
		// Get the 14th variable.
		System.out.print("Please enter a noun");
		String noun_3 = strScan.nextLine();
		// Get the 15th variable.
		System.out.print("Please enter a number");
		int number_2 = MadLibs.nextInt();
		// Get the 16th variable.
		System.out.print("Please enter a noun");
		String noun_4 = strScan.nextLine();
		// Get the 17th variable.
		System.out.print("Please enter a number with decimals");
		double doublenumber_1 = MadLibs.nextDouble();
		// Get the 18th variable.
		System.out.print("Please enter a noun we are almost done!!!");
		String noun_5 = MadLibs.nextLine();
		// Get the 19th variable.
		System.out.print("Please enter a letter. This is the last i will ask of you. :)");
		char character = MadLibs.next().charAt(0);
		
		// Display the "story."
		System.out.println("The Grinch is a " + adjective_1 + " " + color_1 + " creature with " + color_2 + " eyes who does not like Christmas cheer.");
		System.out.println("When he sees people celebrating Christmas, it makes him " + adjective_2 );
		System.out.println("He and his " + animal_1 + " Max try to" + verb_1 + " Christmas for people in the town of " + noun_1 + "-ville by " + verbing_1 + " their Christmas " + pluralnoun_1 );
		System.out.println("When the people still have Christmas cheer, even without " + pluralnoun_2 +", the Grinch decides to return the " + pluralnoun_3 + " and celebrates Christmas after all.");
		System.out.println("The Grinch realizes what he was missing all along and that it was" + noun_2);		
		System.out.println("For this reason he gives everybody " + number_1 + " " + noun_3 + " " + number_2 + " " + noun_4 + " " + doublenumber_1 + " " + noun_5 + " " +  "with the letter" + character);
		
		
		
		//"The Grinch is a " + adjective1 + " " + color1 + " creature with " + color2 + " eyes who does not like Christmas cheer." 
		//"When he sees people celebrating Christmas, it makes him " + adjective2"." 
		//"He and his " + animal1 + " Max try to" + verb1 + " Christmas for people in the town of " + noun1 + "-ville by " + verb-ing1 + " their Christmas " + pluralnoun1"." 
		//"When the people still have Christmas cheer, even without " + pluralnoun2+", the Grinch decides to return the " + pluralnoun3 + " and celebrates Christmas after all."
		// "The Grinch realizes what he was missing what he was missing all along and that it was" + noun_2 
		//"For this reason he gives everybody " + number_1 + " " + noun_3 + " " + number_2 + " " + noun_4 + " " + doublenumber_1 + " " + noun_5 + " " +  "with the letter" + chararacter

	}
}
