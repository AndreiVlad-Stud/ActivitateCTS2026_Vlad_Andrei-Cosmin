package prototype.Oferte.Main;

import prototype.Oferte.Deep.IListaOferte;
import prototype.Oferte.Deep.ListaOferte;

public class Program {
	
	public static void main(String[]args) {
		IListaOferte listaOferte=new ListaOferte();
		listaOferte.incarcaListaOferte();
		
		IListaOferte copieListaOferte = null;
		copieListaOferte = listaOferte.copiaza();		
		
		System.out.println(copieListaOferte.toString());
		
	}

}
