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
                System.out.println("Would you like to reroll your character y/n? \n \n \n");
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
                System.out.println("Would you like to reroll your character y/n? \n \n \n");
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
                System.out.println("Would you like to reroll your character y/n? \n \n \n");
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
                System.out.println("Would you like to reroll your character y/n? \n \n \n");
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

            else if (choice == 2){ /////////////////////////////// VALIDATE SAVE FILE/////////////////////////////////
                System.out.print("Filename: ");
                String fileName = sc.next();

                int knights = 0;
                int peasants = 0;
                int clerics = 0;
                int mages = 0;
                int courtiers = 0;
                int checks = 0;

                try {

                    File saveFile = new File(fileName);
                    Scanner scanner1 = new Scanner(saveFile);
                    Scanner scanner2 = new Scanner(saveFile);
                    scanner1.nextLine();
                    Character currentChar = new Character();

                    for (int i = 0; i < 4; i++){

                        String data = scanner1.nextLine();
                        String[] list = data.split("[,]");
                        currentChar.loadCharacter(list[0], list[1], Integer.parseInt(list[2]), Integer.parseInt(list[3]), Integer.parseInt(list[4]), Integer.parseInt(list[5]), Integer.parseInt(list[6]));
                        if (currentChar.getType().equals("Knight")){
                            knights += 1;
                        }
                        else if (currentChar.getType().equals("Peasant")){
                            peasants += 1;
                        }
                        else if (currentChar.getType().equals("Cleric")){
                            clerics += 1;
                        }
                        else if (currentChar.getType().equals("Mage")){
                            mages += 1;
                        }
                        else if (currentChar.getType().equals("Courtier")){
                            courtiers += 1;
                        }
                        else{
                            System.out.println("ERROR FOUND - Invalid Character Type");
                        }

                        if (knights > 2 || peasants > 2 || clerics > 2 || mages > 2 || courtiers >2){
                            System.out.println("ERROR FOUND - Too many of the same character types");
                        } else{
                            checks += 1;
                        }

                        
                        
                    }
                    int lines = 0;
                    
                    for (int i = 0; i < 5; i++){
                        String data = scanner2.nextLine();
                        String[] list = data.split("[,]");
                        if (lines == 0){
                            if (list.length > 1 || list.length < 0){
                                System.out.println("ERROR FOUND - Title Array Error");
                            }
                            else{
                                checks += 1;
                            }
                            
                        }
                        else{
                            if (list.length > 7 || list.length < 0){
                                System.out.println("ERROR FOUND - Character Array Error");
                            }
                            else{
                                checks += 1;
                            }
                        }
                        lines += 1;
                        
                    }
                    if (checks == 5){
                        System.out.println("FILE SUCCESSFULLY VALIDATED");
                    }
                    scanner1.close();
                    scanner2.close();
                } 
                
                catch(FileNotFoundException e){
                    e.printStackTrace();
                }
            }

            else if (choice == 3){ ////////////////////////////// REROLL A CHARACTER//////////////////////////

                System.out.print("Filename: ");
                String fileName = sc.next();

                System.out.print("Character Name: ");
                String characterName = sc.next();

                int lines = 0;
                Character currentChar = new Character();

                int knights = 0;
                int peasants = 0;
                int clerics = 0;
                int mages = 0;
                int courtiers = 0;

                try {

                    File saveFile = new File(fileName);
                    Scanner typeReader = new Scanner(saveFile);
                    typeReader.nextLine();

                    for (int i = 0; i < 4; i++){

                        String data = typeReader.nextLine();
                        String[] list = data.split("[,]");
                        currentChar.loadCharacter(list[0], list[1], Integer.parseInt(list[2]), Integer.parseInt(list[3]), Integer.parseInt(list[4]), Integer.parseInt(list[5]), Integer.parseInt(list[6]));
                        if (currentChar.getType().equals("Knight")){
                            knights += 1;
                        }
                        else if (currentChar.getType().equals("Peasant")){
                            peasants += 1;
                        }
                        else if (currentChar.getType().equals("Cleric")){
                            clerics += 1;
                        }
                        else if (currentChar.getType().equals("Mage")){
                            mages += 1;
                        }
                        else if (currentChar.getType().equals("Courtier")){
                            courtiers += 1;
                        }
                        
                        
                    }
                    typeReader.close();

                } catch(FileNotFoundException e){
                    e.printStackTrace();
                }
                

                try {

                    File saveFile = new File(fileName);
                    Scanner fileReader = new Scanner(saveFile);
                    BufferedWriter bw = new BufferedWriter(new FileWriter(saveFile, true));
                    
                    for (int i = 0; i < 5; i++){
                        String data = fileReader.nextLine();
                        String[] list = data.split("[,]");

                        if (lines == 0){
                            try{
                                
                                bw.write(list[0]);
                                
                                
                            } catch (IOException e){
                                System.out.println("An error occured.");
                                e.printStackTrace();
                            }
                        }
                        
                        else {
                            if (list[0].equals(characterName)){
                                String exclude = "";
                                currentChar.loadCharacter(list[0], list[1], Integer.parseInt(list[2]), Integer.parseInt(list[3]), Integer.parseInt(list[4]), Integer.parseInt(list[5]), Integer.parseInt(list[6]));

                                if (currentChar.getType() == "Knight" || knights >= 2){
                                    exclude = "Knight";
                                }
                                else if (currentChar.getType() == "Peasant"  || peasants >= 2){
                                    exclude = "Peasant";
                                }
                                else if (currentChar.getType() == "Cleric"  || clerics >= 2){
                                    exclude = "Cleric";
                                }
                                else if (currentChar.getType() == "Mage"  || mages >= 2){
                                    exclude = "Mage";
                                }
                                else if (currentChar.getType() == "Courtier"  || courtiers >= 2){
                                    exclude = "Courtier";
                                }
                                currentChar.randomize(exclude);
                                //currentChar.showCharacter();
                                try{
                                    
                                    bw.write("\n" + currentChar.getData());
                                    
                                    
                                } catch (IOException e){
                                    System.out.println("An error occured.");
                                    e.printStackTrace();
                                }
                            }
                            else{
                                currentChar.loadCharacter(list[0], list[1], Integer.parseInt(list[2]), Integer.parseInt(list[3]), Integer.parseInt(list[4]), Integer.parseInt(list[5]), Integer.parseInt(list[6]));
                                try{
                                    
                                    bw.write("\n" + currentChar.getData());
                                    
                                } catch (IOException e){
                                    System.out.println("An error occured.");
                                    e.printStackTrace();
                                }
                            }
                        }
                        lines += 1;
                        
                    }
                    fileReader.close();
                    
                    FileWriter myWriter = new FileWriter(saveFile, false);
                    myWriter.close();
                    bw.close();
                } catch (FileNotFoundException e){
                    System.out.println("An error occured.");
                    e.printStackTrace();
                } catch (IOException e){
                    e.printStackTrace();
                }

                
            }
            else if (choice == 4){
                System.exit(0);
            }

            else{
                System.out.println("Please pick a valid choice");
            }

        
        
        sc.close();
    }
}