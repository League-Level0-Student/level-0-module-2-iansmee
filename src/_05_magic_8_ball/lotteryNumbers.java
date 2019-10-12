package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {
	public static void main(String[] args) {
		Random ran=new Random();
	
for (int j = 0; j < 5; j++) {
	int i=ran.nextInt(6);
	JOptionPane.showMessageDialog(null," "+i);
}	
	
	
	}
	
	
	
	
	
}
