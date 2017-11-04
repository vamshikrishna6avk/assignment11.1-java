/*here we are showing how an Exception occurs at run time in arrays 
 * if we given the size of the index of an element is out of the array size then it shows an exception
 * as array index out of bound .
 * this exception are known as unchecked exceptions 
*/
package element; //i have created a package as example

public class ArrayException {          //i have taken the class name as ArrayException as we are trying to show
	                                  //classes are the basics of oops(object oriented programming)
	public static void main (String[]args){  
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//String[]args means arguments will be passed into main method and says that main() as a parameter

		
	
		int a[] = new int [5];           //here I'm creating an array  size of index  five 

		a[0] =15;            //here I am initializing and declaring the  5 elements of array  
		a[1] =27; //taking a[1]equal to 27
		a[2] =39;//taking a[2]equal to 39
		a[3] =42;//taking a[3]equal to 42
		a[4] =57;//taking a[4]equal to  57
		System.out.println( a[5]=90);//here i am trying to print the size of the 6th element which i have not declared
	}        
}//so it shows an exception here where array index out of bonding
 //an error occurs and we wont get output