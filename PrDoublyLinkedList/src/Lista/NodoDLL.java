package Lista;

public class NodoDLL {
	private NodoDLL next;
	private NodoDLL prev;
	private int Info;
public NodoDLL(NodoDLL pr,NodoDLL ne,int num){
	next= ne;
	prev=pr;
	Info=num;
}
public NodoDLL getPrev(){
	return prev;
}
public NodoDLL getNext(){
	return next;
}
public int getInfo(){
	return Info;
}
public void setPrev(NodoDLL newPrev){
	prev=newPrev;
}
public void setNext(NodoDLL newNext){
	next=newNext;
}
public void setInfo(int newDato){
	Info= newDato;
}


}
