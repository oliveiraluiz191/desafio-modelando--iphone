package aparelho;

import funcionalidades.funcoes.Funcionalidades;
import funcionalidades.musica.Musica;
import funcionalidades.musica.ReprodutorMusical;
import funcionalidades.telefone.AparelhoTelefonico;
import funcionalidades.telefone.Telefone;
import funcionalidades.internet.Internet;
import funcionalidades.internet.NavegadorInternet;

public class Iphone {
	
	public static void main(String[] args) {
		 	
		Funcionalidades fun = new Funcionalidades();		
		
		Musica musica = fun;
		musica.tocar();
		
		Internet internet = fun;
		internet.exibirPagina();
		
		Telefone fone = fun;
		fone.atender();
		
		System.out.println("=======================");
		
		ReprodutorMusical rm = new ReprodutorMusical();
		rm.selecionarMusica();
		
		NavegadorInternet ni = new NavegadorInternet();
		ni.atualizarPagina();
		
		AparelhoTelefonico at = new AparelhoTelefonico();
		at.iniciarCorreioDeVoz();	
		
		
	}

}
