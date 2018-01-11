class PezDispenser{
    public static final int MAX_PEZ = 12;
    final private String characterName;
    private int pezCount;

    public PezDispenser(String characterName){
        this.characterName = characterName;
        pezCount = 0;
    }

    public void fill(){
        // pezCount = MAX_PEZ;
        // As above so below
        fill(MAX_PEZ);
    }

    public void fill(int pezAmount){
        int newAmount = pezCount += pezAmount;
        if(newAmount > MAX_PEZ){
            throw new IllegalArgumentException("you being greedy with the pez.\n");
        }
        pezCount = newAmount;
    }

    public boolean dispense(){
        boolean wasDispensed = false;
        if(!isEmpty()){
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }
    public boolean isEmpty(){
        return pezCount == 0;
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