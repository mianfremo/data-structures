package structures;

public class Lista{
	protected int head;
	protected Lista cola = null;

	//Constructor por defecto
	public Lista(){

	}

	//Constructor para numero de elementos indeterminados
	public Lista(int... args){
		boolean flag = false;

		for (int arg: args){

			if(flag == false){
				this.setHead(arg);
				flag = true;
			}else{
				this.append(arg);
			}

		}
	}

	//Constructor clonar
	public Lista(Lista copy){
		this.head = copy.getHead();
		this.cola = copy.getCola();
	}

	//GETERS Y SETTERS

	public int getHead(){
		return this.head;
	}

	public Lista getCola(){
		return this.cola;
	}

	public void setCola(Lista cola){
		this.cola = cola;
	}

	public void setHead(int head){
		this.head = head;
	}

	//Función que añade el elemento al final de la lista

	public void append(int e){

		Lista nodo = this;

		boolean flag = false;

		while(flag == false){
			if(nodo.getCola()==null){
				nodo.setCola(new Lista(e));
				flag = true;
			}else{
				nodo = nodo.getCola();
			}
		}
	}

	//Función que añade el elemento al principio de la lista

	public void preppend(int e){

		//Establece la cola como una copia del elemento actual

		this.setCola(new Lista(this));

		//Agrega el elemento al head

		this.setHead(e);
		

	}

	//Función que imprime la lista completa
	
	public void print(){

		Lista nodo = this;

		while(nodo != null){
			System.out.println(nodo.getHead());
			nodo = nodo.getCola();
		}
	}
}