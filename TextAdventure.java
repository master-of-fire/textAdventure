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

    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  }

  private void enterZone2()
  {
    // change image
    // ADD CODE HERE
    console.setImage("cabin.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone3()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

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