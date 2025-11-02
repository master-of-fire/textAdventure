import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Bob", 100, 0);
  }

  public void play()
  {
    String input;
    // start of adventure. You can change this if you like
    console.setImage("distantcity.jpg");

    // ask the user for their name.
    System.out.println("What is your name?\n");
    input = inScanner.nextLine();

    // Change ourHero's name
    ourHero.changeName(input);
    // describe the starting situation. Feel free to change this
    System.out.println("You wake up to find yourself near a shadowy cabin with the lights on. \nYou see what looks like some ruins in the distance. \nWhat would you like to do? \nruins: go towards the ruins\ncabin: turn around and enter the cabin\n" + ourHero.getName() + ": ");

    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE
    input = inScanner.nextLine();
    System.out.println("You would like to go to "+ input);
    if(input.equals("ruins")||input.equals("Ruins")){
      enterZone1();
    }
    else if(input.equals("cabin")||input.equals("Cabin")){
      enterZone2();
    }
    else{
      gameEnd();
    }
  }

  private void enterZone1()
  {
    // change image
    // ADD CODE HERE
    console.setImage("ruins.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("After a short walk, you enter the ruins, the walls are slightly damp with rainwater, and there seems to be some plant growth embedded between the bricks, after exploring for a bit, you come across a chest with a skull on it, What do you want to do? \nopen: try to open the chest \nleave: dont risk it, you never liked that chest anyway\n"+ourHero.getName()+": "); 
    String input = inScanner.nextLine();
    if(input.equals("open")||input.equals("Open")){
          console.setImage("chest.jpg");
                  ourHero.setGold(25);
                  System.out.println("You have "+ourHero.getGold()+" gold");
                  System.out.println("The chest was filled with gold!, the skull was probably just to scare people, you gather it up and take a look at your surroundings, you can walk back to the cabin or a cave you spot close by, What do you do? \ncabin: walk to the cabin \ncave: the cabin creeps you out, might as well check out the cave\n"+ourHero.getName()+": ");
                  if(input.equals("cave")||input.equals("Cave")){
                        enterZone3();
                  }
                  if(input.equals("cabin")||input.equals("Cabin")){
                        enterZone2();
                  }
  }              
    if(input.equals("leave")||input.equals("Leave")){
      enterZone2();
      
    
  }
    
    
    
    
    

  }

  private void enterZone2()
  {
    // change image
    // ADD CODE HERE
    console.setImage("cabin.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You find yourself outside a strange cabin, despite the unnerving exterior, something about it beckons you to enter, but you also spot a cave not too far off. What do you do? \nenter: walk into the cabin \ncave: the cabin creeps you out, might as well check out the cave\n"+ourHero.getName()+": ");
    String zone2input = inScanner.nextLine();

    if(zone2input.equals("enter")||zone2input.equals("Enter")){
          console.setImage("cabin_interior.jpg");
          System.out.println("On entering the cabin, you are greeted by a cozy interior, with a warm fire crackling in the hearth. An old man sits in a rocking chair, beckoning you to sit, despite the initial creepiness, you feel a strange comfort here. Upon sitting, the man offers a deal, a simple coinflip, if you win, he gives you 50 gold, if you lose, you give him 20 health. Do you accept? \nyes: accept the coinflip \nno: politely decline and leave the cabin\n"+ourHero.getName()+": ");
          String input2 = inScanner.nextLine();
          if(input2.equals("yes")||input2.equals("Yes")){
          Random rand = new Random();
          if(rand.nextInt(2) == 1) {
              ourHero.setGold(ourHero.getGold() + 50);
              System.out.println("You won! You have "+ourHero.getGold()+" gold");
              System.out.println("The man looks at the coin and smiles, he gives a slight chuckle as he hands you the gold, you feel a strange sense of satisfaction, you leave the cabin and continue on your journey");
          } else {
              ourHero.setHealth(ourHero.getHealth() - 20);
              System.out.println("You lost! Your health is now "+ourHero.getHealth());
              System.out.println("The man looks at the coin with a gleam in his eye, you feel your energy drain as you pay your debt");
          }
        } 
            else if(input2.equals("no")||input2.equals("No")){
              System.out.println("You politely decline and leave the cabin, you feel a strange sense of relief, you continue on your journey");
        }

          System.out.println("You step outside the cabin, the sun is setting. You can head to the cave or to a watchtower you see in the distance. What do you do? \ncave: check out the cave \ntower: head to the watchtower\n"+ourHero.getName()+": ");
          String input3 = inScanner.nextLine();
          if(input3.equals("cave")||input3.equals("Cave")){
                enterZone3();
          }
          if(input3.equals("tower")||input3.equals("Tower")){
                enterZone4();
          }
      }
    if(zone2input.equals("cave")||zone2input.equals("Cave")){
          enterZone3();
    }
  }
  

  private void enterZone3()
  {
    // change image
    // ADD CODE HERE
    console.setImage("crystals.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You find yourself in a cave, the walls are lined with crystals that shimmer and glow in the darkness. You can go down a path leading deeper into the cave, or you can exit. What do you do? \ndeep: go deeper into the cave \nexit: exit the cave\n"+ourHero.getName()+": ");
    String input = inScanner.nextLine();
    if(input.equals("deep")||input.equals("Deep")){
          System.out.println("The very air chokes your lungs, but you stumble through the cave, reaching the end, you find a glowing yellow amulet, do you take it? \nyes: take the amulet \nno: dont risk it, leave the cave\n"+ourHero.getName()+": ");
          String input2 = inScanner.nextLine();
          if(input2.equals("yes")||input2.equals("Yes")){
                ourHero.setHealth(200);
                System.out.println("You take the amulet, it pulses with a warm energy, you feel a strange sense of power, your health is now "+ourHero.getHealth()+", you leave the cave and head towards the watchtower you saw earlier");
                enterZone5();
          }
          if(input2.equals("no")||input2.equals("No")){
                System.out.println("When you try to leave, you stumble and trip over yourself, your throat begins to itch and a rock hits your head, you crawl out of the cave, your health is now "+(ourHero.getHealth()-50)+", you decide to head towards the watchtower you saw earlier");
                enterZone5();
          }
        } 
    if(input.equals("exit")||input.equals("Exit")){
          enterZone5();
    }

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone4()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone5()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone6()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void gameEnd()
  {
    // ADD CODE HERE

    inScanner.close();
  }
}
