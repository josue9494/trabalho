package exercicio;

public class Compras {

	public float compraParc;
	public int parcelas=0;
	public float preçocompras=0.0f,total=0.0f;
	public boolean compraAvista;
	
	public float getcompraParcPJ(){
		return this.total;	
		}
	public void setcompraParcPJ(float preçocompras,int parcelas){
		if(parcelas>1){
			  this.total=preçocompras+(parcelas*5);
		}else{
			  this.total=preçocompras;
		  }
	}
	
	public float getcompraParcPF(){
		return this.total;	
		}
	public void setcompraParcPF(float preçocompras,int parcelas){
		if(parcelas>1){
			  this.total=preçocompras+(parcelas*3);
		}else{
			  this.total=preçocompras;
		  }
	}
	
    public float getcompraAvistaPF(){
		return this.total;
	}
	public void setcompraAvistaPF(float preçocompras){
		this.total=preçocompras-(5.0f);
	}
	
    public float getcompraAvistaPj(){
		return this.total;
	}
	public void setcompraAvistaPj(float preçocompras){
		this.total=preçocompras-(10.0f);
	}
	
	public boolean getcompraAvista(){
		return this.compraAvista;
	}
	
	public void setcompraAvista(boolean avista){
		this.compraAvista=avista;
	}
	
	
	
    
	
	
	
}
