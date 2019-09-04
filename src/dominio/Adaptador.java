package dominio;

public class Adaptador extends TomadaDeDoisPinos {
    
	private TomadaDeTresPinos tomadaDeTresPinos;
 
    public Adaptador(TomadaDeTresPinos tomadaDeTresPinos) {
        this.tomadaDeTresPinos = tomadaDeTresPinos;
    }
 
    public void ligarNaTomadaDeDoisPinos() {
        tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
    }
}
