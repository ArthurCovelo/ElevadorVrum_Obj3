package Elevadores;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
	
	ControllerElevador Controller = new ControllerElevador();
	
	JLabel fundo;
	

	public static void main(String[] args) {

		// System.out.print("Arthur Covelo!!!");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		Main frame = new Main();

	}

	public Main() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 683);
		setResizable(false);

		JLabel Elevador = new JLabel();
		Elevador.setBounds(360, 550, 100, 150);
		Elevador.setIcon(new ImageIcon("Imagem/Elevador.png"));
		
		ArrayList<JLabel> ListadePortas = new ArrayList<JLabel>();
		
		JLabel Porta1 = new JLabel();
		Porta1.setBounds(460, 550, 10, 150);
		Porta1.setIcon(new ImageIcon("Imagem/Porta.png"));
		ListadePortas.add(Porta1);
		
		JLabel PortaGalho = new JLabel();
		PortaGalho.setBounds(0, 0, 0, 0);
		PortaGalho.setIcon(new ImageIcon("Imagem/Porta.png"));
		

		JLabel Porta2 = new JLabel();
		Porta2.setBounds(460, 453, 10, 90);
		Porta2.setIcon(new ImageIcon("Imagem/Porta.png"));
		ListadePortas.add(Porta2);


		JLabel Porta3 = new JLabel();
		Porta3.setBounds(460, 337, 10, 95);
		Porta3.setIcon(new ImageIcon("Imagem/Porta.png"));
		ListadePortas.add(Porta3);


		JLabel Porta4 = new JLabel();
		Porta4.setBounds(460, 223, 10, 88);
		Porta4.setIcon(new ImageIcon("Imagem/Porta.png"));
		ListadePortas.add(Porta4);


		JLabel Porta5 = new JLabel();
		Porta5.setBounds(460, 119, 10, 86);
		Porta5.setIcon(new ImageIcon("Imagem/Porta.png"));
		ListadePortas.add(Porta5);


		JLabel Porta6 = new JLabel();
		Porta6.setBounds(460, 18, 10, 81);
		Porta6.setIcon(new ImageIcon("Imagem/Porta.png"));
		ListadePortas.add(Porta6);


		fundo = new JLabel();
		fundo.setBounds(-150, -130, 1000, 900);
		fundo.setIcon(new ImageIcon("Imagem/Fundo.png"));
		

		ArrayList<JLabel> ListadeBonecos = new ArrayList<JLabel>();

		JLabel boneco = new JLabel();
		boneco.setBounds(470, 550, 100, 100);
		boneco.setIcon(new ImageIcon("Imagem/Boneco.png"));
		boneco.setVisible(false);
		ListadeBonecos.add(boneco);
		
		add(boneco);

		JLabel boneco2 = new JLabel();
		boneco2.setBounds(470, 453, 100, 100);
		boneco2.setIcon(new ImageIcon("Imagem/Boneco.png"));
	    boneco2.setVisible(false);
		ListadeBonecos.add(boneco2);

		add(boneco2);

		JLabel boneco3 = new JLabel();
		boneco3.setBounds(470, 337, 100, 100);
		boneco3.setIcon(new ImageIcon("Imagem/Boneco.png"));
		boneco3.setVisible(false);
		ListadeBonecos.add(boneco3);

		add(boneco3);

		JLabel boneco4 = new JLabel();
		boneco4.setBounds(470, 223, 100, 100);
		boneco4.setIcon(new ImageIcon("Imagem/Boneco.png"));
		boneco4.setVisible(false);
		ListadeBonecos.add(boneco4);

		add(boneco4);

		JLabel boneco5 = new JLabel();
		boneco5.setBounds(470, 119, 100, 100);
		boneco5.setIcon(new ImageIcon("Imagem/Boneco.png"));
		boneco5.setVisible(false);
		// boneco2.enable(false);
		ListadeBonecos.add(boneco5);

		add(boneco5);

		JLabel boneco6 = new JLabel();
		boneco6.setBounds(470, 18, 100, 100);
		boneco6.setIcon(new ImageIcon("Imagem/Boneco.png"));
		boneco6.setVisible(false);
		ListadeBonecos.add(boneco6);

		add(boneco6);

		add(Porta1);
		add(Porta2);
		add(Porta3);
		add(Porta4);
		add(Porta5);
		add(Porta6);
//		
		add(Elevador);

		add(fundo);
		
		add(PortaGalho);

		repaint(100);

		Controller.AbrirPorta(ListadeBonecos);
		Controller.FecharPorta(ListadePortas, Elevador, 1);
		Controller.VisitarAndar(ListadePortas, Elevador);
	}

}
