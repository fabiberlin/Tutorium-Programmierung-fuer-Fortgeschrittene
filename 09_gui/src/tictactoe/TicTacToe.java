package tictactoe;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

/*
 * adapted from https://stackoverflow.com/questions/40219583/tictactoe-with-java-swing
 */

public class TicTacToe extends JFrame {	

	public TicTacToe() {

		super("TicTacToe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 3));

		for (int i = 0; i < 9; i++) {
			SignLabel label = new SignLabel();
			label.setBorder(BorderFactory.createLineBorder(Color.black));
			p.add(label);
		}
		
		add(p);
		setVisible(true);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				TicTacToe t = new TicTacToe();
			}
		});
	}
}