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

public class VSexo extends JFrame {
	
	public URL sexoURL = getClass().getResource("sexo.wav");
	private static final long serialVersionUID = 1L;
	static final int ANCHO = 500;
	static final int ALTO = 300;
	
	public static final String BTN_SEXO = "....";
	private JButton btnSexo;
	public VSexo() {
		init();
	}
	private void init() {
		getContentPane().setLayout(null);
		
		
		JLabel lblSexo = new JLabel("New label");
		lblSexo.setIcon(new ImageIcon(VAmongus.class.getResource("/view/sexo.gif")));
		lblSexo.setBounds(88, 49, 308, 294);
		getContentPane().add(lblSexo);
		
		btnSexo = new JButton(BTN_SEXO);
		btnSexo.setBounds(0, 342, 484, 23);
		getContentPane().add(btnSexo);
		
		JLabel lblQueriasMas = new JLabel("ASI QUE QUERIAS MAS PILLIN");
		lblQueriasMas.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblQueriasMas.setBounds(39, 11, 484, 27);
		getContentPane().add(lblQueriasMas);
		
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
		btnSexo.addActionListener(listener);
	}
}

