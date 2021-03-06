package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import control.TulaListener;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class VCagaste extends JFrame {


	private static final long serialVersionUID = 1L;
	
	public static final String BTN_CAGASTE = "c̴̟̫̟̒̚a̵͕̘̾̔̕͜g̸͓̦͊̈́͜͝a̵͎̘̘͆̔ș̸͎͕̀̓t̵̢̡͔̾́̒e̸̡͖̪͛̿̿";
	static final int ANCHO = 500;
	static final int ALTO = 300;
	private JButton btnCagaste;
	
	public VCagaste() {
		init();
	}
	private void init() {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(381, 265);
		
		ImageIcon elDiablo = new ImageIcon("666.bmp");
		btnCagaste = new JButton(BTN_CAGASTE);
		btnCagaste.setFont(new Font("Tahoma", Font.PLAIN, 46));
		btnCagaste.setIcon(elDiablo);
		btnCagaste.setBounds(0, 0, 365, 226);
		btnCagaste.setBackground(Color.RED);
		getContentPane().add(btnCagaste);
		
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
		btnCagaste.addActionListener(listener);
	}
}
