import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
   
    
    
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
           
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        Score score = new Score();
        addObject(score,94,29);
     
        Crab crab = new Crab();
        addObject(crab,464,214);
        Lobster lobster = new Lobster();
        addObject(lobster,87,229);
        Worm worm = new Worm();
        addObject(worm,368,325);
        Worm worm2 = new Worm();
        addObject(worm2,440,117);
        Worm worm3 = new Worm();
        addObject(worm3,169,86);
        Worm worm4 = new Worm();
        addObject(worm4,285,211);
        Worm worm5 = new Worm();
        addObject(worm5,151,340);
        Turtle turtle = new Turtle();
        addObject(turtle,260,338);
        
        
    }
    
    public void newScore()
    {
        
    }
}
