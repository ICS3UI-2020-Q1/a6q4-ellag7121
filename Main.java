import java.util.Scanner;
/**
 * asks the user for 2 vectors, tells them the dot value of both vectors
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create Scanner for user input
    Scanner input = new Scanner(System.in);

    //initialize the variables
    int dotProduct; //the variable to hold the dot product

    //create the arrays to hold the dot values
    int[] vectors1 = new int[3];
    int[] vectors2 = new int[3];

    //ask the user for the first coordinates
    System.out.println("Please enter the 3 values for the first vector");
    for(int i = 0; i < vectors1.length; i++){
      //store the user input in the arrays
      vectors1[i] = input.nextInt();
    }
    //ask the user for the second coordinates
    System.out.println("Please enter the 3 values for the second vector");
    for(int i = 0; i < vectors2.length; i++){
      //store the user input in the arrays
      vectors2[i] = input.nextInt();
    }

    //get the dot product
    dotProduct = (vectors1[0] * vectors2[0]) + (vectors1[1] * vectors2[1]) + (vectors1[2] * vectors2[2]);

    //tell the user the dot product
    System.out.println("The dot product is " + dotProduct);

    
    
  }
}
