package view;

import javax.swing.JFrame;

public class VCirculo extends JFrame {

	
	private static final long serialVersionUID = 1L;
	static final int ANCHO = 200;
	static final int ALTO = 150;

	public void init(int x, int y) {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(ANCHO, ALTO);
		
		
		setLocation(x, y);
		
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void hacerInvisible() {
		setVisible(false);
	}
}
//else if (cont ==) {
	//setLocation(,);
//}