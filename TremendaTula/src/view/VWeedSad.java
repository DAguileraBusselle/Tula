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

public class VWeedSad extends JFrame {

private static final long serialVersionUID = 1L;
	
	public URL dieURL = getClass().getResource("DoggSad.wav");
	public static final String BTN_SAD = "OH FU-";
	static final int ANCHO = 500;
	static final int ALTO = 300;

	private JButton btnWeed;
	private JLabel lblWeedSad;
	
	
	
	public VWeedSad() {
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
		btnWeed = new JButton(BTN_SAD);
		btnWeed.setBounds(344, 612, 274, 23);
		getContentPane().add(btnWeed);
		
		JLabel lblSad = new JLabel("FUCK YOU MAN");
		lblSad.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblSad.setBounds(656, 241, 867, 91);
		getContentPane().add(lblSad);
		
		lblWeedSad = new JLabel();
		lblWeedSad.setBounds(0, 0, 996, 746);
		lblWeedSad.setIcon(new ImageIcon(this.getClass().getResource("DoggSad.jpg")));
		getContentPane().add(lblWeedSad);	
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(newAncho, newAlto);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);

	}
	
	
	
	
}
