package iPhoneComponent;

public class Iphone implements MusicPlayer, InternetBrowser, Telephone{

	private MusicPlayer musicPlayer;
	private InternetBrowser internetBrowser;
	private Telephone telephone;
	
	@Override
	public void play() {
		System.out.println("Tocando música...");
		
	}

	@Override
	public void pause() {
		System.out.println("Pausando música...");
		
	}

	@Override
	public void selectSong() {
		System.out.println("Selecionando música...");
		
	}

	@Override
	public void dial() {
		System.out.println("Discando...");
		
	}

	@Override
	public void answer() {
		System.out.println("Atendendo telefone...");
		
	}

	@Override
	public void startVoiceMail() {
		System.out.println("Correio de voz...");
		
	}

	@Override
	public void displayPage() {
		System.out.println("Exibindo página...");
		
	}

	@Override
	public void addNewTab() {
		System.out.println("Adcionando nova aba...");
		
	}

	@Override
	public void refreshPage() {
		System.out.println("Atualizando página...");
	
	}
}
