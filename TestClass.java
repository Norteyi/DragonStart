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
       int dragonx = 0;
       int dragonprevy=0;
       int dragony = 0;
       int dragonsize = 0;
       int dragonnum =0;
       boolean dColor = false;
       String dColors = null;

       ArrayList<Dragon> dragonList = new ArrayList<Dragon>();
       Color background;
       Color dragonColor = null;
       
       DrawingPanel panel = new DrawingPanel(width,height);
       Graphics g = panel.getGraphics();
       
       Scanner user = new Scanner(System.in);
       
       Scene sky = new Scene(width,height);
       background = sky.getskyColor();
       sky.drawScene(g);
       sky.drawGround(g);
       do {
           System.out.println("How many dragons do you want (1-3)");
           dragonnum = user.nextInt();
       }
       while(dragonnum != 1 && dragonnum !=2 && dragonnum != 3);
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
                dColors = user.nextLine();
                if(dColors.equals("blue") || dColors.equals("BLUE")){
                    dragonColor = Color.blue;
                    dColor = true;
                }
                
                if(dColors.equals("red") || dColors.equals("RED")){
                    dragonColor = Color.red;
                    dColor = true;
                }
              
                if(dColors.equals("green") ||dColors.equals("GREEN")){
                    dragonColor = Color.green;
                    dColor = true;
                }
            }
            while(dColor == false);
            if(x==1) {
                dragonList.add(new Dragon(background, dragonx, dragony, dragonsize, dragonColor));
            }
            if(x==2) {
                dragonList.add(new Dragon(background, dragonx, dragony, dragonsize, dragonColor));
            }
            if(x==3) {
                dragonList.add(new Dragon(background, dragonx, dragony, dragonsize, dragonColor));
            }
        }    
        for(int x = 0; x<dragonnum; x++) {
            dragonList.get(x).drawDragon(g, "empty");
        }
        Thread.sleep(3000);
        for(int x = 0; x<dragonnum; x++) {
            dragonList.get(x).growDragon(g);
        }
        for(int x = 0; x<dragonnum; x++) {
            dragonList.get(x).changeDragonColor(g, Color.BLUE );
        }
        Thread.sleep(1000);
        for(int x = 0; x<dragonnum; x++) {
            dragonList.get(x).moveDragon(g, 20);
        }
        Thread.sleep(1000);
        for(int x = 0; x<dragonnum; x++) {
            dragonList.get(x).fillDragon(g);
        }           
        for(int x = 0; x<dragonnum; x++) {
            System.out.println(dragonList.get(x));
        }       
        speakingDragon talky = new speakingDragon(background);
        talky.drawdragon();
        String text = talky.setText("hi guys");
        talky.speak();
    }
}
