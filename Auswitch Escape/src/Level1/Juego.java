package Level1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;

public class Juego extends JFrame {

	private JPanel contentPane;
	private JLabel Kavi;
	private JLabel Fondo;
	private JLabel Inicio;
	private JLabel FinCompletado;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
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
	Icon icono;
	Icon icono2;
	int suma= 1;
	int lucas = 0;
	
	public Juego() {
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int x = Kavi.getX();
				int y = Kavi.getY();
				icono2 = new ImageIcon(getClass().getResource("/Level1/Fondo2Lv1.jpg"));
				
				if (e.getKeyChar()== ' '){
					Inicio.setVisible(false);
					if(suma % 2 == 0){
						icono = new ImageIcon(getClass().getResource("/Level1/kaviDer1.png"));
						Kavi.setIcon(icono);
					}else if (x == 1250 && lucas == 0){
						icono = new ImageIcon(getClass().getResource("/Level1/Fondo2Lv1.jpg"));
						Fondo.setIcon(icono);
						Kavi.setLocation(x=-50, y = 450);
						lucas = 6988;
						
					
					}else if(x == 1250 && lucas == 6988){
						FinCompletado.setVisible(true);
						Kavi.setVisible(false);
						
					}else{
						icono = new ImageIcon(getClass().getResource("/Level1/kaviDer2.png"));
						Kavi.setIcon(icono);
					}
						
					}
					x = x + 25;
					Kavi.setLocation(x, y);
					suma++;
				}
				
			
			
		});
		this.setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
			
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Inicio = new JLabel("");
		Inicio.setIcon(new ImageIcon(Juego.class.getResource("/Level1/Nivel inicio.png")));
		Inicio.setBounds(0, 65, 1558, 745);
		contentPane.add(Inicio);
		
		FinCompletado = new JLabel("");
		FinCompletado.setVisible(false);
		FinCompletado.setIcon(new ImageIcon(Juego.class.getResource("/Level1/Nivel final.png")));
		FinCompletado.setBounds(0, 0, 1362, 705);
		contentPane.add(FinCompletado);
		
		Kavi = new JLabel("");
		Kavi.setIcon(new ImageIcon(Juego.class.getResource("/Ventanas/kavi2.png")));
		Kavi.setBounds(-50, 437, 179, 211);
		contentPane.add(Kavi);
		
		Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(Juego.class.getResource("/Level1/Fondo1Lv1.jpg")));
		Fondo.setBounds(0, 0, 1362, 705);
		contentPane.add(Fondo);
	}
}
