import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Animal
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Lobster() {
        this.speed = 3;
    }
    public void act() 
    {
        moveAround();
        eat();
    }    
    
    public void moveAround()
    {
        move(this.speed);
        if (Greenfoot.getRandomNumber(100) < 10)
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
    
    public void eat()
    {
        Actor crab;
        crab = getOneObjectAtOffset(0,0,Crab.class);
        if(crab != null) {
            World world;
            world = getWorld();
            world.removeObject(crab);
            world.showText("GAME OVER", 300,200);
        }
    }
        // Add your action code here.
    
}
