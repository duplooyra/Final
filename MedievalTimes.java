import java.util.Scanner;
import java.io.*;
public class MedievalTimes{
    static void startMenu(){
        System.out.println("1.) Create a new game");
        System.out.println("2.) Validate a save file");
        System.out.println("3.) Randomize an existing character");
        System.out.println("4.) Quit");
        System.out.println("Select an option 1-4: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        startMenu();
        int choice = sc.nextInt();
        if (choice == 1){
            int knights = 0;
            int peasants = 0;
            int clerics = 0;
            int mages = 0;
            int courtiers = 0;
            int x = 1;
            System.out.print("Name of Game: ");
            String gameName = sc.next();
            gameName += sc.nextLine();


            // Character 1 ////////////////////////
            System.out.print("Character 1 Name: ");
            String name = sc.next();

            System.out.print("Character Type: ");
            String type = sc.next();
            if (type.equals("Knight")){
                knights += 1;
            }
            else if (type.equals("Peasant")){
                peasants += 1;
            }
            else if (type.equals("Cleric")){
                clerics += 1;
            }
            else if (type.equals("Mage")){
                mages += 1;
            }
            else if (type.equals("Courtier")){
                courtiers += 1;
            }
            
            Character char1 = new Character();
            char1.generateCharacter(name, type);
            System.out.println("\n \n \n");
            char1.showCharacter();
            while (x == 1){
                System.out.println("Would you like to reroll your character y/n? ");
                String yn = sc.next();
                if (yn.equals("n")){
                    x = 0;
                }
                else if (yn.equals("y")){
                    char1.reroll();
                    char1.showCharacter();
                }
            }
            x = 1;
            // End of Character 1 ////////////////
            // Character 2 ////////////////////////
            System.out.print("Character 2 Name: ");
            name = sc.next();

            System.out.print("Character Type: ");
            type = sc.next();
            if (type.equals("Knight")){
                knights += 1;
            }
            else if (type.equals("Peasant")){
                peasants += 1;
            }
            else if (type.equals("Cleric")){
                clerics += 1;
            }
            else if (type.equals("Mage")){
                mages += 1;
            }
            else if (type.equals("Courtier")){
                courtiers += 1;
            }
            
            Character char2 = new Character();
            char2.generateCharacter(name, type);
            System.out.println("\n \n \n");
            char2.showCharacter();
            while (x == 1){
                System.out.println("Would you like to reroll your character y/n? ");
                String yn = sc.next();
                if (yn.equals("n")){
                    x = 0;
                }
                else if (yn.equals("y")){
                    char2.reroll();
                    char2.showCharacter();
                }
            }
            x = 1;
            // End of Character 2 ////////////////
            // Character 3 ////////////////////////
            System.out.print("Character 3 Name: ");
            name = sc.next();

            System.out.print("Character Type: ");
            type = sc.next();
            if (type.equals("Knight") && knights == 2){
                System.out.println("Please pick a different type.");
                System.out.print("Character Type: ");
                type = sc.next();
            }
            else if (type.equals("Peasant") && peasants == 2){
                System.out.println("Please pick a different type.");
                System.out.print("Character Type: ");
                type = sc.next();
            }
            else if (type.equals("Cleric") && clerics == 2){
                System.out.println("Please pick a different type.");
                System.out.print("Character Type: ");
                type = sc.next();
            }
            else if (type.equals("Mage") && mages == 2){
                System.out.println("Please pick a different type.");
                System.out.print("Character Type: ");
                type = sc.next();
            }
            else if (type.equals("Courtier") && courtiers == 2){
                System.out.println("Please pick a different type.");
                System.out.print("Character Type: ");
                type = sc.next();
            }
            else {
                if (type.equals("Knight")){
                    knights += 1;
                }
                else if (type.equals("Peasant")){
                    peasants += 1;
                }
                else if (type.equals("Cleric")){
                    clerics += 1;
                }
                else if (type.equals("Mage")){
                    mages += 1;
                }
                else if (type.equals("Courtier")){
                    courtiers += 1;
                }
            }
            
            
            Character char3 = new Character();
            char3.generateCharacter(name, type);
            System.out.println("\n \n \n");
            char3.showCharacter();
            while (x == 1){
                System.out.println("Would you like to reroll your character y/n? ");
                String yn = sc.next();
                if (yn.equals("n")){
                    x = 0;
                }
                else if (yn.equals("y")){
                    char3.reroll();
                    char3.showCharacter();
                }
            }
            x = 1;
            // End of Character 3 ////////////////
            // Character 4 ////////////////////////
            System.out.print("Character 4 Name: ");
            name = sc.next();

            System.out.print("Character Type: ");
            type = sc.next();
            if (type.equals("Knight") && knights == 2){
                System.out.println("Please pick a different type.");
                System.out.print("Character Type: ");
                type = sc.next();
            }
            else if (type.equals("Peasant") && peasants == 2){
                System.out.println("Please pick a different type.");
                System.out.print("Character Type: ");
                type = sc.next();
            }
            else if (type.equals("Cleric") && clerics == 2){
                System.out.println("Please pick a different type.");
                System.out.print("Character Type: ");
                type = sc.next();
            }
            else if (type.equals("Mage") && mages == 2){
                System.out.println("Please pick a different type.");
                System.out.print("Character Type: ");
                type = sc.next();
            }
            else if (type.equals("Courtier") && courtiers == 2){
                System.out.println("Please pick a different type.");
                System.out.print("Character Type: ");
                type = sc.next();
            }
            else {
                if (type.equals("Knight")){
                    knights += 1;
                }
                else if (type.equals("Peasant")){
                    peasants += 1;
                }
                else if (type.equals("Cleric")){
                    clerics += 1;
                }
                else if (type.equals("Mage")){
                    mages += 1;
                }
                else if (type.equals("Courtier")){
                    courtiers += 1;
                }
            }
            
            Character char4 = new Character();
            char4.generateCharacter(name, type);
            System.out.println("\n \n \n");
            char4.showCharacter();
            while (x == 1){
                System.out.println("Would you like to reroll your character y/n? ");
                String yn = sc.next();
                if (yn.equals("n")){
                    x = 0;
                }
                else if (yn.equals("y")){
                    char4.reroll();
                    char4.showCharacter();
                }
            }
            x = 1;
            // End of Character 4 ////////////////
            // Save Game
            try {
                FileWriter myWriter = new FileWriter("save.txt");
                myWriter.write(gameName);
                myWriter.write("\n" + char1.getData());
                myWriter.write("\n" + char2.getData());
                myWriter.write("\n" + char3.getData());
                myWriter.write("\n" + char4.getData()); 
                myWriter.close();
            } catch (IOException e){    
                System.out.println("An error occured.");
                e.printStackTrace();
            }
            }
            else if (choice == 2){
                String fileName = sc.next();
                try{
                    File myObj = new File(fileName);
                    Scanner myReader = new Scanner(myObj);
                    while (myReader.hasNextLine()){
                        String data = myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException e){
                    System.out.println("An error occured.");
                    e.printStackTrace();
                }
            }
            else if (choice == 3){
                System.out.print("Filename: ");
                String fileName = sc.next();

                System.out.print("Character Name: ");
                String characterName = sc.next();

                int lines = 0;
                Character currentChar = new Character();
                try {

                    File saveFile = new File(fileName);
                    Scanner fileReader = new Scanner(saveFile);
                    
                    
                    while (fileReader.hasNextLine()){
                        String data = fileReader.nextLine();
                        String[] list = data.split("[,]");
                        if (lines == 0){
                            try{
                                FileWriter myWriter = new FileWriter(fileName);
                                myWriter.write(list[0]);
                                System.out.print(list[0]);
                                myWriter.close();
                            } catch (IOException e){
                                System.out.println("An error occured.");
                                e.printStackTrace();
                            }
                        }
                        else {
                            if (list[0].equals(characterName)){
                                currentChar.loadCharacter(list[0], list[1], Integer.parseInt(list[2]), Integer.parseInt(list[3]), Integer.parseInt(list[4]), Integer.parseInt(list[5]), Integer.parseInt(list[6]));
                                currentChar.randomize();
                                currentChar.showCharacter();
                                // try{
                                //     FileWriter myWriter = new FileWriter(fileName);
                                //     myWriter.write(currentChar.getData());
                                //     currentChar.showCharacter();
                                //     myWriter.close();
                                // } catch (IOException e){
                                //     System.out.println("An error occured.");
                                //     e.printStackTrace();
                                // }
                            }
                            else{
                                currentChar.loadCharacter(list[0], list[1], Integer.parseInt(list[2]), Integer.parseInt(list[3]), Integer.parseInt(list[4]), Integer.parseInt(list[5]), Integer.parseInt(list[6]));
                                try{
                                    FileWriter myWriter = new FileWriter(fileName);
                                    myWriter.write("\n" + currentChar.getData());
                                    myWriter.close();
                                } catch (IOException e){
                                    System.out.println("An error occured.");
                                    e.printStackTrace();
                                }
                            }
                        }
                        lines += 1;
                        
                    }
                } catch (FileNotFoundException e){
                    System.out.println("An error occured.");
                    e.printStackTrace();
                } 

                
            }

        
        
        sc.close();
    }
}