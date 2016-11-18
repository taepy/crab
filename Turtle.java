import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle  extends Lobster implements Freezable 
{
    private int counter;
    public Turtle() {
        counter = 100;
    }
    
    public void act()
    {
        if(counter <=0) {
            super.act();
           // freeze(100);
        }
        else
            counter--;
    }
    
    public void freeze(int count)   {
        counter = count;
    }
    
    public void eat()   {
        Actor lobster;
        lobster = getOneObjectAtOffset(0,0,Lobster.class);
        if(lobster != null) {
            World world;
            world = getWorld();
            world.removeObject(lobster);
        }
    }
    
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   /* public void act() 
    {
        movearound();
        eatLobster();
        // Add your action code here.
    }    
    
    public void movearound()
    {
        move(1);
        if (Greenfoot.getRandomNumber(100) < 5)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (getX() <= 15 || getX() >= getWorld().getWidth() - 15)
        {
            turn(180);
        }
        if (getY() <= 15 || getY() >= getWorld().getHeight() - 25)
        {
            turn(180);
        }
    }
    
    public void eatLobster()
    {
        Actor lobster;
        lobster = getOneObjectAtOffset(0, 0, Lobster.class);
        if(lobster != null) {
            World world;
            world = getWorld();
            world.removeObject(lobster);
    }
}*/
}
