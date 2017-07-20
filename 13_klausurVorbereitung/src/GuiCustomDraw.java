

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.*;        
 
public class GuiCustomDraw extends JFrame{
	    
    public GuiCustomDraw() {
    	
        super("GuiCustomDraw");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setSize(200, 200);

        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
    	
    	g.clearRect(0, 0, getWidth(), getHeight());
    	
    	int radius = 40;
    	
    	g.setColor(Color.RED);
    	g.fillOval(getWidth()/2 -radius, getHeight()/2-radius, 2*radius, 2*radius);
    	
    	g.setColor(Color.BLACK);
    	g.drawOval(getWidth()/2 -radius, getHeight()/2-radius, 2*radius, 2*radius);
    	
    	g.setColor(Color.GREEN);
    	g.fillRect(getWidth()/2, getHeight()/2, 2*radius, radius);
    	
    	g.setColor(Color.BLACK);
    	char[] text = "Fabian".toCharArray();
    	g.drawChars(text, 0, text.length, getWidth()/2-radius, getHeight()/2);
    	    	

    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override public void run() {
            	GuiCustomDraw customDraw = new GuiCustomDraw();
            }
        });
    }
}
