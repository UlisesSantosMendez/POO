

class Stack {
        private int elementos[];
        private int tope= 0;
	public Stack(int n)
	{
		elementos=new int[n];
		tope=0;
	}
	public int pop(){
                tope--;
		return elementos[tope];
	}
	public void push(int dato){
		elementos[tope]=dato;
		tope++;
	}
        public boolean estaVacia(){
		return tope==0;
	}
	public int top(){
		return elementos[tope-1];
	}
}
