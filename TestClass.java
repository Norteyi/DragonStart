import java.awt.*;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{

   public static void main(String args[]) throws InterruptedException{
       DrawingPanel panel = new DrawingPanel(1000,1000);
       Graphics g = panel.getGraphics();
       
       Dragon draggy = new Dragon();
       
       draggy.drawDragon(g);
       
       Thread.sleep(3000);
       Dragon cheese = new Dragon(500,300,2,Color.red);
       cheese.drawDragon(g);
     
       //System.out.println(draggy);
       //System.out.println(cheese);
    }
}
