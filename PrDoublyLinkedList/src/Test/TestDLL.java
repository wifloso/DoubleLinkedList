package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Lista.*;

public class TestDLL  {
	
	private ListaDLL lista= new ListaDLL();
	@Before
	public void antes(){
		lista=new ListaDLL();
	}
	@Test
	public void ListaVacia(){
		assertEquals(true,lista.isEmpty());
	}
	@Test
	public void ListaUnElemento() {
		NodoDLL nodo= new NodoDLL(null, null, 1);
		lista.insertBeginning(nodo);
		assertEquals(nodo, lista.last());
		assertEquals(nodo, lista.first());
	}
	@Test
	public void ListaDiezElementosEnd(){
		for(int i=1;i<11;i++){
			lista.insertEnd(new NodoDLL(null,null,i));
		}
		NodoDLL test=lista.first();
		for(int i=1;i<11;i++){
			assertEquals(i,test.getInfo());
			test = test.getNext();
		}
	}
	@Test
	public void ListaDiezElementosBeginning(){
		for(int i=1;i<11;i++){
			lista.insertBeginning(new NodoDLL(null,null,i));
		}
		NodoDLL test=lista.last();
		for(int i=1;i<11;i++){
			assertEquals(i,test.getInfo());
			test = test.getPrev();
		}
	}
	@Test
	public void InsertBeforeFirst(){
		for(int i=1;i<11;i++){
			lista.insertEnd(new NodoDLL(null,null,i));
		}
		lista.insertBefore(lista.first(), new NodoDLL(null, null, 0));
		assertEquals(0, lista.first().getInfo());
	}
	@Test
	public void InsertAfterLast(){
		for(int i=1;i<11;i++){
			lista.insertEnd(new NodoDLL(null,null,i));
		}
		lista.insertAfter(lista.last(), new NodoDLL(null, null, 0));
		assertEquals(0, lista.last().getInfo());
	}
	@Test
	public void InsertAfterFirst(){
		for(int i=1;i<11;i++){
			lista.insertEnd(new NodoDLL(null,null,i));
		}
		lista.insertAfter(lista.first(), new NodoDLL(null, null, 0));
		assertEquals(0, lista.first().getNext().getInfo());
	}
	@Test
	public void InsertBeforeLast(){
		for(int i=1;i<11;i++){
			lista.insertEnd(new NodoDLL(null,null,i));
		}
		lista.insertBefore(lista.last(), new NodoDLL(null, null, 0));
		assertEquals(0, lista.last().getPrev().getInfo());
	}
	@Test
	public void RemivingLista(){
		NodoDLL nodo= new NodoDLL(null, null, 1);
		lista.insertBeginning(nodo);
		lista.removing(lista.first());
		assertEquals(null, lista.last());
	}
	@Test
	public void RemovingFirst(){
		for(int i=1;i<4;i++){
			lista.insertEnd(new NodoDLL(null,null,i));
		}
		lista.removing(lista.first());
		assertEquals(2, lista.first().getInfo());
		assertEquals(3, lista.last().getInfo());
	}
	@Test
	public void RemovingLast(){
		for(int i=1;i<4;i++){
			lista.insertEnd(new NodoDLL(null,null,i));
		}
		lista.removing(lista.last());
		assertEquals(1, lista.first().getInfo());
		assertEquals(2, lista.last().getInfo());
	}
	@Test
	public void RemovingOne(){
		for(int i=1;i<4;i++){
			lista.insertEnd(new NodoDLL(null,null,i));
		}
		lista.removing(lista.first().getNext());
		assertEquals(1, lista.first().getInfo());
		assertEquals(3, lista.last().getInfo());
	}
}
	

