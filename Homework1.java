
//The name for the class here, Homework1, should be the name of the class file
//you create to hold the code below.
public class Homework1 {

	public static void main(String[] args) {
		
		/*
		 There are three employees in a company that are listed below in variables. Each employee has
		 a name, id, status if they employed or not and the amount owed to them by the company.
		 
		 Each of these employees needs to get paid by the company. The facts of the problem are stated below
		 
		 Fact 1: If an employee is not employed, they do not get paid. If they are employed, they get paid.
		 
		 Fact 2: If an employee Id is matched with the wrong Name, nobody gets paid since there must have been
		         a major error in the system. So, if Jennifer is about to get paid, but her ID is Steve's, the program
		         will output that an error occurred and not print out any more information.
		 
		 Fact 3: If an employee is to get paid, you take the amount owed too them and remove the tax rate from their
		         wages. The variable taxRate below represents the companies tax rate and is a percentage. 0.15 = 15%.
		         So, you remove 15% of the employees owed amount and pay the employee whatever remains. The calculation
		         needed is as follows. 
		                                 amountTakenOut = taxRate * amountOwed;
		                                 amountEarned = amountOwed - amountTakenOut;
		         The first line calculates how much is taken out by taxes. The second line removes that amount from what
		         the company owes the employee. So, the result of the second line is how much the employee earned in total.
		         
		         
		 Fact 4: For an employee to get paid, all they need is their information output to the command line with
		         the System.out.println(); command. All information must be present though so you must specify
		         who got paid, how much, their ID and how much was taken out of their pay check by taxes. The tax information
		         and the company name can be added as well, but that's your call. You can be serious or wacky about how you
		         print this out so surprise me.
		         
		 Fact 5: All employees want to get paid, so your program should output each employee, one after the other.
		         By the end of your program, you should have output three employees in whichever order you want.
		         
		 Fact 6: Since Meridian is a competitive company, whoever gets the highest pay after taxes, is declared the
		         best employee. Your program should print who the winner is at the end. Whoever made the least, should
		         be declared the worst employee and should also be printed at the end. 
		 
		 
		 Details: You will need to write three big blocks of code. One for each employee. Whenever you need to output
		          information, you can either store it in variables and print it later, or print without right then and there.
		          There are two print commands available to you.
		          
		                           System.out.println();
		                           System.out.print();
		                           
		          The first one above, System.out.println();, prints whatever string you send it on a line, and then moves
		          onto the next line. The second command System.out.print(); just prints whatever string you give it and doesn't
		          move to the next line. These are all of the printing commands you will need.
		         
		         Examples of printing: There are many types of ways to print text in java, but I'm only going to show you a few for now.
		         
		         ------------------->    System.out.println("This is an example string");     //Prints the string given to command line
		         
		         ------------------->    System.out.println("This is" + " " + "an example string");  //Prints all of the strings together
		         
		         ------------------->    String exampleText = "This is an ";
		         ------------------->    System.out.println(exampleText + "example string");  //Prints the variable and then the string after it
		         
		         ------------------->    System.out.println(4500);  //Prints the number as a string to command line
		         
		         ------------------->    System.out.println("This is a number: " + 4500);  //Prints "This is a number: 4500" to command line
		         
		         As you can see above, you can print anything you want from Strings and numbers in either variable or raw form, so be creative.
		         Format the output however you want, but make sure it is all there.
		         
		         
		  Tips: Start with only one employee at a time. Work through each step of the problem for just them. If you have them working, then you
		        have pretty much solved the entire problem and just have to do some careful copy/pasting to do the others. Once they are all printed,
		        do the final step and print the best and worst employee.
		        
		        If you have any questions, message me or your other classmates at will. There is a lot of information listed above, so take your time
		        go slow. This homework is an exercise in syntax and what I have taught so far. This is a huge leap from anything we have done so far,
		        but you have all of the information you need to do it.
		        
		        To make it easier, here is the link to each of my lectures so far
				Lesson 1:
				https://drive.google.com/open?id=1ZTF28LV_Do0IK7d-iYm6sO7FJP0scY31QVq9MRAT8n4&authuser=0
				Lesson 2:
				https://drive.google.com/open?id=1DuTqyQ8pTmVHWuk-TM-HztC-1D0UxzSf70JxPrmXKA4&authuser=0 
		 */
		
		
		//Company information
		//All of these variables, except taxRate, are optional and can be used at will
		//I would also suggest making more variables to describe this so called company.
		//They can be anything you want and you can output them however you want.
		//An example would be the company description which could explain how they grow baby goats
		//to launch off of buildings with catapults. Who knows, but I'm sure you can come up with 
		//something interesting. As always, surprise me (This is optional, but fun)
		String companyName = "Meridian";
		String established = "Way too long ago";
		float taxRate = 0.15f;
		int numberOfEmployees = 37;
		
		
		//You are given three employees info listed below as input. Any of the values can be changed
		//for you to test with so once you get a solution that works, change them and see if your code
		//still works. 
		//(HINT: smaller numbers may be easier to work with, but it's up to you if you want to do that)
		
		//Employee ONE
		String name1 = "Jennifer";
		int id1 = 2342232;
		boolean employed1 = true;
		float owed1 = 897.45f;
		
		//Employee TWO
		String name2 = "Steve";
		int id2 = 4452349;
		boolean employed2 = true;
		float owed2 = 450.68f;
		
		//Employee THREE
		String name3 = "George";
		int id3 = 9989375;
		boolean employed3 = true;
		float owed3 = 768.22f;
		
		
		//YOUR CODE GOES HERE!!!!

	}

}
