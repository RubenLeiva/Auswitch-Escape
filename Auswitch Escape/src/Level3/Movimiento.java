package Level3;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Movimiento extends JPanel implements Runnable{

	/**
	 * Create the panel.
	 */
	public JLabel Ganzu;
	int x = 15;
	Thread hilo;
	public Movimiento() {
		hilo = new Thread(this);
		
	}
	
	public void Ganzu(){
		
		Ganzu = new JLabel("");
		Ganzu.setIcon(new ImageIcon(Movimiento.class.getResource("/Level3/Ganzua1.png")));
		Ganzu.setBounds(23, 101, 155, 138);
		add(Ganzu);
	}
	
	public void Inicio(JLabel ganzua){
		Ganzu = ganzua;
		if(! activo){
		hilo.start();
		activo = true;
		}else{
			seguir(ganzua);
		}
	
	}
	@SuppressWarnings("deprecation")
	public void Parar(JLabel ganzua){
		Ganzu = ganzua;
		pausa= true;
		hilo.stop();
	

	}
	
	public void seguir(JLabel ganzua){
		Ganzu = ganzua;
		//hilo.resume();
		pausa = false;

	}
	private boolean activo = false;
	private boolean pausa = false;
	public void run(){
		try{
		while(true){
			if(!pausa){
				while(x<940){
					Thread.sleep(50);
					x+=30;
					Ganzu.setLocation(x, Ganzu.getY());
				
				} while (x>0){
					Thread.sleep(50);
					x-=30;
					Ganzu.setLocation(x, Ganzu.getY());
				}
				
				}
			Thread.sleep(50);
		}
	
			
		}catch(Exception e){
	System.out.println("Algo has hecho mal");
}
}
}
