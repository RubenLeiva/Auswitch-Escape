package Level3;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Level1.Comic;
import fin.VentanaRank;

public class MovimientoG {


	private TimerTask tarea = null;
	int velocidad = 5;
	int velmil = velocidad * 100;
	int contador = 0;
	int contador2 = 0;
	int contador3 = 0;
	Movimiento m = new Movimiento();
	VentanaRank vr = new VentanaRank();
	Timer timer;
	Object[] object ={"Sí, porfavor", "No, gracias"};
	public void ej(Juego3 j){
		
		
		tarea = new TimerTask(){

			public void run(){
				
				
				Icon icono;
				switch(contador){
				case 0:
					contador = 1;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura0B.png"));
					j.Cerradura.setIcon(icono);
					break;
				case 1:
					contador = 2;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura0M.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 2:
					contador = 3;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura0B.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 3:
					contador = 4;

					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura0M.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 4:
					contador = 5;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura1B.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 5:
					
					m.Inicio(j.Ganzua);
					break;

				}


				

			}
			
		};
		timer = new Timer();
		timer.scheduleAtFixedRate(tarea, velmil, velmil);
	}
	public void ejemplo(Juego3 j) {
		
		tarea = new TimerTask(){

			public void run(){
				
					
				Icon icono;
				switch(contador2){
				case 0:
					contador2 = 1;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura1B.png"));
					j.Cerradura.setIcon(icono);
					break;
				case 1:
					contador2 = 2;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura1M.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 2:
					contador2 = 3;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura1B.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 3:
					contador2 = 4;

					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura1M.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 4:
					contador2 = 5;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura2B.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 5:
					
					m.Inicio(j.Ganzua);
					break;

				}


				

			}
			
		};
		timer = new Timer();
		timer.scheduleAtFixedRate(tarea, velmil, velmil);
	}
	public void ejemplo3(Juego3 j) {
		
		tarea = new TimerTask(){

			public void run(){
				
					
				Icon icono;
				switch(contador3){
				case 0:
					contador3 = 1;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura2B.png"));
					j.Cerradura.setIcon(icono);
					break;
				case 1:
					contador3 = 2;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura2M.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 2:
					contador3 = 3;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura2B.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 3:
					contador3 = 4;

					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura2M.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 4:
					contador3 = 5;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura3B.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 5:
					contador3 = 6;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura3M.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "Vamos al ranking!", "Mensaje", JOptionPane.PLAIN_MESSAGE);
					contador3 = 7;
					break;
				case 7:
					vr.setVisible(true);
					j.dispose();
					break;
				}


				

			}
			
		};
		timer = new Timer();
		timer.scheduleAtFixedRate(tarea, velmil, velmil);
	}
	}

