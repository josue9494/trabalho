package exercicio;

public class Compras {

	public float compraParc;
	public int parcelas=0;
	public float prešocompras=0.0f,total=0.0f;
	public boolean compraAvista;
	
	public float getcompraParcPJ(){
		return this.total;	
		}
	public void setcompraParcPJ(float prešocompras,int parcelas){
		if(parcelas>1){
			  this.total=prešocompras+(parcelas*5);
		}else{
			  this.total=prešocompras;
		  }
	}
	
	public float getcompraParcPF(){
		return this.total;	
		}
	public void setcompraParcPF(float prešocompras,int parcelas){
		if(parcelas>1){
			  this.total=prešocompras+(parcelas*3);
		}else{
			  this.total=prešocompras;
		  }
	}
	
    public float getcompraAvistaPF(){
		return this.total;
	}
	public void setcompraAvistaPF(float prešocompras){
		this.total=prešocompras-(5.0f);
	}
	
    public float getcompraAvistaPj(){
		return this.total;
	}
	public void setcompraAvistaPj(float prešocompras){
		this.total=prešocompras-(10.0f);
	}
	
	public boolean getcompraAvista(){
		return this.compraAvista;
	}
	
	public void setcompraAvista(boolean avista){
		this.compraAvista=avista;
	}
	
	
	
    
	
	
	
}
