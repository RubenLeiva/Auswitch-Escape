package Level3;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Level1.Comic;

public class MovimientoG {


	private TimerTask tarea = null;
	int velocidad = 5;
	int velmil = velocidad * 100;
	int contador = 0;
	Movimiento m = new Movimiento();
	Timer timer;
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
				switch(contador){
				case 0:
					contador = 1;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura1B.png"));
					j.Cerradura.setIcon(icono);
					break;
				case 1:
					contador = 2;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura1M.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 2:
					contador = 3;
					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura1B.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 3:
					contador = 4;

					icono = new ImageIcon(getClass().getResource("/Level3/Cerradura1M.png"));	
					j.Cerradura.setIcon(icono);
					break;
				case 4:
					contador = 5;
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
	}

