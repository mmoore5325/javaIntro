public class NewClass {
    public static void main(String[] args){
        System.out.println("We are making a new PEZ Dispenser");
        System.out.printf("FUN FACT: There are %d pez allowed in every dispenser.%n", 
                          PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Yoda");
        // dispenser.characterName = "Darth Vader";
        System.out.printf("The dispenser is %s %n",
                        dispenser.getCharacterName());
    //   BELOW DOESNT WORK WITH FINAL KEYWORD ON LINE 2 IN PEZDISPENSER
    //     String before = dispenser.swapHead("Darth Vader");
    //     System.out.printf("It was %s but Chris switched it to %s %n", 
    //                     before, 
    //                     dispenser.getCharacterName());
    }
}