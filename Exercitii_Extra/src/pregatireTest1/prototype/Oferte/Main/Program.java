package pregatireTest1.prototype.Oferte.Main;

import pregatireTest1.prototype.Oferte.Deep.IListaOferte;
import pregatireTest1.prototype.Oferte.Deep.ListaOferte;

public class Program {
	
	public static void main(String[]args) {
		IListaOferte listaOferte=new ListaOferte();
		listaOferte.incarcaListaOferte();
		
		IListaOferte copieListaOferte = null;
		copieListaOferte = listaOferte.copiaza();		
		
		System.out.println(copieListaOferte.toString());
		
	}

}
