import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starts game with instructions 
 * Iman 
 * January 7th, 2020
 */
public class StartScreen extends World
{
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {   super(1100, 600, 1);
        GreenfootImage drawedImage = new GreenfootImage("dk.png");
       getBackground().drawImage(drawedImage, 550, 300);
        //The image's left top corner will be at the coordinate poin (100|100) not the center of the image;

        showText("Start", 550, 400);
    }
}
