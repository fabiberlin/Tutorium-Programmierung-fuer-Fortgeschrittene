package layouting;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;        
 
public class SwingLayouting extends JFrame{
	    
    public SwingLayouting() {
    	
        super("SwingLayouting");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JPanel statusPanel = new JPanel();
        statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.Y_AXIS));
        statusPanel.add(new JLabel("Some Status Information"));
        statusPanel.add(new JLabel("Some More Status Information"));       
        statusPanel.add(new JLabel("Really Important Status Information"));       
        getContentPane().add(statusPanel, BorderLayout.SOUTH);
        
        JPanel controlPanel = new JPanel();
        controlPanel.add(new JButton("Action"));
        controlPanel.add(new JButton("Action1"));
        controlPanel.add(new JButton("Action2"));
        controlPanel.add(new JSlider(0, 100, 50));
        getContentPane().add(controlPanel, BorderLayout.NORTH);
        
		try {
			BufferedImage image = ImageIO.read(new File("src/layouting/lena.png"));
			JLabel picLabel = new JLabel(new ImageIcon(image));
	        getContentPane().add(picLabel, BorderLayout.CENTER);
		} catch (IOException e) {
			e.printStackTrace();
		}        
        
        pack();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override public void run() {
            	SwingLayouting layouting = new SwingLayouting();
            }
        });
    }
}