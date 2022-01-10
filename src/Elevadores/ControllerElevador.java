package Elevadores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JLabel;




public class ControllerElevador {
	
	private boolean chegounoAndar;// finalizada;

	private Map<Integer, Elevador> ElevadorChegou; // CarroChegada;

	private static ControllerElevador controllerElevador;
	
	private static final int poicaoElevador = 360; // posicao x
	
	private static final int posicaoFora = 450; // posicao x
	
	private static final int posicaoSaiPassageiro = 200; // posicao x
	
	private static int posicao;
	private String strEsta;
	
	private Predio _predio = new Predio(null, false);
	
	private static final int _Max_time = 3000;
	
	private ArrayList<Predio> ListaPassageiroNoPredio = new ArrayList<Predio>();
	
	private ArrayList<JLabel> ListaObjBonecos = new ArrayList<JLabel>();

	public ControllerElevador() {
		chegounoAndar = false;
		posicao = 1;
	}

	public void AbrirPorta(ArrayList<JLabel> ListadeBonecos) {	
		int i = 0;
		chegounoAndar = true;;
		//loop: 
//		_fundo.setBounds(-150, -130, 1000, 900);
//		_fundo.setIcon(new ImageIcon("Imagem/Fundo.png"));
		for(boolean meuPassageiro: _predio.get_listaIsPassageiros())
		{
			
			if(_predio.get_strPassageiro() == null)
			{					
				_predio.set_strPassageiro("Passageiro " + (i+1));
				_predio.set_strPassageiro(null);
				
				if(meuPassageiro == true)
				{
					strEsta = " tem ";
					
				}
				else
				{
					strEsta = " não tem ";
				}
				
				System.out.println("Andar " + (i+1) + " do predio " + strEsta + " passageiro ");
				
			}
			
			_predio.set_IsPassageiro(meuPassageiro);
			
			ListaPassageiroNoPredio.add(new Predio("Andar " + (i+1), meuPassageiro));
			
			i++;
			//break loop;
			
		}
		
		i = 0;
		
		
		for(JLabel meuBoneco : ListadeBonecos) 
        {
			ListaObjBonecos = ListadeBonecos;
			
			ArrayList<Predio> obj =  ListaPassageiroNoPredio; //ListaPassageiroNoPredio.get(i);
			Loop:
			for (int j = 0; j < obj.size();) {
				meuBoneco.setVisible(obj.get(i).is_IsPassageiro());		
				   
				   if(obj.get(i).get_strPassageiro().equals("Andar 1") && obj.get(i).is_IsPassageiro() == true)
					{
					   chegounoAndar = true;
						meuBoneco.setBounds(posicaoFora, 550, 100, 100);
						EsperaTempo();
						meuBoneco.setBounds(poicaoElevador, 550, 100, 100);
						meuBoneco.setVisible(obj.get(i).is_IsPassageiro());						
						System.out.println("merda parada " + i);
					}
				   
					if(obj.get(i).get_strPassageiro().equals("Andar 2") && obj.get(i).is_IsPassageiro() == true)
					{
						chegounoAndar = true;
						System.out.println("Andar 2");
						meuBoneco.setBounds(posicaoFora, 453, 100, 100);
						//meuBoneco.setVisible(meuPredio.is_IsPassageiro());
						meuBoneco.setVisible(obj.get(i).is_IsPassageiro());	
						FecharPorta(ListadeBonecos, meuBoneco, i);
					}
					if(obj.get(i).get_strPassageiro().equals("Andar 3") && obj.get(i).is_IsPassageiro() == true) 
					{
						chegounoAndar = true;
						System.out.println("Andar 3 ");
						meuBoneco.setBounds(posicaoFora, 337, 100, 100);
						//meuBoneco.setVisible(meuPredio.is_IsPassageiro());
						meuBoneco.setVisible(obj.get(i).is_IsPassageiro());		
						
					}
					if(obj.get(i).get_strPassageiro().equals("Andar 4") && obj.get(i).is_IsPassageiro() == true) 
					{
						chegounoAndar = true;
						System.out.println("merda parada 4");
						meuBoneco.setBounds(posicaoFora, 223, 100, 100);
						//meuBoneco.setVisible(meuPredio.is_IsPassageiro());
						meuBoneco.setVisible(obj.get(i).is_IsPassageiro());		
						
					}
					if(obj.get(i).get_strPassageiro().equals("Andar 5") && obj.get(i).is_IsPassageiro() == true)
					{
						chegounoAndar = true;
						meuBoneco.setBounds(posicaoFora, 119, 100, 100);
						System.out.println("merda parada 5");
						//meuBoneco.setVisible(meuPredio.is_IsPassageiro());
						meuBoneco.setVisible(obj.get(i).is_IsPassageiro());		
						
					}
					if(obj.get(i).get_strPassageiro().equals("Andar 6") && obj.get(i).is_IsPassageiro() == true) 
					{
						chegounoAndar = true;
						meuBoneco.setBounds(posicaoFora, 18, 100, 100);
						System.out.println("merda parada 6");
						//meuBoneco.setVisible(meuPredio.is_IsPassageiro());
						meuBoneco.setVisible(obj.get(i).is_IsPassageiro());		
						
					}
					i++;
				  break Loop;
			}
			
//			for(Predio meuPredio: ListaPassageiroNoPredio)
//			{
//				
//				Loop:
//				if(meuPredio.get_strPassageiro().equals("Andar 1") && meuPredio.is_IsPassageiro() == true)
//				{
//					meuBoneco.setBounds(posicaoFora, 550, 100, 100);
//					EsperaTempo();
//					meuBoneco.setBounds(poicaoElevador, 550, 100, 100);
//					meuBoneco.setVisible(meuPredio.is_IsPassageiro());
//					break Loop;
//				}
//				
//				if(meuPredio.get_strPassageiro().equals("Andar 2") && meuPredio.is_IsPassageiro() == true)
//					{
//						System.out.println("merda parada 2");
//						meuBoneco.setBounds(posicaoFora, 453, 100, 100);
//						meuBoneco.setVisible(meuPredio.is_IsPassageiro());
//					}
//				if(meuPredio.get_strPassageiro().equals("Andar 3") && meuPredio.is_IsPassageiro() == true) 
//					{
//						System.out.println("merda parada 3");
//						meuBoneco.setBounds(posicaoFora, 337, 100, 100);
//						meuBoneco.setVisible(meuPredio.is_IsPassageiro());
//						
//					}
//				if(meuPredio.get_strPassageiro().equals("Andar 4") && meuPredio.is_IsPassageiro() == true) 
//					{
//						System.out.println("merda parada 4");
//						meuBoneco.setBounds(posicaoFora, 223, 100, 100);
//						meuBoneco.setVisible(meuPredio.is_IsPassageiro());
//						
//					}
//				if(meuPredio.get_strPassageiro().equals("Andar 5") && meuPredio.is_IsPassageiro() == true)
//					{
//						meuBoneco.setBounds(posicaoFora, 119, 100, 100);
//						System.out.println("merda parada 5");
//						meuBoneco.setVisible(meuPredio.is_IsPassageiro());
//						
//					}
//				if(meuPredio.get_strPassageiro().equals("Andar 6") && meuPredio.is_IsPassageiro() == true) 
//					{
//						meuBoneco.setBounds(posicaoFora, 18, 100, 100);
//						System.out.println("merda parada 6");
//						meuBoneco.setVisible(meuPredio.is_IsPassageiro());
//						
//					}
//				
//			}
			
        }
		
		System.out.println("Abrir Portar!!!");
	}

	public void FecharPorta(ArrayList<JLabel> ListadePortas, JLabel Porta, int indice) {
		System.out.println("Fechar Porta!!!");
		ArrayList<Predio> obj1 =  ListaPassageiroNoPredio;
		int i = 0;
		if(chegounoAndar)
		{
			//ListaObjBonecos.get(indice).setVisible(false);
			
			Loop:
			for(JLabel minhaPorta : ListadePortas) 
	        {
				ArrayList<Predio> obj =  ListaPassageiroNoPredio; //ListaPassageiroNoPredio.get(i);
				
				for (int j = 0; j < obj.size();) {
					
					EsperaTempo();
					Porta.setVisible(false);
					//ListaObjBonecos.get(j).setVisible(false);
					//i++;
					break Loop;
				}
				
	        }
			
			
			
		}
			
		
		System.out.println("Fuiii" + obj1.get(1).get_strPassageiro());
		
	}

	public void VisitarAndar(ArrayList<JLabel> ListadePortas, JLabel Porta) {
		ArrayList<Predio> obj1 =  ListaPassageiroNoPredio;
		int i = 0;
		int andarSolicitado = 2;
		Elevador elevador = new Elevador(2);	
		chegounoAndar = false;
		MovimentaElevadorBoneco(ListadePortas,Porta, andarSolicitado);
		
		
		FecharPorta(ListadePortas, Porta, andarSolicitado);
		Loop:
		for(Predio _predioaux : obj1)
		{
			if(obj1.get(i).is_IsPassageiro() == true && andarSolicitado != i);
			{
				if(i <= 6)
				{
					chegounoAndar = false;
					MovimentaElevadorBoneco(ListadePortas,Porta, i + 1);
					//chegounoAndar = false;
				}
				else 
				break Loop;
				
			}
		    ++i;
			//
		}
		
		System.out.println("Visitando Andares!!!");
	}
	
	
	public void MovimentaElevadorBoneco(ArrayList<JLabel> ListadePortas, JLabel Porta, int andarSolicitado)
	{
		int i = 0;
		Loop:
		for(JLabel minhaPorta : ListadePortas) 
        {
			ArrayList<Predio> objPortas =  ListaPassageiroNoPredio; //ListaPassageiroNoPredio.get(i);
			
			
			for (int x = 0; x < objPortas.size();) {

				if (andarSolicitado == 1  && chegounoAndar == false && objPortas.get(x).is_IsPassageiro() == true) {
					//chegounoAndar = true;
					objPortas.get(x).set_IsPassageiro(false);
						
					ListaPassageiroNoPredio = objPortas;
					Porta.setBounds(poicaoElevador, 550, 100, 100);
					Porta.setVisible(true); 
					break Loop;
				}else

				if (andarSolicitado == 2 && chegounoAndar == false && objPortas.get(x).is_IsPassageiro() == true) {
					objPortas.get(x).set_IsPassageiro(false);
						
					ListaPassageiroNoPredio =objPortas;
					Porta.setBounds(poicaoElevador, 453, 100, 100);
					Porta.setVisible(true); 
					break Loop;

				}else
				if (andarSolicitado == 3 && chegounoAndar == false && objPortas.get(x).is_IsPassageiro() == true) {
					objPortas.get(x).set_IsPassageiro(false);
						
						ListaPassageiroNoPredio =objPortas;
					Porta.setBounds(poicaoElevador, 337, 100, 100);
					Porta.setVisible(true);
					break Loop;

				}else
				if (andarSolicitado == 4 && chegounoAndar == false && objPortas.get(x).is_IsPassageiro() == true) {
					objPortas.get(x).set_IsPassageiro(false);
						
						ListaPassageiroNoPredio =objPortas;
					Porta.setBounds(poicaoElevador, 223, 100, 100);
					Porta.setVisible(true);
					break Loop;
				}else
				if (andarSolicitado == 5 && chegounoAndar == false && objPortas.get(x).is_IsPassageiro() == true) {
					objPortas.get(x).set_IsPassageiro(false);
						
						ListaPassageiroNoPredio =objPortas;
					Porta.setBounds(poicaoElevador, 119, 100, 100);
					Porta.setVisible(true);
					break Loop;

				}else
				if (andarSolicitado == 6 && chegounoAndar == false && objPortas.get(x).is_IsPassageiro() == true) {
					//objPortas.get(x).set_IsPassageiro(false);
						
					ListaPassageiroNoPredio = objPortas;
					Porta.setBounds(poicaoElevador, 18, 100, 100);
					Porta.setVisible(true);
					break Loop;
				}
				x++;
				//ListaObjBonecos.get(x-1).setVisible(true);
				// i++;
				//break Loop;
				
			}
			
        }
		Loop:
		for(JLabel meuBoneco : ListaObjBonecos) 
        {
			//ListaObjBonecos = ListaObjBonecos;
			
			ArrayList<Predio> obj =  ListaPassageiroNoPredio; //ListaPassageiroNoPredio.get(i);
			
			for (int j = 0; j < obj.size();) {
				//meuBoneco.setVisible(obj.get(i).is_IsPassageiro());		
				   
				   if(andarSolicitado == 1  && obj.get(j).is_IsPassageiro() == true)
					{
					   chegounoAndar = true;
					    
						obj.get(j).set_IsPassageiro(false);
					   meuBoneco.setBounds(poicaoElevador, 550, 100, 100);
					   meuBoneco.setVisible(true);
						EsperaTempo();
						meuBoneco.setBounds(posicaoSaiPassageiro, 550, 100, 100);
						ListaPassageiroNoPredio = obj;						
						System.out.println("merda parada " + i);
						break Loop;
					}
				   
					if(andarSolicitado == 2  && obj.get(j).is_IsPassageiro() == true)
					{
						
						 chegounoAndar = true;
						 meuBoneco.setBounds(poicaoElevador, 453, 100, 100);
						 meuBoneco.setVisible(true);
							EsperaTempo();
							meuBoneco.setBounds(posicaoSaiPassageiro, 453, 100, 100);
							obj.get(j).set_IsPassageiro(false);	
							ListaPassageiroNoPredio = obj;
							//System.out.println("merda parada " + i);
						
						System.out.println("merda parada 2");
						
						//meuBoneco.setVisible(meuPredio.is_IsPassageiro());
						meuBoneco.setVisible(true);		
						break Loop;
					}
					if(andarSolicitado == 3  && obj.get(j).is_IsPassageiro() == true) 
					{
						System.out.println("merda parada 3");
						meuBoneco.setBounds(posicaoSaiPassageiro, 337, 100, 100);
						//meuBoneco.setVisible(meuPredio.is_IsPassageiro());
						meuBoneco.setVisible(true);	
						obj.get(j).set_IsPassageiro(false);
						ListaPassageiroNoPredio = obj;
						break Loop;
						
					}
					if(andarSolicitado == 4  && obj.get(j).is_IsPassageiro() == true) 
					{
						System.out.println("merda parada 4");
						meuBoneco.setBounds(posicaoSaiPassageiro, 223, 100, 100);
						//meuBoneco.setVisible(meuPredio.is_IsPassageiro());
						meuBoneco.setVisible(true);		
						obj.get(j).set_IsPassageiro(false);
						ListaPassageiroNoPredio = obj;
						break Loop;
						
					}
					if(andarSolicitado == 5  && obj.get(j).is_IsPassageiro() == true)
					{
						meuBoneco.setBounds(posicaoSaiPassageiro, 119, 100, 100);
						System.out.println("merda parada 5");
						//meuBoneco.setVisible(meuPredio.is_IsPassageiro());
						meuBoneco.setVisible(true);	
						obj.get(j).set_IsPassageiro(false);
						ListaPassageiroNoPredio = obj;
						break Loop;
						
					}
					if(andarSolicitado == 6  && obj.get(j).is_IsPassageiro() == true) 
					{
						meuBoneco.setBounds(posicaoSaiPassageiro, 18, 100, 100);
						System.out.println("merda parada 6");
						//meuBoneco.setVisible(meuPredio.is_IsPassageiro());
						meuBoneco.setVisible(true);	
						obj.get(j).set_IsPassageiro(false);
						ListaPassageiroNoPredio = obj;
						break Loop;
					}
					j++;
					
//				  break Loop;
			}
		
		
        }
		
	}

	public static ControllerElevador getInstance() {

		if (controllerElevador == null) {
			controllerElevador = new ControllerElevador();
		}

		return controllerElevador;
	}

	public void chegounoAndar(Elevador elevador) {

		if (ElevadorChegou == null) {
			ElevadorChegou = new HashMap<>();
			posicao = 1;
		}

		ElevadorChegou.put(posicao++, elevador);

		if (ElevadorChegou.size() == 5) {
			chegounoAndar = true;
		}
	}


	public boolean isFinalizada() {
		return chegounoAndar;
	}

	public Map<Integer, Elevador> getAndarChegada() {
		return ElevadorChegou;
	}
	
	
	private void EsperaTempo() {
        int tempo = (int) (Math.random() * _Max_time);
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        }
    }
	}
	
	    

