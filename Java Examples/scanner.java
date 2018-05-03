
String line;
int count = 0;
Scanner sc5 = new Scanner(new File("data5.txt");
while(sc5.hasNextLine()){

	line = sc5.nextLine();
	for(int j = 0; j < line.length(); j++){
		if(Character.isLetter(line.charAt(j))){
			System.out.print(Character.toUpperCase(line.charAt(j)));
			count++;
		}
		else if(line.charAt(j) == ' '){
			System.out.println();
		}
		else{
			System.out.print(line.charAt(j));
		}
	}
}

System.out.println("\n Count = " + count);

/*
	Input Data: Hello There
				GOOD BYE
	
start -> set sc5, set count = 0, declare line

	while(sc5.hasNextLine()) -> this is true -> enter while loop

		line = sc5.nextLine() -> line = Hello There

		enter the for loop. line.length = length of "Hello There"

			if(the current character is a letter)
				print that character in all caps on the current line
				increment counter
			else if(the current character is a blank)
				print a new line
			else
				print the current character

			the above are the conditions we are following for the entirety
			of the input data

			so lets start with H
			H is a letter, so we print it in all caps on the current line
			and increment the counter
			counter = 1 now, and output is H

			e is next
			e is a letter, so we print it in all caps on the current line
			and increment the counter
			counter = 2 now, and output is e

			follow that same logic until we get to the empty space 
			empty space is not a letter, so we fail the first conditional
			empty space is empty space! so we pass the second conditional
			this means we print a new line

			now our output looks like this:

			counter = 5, output is HELLO\n (where \n is the new line)

			we continue since j is still less than "Hello There"

			following the above logic, we get

			counter = 10, output is HELLO
									THERE

			now, the for loop condition is met, and we check our while condition

Todo
			


*/
