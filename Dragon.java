import java.awt.*;
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private Color c;

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 200;
        y = 300;
        size = 1;
        c = Color.black; // INS comment here.
    }
    public Dragon(int x,int y, int size, Color c){
        this.x = x;
        this.y = y;
        this.size = size;
        this.c = c; // You saw nothing.
    }
        
    
    /**
     * Overloaded Constructors go here
     */

    /** 
     * Accessor Methods
     */
    /**
     * drawDragon(Graphics g)
     * Starting of drawing, complete your Dragon....
     */
    public void drawDragon(Graphics g)
    {
        int bodySizehw = size*25;
        int necksquareh = bodySizehw / 5;
        int necksquarew = bodySizehw / 3;
        int neckBeginy = y - necksquareh + (bodySizehw /5);
        int neckBeginx = x+(bodySizehw - (bodySizehw /10));
        int cloneneckx= neckBeginx;
        int clonenecky= neckBeginy;
        int totalwidth = 0;
        int totalheight = 0;
        g.setColor(c); // Watermelon Dragon.
        g.drawOval(x, y, bodySizehw, bodySizehw);
        totalwidth += bodySizehw;
        totalheight += bodySizehw;
        g.drawRect(neckBeginx, neckBeginy, necksquarew, necksquareh);
        totalwidth += necksquarew;
        totalheight +=necksquareh;
        cloneneckx -= (necksquarew/3);
        for(int n = 1; n <= 2; n++){
            cloneneckx += necksquarew;
            clonenecky -= necksquareh;
            g.drawRect(cloneneckx, clonenecky, necksquarew, necksquareh);
            totalwidth += necksquarew;
            totalheight += necksquareh;
            cloneneckx -= (necksquarew/3);
        }
        int headbaseh = necksquareh*3;
        int headbasew = necksquarew*3;
        int headbasex= cloneneckx + necksquarew;
        int headbasey = clonenecky - (headbaseh);
        g.drawRect(headbasex, headbasey, headbasew, headbaseh);
        totalheight +=headbaseh;
        totalwidth += headbasew;
        int headmouthh = headbaseh/3;
        int headmouthw = headbasew - (headbasew/3);
        int headmouthx = headbasex + (headbasew/3);
        int headmouthy = headbasey + (headbaseh);
        g.drawRect(headmouthx, headmouthy, headmouthw, headmouthh);
        for(int z =0; z<=2; z++){
            int mouthsep = headmouthw/3;
            int sep1 = headmouthx + (mouthsep*z);
            int sep2 = sep1 + (mouthsep/2);
            int sep3 = sep1 + mouthsep;
            int teethx[] = {sep1, sep2, sep3};
            int teethy[] = {headmouthy,(headmouthy+headmouthh),headmouthy};
            g.fillPolygon(teethx, teethy, 3);
        }
        int leg1startx = x+(bodySizehw/3);
        int leg1starty = y + bodySizehw;
        int leg1endx = x+(bodySizehw/3);
        int leg1endy = leg1starty + bodySizehw;
        int leg2startx = leg1startx +(bodySizehw/3);
        int leg2starty = leg1starty;
        int leg2endx = leg2startx;
        int leg2endy = leg1endy;
        g.drawLine(leg1startx, leg1starty, leg1endx, leg1endy);
        totalheight += (leg1endy - leg1starty);
        g.drawLine(leg2startx, leg2starty, leg2endx, leg2endy);
        int feet1startx = leg1endx;
        int feet1starty = leg1endy;
        int feet1endx = leg2endx;
        int feet1endy = leg2endy +(bodySizehw/6);;
        int feet2startx = leg2endx;
        int feet2starty = leg2endy;
        int feet2endx = leg2endx +(bodySizehw/3);
        int feet2endy = leg2endy+(bodySizehw/6);;
        g.drawLine(feet1startx, feet1starty, feet1endx, feet1endy);
        totalheight += (feet1endy - feet1starty);
        g.drawLine(feet2startx, feet2starty, feet2endx, feet2endy);
    }
    
    public void clearDragon(Graphics g){
        int clearRectx = x;
        int clearRecty = headbasey;
        int clearRectw = totalwidth;
        int clearRecth = totalheight;
    }
    /**
     * Mutator Methods
     */
    
    /**
     * toString
     */
    public String toString(){
        return "x coor: " + x + " y coord: " + y + " size: " + size + " Color: " + c;
    }
}