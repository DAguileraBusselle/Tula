package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.TulaListener;

public class VAmongus extends JFrame {

	public URL amongassURL = getClass().getResource("Amongass.wav");
	private static final long serialVersionUID = 1L;
	static final int ANCHO = 500;
	static final int ALTO = 300;
	
	public static final String BTN_WHAT = ".... que?";
	private JButton btnWhat;
	public VAmongus() {
		init();
	}
	private void init() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(VAmongus.class.getResource("/view/Webp.net-resizeimage.jpg")));
		lblNewLabel.setBounds(81, 0, 308, 294);
		getContentPane().add(lblNewLabel);
		
		btnWhat = new JButton(BTN_WHAT);
		btnWhat.setBounds(191, 318, 89, 23);
		getContentPane().add(btnWhat);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(500, 404);
		
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
	
	public void setListener(TulaListener listener) {
		btnWhat.addActionListener(listener);
	}
}
