package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.VWeedChill;
import view.VWeedChoose;
import view.VWeedSad;
import view.VWeedFriend;
import view.VWeedYeah;
import view.PlayMusic;
import view.V666;
import view.VAmongus;
import view.VCagaste;
import view.VPTula;
import view.VPetaCulos;
import view.VSexo;
import view.VWeed;

public class TulaListener implements ActionListener {


	private VPTula vpt;
	private VAmongus va;
	private V666 v6;
	private VCagaste vc;
	private VWeed vw;
	private VWeedChill vwc;
	private VPetaCulos vpc;
	private PlayMusic pm;
	private VSexo vs;
	private VWeedFriend vwf;
	private VWeedSad vwd;
	private VWeedYeah vwy;
	private VWeedChoose vww;
	//private VCirculo vcir;
	
	private static int contSexo = 0;
	private static int contWeed = 3;
	private static int cont147 = 0;
	
	public TulaListener(VPTula vpt, VAmongus va, V666 v6, VCagaste vc, VWeed vw, VWeedChill vwc,
			VPetaCulos vpc, PlayMusic pm, VSexo vs, VWeedFriend vwf, VWeedSad vws, VWeedYeah vwy, 
			VWeedChoose vww) {
		
		this.vpt = vpt; this.va = va; this.v6 = v6;
		this.vc = vc; this.vw = vw; this.vwc = vwc;
		this.vpc = vpc; this.pm = pm; this.vs = vs;
		this.vwf = vwf; this.vwd = vws; this.vwy = vwy;
		this.vww = vww;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ev) {
		
		System.setProperty("java.awt.headless", "true");
		if (ev.getSource() instanceof JButton) {
			if (ev.getActionCommand().equals(VPTula.BTN_EVALUAR)) {
//CODIGO SECRETO (147)				
				if (vpt.getLongitud()== 1) {
					cont147 = 1;
				} else if (vpt.getLongitud() == 4 && cont147 == 1) {
					cont147 ++;
				} else if (vpt.getLongitud() == 7 && cont147 == 2) {
					vpt.mostrarMsj("hola buenas");
				} else {
					cont147 = 0;
				}
// NO HAY TULA				
				if (vpt.getLongitud() == 0) {
					vpt.mostrarMsjInfo("No hay tula");					
//   147				
				} else if (vpt.getLongitud() == 147) {
					vpt.mostrarMsjInfo("...");
					vpt.mostrarMsjInfo("no");
					System.exit(0);
//    69					
				} else if (vpt.getLongitud() == 69) {
					if (contSexo == 1) {
						System.out.println("im in");
						vpt.dispose();
						vs.hacerVisible();
						pm.playSound(vs.sexoURL);
					} else {
						System.out.println("not in");
						vpt.dispose();
						va.hacerVisible();
						pm.playSound(va.amongassURL);
						contSexo++;
					}
//   666					
				} else if (vpt.getLongitud() == 666) { 
					vpt.dispose();
					vc.hacerVisible();	
//   420					
				} else if (vpt.getLongitud() == 420) {					
					if (contWeed == 3) {
						vpt.mostrarMsj("Este es un camino peligroso, date la vuelta ahora mismo");
						contWeed--;
					} else if (contWeed == 2) {
						vpt.mostrarMsj("No te pienso volver a avisar");
						contWeed--;
					} else if (contWeed == 1) {
						vpt.mostrarMsj("...");
						contWeed--;
					}
					else if (contWeed == 0) {
						vpt.mostrarMsj("T? te lo has buscado");
						vpt.mostrarMsj("Ahora tu destino esta sellado");
						vpt.mostrarMsj("Preparate...");
						pm.playSound(vw.battleURL);
						vpt.mostrarMsj("...");
						vpt.dispose();					
						vw.hacerVisible();
						pm.playSound(vw.spearURL);
					} else if (contWeed == -2) {
						vpt.mostrarMsj("...");
						pm.playSound(vwf.frendURL);
						vpt.mostrarMsj("Despues de todo lo que ha hecho...");
						vpt.mostrarMsj("Sigues queriendo verle...");
						vpt.mostrarMsj("Muy bien");
						vpt.dispose();
						vwf.hacerVisible();
					} else if (contWeed ==-3) {
						pm.playSound(vww.chooseURL);
						vpt.dispose();
						vww.hacerVisible();
					} else if (contWeed == -1) {
						vpt.mostrarMsj("...");
					}
					
				} /*else if (vpt.getLongitud() == 360) {
					int contCirculo =0;
					int x =0;
					int y =0;
					while (contCirculo < 20) {
						contCirculo++;
						
						System.out.println(contCirculo);
						vcir.init(x, y);
						vcir.hacerVisible();
						vcir.dispose();
					} 
					//contCirculo = 0;
// CHIKITA TULA				
				}*/ else if (vpt.getLongitud() <= 5) {
					vpt.mostrarMsjInfo("Bueno... hay tula");
// TREMENDA TULA				
				} else if (vpt.getLongitud() > 5) {
					vpt.mostrarMsjInfo("Tremenda tula");
				} 
				vpt.limpiarComponentes();
			} else if (ev.getActionCommand().equals(VAmongus.BTN_WHAT)) {
				pm.endSound();
				va.dispose();
				vpt.hacerVisible();
			} else if (ev.getActionCommand().equals(VCagaste.BTN_CAGASTE)) {
				vc.dispose();
				
				pm.playSound(v6.cagasteURL);
				int contCagaste = 0;
				while (contCagaste < 666) {
					vpc.init();
					vpc.hacerVisible();
					vpc.dispose();
					contCagaste++;
				}
				v6.hacerVisible();
				pm.endSound();
				pm.playSound(v6.six66URL);
			} else if (ev.getActionCommand().equals(VWeed.BTN_WEED)) {
				pm.endSound();
				vw.dispose();
				vwc.hacerVisible();
				pm.playSound(vwc.chillURL);
			} else if (ev.getActionCommand().equals(VWeedChill.BTN_WCHILL)) {
				vwc.dispose();
				vpt.hacerVisible();
				pm.endSound();
				contWeed=-2;
			} else if (ev.getActionCommand().equals(VSexo.BTN_SEXO)) {
				vs.dispose();
				vpt.hacerVisible();
				pm.endSound();
			} else if (ev.getActionCommand().equals(VWeedFriend.BTN_FREND_YES)) {
				pm.endSound();
				vwf.dispose();
				vwy.hacerVisible();
				pm.playSound(vwy.yeURL);
				contWeed=-3;
			} else if (ev.getActionCommand().equals(VWeedYeah.BTN_WEED_YEAH)) {
				pm.endSound();
				vwy.dispose();
				vpt.hacerVisible();
			} else if (ev.getActionCommand().equals(VWeedFriend.BTN_FREND_NO)) {
				pm.endSound();
				vwf.dispose();
				vwd.hacerVisible();
				pm.playSound(vwd.dieURL);
			} else if (ev.getActionCommand().equals(VWeedSad.BTN_SAD)) {
				pm.endSound();
				contWeed = -1;
				vwd.dispose();
				vpt.hacerVisible();
			} else if (ev.getActionCommand().equals(VWeedChoose.BTN_WEED_CHOOSE)) {
				pm.endSound();
				vww.dispose();
				vpt.hacerVisible();
			}
		} 
				
		
	}
	

}
