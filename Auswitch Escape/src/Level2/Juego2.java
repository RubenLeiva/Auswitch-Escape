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

	public int time;

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
	private JLabel pared11;
	private JLabel pared12;
	private JLabel pared13;
	private JLabel pared14;
	private JLabel pared15;
	private JLabel pared16;
	private JLabel pared17;
	private JLabel pared18;
	private JLabel pared19;
	private JLabel pared20;
	private JLabel pared21;
	private JLabel pared23;
	private JLabel pared22;
	private JLabel pared24;
	private JLabel pared25;
	private JLabel pared26;
	private JLabel pared27;
	private JLabel pared28;
	private JLabel pared29;
	private JLabel pared30;
	private JLabel pared31;
	private JLabel pared32;
	private JLabel pared33;
	private JLabel pared34;
	private JLabel pared35;
	private JLabel pared36;
	private JLabel pared37;
	private JLabel pared38;
	private JLabel pared39;
	private JLabel pared40;
	private JLabel pared41;

	
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

					if(!collision() && !collision1() && !collision2() && !collision3() && !collision4() && !collision5() && !collision6() && !collision7() && !collision8() && !collision9() && !collision10()
&& !collision11()  && !collision12() && !collision13() && !collision14() && !collision15() && !collision16() && !collision17() && !collision18() && !collision19() && !collision20() && !collision21() && !collision22()
&& !collision23()&& !collision24() && !collision25() && !collision27() && !collision28() && !collision29() && !collision30() && !collision31()  && !collision32() && !collision33()
&& !collision34() && !collision35() && !collision36() && !collision37() && !collision38() && !collision39() && !collision40() && !collision41()){
						suma ++;
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

					if(!collision() && !collision1() && !collision2() && !collision3() && !collision4() && !collision5() && !collision6() && !collision7() && !collision8() && !collision9() && !collision10()
&& !collision11()  && !collision12() && !collision13() && !collision14() && !collision15() && !collision16() && !collision17() && !collision18() && !collision19() && !collision20() && !collision21() && !collision22()

&& !collision23()&& !collision24() && !collision25() && !collision26() && !collision27() && !collision28() && !collision29() && !collision30() && !collision31()  && !collision32() && !collision33()
&& !collision34() && !collision35() && !collision36() && !collision37() && !collision38() && !collision39() && !collision40() && !collision41()){	
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
					}else{
						Personaje.setLocation(x, y-5);
						Pies.setLocation(x,  y-5);
					}
						break;
				
					
					

					case KeyEvent.VK_LEFT: Personaje.setLocation(x-5, y); Pies.setLocation(x-5,  y);

					if(!collision() && !collision1() && !collision2() && !collision3() && !collision4() && !collision5() && !collision6() && !collision7() && !collision8() && !collision9() && !collision10()
&& !collision11()  && !collision12() && !collision13() && !collision14() && !collision15() && !collision16() && !collision17() && !collision18() && !collision19() && !collision20() && !collision21() && !collision22()
&& !collision23()&& !collision24() && !collision25() && !collision26() && !collision27() && !collision28() && !collision29() && !collision30() && !collision31()  && !collision32() && !collision33()
&& !collision34() && !collision35() && !collision36() && !collision37() && !collision38() && !collision39() && !collision40() && !collision41()){						
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
					}else{
						Personaje.setLocation(x+5, y);
						Pies.setLocation(x+5, 5);
					}
						break;
					
					
					
					case KeyEvent.VK_RIGHT: Personaje.setLocation(x+5, y); Pies.setLocation(x+5,  y);

					if(!collision() && !collision1() && !collision2() && !collision3() && !collision4() && !collision5() && !collision6() && !collision7() && !collision8() && !collision9() && !collision10()
&& !collision11()  && !collision12() && !collision13() && !collision14() && !collision15() && !collision16() && !collision17() && !collision18() && !collision19() && !collision20() && !collision21() && !collision22()
&& !collision23() && !collision24() && !collision25() && !collision26() && !collision27() && !collision28() && !collision29() && !collision30() && !collision31() && !collision32() && !collision33()
&& !collision34() && !collision35() && !collision36() && !collision37() && !collision38() && !collision39() && !collision40() && !collision41()){
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
		
		pared41 = new JLabel("");
		pared41.setBounds(740, 136, 4, 83);
		contentPane.add(pared41);
		
		pared40 = new JLabel("");
		pared40.setBounds(914, 0, 15, 126);
		contentPane.add(pared40);
		
		pared39 = new JLabel("");
		pared39.setBounds(744, 75, 68, 9);
		contentPane.add(pared39);
		
		pared38 = new JLabel("");
		pared38.setBounds(744, 54, 6, 31);
		contentPane.add(pared38);
		
		pared37 = new JLabel("");
		pared37.setBounds(642, 54, 9, 31);
		contentPane.add(pared37);
		
		pared36 = new JLabel("");
		pared36.setBounds(1204, 75, 6, 51);
		contentPane.add(pared36);
		
		pared35 = new JLabel("");
		pared35.setBounds(1104, 75, 224, 3);
		contentPane.add(pared35);
		
		pared34 = new JLabel("");
		pared34.setBounds(563, 124, 539, 22);
		contentPane.add(pared34);
		
		pared33 = new JLabel("");
		pared33.setBounds(543, 124, 17, 205);
		contentPane.add(pared33);
		
		pared32 = new JLabel("");
		pared32.setBounds(543, 326, 182, 3);
		contentPane.add(pared32);
		
		pared31 = new JLabel("");
		pared31.setBounds(1291, 76, 37, 617);
		contentPane.add(pared31);
		
		pared30 = new JLabel("");
		pared30.setBounds(726, 274, 6, 51);
		contentPane.add(pared30);
		
		pared29 = new JLabel("");
		pared29.setBounds(650, 270, 53, 9);
		contentPane.add(pared29);
		
		pared28 = new JLabel("");
		pared28.setBounds(645, 226, 6, 48);
		contentPane.add(pared28);
		
		pared27 = new JLabel("");
		pared27.setBounds(713, 502, 19, 31);
		contentPane.add(pared27);
		
		pared26 = new JLabel("");
		pared26.setBounds(543, 371, 6, 48);
		contentPane.add(pared26);
		
		pared25 = new JLabel("");
		pared25.setBounds(456, 371, 453, 9);
		contentPane.add(pared25);
		
		pared24 = new JLabel("");
		pared24.setBounds(122, 0, 1154, 43);
		contentPane.add(pared24);
		
		pared23 = new JLabel("");
		pared23.setBounds(453, 44, 10, 273);
		contentPane.add(pared23);
		
		pared22 = new JLabel("");
		pared22.setBounds(370, 226, 64, 5);
		contentPane.add(pared22);
		
		pared21 = new JLabel("");
		pared21.setBounds(370, 174, 64, 10);
		contentPane.add(pared21);
		
		pared20 = new JLabel("");
		pared20.setBounds(277, 180, 19, 95);
		contentPane.add(pared20);
		
		pared19 = new JLabel("");
		pared19.setBounds(205, 270, 167, 5);
		contentPane.add(pared19);
		
		pared18 = new JLabel("");
		pared18.setBounds(185, 180, 23, 145);
		contentPane.add(pared18);
		
		pared17 = new JLabel("");
		pared17.setBounds(185, 326, 187, 6);
		contentPane.add(pared17);
		
		pared16 = new JLabel("");
		pared16.setBounds(290, 371, 88, 13);
		contentPane.add(pared16);
		
		pared15 = new JLabel("");
		pared15.setBounds(271, 371, 19, 48);
		contentPane.add(pared15);
		
		pared14 = new JLabel("");
		pared14.setBounds(0, 371, 187, 13);
		contentPane.add(pared14);
		
		pared13 = new JLabel("");
		pared13.setBounds(175, 371, 27, 48);
		contentPane.add(pared13);
		
		pared12 = new JLabel("");
		pared12.setBounds(139, 466, 141, 13);
		contentPane.add(pared12);
		
		pared11 = new JLabel("");
		pared11.setBounds(266, 466, 19, 54);
		contentPane.add(pared11);
		
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
		pared5.setBounds(359, 326, 19, 233);
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
	private boolean collision11(){
		boolean resultado11 = false;
		if (Pies.getBounds().intersects(pared11.getBounds())){
			resultado11 = true;
		}
			return resultado11;
		}

	private boolean collision12(){
		boolean resultado12 = false;
		if (Pies.getBounds().intersects(pared12.getBounds())){
			resultado12 = true;
		}
			return resultado12;
		}
	private boolean collision13(){
		boolean resultado13 = false;
		if (Pies.getBounds().intersects(pared13.getBounds())){
			resultado13 = true;
		}
			return resultado13;
		}
	private boolean collision14(){
		boolean resultado14 = false;
		if (Pies.getBounds().intersects(pared14.getBounds())){
			resultado14 = true;
		}
			return resultado14;
		}
	private boolean collision15(){
		boolean resultado15 = false;
		if (Pies.getBounds().intersects(pared15.getBounds())){
			resultado15 = true;
		}
			return resultado15;
		}
	private boolean collision16(){
		boolean resultado16 = false;
		if (Pies.getBounds().intersects(pared16.getBounds())){
			resultado16 = true;
		}
			return resultado16;
		}
	private boolean collision17(){
		boolean resultado17 = false;
		if (Pies.getBounds().intersects(pared17.getBounds())){
			resultado17 = true;
		}
			return resultado17;
		}
	private boolean collision18(){
		boolean resultado18 = false;
		if (Pies.getBounds().intersects(pared18.getBounds())){
			resultado18 = true;
		}
			return resultado18;
		}
	private boolean collision19(){
		boolean resultado19 = false;
		if (Pies.getBounds().intersects(pared19.getBounds())){
			resultado19 = true;
		}
			return resultado19;
		}
	private boolean collision20(){
		boolean resultado20 = false;
		if (Pies.getBounds().intersects(pared20.getBounds())){
			resultado20 = true;
		}
			return resultado20;
		}
	private boolean collision21(){
		boolean resultado21 = false;
		if (Pies.getBounds().intersects(pared21.getBounds())){
			resultado21 = true;
		}
			return resultado21;
		}
	private boolean collision22(){
		boolean resultado22 = false;
		if (Pies.getBounds().intersects(pared22.getBounds())){
			resultado22 = true;
		}
			return resultado22;
		}
	private boolean collision23(){
		boolean resultado23 = false;
		if (Pies.getBounds().intersects(pared23.getBounds())){
			resultado23 = true;
		}
			return resultado23;
		}
	private boolean collision24(){
		boolean resultado24 = false;
		if (Pies.getBounds().intersects(pared24.getBounds())){
			resultado24 = true;
		}
			return resultado24;
		}
	private boolean collision25(){
		boolean resultado25 = false;
		if (Pies.getBounds().intersects(pared25.getBounds())){
			resultado25 = true;
		}
			return resultado25;
		}
	private boolean collision26(){
		boolean resultado26 = false;
		if (Pies.getBounds().intersects(pared26.getBounds())){
			resultado26 = true;
		}
			return resultado26;
		}
	private boolean collision27(){
		boolean resultado27 = false;
		if (Pies.getBounds().intersects(pared27.getBounds())){
			resultado27 = true;
		}
			return resultado27;
		}
	private boolean collision28(){
		boolean resultado28 = false;
		if (Pies.getBounds().intersects(pared28.getBounds())){
			resultado28 = true;
		}
			return resultado28;
		}
	private boolean collision29(){
		boolean resultado29 = false;
		if (Pies.getBounds().intersects(pared29.getBounds())){
			resultado29 = true;
		}
			return resultado29;
		}
	private boolean collision30(){
		boolean resultado30 = false;
		if (Pies.getBounds().intersects(pared30.getBounds())){
			resultado30 = true;
		}
			return resultado30;
		}
	private boolean collision31(){
		boolean resultado31 = false;
		if (Pies.getBounds().intersects(pared31.getBounds())){
			resultado31 = true;
		}
			return resultado31;
		}
	private boolean collision32(){
		boolean resultado32 = false;
		if (Pies.getBounds().intersects(pared32.getBounds())){
			resultado32 = true;
		}
			return resultado32;
		}
	private boolean collision33(){
		boolean resultado33 = false;
		if (Pies.getBounds().intersects(pared33.getBounds())){
			resultado33 = true;
		}
			return resultado33;
		}
	private boolean collision34(){
		boolean resultado34 = false;
		if (Pies.getBounds().intersects(pared34.getBounds())){
			resultado34 = true;
		}
			return resultado34;
		}
	private boolean collision35(){
		boolean resultado35 = false;
		if (Pies.getBounds().intersects(pared35.getBounds())){
			resultado35 = true;
		}
			return resultado35;
		}
	private boolean collision36(){
		boolean resultado36= false;
		if (Pies.getBounds().intersects(pared36.getBounds())){
			resultado36 = true;
		}
			return resultado36;
		}
	private boolean collision37(){
		boolean resultado37= false;
		if (Pies.getBounds().intersects(pared37.getBounds())){
			resultado37 = true;
		}
			return resultado37;
		}
	private boolean collision38(){
		boolean resultado38= false;
		if (Pies.getBounds().intersects(pared38.getBounds())){
			resultado38 = true;
		}
			return resultado38;
		}
	private boolean collision39(){
		boolean resultado39= false;
		if (Pies.getBounds().intersects(pared39.getBounds())){
			resultado39 = true;
		}
			return resultado39;
		}
	private boolean collision40(){
		boolean resultado40= false;
		if (Pies.getBounds().intersects(pared40.getBounds())){
			resultado40 = true;
		}
			return resultado40;
		}
	private boolean collision41(){
		boolean resultado41= false;
		if (Pies.getBounds().intersects(pared41.getBounds())){
			resultado41 = true;
		}
			return resultado41;
		}
}
