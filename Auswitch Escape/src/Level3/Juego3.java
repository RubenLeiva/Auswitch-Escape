package Level3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Level1.Comic;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Juego3 extends JFrame {

	private JPanel contentPane;
	private JLabel Inicio;
	public JLabel Cerradura;
	private JLabel Barra;
	public JLabel Ganzua;
	private JLabel Fondo;
	private JLabel Parte1;
	private JLabel Parte2;
	private JLabel Parte3;
	private int caso=0;
	Movimiento j = new Movimiento();
	MovimientoG g= new MovimientoG();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego3 frame = new Juego3();
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

	public Juego3() {

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				switch (e.getExtendedKeyCode()) {

				case KeyEvent.VK_SPACE :
					Inicio.setVisible(false);
					

					ImageIcon icono2 = new ImageIcon(getClass().getResource("/Level3/fondo madera.jpg"));
					Icon cho = new ImageIcon(icono2.getImage().getScaledInstance(Barra.getWidth(), Barra.getHeight(),
							Image.SCALE_DEFAULT));
					Barra.setIcon(cho);
					Barra.setVisible(true);
					Cerradura.setVisible(true);

					ImageIcon icono1 = new ImageIcon(getClass().getResource("/Level3/Ganzua1.png"));
					Icon chos = new ImageIcon(icono1.getImage().getScaledInstance(Ganzua.getWidth(), Ganzua.getHeight(),
							Image.SCALE_DEFAULT));
					Ganzua.setIcon(chos);
					Ganzua.setVisible(true);

					ImageIcon icono3 = new ImageIcon(getClass().getResource("/Level3/Fondo Juego3.jpg"));
					Icon ch = new ImageIcon(icono3.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(),
							Image.SCALE_DEFAULT));
					Fondo.setIcon(ch);
					Fondo.setVisible(true);
					Parte1.setVisible(true);
					j.Inicio(Ganzua);
					
					break;

				case KeyEvent.VK_ENTER:j.Parar(Ganzua);
					switch(caso){	
						case 0: 
							caso = 1;
							if (Ganzua.getX() + 235 >= 442 && Ganzua.getX() + 225 <= 636 && caso == 1) {
								j.Parar(Ganzua);
								g.ej(Juego3.this);
								Parte1.setVisible(false);
								Parte2.setVisible(true);
								System.out.println("primer candado resuelto");
							}else{
								
		
								JOptionPane.showMessageDialog(null, "Vuelve a intentarlo");
							}
						break;
						case 1:
							caso = 2;
							if (Ganzua.getX() + 235 >= 642 && Ganzua.getX() + 225 <= 760 && caso == 2) {
								j.Parar(Ganzua);
								g.ejemplo(Juego3.this);
								Parte2.setVisible(false);
								Parte3.setVisible(true);
								System.out.println("segundo candado resuelto");
							}else{
								
								JOptionPane.showMessageDialog(null, "Vuelve a intentarlo");
							}
						break;
						case 2: 
							caso=3;
							if (Ganzua.getX() + 235 >= 242 && Ganzua.getX() + 225 <= 302 && caso == 3) {
								j.Parar(Ganzua);
								g.ejemplo3(Juego3.this);
								Parte3.setVisible(false);
								System.out.println("tercer candado resuelto");
								
							}else{
	
								JOptionPane.showMessageDialog(null, "3 Vuelve a intentarlo");
							}
						break;
						
					}
					break;
				}

			}

		});

		this.setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Inicio = new JLabel("");
		Inicio.setIcon(new ImageIcon(Juego3.class.getResource("/Level3/Nivel3 inicio.png")));
		Inicio.setBounds(0, 0, 1367, 705);
		contentPane.add(Inicio);

		Barra = new JLabel("");
		Barra.setVisible(false);

		Ganzua = new JLabel("");
		Ganzua.setVisible(false);
		Ganzua.setIcon(new ImageIcon(Juego3.class.getResource("/Level3/Ganzua1.png")));
		Ganzua.setBounds(150, 415, 235, 228);
		contentPane.add(Ganzua);

		Parte1 = new JLabel("");
		Parte1.setVisible(false);
		Parte1.setIcon(new ImageIcon(Juego3.class.getResource("/Level3/verde.gif")));
		Parte1.setForeground(Color.GREEN);
		Parte1.setBackground(Color.GREEN);
		Parte1.setBounds(442, 613, 194, 47);
		contentPane.add(Parte1);
		
		Parte2 = new JLabel("");
		Parte2.setVisible(false);
		Parte2.setIcon(new ImageIcon(Juego3.class.getResource("/Level3/verde.gif")));
		Parte2.setForeground(Color.GREEN);
		Parte2.setBackground(Color.GREEN);
		Parte2.setBounds(642, 613, 120, 47);
		contentPane.add(Parte2);
		
		Parte3 = new JLabel("");
		Parte3.setVisible(false);
		Parte3.setIcon(new ImageIcon(Juego3.class.getResource("/Level3/verde.gif")));
		Parte3.setForeground(Color.GREEN);
		Parte3.setBackground(Color.GREEN);
		Parte3.setBounds(242, 613, 60, 47);
		contentPane.add(Parte3);

		Barra.setIcon(new ImageIcon(Juego3.class.getResource("/Level3/Fondo Juego3.jpg")));
		Barra.setBackground(Color.BLUE);
		Barra.setForeground(Color.BLUE);
		Barra.setBounds(176, 613, 986, 47);
		contentPane.add(Barra);

		Cerradura = new JLabel("");
		Cerradura.setVisible(false);
		Cerradura.setIcon(new ImageIcon(Juego3.class.getResource("/Level3/Cerradura0B.png")));
		Cerradura.setBounds(140, 0, 807, 411);
		contentPane.add(Cerradura);

		Fondo = new JLabel("");
		Fondo.setVisible(false);
		Fondo.setIcon(new ImageIcon(Juego3.class.getResource("/Level3/fondo madera.jpg")));
		Fondo.setBounds(0, 0, 1367, 705);
		contentPane.add(Fondo);
	}
	
	
	
}
