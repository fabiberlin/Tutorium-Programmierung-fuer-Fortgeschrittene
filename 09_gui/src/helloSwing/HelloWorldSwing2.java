package helloSwing;

import java.awt.EventQueue;

import javax.swing.*;        
 
public class HelloWorldSwing2 extends JFrame{
	    
    public HelloWorldSwing2() {
    	
        super("HelloWorldSwing2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        getContentPane().add(label);
        
        pack();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override public void run() {
            	HelloWorldSwing2 helloWorldSwing2 = new HelloWorldSwing2();
            }
        });
    }
}