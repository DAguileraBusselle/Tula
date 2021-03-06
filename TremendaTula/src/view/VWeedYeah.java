package view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import control.TulaListener;
import java.awt.Font;

public class VWeedYeah extends JFrame {

private static final long serialVersionUID = 1L;
	
	public URL yeURL = getClass().getResource("DoggYeah.wav");
	public static final String BTN_WEED_YEAH = "NICE SEE YOU LATER :D";
	static final int ANCHO = 500;
	static final int ALTO = 300;

	private JButton btnWeedNice;
	private JLabel lblWeed;
	
	
	
	public VWeedYeah() {
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
		btnWeedNice.addActionListener(listener);
	}
	
	
	public void invocarSnoop() {
	
		int newAncho = 996;
		int newAlto = 746;
		setSize(newAncho, newAlto);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		btnWeedNice = new JButton(BTN_WEED_YEAH);
		btnWeedNice.setBounds(339, 561, 274, 23);
		getContentPane().add(btnWeedNice);
			
		JLabel lblYeah = new JLabel("FUCK YEAH SEE YOU LATER BRO");
		lblYeah.setFont(new Font("Tahoma", Font.BOLD, 56));
		lblYeah.setBounds(10, 11, 960, 100);
		getContentPane().add(lblYeah);
		
		lblWeed = new JLabel();
		lblWeed.setBounds(0, 0, 996, 746);
		lblWeed.setIcon(new ImageIcon(this.getClass().getResource("DoggYeah.jpg")));
		getContentPane().add(lblWeed);	
		
	
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(newAncho, newAlto);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);

	}
}
