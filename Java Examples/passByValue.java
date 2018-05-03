package question7;

public class Question7{

	public static void main(String[] args){

		int a, b, c;
		a = 5;
		b = 10;
		c = method(a, b);

		//At this point, c = 19, a = 5, b = 10

		System.out.println(a + " " + b + " " + c);
		//prints 5 10 19


		/*
			this is where things get funky... 
			The parameters passed in to method here are b = 10, and c = 19.
			So jump to the comments in method to see what happens...
		*/
		a = method(b, c);

		//as you saw, a is now equal to 29

		System.out.println(a + " " + b + " " + c);
		//prints 29 10 19
	}


	public static int method(int x, int y){

		/*
			Let our parameters be given from the call on line 23 
			That is, method(10, 19)

			So x = 10, and y = 19

			Lets see what happens:
		*/

		x = x + 2;
		//at this point, x is now equal to 12. (x = 10 + 2)

		y = x + 5;
		/*
			at this point, y is now equal to 17 (y = 12 + 5)
			remember, we just set x to 12 in the line before.
		*/

		//return 12 + 17
		return x + y;
		//return 29
	}
}
