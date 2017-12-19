package Level2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.JButton;


public class Juego2 extends JFrame {

	private JPanel contentPane;
	private JLabel Personaje;
	private JLabel Inicio;
	private String dato= "";
	private JLabel fondo;

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
					
					ImageIcon icono2 = new ImageIcon(getClass().getResource("/Level2/fuego.gif"));
						Icon cho = new ImageIcon(icono2.getImage().getScaledInstance(fuego.getWidth(), fuego.getHeight(), Image.SCALE_DEFAULT));
						fuego.setIcon(cho);
						
						ImageIcon icono1 = new ImageIcon(getClass().getResource("/Level2/laboratorio.jpg"));
						Icon chos = new ImageIcon(icono1.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
						fondo.setIcon(chos);
						
						fondo.setVisible(true);
					
					case KeyEvent.VK_UP: Personaje.setLocation(x, y-25);
					
					Personaje.setVisible(true);
					fuego.setVisible(true);
					suma++;
					
					
					
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
					case KeyEvent.VK_DOWN: Personaje.setLocation(x, y+25);
					suma++;
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
					case KeyEvent.VK_LEFT: Personaje.setLocation(x-25, y);
					suma++;
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
					case KeyEvent.VK_RIGHT: Personaje.setLocation(x+25,y);
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
					
				}
				
			}
			
		});
	
		
		this.setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		Personaje = new JLabel("");
		Personaje.setBounds(0, 599, 83, 94);
		Personaje.setVisible(false);
		contentPane.setLayout(null);
		Personaje.setIcon(new ImageIcon(Juego2.class.getResource("/Ventanas/kaviD0.png")));
		contentPane.add(Personaje);
		
		
		fuego = new JLabel("");
		fuego.setBounds(102, 444, 77, 87);
		fuego.setIcon(null);
		fuego.setBackground(Color.GRAY);
		fuego.setForeground(Color.BLACK);
		fuego.setVisible(false);
		
		fondo = new JLabel("");
		fondo.setBounds(0, 0, 1368, 705);
		fondo.setVisible(false);
		fondo.setIcon(new ImageIcon(Juego2.class.getResource("/Level2/laboratorio.jpg")));
		contentPane.add(fondo);
		contentPane.add(fuego);
		
		Inicio = new JLabel("");
		Inicio.setBounds(0, 0, 1354, 705);
		Inicio.setIcon(new ImageIcon(Juego2.class.getResource("/Level2/Nivel2  inicio.png")));
		contentPane.add(Inicio);
		
		
	
	}
}
