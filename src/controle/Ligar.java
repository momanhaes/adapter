package controle;

import dominio.Adaptador;
import dominio.TomadaDeTresPinos;

public class Ligar {
	 
    public static void main(String args[]) {
        
    	TomadaDeTresPinos t3 = new TomadaDeTresPinos();         
        Adaptador adapt = new Adaptador(t3);
        
        adapt.ligarNaTomadaDeDoisPinos();
    }
 
}
