class PezDispenser{
    public static final int MAX_PEZ = 12;
    final private String characterName;

    public PezDispenser(String characterName){
        this.characterName = characterName;
    }

    public String getCharacterName(){
        return characterName;
    }

    // This doesn't work with the FINAL keywork on line 2
    // public String swapHead(String characterName){
    //     String originalCharacterName = this.characterName;
    //     this.characterName = characterName;
    //     return originalCharacterName;
    // }
}