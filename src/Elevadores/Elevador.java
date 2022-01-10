package Elevadores;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Elevador {

	
	private boolean porta;
	private int passageiro;

//	private ControllerElevador controllerElevador;

	ArrayList<int[]> ListaAndares = new ArrayList<int[]>();

	int andares[] = { 1, 2, 3, 4, 5, 6 };

	public Elevador(int _andar) {
		

	}

//	private void cruzarChegadaDeAndares() {
//		try {
//			SM.acquire();
//			controllerElevador.chegounoAndar();
//			// System.out.println(new String("Você Chegou no " +);
//			SM.release();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	public boolean isPorta() {
		return porta;
	}

	public void setPorta(boolean porta) {
		this.porta = porta;
	}

	public int getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(int passageiro) {
		this.passageiro = passageiro;
	}

	public int[] getAndares() {
		return andares;
	}

	public void setAndares(int[] andares) {
		this.andares = andares;
	}

	public void setListaAndares(ArrayList<int[]> listaAndares) {
		listaAndares.add(getAndares());
		ListaAndares = listaAndares;
	}

//	@Override
//	public void run() {
//
////		cruzarChegadaDeAndares();
//
//	}

}
