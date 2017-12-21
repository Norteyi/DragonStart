import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;
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
       int dragonsize;
       int dragonnum;
       boolean dColor = false;
       String[] colorList = {"blue","BLUE", "red", "RED", "GREEN", "green"};
       ArrayList<Dragon> dragonList = new ArrayList<Dragon>();
       Color background;
       Color dragonColor;
       
       DrawingPanel panel = new DrawingPanel(width,height);
       Graphics g = panel.getGraphics();
       
       Scanner user = new Scanner(System.in);
       
       Scene sky = new Scene(width,height);
       background = sky.getskyColor();
       sky.drawScene(g);
       sky.drawGround(g);
       
       System.out.println("How many dragons do you want (1-3)");
       dragonnum = user.nextInt();
       for(int x = 1; x<= dragonnum; x++){
           do{
               System.out.println("what do you want the x starting coordinate to be");
               dragonx = user.nextInt();
            }
            while(dragonprevx == dragonx);
            dragonprevx = dragonx;
       
            do{
                System.out.println("what do you want the y starting coordinate to be");
                dragony = user.nextInt();
            }
            while(dragonprevy == dragony);
            dragonprevy = dragony;
       
            do{
                System.out.println("What size do you want your dragon to be 1 or 2");
                dragonsize = user.nextInt();
            }
            while(dragonsize != 1 && dragonsize != 2);
            
            do{
                dColor = false;
                System.out.println("What color do you want your dragon to be? Blue Green or Red");
                dColor = user.nextLine();
                if(dColor = "blue" || "BLUE"){
                    dragonColor = Color.blue;
                    dColor = true;
                }
                
                if(dColor = "red" || "RED"){
                    dragonColor = Color.red;
                    dColor = true;
                }
              
                if(dColor = "green" || "green"){
                    dragonColor = Color.blue;
                    dColor = true;
                }
            }
            while(dColor == false);
        }
       
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
