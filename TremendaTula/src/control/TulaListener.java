package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.VWeedChill;
import view.V666;
import view.VAmongus;
import view.VCagaste;
import view.VPTula;
import view.VPetaCulos;
import view.VWeed;

public class TulaListener implements ActionListener {


	private VPTula vpt;
	private VAmongus va;
	private V666 v6;
	private VCagaste vc;
	private VWeed vw;
	private VWeedChill vwc;
	private VPetaCulos vpc;
	
	public TulaListener(VPTula vpt, VAmongus va, V666 v6, VCagaste vc, VWeed vw, VWeedChill vwc,
			VPetaCulos vpc) {
		
		this.vpt = vpt;
		this.va = va;
		this.v6 = v6;
		this.vc = vc;
		this.vw = vw;
		this.vwc = vwc;
		this.vpc = vpc;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ev) {
		System.setProperty("java.awt.headless", "true");
		if (ev.getSource() instanceof JButton) {
			if (ev.getActionCommand().equals(VPTula.BTN_EVALUAR)) {
				if (vpt.getLongitud() == 0) {
					vpt.mostrarMsjInfo("No hay tula");					
				} else if (vpt.getLongitud() == 147) {
					vpt.mostrarMsjInfo("...");
					vpt.mostrarMsjInfo("no");
					System.exit(0);
				} else if (vpt.getLongitud() == 69) {
					vpt.dispose();
					va.hacerVisible();
				} else if (vpt.getLongitud() == 666) { 
					vpt.dispose();
					vc.hacerVisible();					
				} else if (vpt.getLongitud() == 420) {					
					vpt.mostrarMsj("No deberias haber hecho eso");
					vpt.mostrarMsj("Ahora tu destino esta sellado");
					vpt.mostrarMsj("Preparate...");
					vpt.mostrarMsj("...");
					vpt.dispose();					
					vw.hacerVisible();
					vw.playSound();
				} else if (vpt.getLongitud() <= 5) {
					vpt.mostrarMsjInfo("Bueno... hay tula");
				} else if (vpt.getLongitud() > 5) {
					vpt.mostrarMsjInfo("Tremenda tula");
				}
				vpt.limpiarComponentes();
			} else if (ev.getActionCommand().equals(VAmongus.BTN_WHAT)) {
				va.dispose();
				vpt.hacerVisible();
			} else if (ev.getActionCommand().equals(VCagaste.BTN_CAGASTE)) {
				vc.dispose();
				v6.hacerVisible();
				int contCagaste = 0;
				while (contCagaste < 200) {
					vpc.init();
					vpc.hacerVisible();
					vpc.dispose();
					contCagaste++;
				}
				
				
			} else if (ev.getActionCommand().equals(VWeed.BTN_WEED)) {
				vw.endSound();
				vw.dispose();
				vwc.hacerVisible();
			} else if (ev.getActionCommand().equals(VWeedChill.BTN_WCHILL)) {
				vwc.dispose();
				vpt.hacerVisible();
			}
		}
				
		
	}
	

}
