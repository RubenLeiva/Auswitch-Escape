package Level3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Juego3 extends JFrame {

	private JPanel contentPane;
	private JLabel Inicio;
	private JLabel Cerradura;
	private JLabel Barra;
	public JLabel Ganzua;
	private JLabel Fondo;
	private JLabel Parte1;
	Movimiento j = new Movimiento();
	
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
				
		switch (e.getExtendedKeyCode()){
		
		case KeyEvent.VK_SPACE: Inicio.setVisible(false);

			
			ImageIcon icono2 = new ImageIcon(getClass().getResource("/Level3/fondo madera.jpg"));
			Icon cho = new ImageIcon(icono2.getImage().getScaledInstance(Barra.getWidth(), Barra.getHeight(), Image.SCALE_DEFAULT));
			Barra.setIcon(cho);
			Barra.setVisible(true);
			Cerradura.setVisible(true);
			
			ImageIcon icono1 = new ImageIcon(getClass().getResource("/Level3/Ganzua1.png"));
			Icon chos = new ImageIcon(icono1.getImage().getScaledInstance(Ganzua.getWidth(), Ganzua.getHeight(), Image.SCALE_DEFAULT));
			Ganzua.setIcon(chos);
			Ganzua.setVisible(true);
			
			ImageIcon icono3= new ImageIcon(getClass().getResource("/Level3/Fondo Juego3.jpg"));
			Icon ch = new ImageIcon(icono3.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));
			Fondo.setIcon(ch);
			Fondo.setVisible(true);
			
			Parte1.setVisible(true);
			j.Inicio(Ganzua);
		
	
			if(Ganzua.getX()>= 207 && Ganzua.getX()<= 407){
			j.Parar(Ganzua);
				
			}
	
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
