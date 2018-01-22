package Level2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Extra.CuentaAtras;

import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;


public class Juego2 extends JFrame {

	private JPanel contentPane;
	private JLabel Personaje;
	private JLabel Inicio;
	private String dato= "";
	private JLabel fondo;
	public JLabel Reloj;
	private JLabel Pies;
	CuentaAtras j = new CuentaAtras();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego2 frame = new Juego2();
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
	
	int x;
	int y;
	int suma = 0;
	Icon icono;
	Icon icono2;
	Icon icono1;
	private JLabel fuego;
	private JLabel pared6;
	private JLabel pared;

	
	public Juego2() {
		
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				x = Personaje.getX();
				y = Personaje.getY();
				
				if(x> 1000 && y < 60){
					Inicio.setVisible(true);
				}
				
				switch (e.getExtendedKeyCode()){
				
			
				
					case KeyEvent.VK_SPACE: Inicio.setVisible(false);
					j.Inicio(Reloj);
					ImageIcon icono2 = new ImageIcon(getClass().getResource("/Level2/fuego.gif"));
						Icon cho = new ImageIcon(icono2.getImage().getScaledInstance(fuego.getWidth(), fuego.getHeight(), Image.SCALE_DEFAULT));
						fuego.setIcon(cho);
						
						ImageIcon icono1 = new ImageIcon(getClass().getResource("/Level2/laboratorio.jpg"));
						Icon chos = new ImageIcon(icono1.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
						fondo.setIcon(chos);
						
						fondo.setVisible(true);
					
					case KeyEvent.VK_UP: Personaje.setLocation(x, y-5);Pies.setLocation(x, y-5);
					
					Personaje.setVisible(true);
					fuego.setVisible(true);
					suma++;
					if(!(Personaje.getBounds().intersects(fuego.getBounds()))){	
						if(suma % 2 == 0){
							ImageIcon icono = new ImageIcon(getClass().getResource("/Ventanas/kaviD2.png"));
							Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
							Personaje.setIcon(ch);							
						}else{
							ImageIcon icono = new ImageIcon(getClass().getResource("/Ventanas/kaviD3.png"));
							Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
							Personaje.setIcon(ch);
						}
						break;
					}else{Personaje.setLocation(x, y+25);}
					

					case KeyEvent.VK_DOWN: Personaje.setLocation(x, y+25);

					
					
					if(suma % 2 == 0){
						ImageIcon icono = new ImageIcon(getClass().getResource("/Ventanas/kaviD2.png"));
						Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
						Personaje.setIcon(ch);
						
						
						
					}else{
						ImageIcon icono = new ImageIcon(getClass().getResource("/Ventanas/kaviD3.png"));
						Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
						Personaje.setIcon(ch);
						
						
						
					}
					break;
					
					
					case KeyEvent.VK_DOWN: Personaje.setLocation(x, y +5);Pies.setLocation(x,  y+5);
					
					if(!(collision())){
>>>>>>> branch 'master' of https://github.com/RubenLeiva/Auswitch-Escape
					suma++;
<<<<<<< HEAD
					if(!(Personaje.getBounds().intersects(fuego.getBounds()))){	
						if(suma % 2 == 0){
							ImageIcon icono = new ImageIcon(getClass().getResource("/Ventanas/kavi3.png"));
							Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
							Personaje.setIcon(ch);
						}else{
							ImageIcon icono = new ImageIcon(getClass().getResource("/Ventanas/kavi4.png"));
							Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
							Personaje.setIcon(ch);
						}
						break;
					}else{Personaje.setLocation(x, y-25);}
					case KeyEvent.VK_LEFT: Personaje.setLocation(x-25, y);
=======
					if(suma % 2 == 0){
						ImageIcon icono = new ImageIcon(getClass().getResource("/Ventanas/kavi3.png"));
						Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
						Personaje.setIcon(ch);
					}else{
						ImageIcon icono = new ImageIcon(getClass().getResource("/Ventanas/kavi4.png"));
						Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
						Personaje.setIcon(ch);
					}
					}else{
						Personaje.setLocation(x, y-5);
						Pies.setLocation(x, y -5);
					}
					break;
					
					
					case KeyEvent.VK_LEFT: Personaje.setLocation(x-5, y); Pies.setLocation(x-5,  y);
>>>>>>> branch 'master' of https://github.com/RubenLeiva/Auswitch-Escape
					suma++;
<<<<<<< HEAD
					if(!(Personaje.getBounds().intersects(fuego.getBounds()))){	

						if(suma % 2 == 0){
							ImageIcon icono = new ImageIcon(getClass().getResource("/Ventanas/kaviIzq1.png"));
							Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
							Personaje.setIcon(ch);
						}else{
							ImageIcon icono = new ImageIcon(getClass().getResource("/Ventanas/kaviIzq2.png"));
							Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
							Personaje.setIcon(ch);
						}
						break;
					}else{Personaje.setLocation(x+25, y);}
					case KeyEvent.VK_RIGHT: Personaje.setLocation(x+25,y);
					suma++;
					if(!(Personaje.getBounds().intersects(fuego.getBounds()))){	
						if(suma % 2 == 0){
							ImageIcon icono = new ImageIcon(getClass().getResource("/Level1/kaviDer1.png"));
							Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
							Personaje.setIcon(ch);
						}else{
							ImageIcon icono = new ImageIcon(getClass().getResource("/Level1/kaviDer2.png"));
							Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
							Personaje.setIcon(ch);
						}
						break;
					}else{Personaje.setLocation(x-25, y);}

=======
					
					if(suma % 2 == 0){
						ImageIcon icono = new ImageIcon(getClass().getResource("/Ventanas/kaviIzq1.png"));
						Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
						Personaje.setIcon(ch);
					}else{
						ImageIcon icono = new ImageIcon(getClass().getResource("/Ventanas/kaviIzq2.png"));
						Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
						Personaje.setIcon(ch);
					}
					break;
					
					
					
						case KeyEvent.VK_RIGHT: Personaje.setLocation(x+5, y); Pies.setLocation(x+5,  y);
						if(!(collision())){
						suma++;
						
						
						if(suma % 2 == 0){
							ImageIcon icono = new ImageIcon(getClass().getResource("/Level1/kaviDer1.png"));
							Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
							Personaje.setIcon(ch);
						}else{
							ImageIcon icono = new ImageIcon(getClass().getResource("/Level1/kaviDer2.png"));
							Icon ch = new ImageIcon(icono.getImage().getScaledInstance(Personaje.getWidth(), Personaje.getHeight(), Image.SCALE_DEFAULT));
							Personaje.setIcon(ch);
						
						}
						}else{
							Personaje.setLocation(x-5, y);
							Pies.setLocation(x-5, y);
						}
						break;
					
>>>>>>> branch 'master' of https://github.com/RubenLeiva/Auswitch-Escape
					
				}
				
			}
		
		});
	
		
		this.setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
<<<<<<< HEAD
=======
		Pies = new JLabel("");
		Pies.setBounds(0, 673, 37, 20);
		Pies.setVisible(false);
		contentPane.add(Pies);
		
		Personaje = new JLabel("");
		Personaje.setBounds(0, 641, 37, 52);
		Personaje.setVisible(false);
		Personaje.setIcon(new ImageIcon(Juego2.class.getResource("/Ventanas/kaviD0.png")));
		contentPane.add(Personaje);
		
		Reloj = new JLabel("");
		Reloj.setForeground(Color.RED);
		Reloj.setFont(new Font("DK Face Your Fears", Font.PLAIN, 60));
		Reloj.setBounds(632, 0, 187, 59);
		contentPane.add(Reloj);
		
>>>>>>> branch 'master' of https://github.com/RubenLeiva/Auswitch-Escape
		
		fuego = new JLabel("");
		fuego.setBounds(102, 444, 77, 87);
		fuego.setIcon(null);
		fuego.setBackground(Color.GRAY);
		fuego.setForeground(Color.BLACK);
		fuego.setVisible(false);
		
		fondo = new JLabel("");
		fondo.setBounds(0, 0, 1368, 705);
		fondo.setVisible(false);
		
		pared6 = new JLabel("");
		pared6.setBounds(901, 588, 304, 23);
		contentPane.add(pared6);
		
		JLabel pared4 = new JLabel("");
		pared4.setBackground(Color.PINK);
		pared4.setBounds(434, 541, 683, 21);
		contentPane.add(pared4);
		
		JLabel pared5 = new JLabel("");
		pared5.setBounds(342, 586, 492, 24);
		contentPane.add(pared5);
		
		JLabel pared3 = new JLabel("");
		pared3.setBounds(358, 442, 387, 19);
		contentPane.add(pared3);
		
		JLabel pared2 = new JLabel("");
		pared2.setBounds(437, 488, 392, 21);
		contentPane.add(pared2);
		
		JLabel pared1 = new JLabel("");
		pared1.setBounds(439, 388, 487, 18);
		contentPane.add(pared1);
		
		pared = new JLabel("");
		pared.setBounds(80, 652, 1235, 20);
		contentPane.add(pared);
		fondo.setIcon(new ImageIcon(Juego2.class.getResource("/Level2/laboratorio.jpg")));
		contentPane.add(fondo);
		contentPane.add(fuego);
		
		Personaje = new JLabel("");
		Personaje.setVisible(false);
		Personaje.setIcon(new ImageIcon(Juego2.class.getResource("/Ventanas/kaviD0.png")));
		Personaje.setBounds(-44, 557, 136, 148);
		contentPane.add(Personaje);
		
		Inicio = new JLabel("");
		Inicio.setBounds(0, 0, 1354, 705);
		Inicio.setIcon(new ImageIcon(Juego2.class.getResource("/Level2/Nivel2  inicio.png")));
		contentPane.add(Inicio);
		
		
	
	}
	private boolean collision(){
		
		return Pies.getBounds().intersects(pared.getBounds());
	}
}
