package tictactoe;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class SignLabel extends JLabel implements MouseListener {
	
	static boolean xoSwddditchValue = false;

	public SignLabel() {
		this.addMouseListener(this);
		//this.setOpaque(true);
		//this.setBackground(Color.blue);
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked");
		
		xoSwddditchValue = !xoSwddditchValue;
		
		if (getText().length() == 0) {
			if (xoSwddditchValue) {
				setText("X");
			} else {
				setText("O");
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseEntered");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseExited");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mousePressed");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseReleased");

	}
}