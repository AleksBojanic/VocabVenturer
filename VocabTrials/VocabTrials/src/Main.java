import java.util.Scanner;

public class Main {
    static String[] jungleAnswers = {"A", "C", "A", "B", "C", "B", "C"};
    static String[] jungleAnswersFR = {"French", "The Jungle - La Jungle - French", "Le Singe", "La Banane", "La Panthère", "La Falaise", "Les Sables Mouvant"};
    static String[] jungleAnswersESP = {"Spanish", "The Jungle - La Selva - Spanish", "El Mono", "El Plátano", "La Pantera", "El Acantilado", "Las Arenas Movedizas"};
    static String[] jungleAnswersDEU = {"German", "The Jungle - Der Dschungel - German", "Der Affe", "Die Banane", "Der Panther", "Die Klippe", "Der Triebsand"};
    static String[] dungeonAnswers = {"C", "B", "C", "B", "A", "C", "C"};
    static String[] dungeonAnswersFR = {"French", "The Dungeon - Le Donjon - French", "Le Chauve Souris", "Le Crane", "L'Araignee", "La Bombe", "Le Chaton", "Le Loup", };
    static String[] dungeonAnswersESP = {"Spanish", "The Dungeon - La Mazmorra - Spanish", "El Murciélago", "El Craneo", "La Arana", "La Bomba", "El Gato", "El Lobo"   };
    static String[] dungeonAnswersDEU = {"German", "The Dungeon - Das Verlies - German", "Die Fledermaus", "Der Schädel", "Die Spinne","Die Bombe", "Die Katze", "Der Wolf"};

    public static void main(String args[]) {
        int select = selectStory();
        String[] lang = selectLanguage(select);
        if (select == 1) {
            jungleStory(lang);     
        }
        if (select == 2) {
            dungeonStory(lang);
        }
    }

    private static String[] selectLanguage(int story) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Good Choice! Please select which language you would like to learn:");
        System.out.println("F: Francais\n");
        System.out.println("E: Espanol\n");
        System.out.println("D: Deutsch\n");
        String guess = scanner.nextLine();
        while(true) {
            if(guess.equalsIgnoreCase("f")) {
                if(story == 1) {
                    return jungleAnswersFR;
                } else {
                    return dungeonAnswersFR;
                }
            } else if (guess.equalsIgnoreCase("e")) {
               if(story == 1) {
                   return jungleAnswersESP;
               } else {
                   return dungeonAnswersESP;
               }
            } else if (guess.equalsIgnoreCase("d")) {
                if(story == 1) {
                    return jungleAnswersDEU;
                } else {
                    return dungeonAnswersDEU;
                }
            } else {
                System.out.println("Invalid language. Try again!");
                guess = scanner.nextLine();
            }
        }
    
    }

    private static int selectStory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to The Vocab Trials! Select which story you would like to play by typing 1 or 21" +
                ", if you dare...");
        System.out.println("1: Jungle Jeopardy ");
        System.out.println("2: Dungeon Danger");
        int select = scanner.nextInt();
        while(true) {
            if(select == 1) {
                return 1;
            }
            if(select == 2) {
                return 2;
            }
            select = scanner.nextInt();
        }
    }

    private static void jungleStory(String[] lang) {
        int temp = 0;
        Scanner userGuess = new Scanner(System.in);
        System.out.println(lang[1]);
        System.out.println("----------------");
        System.out.println("You wake up in an unfamilliar place. You take a look around and see big lush trees and hear the chirping of tropical birds.\n");
        System.out.println("A jungle! You jolt up and begin to search around, trying to find out how you ended up here.\n");
        System.out.println("Ahead, you see a small animal sitting relaxed under a tree.\n");
        System.out.println("---------------------------------------------------");
        System.out.println("       .--.  .-'''-.  .--.");
        System.out.println("      /.\"\".v'.-. .-.`v.\"\"\\");
        System.out.println("     ||  / / O| | O\\ \\  ||");
        System.out.println("      \\_/| \\__| |__/  \\_//");
        System.out.println("       `-'\\  .-n-n-.  /`-'");
        System.out.println("        _.-\\/       \\/-._");
        System.out.println("      .'   (\\`.___.'/)   `.");
        System.out.println("     /      \\`.___.'/      `.");
        System.out.println("    /        `.___.'        \\");
        System.out.println("    |     |             \\    \\");
        System.out.println("    |     |   .      .  |\\    \\");
        System.out.println("    |     |             | \\    \\");
        System.out.println("     \\     \\            |  \\    \\");
        System.out.println("      \\     \\           |.' `.   \\");
        System.out.println("       \\         .'     `.  \\");
        System.out.println("  _.._   `.   `-. ___ /        /`.  `.");
        System.out.println(".'    `-._ `.    `.__)       .'  /    `.");
        System.out.println("|         `-.\\     \\/      .'   / /\\  )|\\.");
        System.out.println(" \\          _/ / /|/     .'    (_/ / / | \\)");
        System.out.println("   `._      (__/_/-/   ..'         (_/| |\\_)");
        System.out.println("       ``--._____.-(     `.            `-'");
        System.out.println("                           `--.   `.");
        System.out.println("                            (_/\\ \\\\");
        System.out.println("                               /_//");
        System.out.println("---------------------------------------------------\n");
        System.out.println("What is this animal?\n");
        System.out.println("************");
        System.out.println("A - Monkey");
        System.out.println("B - Cougar");
        System.out.println("C - Elephant");
        System.out.println("************");
        
        while(temp == 0) {
            System.out.println("?: ");
            String guess = userGuess.nextLine();
            if(guess.equalsIgnoreCase(jungleAnswers[0])) {
                temp = 1;
            } else {
                System.out.println("Oops! Not quite. Try again!");
            }
        }
        temp = 0;

        System.out.println("\nCorrect! A monkey! The " + lang[0] + " word for monkey is - " + lang[2] +  ".\n");
        System.out.println(lang[2] + " begins to eat a long yellow fruit.");
        System.out.println("-------------------------------------------------");
        System.out.println("//\\");
        System.out.println("V  \\");
        System.out.println(" \\  \\_");
        System.out.println("  \\,'.`-.");
        System.out.println("   |\\ `. `. ");      
        System.out.println("   ( \\  `. `-.                        _,.-:\\");
        System.out.println("    \\ \\   `.  `-._             __..--' ,-';/");
        System.out.println("     \\ `.   `-.   `-..___..---'   _.--' ,'/");
        System.out.println("      `. `.    `-._        __..--'    ,' /");
        System.out.println("        `. `-_     ``--..''       _.-' ,'");
        System.out.println("          `-_ `-.___        __,--'   ,'");
        System.out.println("             `-.__  `----\"\"\"    __.-'");
        System.out.println("                  `--..____..--'\n");
        System.out.println("-------------------------------------------------\n");
        System.out.println("What is " + lang[2] + " eating?\n");
        System.out.println("************");
        System.out.println("A - An Apple");
        System.out.println("B - A Grapefruit");
        System.out.println("C - A Banana");
        System.out.println("************");
        
        while(temp == 0) {
            System.out.println("?: ");
            String guess = userGuess.nextLine();
            if(guess.equalsIgnoreCase(jungleAnswers[1])) {
                temp = 1;
            } else {
                System.out.println("Oops! Not quite. Try again!");
            }
        }
        temp = 0;
        
        System.out.println("\nCorrect! A banana! The " + lang[0] + " word for banana is - " + lang[3] +  ".\n");
        System.out.println("The monkey suddenly jumps out from under the tree in a panic and begins sprinting away.\n");
        System.out.println("Confused, you spin your head around and witness a terrifying creature.\n");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                                                           _...---.._");
        System.out.println("                                                       _.'`       -_ ``.");
        System.out.println("                                                   .-'`                 `.");
        System.out.println("                                                .-`                     q ;");
        System.out.println("                                             _-`                       __  \\");
        System.out.println("                                         .-'`                  . ' .   \\ `;/");
        System.out.println("                                     _.-`                    /.      `._`/");
        System.out.println("                             _...--'`                        \\_`..._");
        System.out.println("                          .'`                         -         `'--:._");
        System.out.println("                       .-`                           \\                  `-.");
        System.out.println("                      .                `              `-..__.....----...., `.");
        System.out.println("                     '                 `  '''---..-''`'              : :  : :");
        System.out.println("                   .` -                '`.  `-.                       `'   `'");
        System.out.println("                .-` .` '             .`'.__ ;");
        System.out.println("            _.-` .-`   '            .");
        System.out.println("        _.-` _.-`    .' '         .`");
        System.out.println("(`''--'' _.-`      .'  '        .'");
        System.out.println(" `'----''        .'  .`       .`");
        System.out.println("               .'  .'     .-'`");
        System.out.println("             .'   :    .-`");
        System.out.println("             `. .`   ,`");
        System.out.println("              .'   .'");
        System.out.println("             '   .`");
        System.out.println("            '  .`");
        System.out.println("            `  '.");
        System.out.println("            `.___;");
        System.out.println("--------------------------------------------------------------------------------\n");
        System.out.println("Ahh! You want to run away but you don't know what it's name is, so you are frozen in place. What is the animal called?\n");
        System.out.println("************");
        System.out.println("A - A Panther");
        System.out.println("B - A Parrot");
        System.out.println("C - An Elephant");
        System.out.println("************");
        
        while(temp == 0) {
            System.out.println("?: ");
            String guess = userGuess.nextLine();
            if(guess.equalsIgnoreCase(jungleAnswers[2])) {
                temp = 1;
            } else {
                System.out.println("Oops! Not quite. Try again!");
            }
        }
        temp = 0;
        
        System.out.println("\nCorrect! A panther! The " + lang[0] + " word for panther is - " + lang[4] +  ".\n");
        System.out.println("You turn and run, but soon reach a steep drop off!");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                     /#\\");
        System.out.println("                    /###\\     /\\");
        System.out.println("                   /  ###\\   /##\\  /\\");
        System.out.println("                  /      #\\ /####\\/##\\");
        System.out.println("                 /  /      /   # /  ##\\             _       /\\");
        System.out.println("               // //  /\\  /    _/  /  #\\ _         /#\\    _/##\\    /\\");
        System.out.println("              // /   /  \\     /   /    #\\ \\      _/###\\_ /   ##\\__/ _\\");
        System.out.println("             /  \\   / .. \\   / /   _   { \\ \\   _/       / //    /    \\");
        System.out.println("     /\\     /    /\\  ...  \\_/   / / \\   } \\ | /  /\\  \\ /  _    /  /    \\ /\\");
        System.out.println("  _ /  \\  /// / .\\  ..%:.  /... /\\ . \\ {:  \\   /. \\     / \\  /   ___   /  \\");
        System.out.println(" /.\\ .\\.\\// \\/... \\.::::..... _/..\\ ..\\:|:. .  / .. \\  /.. \\    /...\\ /  \\ \\");
        System.out.println("/...\\.../..:.\\. ..:::::::..:..... . ...\\{:... / %... \\/..%. \\  /./:..\\__   \\");
        System.out.println(" .:..\\:..:::....:::;;;;;;::::::::.:::::.\\}.....::%.:. \\ .:::. \\/.%:::.:..\\");
        System.out.println("::::...:::;;:::::;;;;;;;;;;;;;;:::::;;::{:::::::;;;:..  .:;:... ::;;::::..");
        System.out.println(";;;;:::;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;];;;;;;;;;;::::::;;;;:.::;;;;;;;;:..");
        System.out.println(";;;;;;;;;;;;;;ii;;;;;;;;;;;;;;;;;;;;;;;;[;;;;;;;;;;;;;;;;;;;;;;:;;;;;;;;;;;;;");
        System.out.println(";;;;;;;;;;;;;;;;;;;iiiiiiii;;;;;;;;;;;;;;};;ii;;iiii;;;;i;;;;;;;;;;;;;;;ii;;;");
        System.out.println("iiii;;;iiiiiiiiiiIIIIIIIIIIIiiiiiIiiiiii{iiIIiiiiiiiiiiiiiiii;;;;;iiiilliiiii");
        System.out.println("IIIiiIIllllllIIlllIIIIlllIIIlIiiIIIIIIIIIIIIlIIIIIllIIIIIIIIiiiiiiiillIIIllII");
        System.out.println("IIIiiilIIIIIIIllTIIIIllIIlIlIIITTTTlIlIlIIIlIITTTTTTTIIIIlIIllIlIlllIIIIIIITT");
        System.out.println("IIIIilIIIIITTTTTTTIIIIIIIIIIIIITTTTTIIIIIIIIITTTTTTTTTTIIIIIIIIIlIIIIIIIITTTT");
        System.out.println("IIIIIIIIITTTTTTTTTTTTTIIIIIIIITTTTTTTTIIIIIITTTTTTTTTTTTTTIIIIIIIIIIIIIITTTTT");
        System.out.println("--------------------------------------------------------------------------------\n");
        System.out.println("What are you standing on?\n");
        System.out.println("************");
        System.out.println("A - A Field");
        System.out.println("B - A Cliff");
        System.out.println("C - A River");
        System.out.println("************");
        
        while(temp == 0) {
            System.out.println("?: ");
            String guess = userGuess.nextLine();
            if(guess.equalsIgnoreCase(jungleAnswers[3])) {
                temp = 1;
            } else {
                System.out.println("Oops! Not quite. Try again!");
            }
        }
        temp = 0;
        
        System.out.println("\nCorrect! A cliff! The " + lang[0] + " word for cliff is - " + lang[5] +  ".\n");
        System.out.println("Fortunately you see a pool of water at the base of the cliff.\n");
        System.out.println("You decide to jump, but when you land you realize that it isn't water at all!\n");
        System.out.println("You're stuck in something, and it feels like it's pulling you down.\n");
        System.out.println("What did you land in?\n");
        System.out.println("************");
        System.out.println("A - An Airplane");
        System.out.println("B - A Tree");
        System.out.println("C - Quicksand");
        System.out.println("************");
        
        while(temp == 0) {
            System.out.println("?: ");
            String guess = userGuess.nextLine();
            if(guess.equalsIgnoreCase(jungleAnswers[4])) {
                temp = 1;
            } else {
                System.out.println("Oops! Not quite. Try again!");
            }
        }
        temp = 0;
        
        System.out.println("\nCorrect! Quicksand! The " + lang[0] + " word for quicksand is - " + lang[6] +  ".\n");
        System.out.println("As you begin to sink, you're suddenly pulled out of " + lang[6] + ".\n");
        System.out.println("Looking up, you see a farmiliar face!");
        System.out.println("---------------------------------------------------");
        System.out.println("       .--.  .-'''-.  .--.");
        System.out.println("      /.\"\".v'.-. .-.`v.\"\"\\");
        System.out.println("     ||  / / O| | O\\ \\  ||");
        System.out.println("      \\_/| \\__| |__/  \\_//");
        System.out.println("       `-'\\  .-n-n-.  /`-'");
        System.out.println("        _.-\\/       \\/-._");
        System.out.println("      .'   (\\`.___.'/)   `.");
        System.out.println("     /      \\`.___.'/      `.");
        System.out.println("    /        `.___.'        \\");
        System.out.println("    |     |             \\    \\");
        System.out.println("    |     |   .      .  |\\    \\");
        System.out.println("    |     |             | \\    \\");
        System.out.println("     \\     \\            |  \\    \\");
        System.out.println("      \\     \\           |.' `.   \\");
        System.out.println("       \\         .'     `.  \\");
        System.out.println("  _.._   `.   `-. ___ /        /`.  `.");
        System.out.println(".'    `-._ `.    `.__)       .'  /    `.");
        System.out.println("|         `-.\\     \\/      .'   / /\\  )|\\.");
        System.out.println(" \\          _/ / /|/     .'    (_/ / / | \\)");
        System.out.println("   `._      (__/_/-/   ..'         (_/| |\\_)");
        System.out.println("       ``--._____.-(     `.            `-'");
        System.out.println("                           `--.   `.");
        System.out.println("                            (_/\\ \\\\");
        System.out.println("                               /_//");
        System.out.println("---------------------------------------------------\n");
        System.out.println("Who has rescued you?\n");
        System.out.println("************");
        System.out.println("A - " + lang[3]);
        System.out.println("B - " + lang[2]);
        System.out.println("C - " + lang[5]);
        System.out.println("************");
        
        while(temp == 0) {
            System.out.println("?: ");
            String guess = userGuess.nextLine();
            if(guess.equalsIgnoreCase(jungleAnswers[5])) {
                temp = 1;
            } else {
                System.out.println("Oops! Not quite. Try again!");
            }
        }
        temp = 0;

        System.out.println("\nCorrect! It is " + lang[2] + "!\n");
        System.out.println("You've had enough jungle adventures for one day!\n");
        System.out.println("You turn to leave, but suddenly hear a ruckus break out behind you. You turn around, and see that:");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println(lang[2] + " is eating "  + lang[3]+ " and "  + lang [4] + " has run off of " + lang[5] + " and is stuck in " + lang[6] +".");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("What are you looking at?\n");
        System.out.println("************");
        System.out.println("A - The quicksand is eating the banana and the monkey ran off the cliff and is stuck in the panther.");
        System.out.println("B - The panther is eating the quicksand and the banana ran off the cliff and is stuck in the monkey.");
        System.out.println("C - The monkey is eating the banana and the panther ran off the cliff and is stuck in the quicksand.");
        System.out.println("************");
        
        while(temp == 0) {
            System.out.println("?: ");
            String guess = userGuess.nextLine();
            if(guess.equalsIgnoreCase(jungleAnswers[6])) {
                temp = 1;
            } else {
                System.out.println("Oops! Not quite. Try again!");
            }
        }
        temp = 0;
        
        System.out.println("Correct!");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Congratulations, you made it out! You finished The Jungle Adventure in " + lang[0] + "! Woohoo!");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }

    private static void dungeonStory(String[] lang) {
        Scanner userGuess = new Scanner(System.in);
        int temp = 0;
        System.out.println(lang[1]);
        System.out.println("----------------");
        System.out.println("You open your eyes in a dark, cold place. You seem to be in a stone room, but you are not sure where.");
        System.out.println("As your eyes are adjusting to the light, you spot something small in the dark.");
        System.out.println("Its small and its dark, and it is flying towards you!!!\n");
        System.out.println("---------------------------------------------------");
        System.out.println("#");
        System.out.println(" ##");
        System.out.println(" ###");
        System.out.println("  ####");
        System.out.println("   #####");
        System.out.println("   #######");
        System.out.println("    #######");
        System.out.println("    ########");
        System.out.println("    ########");
        System.out.println("    #########");
        System.out.println("    ##########");
        System.out.println("   ############");
        System.out.println(" ##############");
        System.out.println("################");
        System.out.println(" ################");
        System.out.println("   ##############");
        System.out.println("    ##############                                              ####");
        System.out.println("    ##############                                           #####");
        System.out.println("     ##############                                      #######");
        System.out.println("     ##############                                 ###########");
        System.out.println("     ###############                              #############");
        System.out.println("     ################                           ##############");
        System.out.println("    #################      #                  ################");
        System.out.println("    ##################     ##    #           #################");
        System.out.println("   ####################   ###   ##          #################");
        System.out.println("        ################  ########          #################");
        System.out.println("         ################  #######         ###################");
        System.out.println("           #######################       #####################");
        System.out.println("            #####################       ###################");
        System.out.println("              ############################################");
        System.out.println("               ###########################################");
        System.out.println("               ##########################################");
        System.out.println("                ########################################");
        System.out.println("                ########################################");
        System.out.println("                 ######################################");
        System.out.println("                 ######################################");
        System.out.println("                  ##########################      #####");
        System.out.println("                  ###  ###################           ##");
        System.out.println("                  ##    ###############");
        System.out.println("                  #     ##  ##########");
        System.out.println("                            ##    ###");
        System.out.println("                                  ###");
        System.out.println("                                  ##");
        System.out.println("                                  #");
        System.out.println("---------------------------------------------------\n");
        System.out.println("What is this animal?\n");
        System.out.println("************");
        System.out.println("A - A Bird");
        System.out.println("B - A Fly");
        System.out.println("C - A Bat");
        System.out.println("************");
        
        while(temp == 0) {
            System.out.println("?: ");
            String guess = userGuess.nextLine();
            if(guess.equalsIgnoreCase(dungeonAnswers[0])) {
                temp = 1;
            } else {
                System.out.println("Oops! Not quite. Try again!");
            }
        }
        temp = 0;

        System.out.println("\nCorrect! A Bat! The " + lang[0] + " word for bat is - " + lang[2] +  ".\n");
        System.out.println(lang[2] + " flies over you, and suddenly you hear someone calling out to you.");
        System.out.println("-------------------------------------------------");
        System.out.println("                               ...----....");
        System.out.println("                         ..-::         :-..");
        System.out.println("                      .-'                      '-.");
        System.out.println("                    .'              .     .       '.");
        System.out.println("                  .'   .          .    .      .    .''.");
        System.out.println("                .'  .    .       .   .   .     .   . ..:.");
        System.out.println("              .' .   . .  .       .   .   ..  .   . ....::.");
        System.out.println("             ..   .   .      .  .    .     .  ..  . ....:IA.");
        System.out.println("            .:  .   .    .    .  .  .    .. .  .. .. ....:IA.");
        System.out.println("           .: .   .   ..   .    .     . . .. . ... ....:.:VHA.");
        System.out.println("           '..  .  .. .   .       .  . .. . .. . .....:.::IHHB.");
        System.out.println("          .:. .  . .  . .   .  .  . . . ...:.:... .......:HIHMM.");
        System.out.println("         .:.... .   . .'::''.. .   .  . .:.:.:II;,. .. ..:IHIMMA");
        System.out.println("         ':.:..  ..::IHHHHHI::. . .  ...:.::::.,,,. . ....VIMMHM");
        System.out.println("        .:::I. .AHHHHHHHHHHAI::. .:...,:IIHHHHHHMMMHHL:. . VMMMM");
        System.out.println("       .:.:V.:IVHHHHHHHMHMHHH::..:' .:HIHHHHHHHHHHHHHMHHA. .VMMM.");
        System.out.println("       :..V.:IVHHHHHMMHHHHHHHB... . .:VPHHMHHHMMHHHHHHHHHAI.:VMMI");
        System.out.println("       ::V..:VIHHHHHHMMMHHHHHH. .   .I':IIMHHMMHHHHHHHHHHHAPI:WMM");
        System.out.println("       ::'. .:.HHHHHHHHMMHHHHHI.  . .:..I:MHMMHHHHHHHHHMHV:':H:WM");
        System.out.println("       :: . :.::IIHHHHHHMMHHHHV  .ABA.:.:IMHMHMMMHMHHHHV:'. .IHWW");
        System.out.println("       '.  ..:..:.:IHHHHHMMHV' .AVMHMA.:.'VHMMMMHHHHHV:' .  :IHWV");
        System.out.println("        :.  .:...:'.:.:TPP'   .AVMMHMMA.:. 'VMMHHHP.:... .. :IVAI");
        System.out.println("       .:.   '... .:''   .   ..HMMMHMMMA::. .'VHHI:::....  .:IHW'");
        System.out.println("       ...  .  . ..:IIPPIH: ..HMMMI.MMMV:I:.  .:ILLH:.. ...:I:IM");
        System.out.println("     : .   .''' .:.V'. .. .  :HMMM:IMMMI::I. ..:HHIIPPHI::'.P:HM.");
        System.out.println("     :.  .  .  .. ..:.. .    :AMMM IMMMM..:...:IV':T::I::.'.:IHIMA");
        System.out.println("     'V:.. .. . .. .  .  .   'VMMV..VMMV :....:V:.:..:....::IHHHMH");
        System.out.println("       'IHH:.II:.. .:. .  . . .   :HB  . . ..PI:.::.:::..:IHHMMV");
        System.out.println("        :IP''HHII:.  .  .    . . .'V:. . . ..:IH:.:.::IHIHHMMMMM");
        System.out.println("        :V:. VIMA:I..  .     .  . .. . .  .:.I:I:..:IHHHHMMHHMMM");
        System.out.println("        :'VI:.VWMA::. .:      .   .. .:. ..:.I::.:IVHHHMMMHMMMMI");
        System.out.println("        :.'VIIHHMMA:.  .   .   .:  .:.. . .:.II:I:AMMMMMMHMMMMMI");
        System.out.println("        :..VIHIHMMMI...::.,:.,:!'I:!'I!'I!'V:AI:VAMMMMMMHMMMMMM'");
        System.out.println("        ':.:HIHIMHHA:'!!'I.:AXXXVVXXXXXXXA:.'HPHIMMMMHHMHMMMMMV");
        System.out.println("          V:H:I:MA:W'I :AXXXIXII:IIIISSSSSSXXA.I.VMMMHMHMMMMMM");
        System.out.println("            'I::IVA ASSSSXSSSSBBSBMBSSSSSSBBMMMBS.VVMMHIMM''");
        System.out.println("             I:: VPAIMSSSSSSSSSBSSSMMBSSSBBMMMMXXI:MMHIMMI");
        System.out.println("            .I::. 'H:XIIXBBMMMMMMMMMMMMMMMMMBXIXXMMPHIIMM'");
        System.out.println("            :::I.  ':XSSXXIIIIXSSBMBSSXXXIIIXXSMMAMI:.IMM");
        System.out.println("            :::I:.  .VSSSSSISISISSSBII:ISSSSBMMB:MI:..:MM");
        System.out.println("            ::.I:.  ':'SSSSSSSISISSXIIXSSSSBMMB:AHI:..MMM.");
        System.out.println("            ::.I:. . ..:'BBSSSSSSSSSSSSBBBMMMB:AHHI::.HMMI");
        System.out.println("            :..::.  . ..::':BBBBBSSBBBMMMB:MMMMHHII::IHHMI");
        System.out.println("            ':.I:... ....:IHHHHHMMMMMMMMMMMMMMMHHIIIIHMMV");
        System.out.println("               V:. ..:...:.IHHHMMMMMMMMMMMMMMMMHHHMHHMHP'");
        System.out.println("               ':. .:::.:.::III::IHHHHMMMMMHMHMMHHHHM");
        System.out.println("                  ::....::.:::..:..::IIIIIHHHHMMMHHMV");
        System.out.println("                    ::.::.. .. .  ...:::IIHHMMMMHMV'");
        System.out.println("                      V::... . .I::IHHMMV'");
        System.out.println("                       ' VHVHHHAHHHHMMV:'");
        System.out.println("-------------------------------------------------\n");
        System.out.println("What is this thing!?!" );
        System.out.println("************");
        System.out.println("A - A Head");
        System.out.println("B - A Skull");
        System.out.println("C - A Brain");
        System.out.println("************");
        
        while(temp == 0) {
            System.out.println("?: ");
            String guess = userGuess.nextLine();
            if(guess.equalsIgnoreCase(dungeonAnswers[1])) {
                temp = 1;
            } else {
                System.out.println("Oops! Not quite. Try again!");
            }
        }
        temp = 0;
        
        System.out.println("\nCorrect! This is a Skull! The " + lang[0] + " word for skull is - " + lang[3] +  ".\n");
        System.out.println("Confused, you ask the skull what he wants. He says he knows the way out, and will tell you if you take him with you.\n");
        System.out.println("You agree, and you pick him up and follow his directions. You come to a large room.");
        System.out.println("There is something in the middle of the room... and it is alive!\n");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("            ;               ,       ");    
        System.out.println("         ,;                 '.         ");
        System.out.println("        ;:                   :;        ");
        System.out.println("       ::                     ::       ");
        System.out.println("       ::                     ::       ");
        System.out.println("       ':                     :        ");
        System.out.println("        :.                    :        ");
        System.out.println("     ;' ::                   ::  '     ");
        System.out.println("    .'  ';                   ;'  '.    ");
        System.out.println("   ::    :;                 ;:    ::   ");
        System.out.println("   ;      :;.             ,;:     ::   ");
        System.out.println("   :;      :;:           ,;'      ::   ");
        System.out.println("   ::.      ':;  ..,.;  ;:'     ,.;:   ");
        System.out.println("    '''...   '::,::::: ;:   .;.;'''    ");
        System.out.println("        ''''....;:::::;,;.;'''         ");
        System.out.println("    .:::.....''':::::::'',...;::::;.   ");
        System.out.println("   ;:' '''''';.,;:::::;.'''''''  ':;   ");
        System.out.println("  ::'         ;::;:::;::..         :;  ");
        System.out.println(" ::         ,;:::::::::::;:..       :: ");
        System.out.println(" ;'     ,;;:;::::::::::::::;';..    ':.");
        System.out.println("::     ;:'  ::::::''''::::::  ':     ::");
        System.out.println(" :.    ::   ::::::;  :::::::   :     ; ");
        System.out.println("  ;    ::   :::::::  :::::::   :    ;  ");
        System.out.println("   '   ::   ::::::....:::::'  ,:   '   ");
        System.out.println("    '  ::    :::::::::::::'   ::       ");
        System.out.println("       ::     ':::::::::''    ::       ");
        System.out.println("       ':       ''''''''      ::       ");
        System.out.println("        ::                   ;:        ");
        System.out.println("        ':;                 ;:'        ");
        System.out.println("           ';              ,;'         ");
        System.out.println("            ''           ''            ");
        System.out.println("              '");
        System.out.println("--------------------------------------------------------------------------------\n");
        System.out.println("What is this foul beast?\n");
        System.out.println("************");
        System.out.println("A - A Lizard");
        System.out.println("B - A Crab");
        System.out.println("C - A Spider");
        System.out.println("************");
        
        while(temp == 0) {
            System.out.println("?: ");
            String guess = userGuess.nextLine();
            if(guess.equalsIgnoreCase(dungeonAnswers[2])) {
                temp = 1;
            } else {
                System.out.println("Oops! Not quite. Try again!");
            }
        }
        temp = 0;
        
        System.out.println("\nCorrect! It is a Spider! The " + lang[0] + " word for Spider is - " + lang[4] +  ".\n");
        System.out.println("As you scramble away from the spider, you carry the skull with you and run down a long dark hallway and step on a pressure plate.");
        System.out.println("There is the sound of something fizzling, and a strange object rolls down the hallway... on closer inspection, you decide to run!");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("    ####              ");                
        System.out.println("  ##  ##    ##           ");                           
        System.out.println("              ##           ");                                       
        System.out.println("##    ##        ##         ");           
        System.out.println("    ##      ##########      ");                        
        System.out.println("            ##########       ");                         
        System.out.println("        ##################     ");               
        System.out.println("      ######################    ");          
        System.out.println("      ######################     ");         
        System.out.println("    ##########################   ");     
        System.out.println("    ################  ########   ");     
        System.out.println("      ##############  ######     ");         
        System.out.println("      ############  ########     ");     
        System.out.println("        ##################      ");            
        System.out.println("          ##############       ");              
        System.out.println("              ######        ");
        System.out.println("--------------------------------------------------------------------------------\n");
        System.out.println("What is this dangerous object?\n");
        System.out.println("************");
        System.out.println("A - A Basketball");
        System.out.println("B - A Bomb");
        System.out.println("C - A Rock");
        System.out.println("************");
        
        while(temp == 0) {
            System.out.println("?: ");
            String guess = userGuess.nextLine();
            if(guess.equalsIgnoreCase(dungeonAnswers[3])) {
                temp = 1;
            } else {
                System.out.println("Oops! Not quite. Try again!");
            }
        }
        temp = 0;
        
        System.out.println("\nCorrect! It's a Bomb! The " + lang[0] + " word for Bomb is - " + lang[5] +  ".\n");
        System.out.println("You jump out of the way just in time to dodge the bomb, and watch as it rolls past you and blows up the spider that was chasing you!\n");
        System.out.println("You are safe! For now...\n");
        System.out.println("Suddenly, you hear a soft noise come from down a dark corridor. You follow it towards a door. When you open the door... you are faced with this.\n");
              
        System.out.println("---------------------------------------------------");
        System.out.println("       *-.      ");              
        System.out.println("        )  _`-.         ");        
        System.out.println("       .  : `. .            ");    
        System.out.println("       : _   '               ");  
        System.out.println("       ; *` _.   `*-._         "); 
        System.out.println("       `-.-'          `-.       ");
        System.out.println("         ;       `       `.     ");
        System.out.println("         :.       .        -    ");
        System.out.println("         .   .   :   .-'   .   ");
        System.out.println("         '  `+.;  ;  '      :   ");
        System.out.println("         :  '  |    ;       ;-. ");
        System.out.println("         ; '   : :`-:     _.`* ;");
        System.out.println("   .*' /  .*' ; .*`- +'  `*' ");
        System.out.println("      `*-*   `*-*  `*-*'");
        System.out.println("---------------------------------------------------\n");
        
        System.out.println("What is this thing?\n");
        System.out.println("************");
        System.out.println("A - A Kitten");
        System.out.println("B - A Puppy");
        System.out.println("C - An Evil Goblin");
        System.out.println("************");
        
        while(temp == 0) {
            System.out.println("?: ");
            String guess = userGuess.nextLine();
            if(guess.equalsIgnoreCase(dungeonAnswers[4])) {
                temp = 1;
            } else {
                System.out.println("Oops! Not quite. Try again!");
            }
        }
        temp = 0;
        
        System.out.println("\nCorrect! It is a Kitten! The " + lang[0] + " word for Kitten is - " + lang[6] +  ".\n");
        System.out.println("You decide to pick up the kitten with your free hand, and you, the kitten, and the skull continue your journey to escape...\n");
      
        System.out.println("You come across a door with a fascinating dial on it. It seems to need some sort of code to get through, and there is a picture of a wolf on it\n");
        System.out.println("Which one of the words on the lock could mean wolf?\n");
        System.out.println("************");
        System.out.println("A - La Wolfo");
        System.out.println("B - Le Wolfi");
        System.out.println("C - " + lang[7]);
        System.out.println("************");
        
        while(temp == 0) {
            System.out.println("?: ");
            String guess = userGuess.nextLine();
            if(guess.equalsIgnoreCase(dungeonAnswers[5])) {
                temp = 1;
            } else {
                System.out.println("Oops! Not quite. Try again!");
            }
        }
        temp = 0;

        System.out.println("\nCorrect! It is " + lang[7] + "!");

    System.out.println("The door opens...\n");
        System.out.println("As you step outside with your 2 new friends, you turn around and see a scary sight.\n");
        System.out.println("You see that:");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println(lang[2] + " is chasing "  + lang[4]+ " who is carrying "  + lang [5] + " and running towards " + lang[6] + " and " + lang[3] +".");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("What are you looking at?\n");
        System.out.println("************");
        System.out.println("A - The wolf is chasing the spider who is carrying the kitten and running towards the bat and the skull ");
        System.out.println("B - I dont know but this is terrifying!");
        System.out.println("C - The bat is chasing the spider who is carrying the bomb and running towards the kitten and the skull.");
        System.out.println("************");
        
        while(temp == 0) {
            System.out.println("?: ");
            String guess = userGuess.nextLine();
            if(guess.equalsIgnoreCase(dungeonAnswers[6])) {
                temp = 1;
            } else {
                System.out.println("Oops! Not quite. Try again!");
            }
        }
        temp = 0;
        
        System.out.println("Correct!");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Congratulations, you  made it out! You finished The Dungeon Adventure in " + lang[0] + "! Woohoo!");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}
    