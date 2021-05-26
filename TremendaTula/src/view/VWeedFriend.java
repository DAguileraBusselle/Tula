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

public class VWeedFriend extends JFrame {

private static final long serialVersionUID = 1L;
	
	public URL frendURL = getClass().getResource("DoggFriend.wav");
	public static final String BTN_FREND_YES = "FUCK YEAH";
	public static final String BTN_FREND_NO = "Nah man I'm good";
	static final int ANCHO = 500;
	static final int ALTO = 300;

	private JButton btnFriendNo;
	private JLabel lblWeed;
	private JButton btnFriendYeah;
	private JLabel lblFrend;
	private JLabel lblFrend2;
	private JLabel lblFrend3;
	
	
	
	public VWeedFriend() {
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
		btnFriendNo.addActionListener(listener);
		btnFriendYeah.addActionListener(listener);
	}
	
	
	public void invocarSnoop() {
	
		int newAncho = 996;
		int newAlto = 746;
		setSize(newAncho, newAlto);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		btnFriendNo = new JButton(BTN_FREND_NO);
		btnFriendNo.setBounds(55, 632, 274, 23);
		getContentPane().add(btnFriendNo);
		
		btnFriendYeah = new JButton(BTN_FREND_YES);
		btnFriendYeah.setBounds(607, 632, 274, 23);
		getContentPane().add(btnFriendYeah);
		
		lblFrend = new JLabel("YOU KNOW WHAT, YOU'RE PRETTY COOL");
		lblFrend.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblFrend.setBounds(10, 6, 960, 61);
		getContentPane().add(lblFrend);
		
		lblFrend2 = new JLabel("SOMEONE WORTH BEING FRIENDS WITH...");
		lblFrend2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFrend2.setBounds(20, 63, 695, 40);
		getContentPane().add(lblFrend2);
		
		lblFrend3 = new JLabel("HOW ABOUT IT? WANNA BE MY FRIEND?");
		lblFrend3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFrend3.setBounds(22, 78, 542, 84);
		getContentPane().add(lblFrend3);
		
		lblWeed = new JLabel();
		lblWeed.setBounds(0, 0, 996, 746);
		lblWeed.setIcon(new ImageIcon(this.getClass().getResource("DoggFriend.jpg")));
		getContentPane().add(lblWeed);			
				
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = new Dimension(newAncho, newAlto);
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);

	}
}
