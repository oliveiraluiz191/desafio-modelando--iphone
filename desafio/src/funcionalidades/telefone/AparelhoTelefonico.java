package funcionalidades.telefone;

public class AparelhoTelefonico implements Telefone {

	@Override
	public void ligar() {
		System.out.println("LIGANDO");
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
		
	}

}
