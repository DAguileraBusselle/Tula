package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import control.TulaListener;

public class VWeed extends JFrame {

private static final long serialVersionUID = 1L;
	
	public URL battleURL = getClass().getResource("Battle.wav");
	public URL spearURL = getClass().getResource("SpearofJustice.wav");
	public static final String BTN_WEED = "...no?";
	static final int ANCHO = 500;
	static final int ALTO = 300;

	private JButton btnWeed;
	private JLabel lblWeed;
	
	
	
	public VWeed() {
		init();
		
		invocarSnoop();

	}
	private void init() {
		getContentPane().setLayout(null);
		
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
		btnWeed.addActionListener(listener);
	}
	
	
	public void invocarSnoop() {
	
		int newAncho = 996;
		int newAlto = 746;
		setSize(newAncho, newAlto);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		btnWeed = new JButton(BTN_WEED);
		btnWeed.setBounds(373, 498, 274, 23);
		getContentPane().add(btnWeed);
		
		lblWeed = new JLabel();
		lblWeed.setBounds(0, 0, 996, 746);
		lblWeed.setIcon(new ImageIcon(V666.class.getResource("/view/SummonDoggAngery.jpg")));
		getContentPane().add(lblWeed);	
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(newAncho, newAlto);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);

	}
	
	
	
	
}
