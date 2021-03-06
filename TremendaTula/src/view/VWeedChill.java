package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.TulaListener;

public class VWeedChill extends JFrame {
private static final long serialVersionUID = 1L;
	
	public URL chillURL = getClass().getResource("Chill.wav");
	public static final String BTN_WCHILL = "OK bye :)";
	static final int ANCHO = 500;
	static final int ALTO = 300;
	private JButton btnWeedChill;
	private JLabel lblWeed;

	public VWeedChill() {
		init();
		
		invocarSnoop();

	}
	private void init() {
						
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(ANCHO, ALTO);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
		
		setSize(ANCHO, ALTO);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void hacerInvisible() {
		setVisible(false);
	}
	
	public void setListener(TulaListener listener) {
		btnWeedChill.addActionListener(listener);
	}
	
	
	public void invocarSnoop() {
	
		int newAncho = 996;
		int newAlto = 746;
		setSize(newAncho, newAlto);
		

		btnWeedChill = new JButton(BTN_WCHILL);
		btnWeedChill.setBounds(373, 498, 274, 23);
		add(btnWeedChill);
		
		lblWeed = new JLabel();
		lblWeed.setBounds(10, 20, 996, 746);
		lblWeed.setIcon(new ImageIcon(V666.class.getResource("/view/SummonDoggChill.jpg")));
		add(lblWeed);	
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(newAncho, newAlto);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
	}
	
}