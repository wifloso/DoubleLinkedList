
public class NodoDLL {
	private NodoDLL next;
	private NodoDLL prev;
	private int dato;
public NodoDLL(NodoDLL pr,NodoDLL ne,int num){
	next= ne;
	prev=pr;
	dato=num;
}
public NodoDLL getPrev(){
	return prev;
}
public NodoDLL getNext(){
	return next;
}
public int getDato(){
	return dato;
}
public void setPrev(NodoDLL newPrev){
	prev=newPrev;
}
public void setNext(NodoDLL newNext){
	next=newNext;
}
public void setDato(int newDato){
	dato= newDato;
}


}
