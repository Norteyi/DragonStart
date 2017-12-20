import java.awt.*;
import java.util.Scanner;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{

   public static void main(String args[]) throws InterruptedException{
       int width = 1000;
       int height = 1000;
       int dragonprevx=0;
       int dragonx;
       int dragonprevy=0;
       int dragony;
       Color background;
       
       DrawingPanel panel = new DrawingPanel(width,height);
       Graphics g = panel.getGraphics();
       
       Scanner user = new Scanner(System.in);
       
       Scene sky = new Scene(width,height);
       background = sky.getskyColor();
       sky.drawScene(g);
       sky.drawGround(g);
       
       do{
           System.out.println("what do you want the x value to be");
           dragonx = user.nextInt();
        }
        while(dragonprevx == dragonx);
          
       
       Dragon draggy = new Dragon(background);
       
       draggy.drawDragon(g,"empty");
       
       Thread.sleep(3000);
       Dragon cheese = new Dragon(background, 500,300,2,Color.red);
       cheese.drawDragon(g,"empty");
       Thread.sleep(3000);
       cheese.growDragon(g);
       cheese.changeDragonColor(g, Color.BLUE);
       Thread.sleep(1000);
       cheese.moveDragon(g, 20);
       Thread.sleep(1000);
       cheese.fillDragon(g);
       
       
       
       System.out.println(draggy);
       System.out.println(cheese);
    }
}
