package view;


import java.awt.Color;
import java.util.Random;


import javax.swing.JFrame;

public class VPetaCulos extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public VPetaCulos() {
		init();
	}
	public void init() {
		getContentPane().setLayout(null);
		setBackground(Color.RED);
		
		Random rd = new Random();
		Random rd2 = new Random();
		
		int x = rd.nextInt(1920 - 0) + 0;
		int y = rd.nextInt(1080 - 0) + 0;
		
		int ancho = rd2.nextInt(1920 - 0) + 0;
		int alto = rd2.nextInt(1080 - 0) + 0;
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(ancho, alto);
				
		setLocation(x, y);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void hacerInvisible() {
		setVisible(false);
	}


}
