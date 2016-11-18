import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Animal
{
    int X = Greenfoot.getRandomNumber(500);
    int Y = Greenfoot.getRandomNumber(400);
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       moveAndTurn();
       eat();
    }
    public void moveAndTurn() {
        if(Greenfoot.isKeyDown("left")) {
            move(-10);
        }
        if(Greenfoot.isKeyDown("right")) {
            move(10);
        }
        
        turn(5);
    }
    public void eat() {
        Actor worm;
        Score score =  (Score)getOneObjectAtOffset(-(this.getX())+94, -(this.getY())+29, Score.class);
        worm = getOneObjectAtOffset(0, 0, Worm.class);
        if(worm != null) {
            World world;
            world = getWorld();
            world.removeObject(worm);
            int X = Greenfoot.getRandomNumber(500);
            int Y = Greenfoot.getRandomNumber(400);
            world.addObject(new Worm(), X, Y);
            score.addScore(10);
        }
    }
   
    
    
}
