import java.io.Console;

public class NewClass {
    public static void main(String[] args){
        System.out.println("We are making a new PEZ Dispenser");
        System.out.printf("FUN FACT: There are %d pez allowed in every dispenser.%n", 
                          PezDispenser.MAX_PEZ);

        Console console = System.console();
        String myName = console.readLine("Give me a name: ");

        PezDispenser dispenser = new PezDispenser(myName);
        // dispenser.characterName = "Darth Vader";

        System.out.printf("The dispenser is %s %n",
                        dispenser.getCharacterName());

        if(dispenser.isEmpty()){
            System.out.println("Dispenser is empty");
        }
        
        System.out.println("Filling dispenser with the drug known as Pez...");
        dispenser.fill();

        if(!dispenser.isEmpty()){
            System.out.println("You have pez, enjoy.");
        }

        while(dispenser.dispense()){
            System.out.println("Chomp!");
        }
        
        if(dispenser.isEmpty()){
            System.out.println("Lay off the Pez bro.");
        }

        dispenser.fill(4);
        dispenser.fill(2);
        while(dispenser.dispense()){
            System.out.println("Chomp!!!");
        }
        try{
            dispenser.fill(42);
            System.out.println("You will never see this printed.");
        } catch(IllegalArgumentException iae) {
            System.out.println("Whoa there! Trying to break the dispenser.");
            System.out.printf("The error was %s",
                                iae.getMessage());
        }
        

    //   BELOW DOESNT WORK WITH FINAL KEYWORD ON LINE 2 IN PEZDISPENSER
    //     String before = dispenser.swapHead("Darth Vader");
    //     System.out.printf("It was %s but Chris switched it to %s %n", 
    //                     before, 
    //                     dispenser.getCharacterName());
    }
}