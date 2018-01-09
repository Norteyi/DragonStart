import java.awt.*;
import java.util.Scanner;
/**
 * Write a description of class speakingDragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class speakingDragon extends Dragon
{
    private String text;
    Scanner user = new Scanner(System.in);
    /**
     * Constructor for objects of class speakingDragon
     */
    public speakingDragon(Color pbackground)
    {
        super(pbackground);
    }
    public speakingDragon(Color pbackground, int x,int y, int size, Color c)
    {
        super(pbackground, x , y , size, c);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String setText(){
        System.out.println("What do you want the dragon to say");
        text = user.nextLine();
        return text;
    }
    public void speak(String stext)
    {
        System.out.println("This dragon has said: "+stext);
    }
}
