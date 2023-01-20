import java.util.Scanner;


class input {
    public static void main(String[] args)  {
        
     

        // time for user input 
        // setting up scanner with system.in

        Scanner input = new Scanner(System.in);

        System.out.println("hey, give me a response. Tell me your fav food");

        // declaring a variable named 'response' and assigning it a value of a user input 
        // through the nextLine() function(or method I think)
        String response = input.nextLine();

        // assigning a variable named 'finalthoughts' to a string that ends the program with a nice message + the response the user gave 
        String finalThoughts = "well, this is the final part of the program. Your favorite food is " + response;

        System.out.println(finalThoughts);


   





    }
}