package funcionalidades.musica;

public class ReprodutorMusical implements Musica {

	@Override
	public void tocar() {
		System.out.println("TOCANDO MUSICA NO REPRODUTOR MUSICAL");
		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MUSICA REPRODUTOR MUSICAL");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MUSICA REPRODUTOR MUSICAL");
		
	}

}
