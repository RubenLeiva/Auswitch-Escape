package Ventanas;

import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CambioImagen {

	static int contador = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int velocidad = 5;
		
		Timer timer;
		TimerTask tarea;
		
		int velmil = velocidad * 100;
		SeleccionPersonaje cambio = new SeleccionPersonaje();
		cambio.setVisible(true);
		tarea = new TimerTask(){

			
		
			public void run() {
				
			
				Icon icono;
				if(cambio.KabiA.isVisible()==true){
					if(cambio.Kabi.isVisible()==false){
						switch(contador){
						case 0:
							contador = 1;
							icono = new ImageIcon(getClass().getResource("/Ventanas/kavi2.png"));	
							cambio.KabiA.setIcon(icono);
							break;
						case 1:
							contador = 2;
							icono = new ImageIcon(getClass().getResource("/Ventanas/kavi2.png"));	
							cambio.KabiA.setIcon(icono);
							break;
						case 2:
							contador = 3;
							icono = new ImageIcon(getClass().getResource("/Ventanas/kavi2.png"));	
							cambio.KabiA.setIcon(icono);
							break;
						case 3:
							contador = 4;
							icono = new ImageIcon(getClass().getResource("/Ventanas/kavi2.png"));	
							cambio.KabiA.setIcon(icono);
							break;
						case 4:
							contador = 5;
							icono = new ImageIcon(getClass().getResource("/Ventanas/kaviD0.png"));	
							cambio.KabiA.setIcon(icono);
							break;
						case 5:
							contador = 6;
							icono = new ImageIcon(getClass().getResource("/Ventanas/kaviD0.png"));	
							cambio.KabiA.setIcon(icono);
							break;
						case 6:
							contador = 7;
							icono = new ImageIcon(getClass().getResource("/Ventanas/kaviD2.png"));	
							cambio.KabiA.setIcon(icono);
							break;
						case 7:
							contador = 6;
							icono = new ImageIcon(getClass().getResource("/Ventanas/kaviD3.png"));	
							cambio.KabiA.setIcon(icono);
							break;
						}
					}else{
				switch(contador){
				case 0:
					contador = 1;
					icono = new ImageIcon(getClass().getResource("/Ventanas/kavi3.png"));	
					cambio.KabiA.setIcon(icono);
					break;
				case 1:
					contador = 0;
					icono = new ImageIcon(getClass().getResource("/Ventanas/kavi4.png"));	
					cambio.KabiA.setIcon(icono);
					break;
				
				}
				}
				} else if(cambio.WeguA.isVisible()==true){
					if(cambio.Wegu.isVisible()==false){
						switch(contador){
						
						case 0:
							contador = 1;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Wegu1.png"));	
							cambio.WeguA.setIcon(icono);
							break;
						case 1:
							contador = 2;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Wegu1.png"));	
							cambio.WeguA.setIcon(icono);
							break;
						case 2:
							contador = 3;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Wegu1.png"));	
							cambio.WeguA.setIcon(icono);
							break;
						case 3:
							contador = 4;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Wegu1.png"));	
							cambio.WeguA.setIcon(icono);
							break;
						case 4:
							contador = 5;
							icono = new ImageIcon(getClass().getResource("/Ventanas/WeguD1.png"));	
							cambio.WeguA.setIcon(icono);
							break;
						case 5:
							contador = 6;
							icono = new ImageIcon(getClass().getResource("/Ventanas/WeguD1.png"));	
							cambio.WeguA.setIcon(icono);
							break;
						case 6:
							contador = 7;
							icono = new ImageIcon(getClass().getResource("/Ventanas/WeguD2.png"));	
							cambio.WeguA.setIcon(icono);
							break;
						case 7:
							contador = 6;
							icono = new ImageIcon(getClass().getResource("/Ventanas/WeguD3.png"));	
							cambio.WeguA.setIcon(icono);
							break;
						}
						}else{
					switch(contador){
					case 0:
						contador = 1;
						icono = new ImageIcon(getClass().getResource("/Ventanas/Wegu2.png"));
						cambio.WeguA.setIcon(icono);
						break;
					case 1:
						contador = 0;
						icono = new ImageIcon(getClass().getResource("/Ventanas/Wegu3.png"));
						cambio.WeguA.setIcon(icono);
						break;
					}
					}
				}else if(cambio.TokinoA.isVisible()==true){
					if(cambio.Tokino.isVisible()==false){
						switch(contador){
						case 0:
							contador = 1;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Tokino1.png"));	
							cambio.TokinoA.setIcon(icono);
							break;
						case 1:
							contador = 2;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Tokino1.png"));	
							cambio.TokinoA.setIcon(icono);
							break;
						case 2:
							contador = 3;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Tokino1.png"));	
							cambio.TokinoA.setIcon(icono);
							break;
						case 3:
							contador = 4;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Tokino1.png"));	
							cambio.TokinoA.setIcon(icono);
							break;
						case 4:
							contador = 5;
							icono = new ImageIcon(getClass().getResource("/Ventanas/TokinoD1.png"));	
							cambio.TokinoA.setIcon(icono);
							break;
						case 5:
							contador = 6;
							icono = new ImageIcon(getClass().getResource("/Ventanas/TokinoD1.png"));	
							cambio.TokinoA.setIcon(icono);
							break;
						case 6:
							contador = 7;
							icono = new ImageIcon(getClass().getResource("/Ventanas/TokinoD2.png"));	
							cambio.TokinoA.setIcon(icono);
							break;
						case 7:
							contador = 6;
							icono = new ImageIcon(getClass().getResource("/Ventanas/TokinoD3.png"));	
							cambio.TokinoA.setIcon(icono);
							break;
						
						}
						}else{
					switch(contador){
					case 0:
						contador = 1;
						icono = new ImageIcon(getClass().getResource("/Ventanas/Tokino2.png"));
						cambio.TokinoA.setIcon(icono);
						break;
					case 1:
						contador = 0;
						icono = new ImageIcon(getClass().getResource("/Ventanas/Tokino3.png"));
						cambio.TokinoA.setIcon(icono);
						break;
					}
						}
				}else if(cambio.RudeA.isVisible()==true){
					if(cambio.Rude.isVisible()==false){
						switch(contador){
						case 0:
							contador = 1;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Rude1.png"));	
							cambio.RudeA.setIcon(icono);
							break;
						case 1:
							contador = 2;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Rude1.png"));	
							cambio.RudeA.setIcon(icono);
							break;
						case 2:
							contador = 3;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Rude1.png"));	
							cambio.RudeA.setIcon(icono);
							break;
						case 3:
							contador = 4;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Rude1.png"));	
							cambio.RudeA.setIcon(icono);
							break;
						case 4:
							contador = 5;
							icono = new ImageIcon(getClass().getResource("/Ventanas/RudeD1.png"));	
							cambio.RudeA.setIcon(icono);
							break;
						case 5:
							contador = 6;
							icono = new ImageIcon(getClass().getResource("/Ventanas/RudeD1.png"));	
							cambio.RudeA.setIcon(icono);
							break;
						case 6:
							contador = 7;
							icono = new ImageIcon(getClass().getResource("/Ventanas/RudeD2.png"));	
							cambio.RudeA.setIcon(icono);
							break;
						case 7:
							contador = 6;
							icono = new ImageIcon(getClass().getResource("/Ventanas/RudeD3.png"));	
							cambio.RudeA.setIcon(icono);
							break;
						}
					}else{
						
					switch(contador){
					case 0:
						contador = 1;
						icono = new ImageIcon(getClass().getResource("/Ventanas/Rude2.png"));
						cambio.RudeA.setIcon(icono);
						break;
					case 1:
						contador = 0;
						icono = new ImageIcon(getClass().getResource("/Ventanas/Rude3.png"));
						cambio.RudeA.setIcon(icono);

					}
					}
				}else if(cambio.YojikoA.isVisible()==true){
					if(cambio.Yojiko.isVisible()==false){
						switch(contador){
						case 0:
							contador = 1;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Yojiko1.png"));	
							cambio.YojikoA.setIcon(icono);
							break;
						case 1:
							contador = 2;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Yojiko1.png"));	
							cambio.YojikoA.setIcon(icono);
							break;
						case 2:
							contador = 3;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Yojiko1.png"));	
							cambio.YojikoA.setIcon(icono);
							break;
						case 3:
							contador = 4;
							icono = new ImageIcon(getClass().getResource("/Ventanas/Yojiko1.png"));	
							cambio.YojikoA.setIcon(icono);
							break;
						case 4:
							contador = 5;
							icono = new ImageIcon(getClass().getResource("/Ventanas/YojikoD1.png"));	
							cambio.YojikoA.setIcon(icono);
							break;
						case 5:
							contador = 6;
							icono = new ImageIcon(getClass().getResource("/Ventanas/YojikoD1.png"));	
							cambio.YojikoA.setIcon(icono);
							break;
						case 6:
							contador = 7;
							icono = new ImageIcon(getClass().getResource("/Ventanas/YojikoD2.png"));	
							cambio.YojikoA.setIcon(icono);
							break;
						case 7:
							contador = 6;
							icono = new ImageIcon(getClass().getResource("/Ventanas/YojikoD3.png"));	
							cambio.YojikoA.setIcon(icono);
							break;
						}
						}else{
					switch(contador){
					case 0:
						contador = 1;
						icono = new ImageIcon(getClass().getResource("/Ventanas/Yojiko2.png"));
						cambio.YojikoA.setIcon(icono);
						break;
					case 1:
						contador = 0;
						icono = new ImageIcon(getClass().getResource("/Ventanas/Yojiko3.png"));
						cambio.YojikoA.setIcon(icono);
						break;

					}
						}
				
				}
			}
			
		};
		
		timer = new Timer();
		timer.scheduleAtFixedRate(tarea, velmil, velmil);
	}

}
