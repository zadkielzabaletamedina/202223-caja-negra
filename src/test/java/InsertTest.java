import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class InsertTest {
	private BinaryTree arbolSoloRaiz;
	private BinaryTree arbolVariosNiveles;
	private BinaryTree arbolSoloRaizHijoIzq;
	private BinaryTree arbolSoloRaizHijoDcha;
	private BinaryTree arbolVariosNivelesHijoIzq;
	private BinaryTree arbolVariosNivelesHijoDcha;
	
	private Node raizArbolSoloRaiz;
	private Node nodoArbolVariosNiveles;
	
	private Node nodoArbolVariosNivelesConHijoIzq;
	private Node nodoArbolVariosNivelesConHijoDcha;
	
	private Node nodoNoEnElArbol;

	

	
	
	@BeforeEach
	void setUp() {
	    	
	    arbolSoloRaiz = Util.crearArbolSoloRaiz();
	    raizArbolSoloRaiz=arbolSoloRaiz.getRoot();
	    
	    arbolSoloRaizHijoIzq= Util.crearArbolSoloHijoIzquierda();
	    arbolSoloRaizHijoDcha= Util.crearArbolSoloHijoDerecha();
	    

		arbolVariosNiveles = Util.crearArbolTresNiveles();
		nodoArbolVariosNiveles=arbolVariosNiveles.getRoot().getLeftChild().getLeftChild();
		nodoArbolVariosNivelesConHijoIzq= arbolVariosNiveles.getRoot().getLeftChild();

				
		arbolVariosNivelesHijoIzq= Util.crearArbolCuatroNivelesIzq();
		
		
		arbolVariosNivelesHijoDcha= Util.crearArbolCuatroNivelesDcha();
		nodoArbolVariosNivelesConHijoDcha= arbolVariosNivelesHijoDcha.getRoot().getLeftChild().getLeftChild();


		
		nodoNoEnElArbol= new Node("6");
		

	}
	//Content v, nodo no, true, un nodo
	@Test 
	void arbolSoloRaizNodoNoIzquierda() {
		assertThrows(Exception.class, ()-> arbolSoloRaiz.insert("5", nodoNoEnElArbol, true));
	}
	//Content v, nodo no, true, varios
	@Test
	void arbolVariosNodoNoIzquierda() {
		assertThrows(Exception.class, ()-> arbolVariosNiveles.insert("5", nodoNoEnElArbol, true));
	}
	//Content v, nodo no, false, un nodo
	@Test
	void arbolSoloRaizNodoNoDerecha() {
		assertThrows(Exception.class, ()-> arbolSoloRaiz.insert("5", nodoNoEnElArbol, false));
	}
	//Content v, nodo no, false, varios
	@Test
	void arbolVariosNodoNoDerecha() {
		assertThrows(Exception.class, ()-> arbolVariosNiveles.insert("5", nodoNoEnElArbol, false));
	}
	//Content v, nodo existe pero con hijo, true, varios
	@Test
	void arbolVariosConNodoPeroHijoIzquierda() {
		assertThrows(Exception.class, ()-> arbolVariosNiveles.insert("5", nodoArbolVariosNivelesConHijoIzq, true));
	}
	//Content v, nodo existe pero con hijo, false, varios
	@Test
	void arbolVariosConNodoPeroHijoDerecha() {
		assertThrows(Exception.class, ()-> arbolVariosNivelesHijoDcha.insert("5", nodoArbolVariosNivelesConHijoDcha, false));
	}
	//Content v, nodo si, true, un nodo
	@Test
	void arbolRaizConNodoIzquierda() {
		arbolSoloRaiz.insert("2", raizArbolSoloRaiz, true);
		assertTrue(Util.arbolesIguales(arbolSoloRaizHijoIzq, arbolSoloRaiz));
	}
	//Content v, nodo si, true, varios
	@Test
	void arbolVariosConNodoIzquierda() {
		arbolVariosNiveles.insert("5", nodoArbolVariosNiveles, true);
		assertTrue(Util.arbolesIguales(arbolVariosNivelesHijoIzq, arbolVariosNiveles));
	}
	//Content v, nodo si, false, un nodo
	@Test
	void arbolRaizConNodoDerecha() {
		arbolSoloRaiz.insert("2", raizArbolSoloRaiz, false);
		assertTrue(Util.arbolesIguales(arbolSoloRaizHijoDcha, arbolSoloRaiz));
	}
	//Content v, nodo si, false, varios
	@Test
	void arbolVariosConNodoDerecha() {
		arbolVariosNiveles.insert("5", nodoArbolVariosNiveles, false);
		assertTrue(Util.arbolesIguales(arbolVariosNivelesHijoDcha, arbolVariosNiveles));
	}
	//content in, nodo no, true, uno
	void arbolRaizNodoNoIzquierdaContentNo() {
		assertThrows(Exception.class, ()-> arbolSoloRaiz.insert("*", nodoNoEnElArbol, true));
	}
	//Content in, nodo no, true, varios
	@Test
	void arbolVariosNodoNoIzquierdaContentNo() {
		assertThrows(Exception.class, ()-> arbolVariosNiveles.insert("*", nodoNoEnElArbol, true));
	}
	//Content in, nodo no, false, un nodo 
	@Test	void arbolSoloRaizNodoNoDerechaContentNo() {
		assertThrows(Exception.class, ()-> arbolSoloRaiz.insert("*", nodoNoEnElArbol, false));
	}
	//Content in, nodo no, false, varios
	@Test
	void arbolVariosNodoNoDerechaContentNo() {
		assertThrows(Exception.class, ()-> arbolVariosNiveles.insert("*", nodoNoEnElArbol, false));
	}
	//Content in, nodo existe pero con hijo, true, varios
	@Test
	void arbolVariosConNodoPeroHijoIzquierdaContentNo() {
		assertThrows(Exception.class, ()-> arbolVariosNiveles.insert("*", nodoArbolVariosNivelesConHijoIzq, true));
	}
	//Content in, nodo existe pero con hijo, false, varios
	@Test
	void arbolVariosConNodoPeroHijoDerechaContentNo() {
		assertThrows(Exception.class, ()-> arbolVariosNivelesHijoDcha.insert("*", nodoArbolVariosNivelesConHijoDcha, false));
	}
	//Content in, nodo si, true, un nodo
	@Test
	void arbolRaizConNodoIzquierdaContentNo() {
		assertThrows(Exception.class, ()-> arbolSoloRaiz.insert("*", raizArbolSoloRaiz, true));
	}
	//Content in, nodo si, true, varios
	@Test
	void arbolVariosConNodoIzquierdaContentNo() {
		assertThrows(Exception.class, ()-> arbolVariosNiveles.insert("*", nodoArbolVariosNiveles, true));
	}
	//Content in, nodo si, false, un nodo
	@Test
	void arbolRaizConNodoDerechaContentNo() {
		assertThrows(Exception.class, ()-> arbolSoloRaiz.insert("*", raizArbolSoloRaiz, false));
	}
	//Content in, nodo si, false, varios
	@Test
	void arbolVariosConNodoDerechaContentNo() {
		assertThrows(Exception.class, ()-> arbolVariosNiveles.insert("*", nodoArbolVariosNiveles, false));
		
	}
	
	
}
