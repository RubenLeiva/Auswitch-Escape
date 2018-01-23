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
	private JLabel pared1;
	private JLabel pared2;
	private JLabel pared3;
	private JLabel pared4;
	private JLabel pared5;
	private JLabel pared7;
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

	private JLabel pared6;
	private JLabel pared;
	private JLabel pared8;
	private JLabel pared9;
	private JLabel pared10;

	
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
					
					
						
						ImageIcon icono1 = new ImageIcon(getClass().getResource("/Level2/laboratorio.jpg"));
						Icon chos = new ImageIcon(icono1.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
						fondo.setIcon(chos);
						
						fondo.setVisible(true);
					
					case KeyEvent.VK_UP: Personaje.setLocation(x, y-5);Pies.setLocation(x, y-5);
					Personaje.setVisible(true);
					if(!collision() && !collision1() && !collision2() && !collision3() && !collision4() && !collision5() && !collision6() && !collision7() && !collision8() && !collision9() && !collision10()){						suma++;
					
					
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
					}else{
					Personaje.setLocation(x, y+5);
					Pies.setLocation(x, y+5);
					}
					
					break;

				
					
					
					case KeyEvent.VK_DOWN: Personaje.setLocation(x, y +5);Pies.setLocation(x,  y+5);
					if(!collision() && !collision1() && !collision2() && !collision3() && !collision4() && !collision5() && !collision6() && !collision7() && !collision8() && !collision9() && !collision10()){					
						
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
					}else{
						Personaje.setLocation(x, y-5);
						Pies.setLocation(x,  y-5);
					}
						break;
				
					
					
					case KeyEvent.VK_LEFT: Personaje.setLocation(x-5, y); Pies.setLocation(x-5,  y);
					if(!collision() && !collision1() && !collision2() && !collision3() && !collision4() && !collision5() && !collision6() && !collision7() && !collision8() && !collision9() && !collision10()){						suma++;
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
					}else{
						Personaje.setLocation(x+5, y);
						Pies.setLocation(x+5, 5);
					}
						break;
					
					
					
					case KeyEvent.VK_RIGHT: Personaje.setLocation(x+5, y); Pies.setLocation(x+5,  y);
					if(!collision() && !collision1() && !collision2() && !collision3() && !collision4() && !collision5() && !collision6() && !collision7() && !collision8() && !collision9() && !collision10()){
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
		

		Pies = new JLabel("");
		Pies.setBounds(0, 673, 37, 20);
		Pies.setVisible(false);
		contentPane.add(Pies);
		
		Personaje = new JLabel("");
		Personaje.setBounds(76, 589, 37, 54);
		Personaje.setVisible(false);
		Personaje.setIcon(new ImageIcon(Juego2.class.getResource("/Ventanas/kaviD0.png")));
		contentPane.add(Personaje);
		
		Reloj = new JLabel("");
		Reloj.setForeground(Color.RED);
		Reloj.setFont(new Font("DK Face Your Fears", Font.PLAIN, 60));
		Reloj.setBounds(632, 0, 187, 59);
		contentPane.add(Reloj);
		
		
		fondo = new JLabel("");
		fondo.setBounds(0, 0, 1368, 705);
		fondo.setVisible(false);
		
		pared10 = new JLabel("");
		pared10.setBounds(185, 517, 100, 6);
		contentPane.add(pared10);
		
		pared9 = new JLabel("");
		pared9.setBounds(78, 43, 35, 524);
		contentPane.add(pared9);
		
		pared8 = new JLabel("");
		pared8.setBounds(268, 565, 8, 72);
		contentPane.add(pared8);
		
		pared7 = new JLabel("");
		pared7.setForeground(Color.BLACK);
		pared7.setBounds(173, 570, 27, 72);
		contentPane.add(pared7);
		
		pared6 = new JLabel("");
		pared6.setBounds(914, 570, 283, 10);
		contentPane.add(pared6);
		
		pared5 = new JLabel("");
		pared5.setBounds(359, 326, 19, 213);
		contentPane.add(pared5);
		
		pared4 = new JLabel("");
		pared4.setBackground(Color.PINK);
		pared4.setBounds(359, 570, 453, 6);
		contentPane.add(pared4);
		
		pared3 = new JLabel("");
		pared3.setBounds(453, 466, 361, 10);
		contentPane.add(pared3);
		
		pared2 = new JLabel("");
		pared2.setBounds(459, 517, 643, 13);
		contentPane.add(pared2);
		
		pared1 = new JLabel("");
		pared1.setBounds(371, 425, 361, 6);
		contentPane.add(pared1);
		
		pared = new JLabel("");
		pared.setBounds(122, 611, 1193, 31);
		contentPane.add(pared);
		fondo.setIcon(new ImageIcon(Juego2.class.getResource("/Level2/laboratorio.jpg")));
		contentPane.add(fondo);
		
		Inicio = new JLabel("");
		Inicio.setBounds(0, 0, 1354, 705);
		Inicio.setIcon(new ImageIcon(Juego2.class.getResource("/Level2/Nivel2  inicio.png")));
		contentPane.add(Inicio);
		
		
	
	}
	private boolean collision(){
		boolean resultado = false;
		if (Pies.getBounds().intersects(pared.getBounds())){
			resultado = true;
		}
			return resultado;
		}
	
	private boolean collision1(){
		boolean resultado1 = false;
		if (Pies.getBounds().intersects(pared1.getBounds())){
			resultado1 = true;
		}
			return resultado1;
		}
	private boolean collision2(){
		boolean resultado2 = false;
		if (Pies.getBounds().intersects(pared2.getBounds())){
			resultado2 = true;
		}
			return resultado2;
		}
	private boolean collision3(){
		boolean resultado3 = false;
		if (Pies.getBounds().intersects(pared3.getBounds())){
			resultado3 = true;
		}
			return resultado3;
		}
	private boolean collision4(){
		boolean resultado4 = false;
		if (Pies.getBounds().intersects(pared4.getBounds())){
			resultado4 = true;
		}
			return resultado4;
		}
	private boolean collision5(){
		boolean resultado5 = false;
		if (Pies.getBounds().intersects(pared5.getBounds())){
			resultado5 = true;
		}
			return resultado5;
		}
	private boolean collision6(){
		boolean resultado6 = false;
		if (Pies.getBounds().intersects(pared6.getBounds())){
			resultado6 = true;
		}
			return resultado6;
		}
	private boolean collision7(){
		boolean resultado7 = false;
		if (Pies.getBounds().intersects(pared7.getBounds())){
			resultado7 = true;
		}
			return resultado7;
		}
	private boolean collision8(){
		boolean resultado8 = false;
		if (Pies.getBounds().intersects(pared8.getBounds())){
			resultado8 = true;
		}
			return resultado8;
		}
	private boolean collision9(){
		boolean resultado9 = false;
		if (Pies.getBounds().intersects(pared9.getBounds())){
			resultado9 = true;
		}
			return resultado9;
		}
	private boolean collision10(){
		boolean resultado10 = false;
		if (Pies.getBounds().intersects(pared10.getBounds())){
			resultado10 = true;
		}
			return resultado10;
		}
}
