package exercicio;

import javax.sound.midi.Synthesizer;

public class Principal {

	public static void main(String[] args) {
		Cliente c1= new Cliente();
		Compras c2=new Compras();
		
		c1.setpFisica(true);
		c2.setcompraAvista(true);
		
	if(c1.pessoaF==true){
		if(c2.compraAvista==true){
			c2.setcompraAvistaPF(30.0f);
			System.out.println(c2.getcompraAvistaPF());
		}else{
			c2.setcompraParcPF(30.0f, 5 );
			System.out.println(c2.getcompraParcPF());
		}
	}else{
		if(c2.compraAvista==true){
			c2.setcompraAvistaPj(1000.0f);
			System.out.println(c2.getcompraAvistaPj());
			
		}else{
			c2.setcompraParcPJ(100.0f, 4);
			System.out.println(c2.getcompraParcPJ());
		}
		}
		
	}

}
