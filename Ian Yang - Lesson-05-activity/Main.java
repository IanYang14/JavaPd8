class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
   int a = 31;
   int b = 32;
   int sum = a+b;
System.out.println(sum);


/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/
double x = 92;
double y= 83;
double z = 100;
double total = x+y+z;
System.out.println(total);
/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/
double avg=total/3;
System.out.println(avg);


/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/
    double A = 5;
    double X=10;
    double Y=A/(X+1);
  System.out.println(Y);

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
 double Y2=(2*X*(X+1)*(-X/2))/A;
System.out.println(Y2);




/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
 double B = 3;
 double h = 4;
 double area=(B*h)/2;
System.out.println(area);




/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/

int egg = 100;
int basket = 12;
int amount = egg/basket;
int leftover = egg%basket;
System.out.println(amount);
System.out.println(leftover);



    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}