
// data.txt = 3 9 2 4 7 0 18 12

final int SIZE = 10;
int[] numbers = new int[SIZE];

Scanner sc = new Scanner(new File("data.txt"));

int i = 0;


/*	This loop continues until the scanner finds no next integer.
	Thus we continue until we reach 12, since that is the last integer the scanner
	will find.
*/ 
while(sc.hasNextInt()){

	//fill in numbers array
	numbers[i] = sc.nextInt();

	//print current integer
	System.out.print(numbers[i] + " ");
	i++;
}

//printed so far: 3 9 2 4 7 0 18 12

System.out.println();

//printed so far: 3 9 2 4 7 0 18 12
				 //new line//
i = 0;

//do while loops always execute first, then check the condition.
//at this point, numbers[i] contains 3 9 2 4 7 0 18 12 0 0
//because arrays in Java are initialized to 0 unless otherwise specified. 

do{
	System.out.print(numbers[i] + " ");
	i++;
} while(numbers[i] != 0);


System.out.println();

/*
	at this point we have printed:
	3 9 2 4 7 0 18 12
	//new line//
	3 9 2 4 7
	//new line//

	and recall numbers contains: 3 9 2 4 7 0 18 12 0 0
*/

for(int j = 5; j < SIZE; j++){

	//if numbers[j] is even
	if(numbers[j] % 2 == 0){
		//then add 2 to that 
		numbers[j] = numbers[j] + 2;
	}
}

/*
	For the above function, starting at index 5, we see that 
	numbers[5] == 0
	0 % 2 = 0 -> numbers[5] -> 0 + 2 = 2
	numbers[6] == 18
	18 % 2 = 0 -> numbers[6] -> 18 + 2 = 20
	numbers[7] == 12
	12 % 2 = 0 -> numbers[7] -> 12 + 2 = 14
	numbers[8] == 0
	0 % 2 = 0 -> numbers[8] -> 0 + 2 = 2
	numbers[9] == 0
	0 % 2 = 0 -> numbers[5] -> 0 + 2 = 2
	
	now 10 is not less than SIZE (10), so the loop is done.
*/

for (int j = SIZE - 1; j >= 0; j--){
	System.out.print(numbers[j] + " ");
}

/*
	at this point, numbers contains: 3 9 2 4 7 2 20 14 2 2
	and all the loop above is doing, is starting from numbers[SIZE - 1] (that is, numbers[9])
	print out the contents until we reach numbers[0]
	A reverse printer!

	We print:
	2 2 14 20 2 7 4 2 9 3

	And our total final answer is:
	3 9 2 4 7 0 18 12
	//new line//
	3 9 2 4 7
	//new line//
	2 2 14 20 2 7 4 2 9 3

*/


