import java.util.Scanner;

public class Main {

    public static Scanner sc;
    public static int turns, progress;
    public static String test;

    public static void main(String[] args) {
	// write your code here
        System.out.println("You are in an escape room. You have 30 turns to escape. \nEach turn requires a two word command consisting of a verb and a noun (eg. \"go door\" for moving your charactar to the door).\n Make sure all letters are lowercase and all commands are general.");
        turns = 30;
        progress = 14;


        if (progress >= 14) {Foyer();}
        if ((progress >= 6) && (progress <=9)) {Library();}
        if (progress <= 5) {Conservatory();}
    }

    public static void Foyer() {
        if ((turns<progress) || (turns == 0)) {
            youLose();
        }
        if (progress == 14) {
            System.out.println("\nYou are in the Foyer. Cobwebbs hang from the chandeliers that look about to fall from the ceiling. \nThe light is dim and you can barely make out your surroundings. \nInside the foyer, you see a bench, a chest, an unlit candle, and a note. There is a door to the north, but it is locked.");
            switch (turn()) {
                case "look note":
                case "read note":
                    System.out.println("\nThe note says, \"May my light show you the way.\" You do not understand -- the door is still locked.");
                    calcTurns();
                    Foyer();
                    break;
                case "open chest":
                    System.out.println("\nInside the chest is dusty; it clearly has been left unopened for years. \nAfter sweeping through some of the dust, the contents become visable: a box of matches.");
                    progress = progress - 1;
                    calcTurns();
                    break;
                default:
                    System.out.println("\nYour move yielded no advancement in escaping the room.");
                    calcTurns();
                    Foyer();
                    break;
            }
        }
        if (progress == 13) {
            switch (turn()) {
                case "look note":
                case "read note":
                    System.out.println("\nThe note says, \"May my light show you the way.\" You do not understand -- the door is still locked.");
                    calcTurns();
                    Foyer();
                    break;
                case "get matches":
                    System.out.println("\nYou pick up the matches, unsure if they will still work after all these years.");
                    progress = progress - 1;
                    calcTurns();
                    break;
                default:
                    System.out.println("\nYour move yielded no advancement in escaping the room.");
                    calcTurns();
                    Foyer();
                    break;
            }
        }
        if (progress == 12) {
            switch (turn()) {
                case "look note":
                case "read note":
                    System.out.println("\nThe note says, \"May my light show you the way.\" You do not understand -- the door is still locked.");
                    calcTurns();
                    Foyer();
                    break;
                case "light candle":
                    System.out.println("\nYou light the candle. Immediatly you hear a bang, then a slow creak. The door to the north unlocks.");
                    progress = progress - 1;
                    calcTurns();
                    break;
                default:
                    System.out.println("\nYour move yielded no advancement in escaping the room.");
                    calcTurns();
                    Foyer();
                    break;
            }
        }
        if (progress == 11) {
            switch (turn()) {
                case "look note":
                case "read note":
                    System.out.println("\nThe note says, \"May my light show you the way.\" You do not understand -- the door is still locked.");
                    calcTurns();
                    Foyer();
                    break;
                case "open door":
                    System.out.println("\nThe door to the north opens slowely, enticing you to enter.");
                    progress = progress - 1;
                    calcTurns();
                    break;
                default:
                    System.out.println("\nYour move yielded no advancement in escaping the room.");
                    calcTurns();
                    Foyer();
                    break;
            }
        }
        if (progress == 10) {
            switch (turn()) {
                case "look note":
                case "read note":
                    System.out.println("\nThe note says, \"May my light show you the way.\" You do not understand -- the door is still locked.");
                    calcTurns();
                    Foyer();
                    break;
                case "go door":
                case "go north":
                case "north":
                    System.out.println("\nYou walk through the door and the room opens up into a much brighter room. As you view the books lining the shelves, it becomes clear that you are in a library.\n In a specific corner, you see a desk with a pen and scroll lying on it. There is another door to the north.");
                    progress = progress - 1;
                    calcTurns();
                    break;
                default:
                    System.out.println("\nYour move yielded no advancement in escaping the room.");
                    calcTurns();
                    Foyer();
                    break;
            }
        }
    }

    public static void Library() {
        if ((turns<progress) || (turns == 0)) {
            youLose();
        }
        if (progress == 9) {
            switch (turn()) {
                case "look scroll":
                case "read scroll":
                    System.out.println("\nThe scroll says, \"Share your story.\" The library seems so old; you wonder if it is possible that it could have been written for you?");
                    calcTurns();
                    Library();
                    break;
                case "get pen":
                    System.out.println("\nYou pick up the pen. It is still sealed -- it has never been used.");
                    progress = progress - 1;
                    calcTurns();
                    break;
                case "look bookshelf":
                    System.out.println("\nAfter searching the bookshelf, you see a book open. It is curious so you take a closer look. \nThe book is titled \"The Autobiography of...\" with the rest of the title empty. You wonder why.");
                    Library();
                    break;
                default:
                    System.out.println("\nYour move yielded no advancement in escaping the room.");
                    calcTurns();
                    Library();
                    break;
            }
        }
        if (progress == 8) {
            switch (turn()) {
                case "look scroll":
                case "read scroll":
                    System.out.println("\nThe scroll says, \"Share your story.\" The library seems so old; you wonder if it is possible that it could have been written for you?");
                    calcTurns();
                    Library();
                    break;
                case "write name":
                case "write book":
                    System.out.println("\nYou write your name in the book, making the autobiography about you. The pages become filled with a history you are yet to know.\nYou shut your eyes as you know your mind would be unable to handle it.\nThe door to the north once again becomes unlocked.");
                    progress = progress - 1;
                    calcTurns();
                    break;
                case "look bookshelf":
                    System.out.println("\nAfter searching the bookshelf, you see a book open. It is curious so you take a closer look. \nThe book is titled \"The Autobiography of...\" with the rest of the title empty. You wonder why.");
                    Library();
                    break;
                default:
                    System.out.println("\nYour move yielded no advancement in escaping the room.");
                    calcTurns();
                    Library();
                    break;
            }
        }
        if (progress == 7) {
            switch (turn()) {
                case "look scroll":
                case "read scroll":
                    System.out.println("\nThe scroll says, \"Share your story.\" The library seems so old; you wonder if it is possible that it could have been written for you?");
                    calcTurns();
                    Library();
                    break;
                case "open door":
                    System.out.println("\n The door slowely creaks open. You hope you have bested the last room you need to.");
                    progress = progress - 1;
                    calcTurns();
                    break;
                case "look bookshelf":
                    System.out.println("\nAfter searching the bookshelf, you see a book open. It is curious so you take a closer look. \nThe book is titled \"The Autobiography of...\" with the rest of the title empty. You wonder why.");
                    Library();
                    break;
                default:
                    System.out.println("\nYour move yielded no advancement in escaping the room.");
                    calcTurns();
                    Library();
                    break;
            }
        }
        if (progress == 6) {
            switch (turn()) {
                case "look scroll":
                case "read scroll":
                    System.out.println("\nThe scroll says, \"Share your story.\" The library seems so old; you wonder if it is possible that it could have been written for you?");
                    calcTurns();
                    Library();
                    break;
                case "go door":
                case "go north":
                case "north":
                    System.out.println("\nYou walk through the door and the room opens up into a grand high ceilinged room. Couches line the outside of it. Although there is much greenery around you, you feel the same creepiness as before.\nThere are three instruments in this room: a trumpet, a drum, and a piano. There is also a piece of sheet music on a stand in the center.");
                    progress = progress - 1;
                    calcTurns();
                    break;
                case "look bookshelf":
                    System.out.println("\nAfter searching the bookshelf, you see a book open. It is curious so you take a closer look. \nThe book is titled \"The Autobiography of...\" with the rest of the title empty. You wonder why.");
                    Library();
                    break;
                default:
                    System.out.println("\nYour move yielded no advancement in escaping the room.");
                    calcTurns();
                    Library();
                    break;
            }
        }
    }

    public static void Conservatory() {
        if ((turns<progress) || (turns == 0)) {
            youLose();
        }
        if (progress == 5) {
            switch (turn()) {
                case "read sheet":
                case "read music":
                case "look sheet":
                case "look music":
                    System.out.println("\nThe sheet music is empty, but a phrasie is written on the musical staff: \"Timbre, Tone, and Time.\" \nThese represent the Trumpet, Piano, and Drum respectively. It seems strange.");
                    calcTurns();
                    Conservatory();
                    break;
                case "play trumpet":
                    System.out.println("\nYou play the trumpet. Much to your suprise, you are able to play with ease. \nMelodies flow out perfectly even though you have never before played a trumpet.");
                    progress = progress - 1;
                    calcTurns();
                    break;
                case "get trumpet":
                    System.out.println("\nYou pick up the trumpet. You really hope the mouthpiece is new.");
                    calcTurns();
                    break;
                default:
                    System.out.println("\nYour move yielded no advancement in escaping the room.");
                    calcTurns();
                    Conservatory();
                    break;
            }
        }
        if (progress == 4) {
            switch (turn()) {
                case "read sheet":
                case "read music":
                case "look sheet":
                case "look music":
                    System.out.println("\nThe sheet music is empty, but a phrasie is written on the musical staff: \"Timbre, Tone, and Time.\" \nThese represent the Trumpet, Piano, and Drum respectively. It seems strange.");
                    calcTurns();
                    Conservatory();
                    break;
                case "go piano":
                    System.out.println("\nYou sit at the piano.");
                    Conservatory();
                    break;
                case "play piano":
                    System.out.println("\nYou play the piano. This time, too, you are able to play a melody perfectly even though you have never touched a piano in your life.");
                    progress = progress - 1;
                    calcTurns();
                    break;
                default:
                    System.out.println("\nYour move yielded no advancement in escaping the room.");
                    calcTurns();
                    Conservatory();
                    break;
            }
        }
        if (progress == 3) {
            switch (turn()) {
                case "read sheet":
                case "read music":
                case "look sheet":
                case "look music":
                    System.out.println("\nThe sheet music is empty, but a phrasie is written on the musical staff: \"Timbre, Tone, and Time.\" \nThese represent the Trumpet, Piano, and Drum respectively. It seems strange.");
                    calcTurns();
                    Conservatory();
                    break;
                case "get drum":
                    System.out.println("\nYou get the drum and hold the drumsticks.");
                    Library();
                    break;
                case "play drum":
                    System.out.println("\nAs soon as you finish playing, the door to the north once again becomes unlocked.");
                    progress = progress - 1;
                    calcTurns();
                    break;
                default:
                    System.out.println("\nYour move yielded no advancement in escaping the room.");
                    calcTurns();
                    Conservatory();
                    break;
            }
        }
        if (progress == 2) {
            switch (turn()) {
                case "read sheet":
                case "read music":
                case "look sheet":
                case "look music":
                    System.out.println("\nThe sheet music is empty, but a phrasie is written on the musical staff: \"Timbre, Tone, and Time.\" \nThese represent the Trumpet, Piano, and Drum respectively. It seems strange.");
                    calcTurns();
                    Conservatory();
                    break;
                case "open door":
                    System.out.println("\nYou open the door.");
                    progress = progress - 1;
                    calcTurns();
                    break;
                default:
                    System.out.println("\nYour move yielded no advancement in escaping the room.");
                    calcTurns();
                    Conservatory();
                    break;
            }
        }
        if (progress == 1) {
            switch (turn()) {
                case "read sheet":
                case "read music":
                case "look sheet":
                case "look music":
                    System.out.println("\nThe sheet music is empty, but a phrasie is written on the musical staff: \"Timbre, Tone, and Time.\" \nThese represent the Trumpet, Piano, and Drum respectively. It seems strange.");
                    calcTurns();
                    Conservatory();
                    break;
                case "go door":
                case "go north":
                case "north":
                    System.out.println("\nYou walk through the door, and you finally exit the house.");
                    progress = progress - 1;
                    calcTurns();
                    youWin();
                    break;
                default:
                    System.out.println("\nYour move yielded no advancement in escaping the room.");
                    calcTurns();
                    Conservatory();
                    break;
            }
        }
    }

    public static void calcTurns() {
        System.out.println("You have " + turns + " turns left to play.");
    }

    public static String turn() {
        sc = new Scanner (System.in);
        System.out.print("What do you do next?");
        turns = turns - 1;
        return sc.nextLine();
    }

    public static void youLose() {
        System.out.println("You have made too many mistakes and have lost. You will be in this house forever. \nDo not worry though, you will not die soon. It will be slow and painful.");
    }

    public static void youWin() {
        System.out.println("You exist the house, falling to your knees with gratitude of your freedom. \n----------------------------------------------------------------\nCONGRADULATIONS, YOU HAVE WON.");
    }
}
