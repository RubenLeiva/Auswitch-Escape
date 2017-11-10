package Ventanas;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Frame;

public class SeleccionPersonaje extends JFrame {

	private JPanel contentPane;
	private JLabel flechaizqP;
	private JLabel flechaizq;
	private JLabel flechader;
	private JLabel flechaderP;
	public JLabel KabiA;
	public JLabel TokinoA;
	public JLabel WeguA;
	public JLabel RudeA;
	public JLabel YojikoA;
	public JLabel Yojiko;
	public JLabel Kabi;
	public JLabel Tokino;
	public JLabel Wegu;
	public JLabel Rude;
	private JLabel lblChooseYourSpy;
	
	/**
	 * Launch the application.
	 */

	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionPersonaje frame = new SeleccionPersonaje();
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
	public SeleccionPersonaje() {
		
		
		
		this.setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		flechader = new JLabel("New label");
		flechader.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				flechader.setVisible(false);
				flechaderP.setVisible(true);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			if(KabiA.isVisible()){
				KabiA.setVisible(false);
				TokinoA.setVisible(true);
				RudeA.setVisible(false);	
				WeguA.setVisible(false);
				YojikoA.setVisible(false);
				Kabi.setVisible(false);
				Tokino.setVisible(true);
				Rude.setVisible(false);	
				Wegu.setVisible(false);
				Yojiko.setVisible(false);
			}else if(TokinoA.isVisible()){
				KabiA.setVisible(false);
				TokinoA.setVisible(false);
				RudeA.setVisible(true);	
				WeguA.setVisible(false);
				YojikoA.setVisible(false);
				Kabi.setVisible(false);
				Tokino.setVisible(false);
				Rude.setVisible(true);	
				Wegu.setVisible(false);
				Yojiko.setVisible(false);
				
			}else if(RudeA.isVisible()){
				KabiA.setVisible(false);
				TokinoA.setVisible(false);
				RudeA.setVisible(false);	
				WeguA.setVisible(true);
				YojikoA.setVisible(false);
				Kabi.setVisible(false);
				Tokino.setVisible(false);
				Rude.setVisible(false);	
				Wegu.setVisible(true);
				Yojiko.setVisible(false);
			
			}else if(WeguA.isVisible()){
				KabiA.setVisible(false);
				TokinoA.setVisible(false);
				RudeA.setVisible(false);	
				WeguA.setVisible(false);
				YojikoA.setVisible(true);
				Kabi.setVisible(false);
				Tokino.setVisible(false);
				Rude.setVisible(false);	
				Wegu.setVisible(false);
				Yojiko.setVisible(true);
				
			}else if(YojikoA.isVisible()){
				KabiA.setVisible(true);
				TokinoA.setVisible(false);
				RudeA.setVisible(false);	
				WeguA.setVisible(false);
				YojikoA.setVisible(false);
				Kabi.setVisible(true);
				Tokino.setVisible(false);
				Rude.setVisible(false);	
				Wegu.setVisible(false);
				Yojiko.setVisible(false);
				
			}
			
			}
		});
		flechader.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				flechader.setVisible(true);
				flechaderP.setVisible(false);
			}
		});
		flechader.setIcon(new ImageIcon(SeleccionPersonaje.class.getResource("/Ventanas/depositphotos_9818868-stock-photo-red-grunge-arrow.png")));
		flechader.setBounds(822, 450, 156, 67);
		contentPane.add(flechader);
		
		 flechaizq = new JLabel("New label");
		flechaizq.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				flechaizq.setVisible(false);
				flechaizqP.setVisible(true);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(KabiA.isVisible()){
					KabiA.setVisible(false);	
					TokinoA.setVisible(false);
					RudeA.setVisible(false);
					WeguA.setVisible(false);
					YojikoA.setVisible(true);
					Kabi.setVisible(false);
					Tokino.setVisible(false);
					Rude.setVisible(false);	
					Wegu.setVisible(false);
					Yojiko.setVisible(true);

				}else if(TokinoA.isVisible()){
					KabiA.setVisible(true);	
					TokinoA.setVisible(false);
					RudeA.setVisible(false);
					WeguA.setVisible(false);
					YojikoA.setVisible(false);
					Kabi.setVisible(true);
					Tokino.setVisible(false);
					Rude.setVisible(false);	
					Wegu.setVisible(false);
					Yojiko.setVisible(false);

				}else if(RudeA.isVisible()){
					KabiA.setVisible(false);	
					TokinoA.setVisible(true);
					RudeA.setVisible(false);
					WeguA.setVisible(false);
					YojikoA.setVisible(false);
					Kabi.setVisible(false);
					Tokino.setVisible(true);
					Rude.setVisible(false);	
					Wegu.setVisible(false);
					Yojiko.setVisible(false);

				}else if(WeguA.isVisible()){
					KabiA.setVisible(false);	
					TokinoA.setVisible(false);
					RudeA.setVisible(true);
					WeguA.setVisible(false);
					YojikoA.setVisible(false);
					Kabi.setVisible(false);
					Tokino.setVisible(false);
					Rude.setVisible(true);	
					Wegu.setVisible(false);
					Yojiko.setVisible(false);

				}else if(YojikoA.isVisible()){
					KabiA.setVisible(false);	
					TokinoA.setVisible(false);
					RudeA.setVisible(false);
					WeguA.setVisible(true);
					YojikoA.setVisible(false);
					Kabi.setVisible(false);
					Tokino.setVisible(false);
					Rude.setVisible(false);	
					Wegu.setVisible(true);
					Yojiko.setVisible(false);

				}
				
				
			}
		});
		flechaizq.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				flechaizq.setVisible(true);
				flechaizqP.setVisible(false);
			}
		});
		
		flechaderP = new JLabel("New label");
		flechaderP.setIcon(new ImageIcon(SeleccionPersonaje.class.getResource("/Ventanas/Flechaderpeque.png")));
		flechaderP.setBounds(864, 458, 98, 41);
		contentPane.add(flechaderP);
		flechaizq.setIcon(new ImageIcon(SeleccionPersonaje.class.getResource("/Ventanas/palotrolao.png")));
		flechaizq.setBounds(399, 444, 156, 78);
		contentPane.add(flechaizq);
		
		flechaizqP = new JLabel("New label");
		flechaizqP.setVisible(false);
		flechaizqP.setIcon(new ImageIcon(SeleccionPersonaje.class.getResource("/Ventanas/palotrolaopeque.png")));
		flechaizqP.setBounds(418, 458, 98, 50);
		contentPane.add(flechaizqP);
		
		TokinoA = new JLabel("New label");
		
		TokinoA.setVisible(false);
		
		WeguA = new JLabel("New label");
		WeguA.setVisible(false);
		
		RudeA = new JLabel("New label");
		RudeA.setVisible(false);
		
		YojikoA = new JLabel("");
		YojikoA.setVisible(false);
		YojikoA.setIcon(new ImageIcon(SeleccionPersonaje.class.getResource("/Ventanas/Yojiko1.png")));
		YojikoA.setBounds(559, 384, 166, 199);
		contentPane.add(YojikoA);
		
		Yojiko = new JLabel("Yojiko");
		Yojiko.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Yojiko.setForeground(Color.RED);
				Yojiko.setFont(new Font("Who asks Satan", Font.ITALIC, 70));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				Yojiko.setForeground(Color.WHITE);
				Yojiko.setFont(new Font("Who asks Satan", Font.ITALIC, 60));
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				Yojiko.setFont(new Font("Who asks Satan", Font.ITALIC, 60));	
			}
			public void mouseClicked(MouseEvent arg0) {
			 	
		 		flechaizq.setVisible(false);
		 		flechader.setVisible(false);
		 		flechaderP.setVisible(false);
		 		flechaizqP.setVisible(false);
		 		lblChooseYourSpy.setVisible(false);
		 		Yojiko.setVisible(false);
			 		
		 	}
		});
		
		Yojiko.setVisible(false);
		Yojiko.setForeground(Color.WHITE);
		Yojiko.setFont(new Font("Who asks Satan", Font.ITALIC, 60));
		Yojiko.setBounds(620, 595, 139, 50);
		contentPane.add(Yojiko);
		
		KabiA = new JLabel("New label");
		KabiA.setIcon(new ImageIcon(SeleccionPersonaje.class.getResource("/Ventanas/kavi2.png")));
		KabiA.setBounds(565, 338, 209, 291);
		contentPane.add(KabiA);
		
		Kabi = new JLabel("Kabi");
		Kabi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				Kabi.setForeground(Color.RED);
				Kabi.setFont(new Font("Who asks Satan", Font.ITALIC, 70));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				Kabi.setForeground(Color.WHITE);
				Kabi.setFont(new Font("Who asks Satan", Font.ITALIC, 60));
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				Kabi.setFont(new Font("Who asks Satan", Font.ITALIC, 60));	
			}
			public void mouseClicked(MouseEvent arg0) {
		 		
		 		flechaizq.setVisible(false);
		 		flechader.setVisible(false);
		 		flechaderP.setVisible(false);
		 		flechaizqP.setVisible(false);
		 		lblChooseYourSpy.setVisible(false);
		 		Kabi.setVisible(false);
		 		

		 	}
		});
		Kabi.setForeground(Color.WHITE);
		Kabi.setFont(new Font("Who asks Satan", Font.ITALIC, 60));
		Kabi.setBounds(635, 600, 147, 28);
		contentPane.add(Kabi);
		RudeA.setIcon(new ImageIcon(SeleccionPersonaje.class.getResource("/Ventanas/Rude1.png")));
		RudeA.setBounds(564, 377, 188, 212);
		contentPane.add(RudeA);
		
		
		 Rude = new JLabel("Rude");
		 Rude.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					Rude.setForeground(Color.RED);
					Rude.setFont(new Font("Who asks Satan", Font.ITALIC, 70));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Rude.setForeground(Color.WHITE);
					Rude.setFont(new Font("Who asks Satan", Font.ITALIC, 60));
				}
				@Override
				public void mousePressed(MouseEvent e) {
					Rude.setFont(new Font("Who asks Satan", Font.ITALIC, 50));	
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					Rude.setFont(new Font("Who asks Satan", Font.ITALIC, 60));	
				}
		 	@Override
		 	public void mouseClicked(MouseEvent arg0) {
		 		
		 		flechaizq.setVisible(false);
		 		flechader.setVisible(false);
		 		flechaderP.setVisible(false);
		 		flechaizqP.setVisible(false);
		 		lblChooseYourSpy.setVisible(false);
		 		Rude.setVisible(false);

		 	}
			});
		Rude.setVisible(false);
		Rude.setForeground(Color.WHITE);
		Rude.setFont(new Font("Who asks Satan", Font.ITALIC, 60));
		Rude.setBounds(624, 600, 140, 34);
		contentPane.add(Rude);
		WeguA.setIcon(new ImageIcon(SeleccionPersonaje.class.getResource("/Ventanas/Wegu1.png")));
		WeguA.setBounds(554, 383, 196, 200);
		contentPane.add(WeguA);
		
		 Wegu = new JLabel("Wegu");
		 Wegu.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					Wegu.setForeground(Color.RED);
					Wegu.setFont(new Font("Who asks Satan", Font.ITALIC, 70));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Wegu.setForeground(Color.WHITE);
					Wegu.setFont(new Font("Who asks Satan", Font.ITALIC, 60));
				}
				@Override
				public void mousePressed(MouseEvent e) {
					Wegu.setFont(new Font("Who asks Satan", Font.ITALIC, 50));	
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					Wegu.setFont(new Font("Who asks Satan", Font.ITALIC, 60));	
				}
				public void mouseClicked(MouseEvent arg0) {
			 	
			 		flechaizq.setVisible(false);
			 		flechader.setVisible(false);
			 		flechaderP.setVisible(false);
			 		flechaizqP.setVisible(false);
			 		lblChooseYourSpy.setVisible(false);
			 		Wegu.setVisible(false);

			 	}
			});
		Wegu.setVisible(false);
		Wegu.setVisible(false);
		Wegu.setFont(new Font("Who asks Satan", Font.ITALIC, 60));
		Wegu.setForeground(Color.WHITE);
		Wegu.setBounds(624, 594, 140, 41);
		contentPane.add(Wegu);
		TokinoA.setIcon(new ImageIcon(SeleccionPersonaje.class.getResource("/Ventanas/Tokino2.png")));
		TokinoA.setBounds(565, 381, 171, 195);
		contentPane.add(TokinoA);
		
		 Tokino = new JLabel("Tokino");
		 Tokino.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent arg0) {
					Tokino.setForeground(Color.RED);
					Tokino.setFont(new Font("Who asks Satan", Font.ITALIC, 70));
				}
				@Override
				public void mouseExited(MouseEvent arg0) {
					Tokino.setForeground(Color.WHITE);
					Tokino.setFont(new Font("Who asks Satan", Font.ITALIC, 60));
				}
				@Override
				public void mousePressed(MouseEvent e) {
					Tokino.setFont(new Font("Who asks Satan", Font.ITALIC, 50));	
				}
				@Override
				public void mouseReleased(MouseEvent e) {
					Tokino.setFont(new Font("Who asks Satan", Font.ITALIC, 60));	
				}
				public void mouseClicked(MouseEvent arg0) {
			 	
			 		flechaizq.setVisible(false);
			 		flechader.setVisible(false);
			 		flechaderP.setVisible(false);
			 		flechaizqP.setVisible(false);
			 		lblChooseYourSpy.setVisible(false);
			 		Tokino.setVisible(false);

			 	}
			});
		Tokino.setVisible(false);
		Tokino.setFont(new Font("Who asks Satan", Font.ITALIC, 60));
		Tokino.setForeground(Color.WHITE);
		Tokino.setBounds(610, 600, 158, 41);
		contentPane.add(Tokino);
		
		lblChooseYourSpy = new JLabel("Choose Your Spy");
		lblChooseYourSpy.setForeground(Color.WHITE);
		lblChooseYourSpy.setFont(new Font("DK Face Your Fears", Font.BOLD | Font.ITALIC, 72));
		lblChooseYourSpy.setBounds(429, 236, 594, 67);
		contentPane.add(lblChooseYourSpy);
		
		JLabel fondo = new JLabel("New label");
		fondo.setForeground(Color.RED);
		fondo.setIcon(new ImageIcon(SeleccionPersonaje.class.getResource("/Ventanas/Auschwitz-16.jpg")));
		fondo.setBounds(10, -99, 1344, 802);
		contentPane.add(fondo);
		
		
		
		
		 
}
}
