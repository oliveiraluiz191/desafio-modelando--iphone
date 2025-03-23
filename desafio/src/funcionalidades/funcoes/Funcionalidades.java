package funcionalidades.funcoes;

import funcionalidades.internet.Internet;
import funcionalidades.musica.Musica;
import funcionalidades.telefone.Telefone;

public class Funcionalidades implements Telefone, Internet, Musica {

	@Override
	public void tocar() {
		System.out.println("TOCANDO VIA FUNCIONALIDADES");
		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO VIA FUNCIONALIDADES");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MUSICA VIA FUNCIONALIDADES");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA VIA FUNCIONALIDADES");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA VIA FUNCIONALIDADES");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA VIA FUNCIONALIDADES");
		
	}

	@Override
	public void ligar() {
		System.out.println("LIGANDO VIA FUNCIONALIDADES");
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO VIA FUNCIONALIDADES");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ VIA FUNCIONALIDADES");
		
	}

}
