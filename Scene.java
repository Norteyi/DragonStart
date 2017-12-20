import java.awt.*;
/**
 * Write a description of class scene here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scene
{
    // instance variables - replace the example below with your own
    private int height;
    private int width;
    private Color skyColor = Color.cyan;

    /**
     * Constructor for objects of class scene
     */
    public Scene(int pheight, int pwidth)
    {
        // initialise instance variables
        height = pheight;
        width = pwidth;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void drawScene(Graphics g)
    {
        g.setColor(skyColor);
        g.fillRect(0,0,height,width);
    }
    
    public Color getskyColor(){
        Color gskyColor = skyColor;
        return gskyColor;
    }
    
    public void drawGround(Graphics g){
        Color brown = new Color(139, 69, 19);
        g.setColor(brown);
        g.fillRect(0,570,width,height-570);
        
    } 
    
    
        
}
