package Elevadores;
import java.util.ArrayList;

public class Predio {
	
	
	
	public Predio(String passageiro, boolean TemPassageiro) {
		_elevador = new Elevador(0);
		_IsPassageiro = false;	
		_strPassageiro = passageiro;
		_IsPassageiro = TemPassageiro;
	}
	
	private String _strPassageiro;	

	private boolean _IsPassageiro;
	
	//private ArrayList<Boolean> _listPassageiros;
	
	private ArrayList<Boolean[]> _listaPassageiros = new ArrayList<Boolean[]>();
	

	private Boolean _listaIsPassageiros[] = {true, false, true, false, true, false};
	
	
	private Elevador _elevador;
	
	public boolean is_IsPassageiro() {
		return _IsPassageiro;
	}


	public void set_IsPassageiro(boolean _IsPassageiro) {
		this._IsPassageiro = _IsPassageiro;
	}
	
	public String get_strPassageiro() {
		return _strPassageiro;
	}


	public void set_strPassageiro(String _strPassageiro) {
		this._strPassageiro = _strPassageiro;
	}


	public ArrayList<Boolean[]> get_listaPassageiros() {
		return _listaPassageiros;
	}


//	public ArrayList<Boolean> get_listPassageiros() {
//		return _listPassageiros;
//	}
//
//
//	public void set_listPassageiros(ArrayList<Boolean> _listPassageiros) {
//		this._listPassageiros = _listPassageiros;
//	}


	public ArrayList<Boolean[]> get_listaAndares() {
		return _listaPassageiros;
	}


	public void set_listaPassageiros(ArrayList<Boolean[]> _listaPassageiros) {
		_listaPassageiros.add(get_listaIsPassageiros());
		this._listaPassageiros = _listaPassageiros;
	}


	public Boolean[] get_listaIsPassageiros() {
		return _listaIsPassageiros;
	}


	public void set_listaIsPassageiros(Boolean[] _listaIsPassageiros) {
		this._listaIsPassageiros = _listaIsPassageiros;
	}


	public Elevador get_elevador() {
		return _elevador;
	}


	public void set_elevador(Elevador _elevador) {
		this._elevador = _elevador;
	}


	


	
	

	
}
