package exercicio;

public class Compras {

	public float compraParc;
	public int parcelas=0;
	public float pre�ocompras=0.0f,total=0.0f;
	public boolean compraAvista;
	
	public float getcompraParcPJ(){
		return this.total;	
		}
	public void setcompraParcPJ(float pre�ocompras,int parcelas){
		if(parcelas>1){
			  this.total=pre�ocompras+(parcelas*5);
		}else{
			  this.total=pre�ocompras;
		  }
	}
	
	public float getcompraParcPF(){
		return this.total;	
		}
	public void setcompraParcPF(float pre�ocompras,int parcelas){
		if(parcelas>1){
			  this.total=pre�ocompras+(parcelas*3);
		}else{
			  this.total=pre�ocompras;
		  }
	}
	
    public float getcompraAvistaPF(){
		return this.total;
	}
	public void setcompraAvistaPF(float pre�ocompras){
		this.total=pre�ocompras-(5.0f);
	}
	
    public float getcompraAvistaPj(){
		return this.total;
	}
	public void setcompraAvistaPj(float pre�ocompras){
		this.total=pre�ocompras-(10.0f);
	}
	
	public boolean getcompraAvista(){
		return this.compraAvista;
	}
	
	public void setcompraAvista(boolean avista){
		this.compraAvista=avista;
	}
	
	
	
    
	
	
	
}
