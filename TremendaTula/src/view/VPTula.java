package view;

import javax.swing.JFrame;
import javax.swing.JSpinner;

import control.TulaListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.KeyListener;

public class VPTula extends JFrame {
	
	private static final long serialVersionUID = 1L;
	static final int ANCHO = 500;
	static final int ALTO = 300;
	
	public static final String BTN_EVALUAR = "EVALUAR";
	private JSpinner spinner;
	private JButton btnEvaluar;
	
	public VPTula() {
		init();
	}

	@SuppressWarnings("deprecation")
	private void init() {
		getContentPane().setLayout(null);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setBounds(288, 89, 51, 20);
		getContentPane().add(spinner);
		
		JLabel lblDaniTula = new JLabel("Introduzca longitud de pene (cm):");
		lblDaniTula.setBounds(24, 92, 254, 14);
		getContentPane().add(lblDaniTula);
		
		btnEvaluar = new JButton(BTN_EVALUAR);
		btnEvaluar.setBounds(164, 162, 89, 23);
		getContentPane().add(btnEvaluar);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(ANCHO, ALTO);
		
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
		btnEvaluar.addActionListener(listener);
	}
	
	public void setKeyListener(KeyListener key) {
		spinner.addKeyListener(key);
	}
	
	public int getLongitud() {
		return (int) spinner.getValue();
	}

	public void mostrarMsjInfo(String msj) {
		JOptionPane.showMessageDialog(this, msj, "Informacion de tula", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarMsj(String msj) {
		JOptionPane.showMessageDialog(this, msj, "", JOptionPane.WARNING_MESSAGE);
	}
	
	public void limpiarComponentes() {
		spinner.setValue(0);
	}

	
}
