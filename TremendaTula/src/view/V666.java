package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class V666 extends JFrame {

	private static final long serialVersionUID = 1L;
	static final int ANCHO = 1835;
	static final int ALTO = 1080;

	public V666() {
		init();
	}
	private void init() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(V666.class.getResource("/view/666.jpg")));
		lblNewLabel.setBounds(0, 0, 1815, 1060);
		getContentPane().add(lblNewLabel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(1835, 1080);
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(ANCHO, ALTO);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void hacerInvisible() {
		setVisible(false);
	}

}
