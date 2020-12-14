import java.util.Random;
public class Character{
    private String character;
    private String type;
    private int strength;
    private int toughness;
    private int intelligence;
    private int magic;
    private int influence;
    private int total;
    Random randomGenerator = new Random();

    public void generateCharacter(String name, String type){
        this.character = name;
        this.type = type;
        if (type.equals("Knight")){
            this.strength = randomGenerator.nextInt(10 - 7 + 1) + 7;
            this.toughness = randomGenerator.nextInt(7);
            this.intelligence = randomGenerator.nextInt(7);
            this.magic = randomGenerator.nextInt(7);
            this.influence = randomGenerator.nextInt(7);
            int total = this.strength + this.toughness + this.intelligence + this.magic + this.influence;
            while (total > 28 || total < 8){
                this.toughness = randomGenerator.nextInt(7);
                this.intelligence = randomGenerator.nextInt(7);
                this.magic = randomGenerator.nextInt(7);
                this.influence = randomGenerator.nextInt(7);
            }
            this.total = total;
        }
        else if (type.equals("Peasant")){
            this.toughness = randomGenerator.nextInt(10 - 7 + 1) + 7;
            this.strength = randomGenerator.nextInt(7);
            this.intelligence = randomGenerator.nextInt(7);
            this.magic = randomGenerator.nextInt(7);
            this.influence = randomGenerator.nextInt(7);
            int total = this.strength + this.toughness + this.intelligence + this.magic + this.influence;
            while (total > 28 || total < 8){
                this.toughness = randomGenerator.nextInt(7);
                this.intelligence = randomGenerator.nextInt(7);
                this.magic = randomGenerator.nextInt(7);
                this.influence = randomGenerator.nextInt(7);
            }
            this.total = total;
        }
        else if (type.equals("Cleric")){
            this.intelligence = randomGenerator.nextInt(10 - 7 + 1) + 7;
            this.toughness = randomGenerator.nextInt(7);
            this.strength = randomGenerator.nextInt(7);
            this.magic = randomGenerator.nextInt(7);
            this.influence = randomGenerator.nextInt(7);
            int total = this.strength + this.toughness + this.intelligence + this.magic + this.influence;
            while (total > 28 || total < 8){
                this.toughness = randomGenerator.nextInt(7);
                this.intelligence = randomGenerator.nextInt(7);
                this.magic = randomGenerator.nextInt(7);
                this.influence = randomGenerator.nextInt(7);
            }
            this.total = total;
        }
        else if (type.equals("Mage")){
            this.magic = randomGenerator.nextInt(10 - 7 + 1) + 7;
            this.toughness = randomGenerator.nextInt(7);
            this.intelligence = randomGenerator.nextInt(7);
            this.strength = randomGenerator.nextInt(7);
            this.influence = randomGenerator.nextInt(7);
            int total = this.strength + this.toughness + this.intelligence + this.magic + this.influence;
            while (total > 28 || total < 8){
                this.toughness = randomGenerator.nextInt(7);
                this.intelligence = randomGenerator.nextInt(7);
                this.magic = randomGenerator.nextInt(7);
                this.influence = randomGenerator.nextInt(7);
            }
            this.total = total;
        }
        else if (type.equals("Courtier")){
            this.influence = randomGenerator.nextInt(10 - 7 + 1) + 7;
            this.toughness = randomGenerator.nextInt(7);
            this.intelligence = randomGenerator.nextInt(7);
            this.magic = randomGenerator.nextInt(7);
            this.strength = randomGenerator.nextInt(7);
            int total = this.strength + this.toughness + this.intelligence + this.magic + this.influence;
            while (total > 28 || total < 8){
                this.toughness = randomGenerator.nextInt(7);
                this.intelligence = randomGenerator.nextInt(7);
                this.magic = randomGenerator.nextInt(7);
                this.influence = randomGenerator.nextInt(7);
            }
            this.total = total;
        }
    }

    public void reroll(){
        generateCharacter(character, type);
    }

    public void showCharacter(){
        System.out.println("Name: " + character);
        System.out.println("Type: " + type);
        System.out.println("Strength: " + strength);
        System.out.println("Toughness: " + toughness);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Magic: " + magic);
        System.out.println("Influence: " + influence);
        System.out.println("Total: " + total);
    }

    public void randomize(){
        String newType;
        int randomType = randomGenerator.nextInt(5);
        if (randomType == 0){
            newType = "Knight";
            generateCharacter(character, newType);
        }
        else if (randomType == 1){
            newType = "Peasant";
            generateCharacter(character, newType);
        }
        else if (randomType == 2){
            newType = "Cleric";
            generateCharacter(character, newType);
        }
        else if (randomType == 3){
            newType = "Mage";
            generateCharacter(character, newType);
        }
        else if (randomType == 4){
            newType = "Courtier";
            generateCharacter(character, newType);
        }
    }

    public String getData(){
        String strength = Integer.toString(this.strength);
        String toughness = Integer.toString(this.toughness);
        String intelligence = Integer.toString(this.intelligence);
        String magic = Integer.toString(this.magic);
        String influence = Integer.toString(this.influence);
        String data = character + "," + type + "," + strength + "," + toughness + "," + intelligence + "," + magic + "," + influence;
        return data;
    }

    public void loadCharacter(String name, String type, int strength, int toughness, int intelligence, int magic, int influence){
        this.character = name;
        this.type = type;
        this.strength = strength;
        this.toughness = toughness;
        this.intelligence = intelligence;
        this.magic = magic;
        this.influence = influence;
    }
    
}