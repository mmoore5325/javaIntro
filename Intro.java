import java.io.Console;

public class Intro {

    public static void main(String[] args) {
        Console console = System.console();
        String firstName = "Michael";
        // Similar to JavaScript, this is how you make notes, '//'
        console.printf("Hello World, my name is %s\n", firstName);
        console.printf("Learning Java with the best name, %s\n", firstName);

        String yourName = console.readLine("What is your name?  ");
        console.printf("Hello %s\n", yourName);

        // BASIC CONDITIONAL STATEMENT
        // Basic if conditional Java

        String ageAsString = console.readLine("How old are you? ");
        int age = Integer.parseInt(ageAsString);

        if (age < 13){
            console.printf("You must be older than 13, sorry. Run the program again and lie next time.\n");
            System.exit(0);
        }else{
            console.printf("You are old enough.\n");
        }

        String name = console.readLine("Enter a name: ");
        String adjective = console.readLine("Enter an adjective: ");
        String noun;
        boolean isInvalidWord;
        do {
            noun = console.readLine("Enter a noun: ");
            isInvalidWord = (noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("jerk"));
            if (isInvalidWord){
                console.printf("That language is not permitted.  Try again. \n\n");
            }
        } while(noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("jerk"));
        String adverb = console.readLine("Enter an adjective: ");
        String verb = console.readLine("Enter a verb ending an -ing: ");
    }
}