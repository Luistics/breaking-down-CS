int x = 0; y = 0;

for(int i = 0; i < 10; i++){

	x++;
	if(y == 3)
		break;

	for(int j = 0; j < 3; j++){
		y++;
	}

}

System.out.println(x + " " + y);


/*

set x = 0, y = 0;
Enter the i loop: i = 0
				is 0 < 10? yes, enter loop body:

					x++ -> x = 1;
					if(y == 3) -> false -> so we continue

					enter the j loop now
					j = 0
					is 0 < 3? yes, enter loop body:
						y++ -> y = 1;
						there is no more code left in this loop, we continue
					j = 1
					is 1 < 3? yes, enter loop body:
						y++ -> y = 2;
						there is no more code left in this loop, we continue
					j = 2
					is 2 < 3? yes, enter loop body:
						y++ -> y = 3;
						there is no more code left in this loop, we continue
					j = 3
					is 3 < 3? no, namely 3 = 3, so we exit

					there is no more code left in the i loop, we continue

				i = 1
				is 1 < 10? yes, enter loop body:

					x++ -> x = 2;
					if(y == 3) -> this is true now! -> so we break

				print out x (2) + " " + y (3)
				end;

*/
