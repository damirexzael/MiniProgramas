
public class SuperList {
	private Object[] datos;
	private int ult_dato;
	private int actual;
	
	public SuperList() {
		datos = new Object[100];
		ult_dato = -1;
		actual = -1;
	}
	
	public boolean add(Object value) {
		if(this.length() < 100) {
			this.datos[this.ult_dato+1]=value;
			this.ult_dato++;
			return true;
		}
		return false;
	}
	
	public Object delete() {
		Object borrado=datos[actual];
		for(int i=actual;i<ult_dato && datos[i]!=null; i++)
		{
			datos[i]=datos[i+1];
		}
		ult_dato--;
		return borrado;
	}
	
	public void next() {
		if(actual<ult_dato)
				actual++;
	}
	
	public Object currElement() {
		if(length()==0) {
			return null;
		}
		else
		return datos[actual];
	}
	
	public void setFirst() {
		actual=0;
	}
	
	public int length() {
		return ult_dato+1;
		
	}
	
	
}
