package Ventanas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Level1.Comic;

import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

public class PrimeraVentana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		 
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeraVentana frame = new PrimeraVentana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrimeraVentana() {
		this.setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Auschwitz Escape");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Who asks Satan", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel_1.setBounds(249, 11, 711, 100);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblExit = new JLabel("Exit");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setForeground(Color.RED);
				lblExit.setFont(new Font("DK Face Your Fears", Font.BOLD | Font.ITALIC, 80));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblExit.setForeground(Color.BLACK);
				lblExit.setFont(new Font("DK Face Your Fears", Font.BOLD | Font.ITALIC, 67));
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		lblExit.setForeground(Color.BLACK);
		lblExit.setFont(new Font("DK Face Your Fears", Font.BOLD | Font.ITALIC, 67));
		lblExit.setBounds(58, 601, 167, 50);
		contentPane.add(lblExit);
		
		JLabel lblPlay = new JLabel("Play");
		lblPlay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblPlay.setForeground(Color.RED);
				lblPlay.setFont(new Font("DK Face Your Fears", Font.BOLD | Font.ITALIC, 80));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblPlay.setForeground(Color.BLACK);
				lblPlay.setFont(new Font("DK Face Your Fears", Font.BOLD | Font.ITALIC, 61));
			}
			
			int contador = 0;
			public void mouseClicked(MouseEvent e) {
				final SeleccionPersonaje s = new SeleccionPersonaje();
				s.setVisible(true);
				dispose();
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

			
		});
		lblPlay.setForeground(Color.BLACK);
		lblPlay.setFont(new Font("DK Face Your Fears", Font.BOLD | Font.ITALIC, 61));
		lblPlay.setBounds(58, 526, 167, 50);
		contentPane.add(lblPlay);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(PrimeraVentana.class.getResource("/Ventanas/Fondo Proyecto.jpg")));
		lblNewLabel.setBounds(0, 0, 1362, 705);
		contentPane.add(lblNewLabel);
	}
}
