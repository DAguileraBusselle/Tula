package main;

import java.awt.EventQueue;

import control.TulaListener;

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

public class Inicio {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						
						VPTula vpt = new VPTula();
						VAmongus va = new VAmongus();
						V666 v6 = new V666();
						VCagaste vc = new VCagaste();
						VWeed vw = new VWeed();
						VWeedChill pwc = new VWeedChill();
						VPetaCulos vpc = new VPetaCulos();
						VSexo vsex = new VSexo();
						PlayMusic pm = new PlayMusic();
						VWeedFriend vwf = new VWeedFriend();
						VWeedSad vws = new VWeedSad();
						VWeedYeah vwy = new VWeedYeah();
						VWeedChoose vww = new VWeedChoose();
						
						TulaListener listener = new TulaListener(vpt, va, v6, vc, vw, pwc, vpc, pm, vsex, 
								vwf, vws, vwy, vww);
						
						vpt.setListener(listener);
						va.setListener(listener);
						vc.setListener(listener);
						vw.setListener(listener);
						pwc.setListener(listener);
						vsex.setListener(listener);
						vwf.setListener(listener);
						vws.setListener(listener);
						vwy.setListener(listener);
						vww.setListener(listener);
						
						
						
						vpt.hacerVisible();
			}
		});
	}
}
