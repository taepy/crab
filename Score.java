import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private int score;
    public Score() {
        this.score = 0;
        setImage(new GreenfootImage("Score : " + score, 24, Color.BLACK, new Color(0x000000FF, true)));
    }
    public void act() {}
    public void addScore(int score) {
        this.score += score;
    }             
}
