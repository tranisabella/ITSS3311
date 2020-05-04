// Sample Run:
//Enter 5 elements for list1
//1
//2
//3
//4
//5
//Enter 5 elements for list2
//1
//2
//3
//4
//5
//Two lists are strictly identical

// establish input device
import java.util.Scanner;
public class StrictlyIdentical {
	
public static void main(String[] args) {
	// create scanner
	Scanner input = new Scanner(System.in);
	
	// List1 Array User Input
	System.out.println("Enter 5 elements for list1");
	int [] list1 = new int[5];
	for (int i = 0; i < 5; i++) {
	// for loop to restrict size to 5 elements	
		list1[i] = input.nextInt();
	}	
	
	// List2 Array User Input
	System.out.println("Enter 5 elements for list2");
	int [] list2 = new int[5];
	for (int i = 0; i < 5; i++) {
	// for loop to restrict size to 5 elements	
		list2[i] = input.nextInt();	
	}
	
	// close the scanner to get rid of the warning
	input.close();
	  
     // declare if list1 and list2 are identical
	 if (equals(list1, list2)) {
         System.out.println("Two lists are strictly identical");
     } else {
         System.out.println("Two lists are not strictly identical");
     }
}
//boolean method to check if they are identical
public static boolean equals(int[] list1, int[] list2) {

    if (list1.length != list2.length) return false;


    for (int i = 0; i < list1.length; i++) {
        if (list1[i] != list2[i]) return false;
    }

    return true;
}
}