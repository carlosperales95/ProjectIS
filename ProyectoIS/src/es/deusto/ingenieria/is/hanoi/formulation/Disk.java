package es.deusto.ingenieria.is.hanoi.formulation;

public class Disk {

	private int size;

	public Disk(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	
	public boolean isBigger(Disk r){
		return this.size > r.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String toString(){
		return "Disk size is: " + size;
	}

	
	public boolean equals(Object obj){
		if(obj != null && obj instanceof Disk){
			Disk diskAux = (Disk) obj;
			if(this.size == diskAux.size){
				return true;
			}
			else{
				return false;				
			}
		}
		return false;
	}
	
	
	
	@Override
	public Disk clone() {
		return new Disk(this.size);
	}
	
}
