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
	private Node nodoNoEnElArbolHijoIzq;
	private Node nodoNoEnElArbolHijoDcha;

	

	
	
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
		
		
		arbolVariosNivelesHijoDcha= Util.crearArbolVariosNivelesDcha();
		nodoArbolVariosNivelesConHijoIzq= arbolVariosNivelesHijoIzq.getRoot().getLeftChild().getLeftChild();


		
		nodoNoEnElArbol= new Node("6");
		
		nodoNoEnElArbolHijoIzq= new Node("7");
		nodoNoEnElArbolHijoIzq.setLeftChild(new Node("8"));
		
		nodoNoEnElArbolHijoDcha= new Node("7");
		nodoNoEnElArbolHijoIzq.setLeftChild(new Node("8"));
		
		
	}
	
	//content válido, nodo no ,tiene hijo ,true ,varios
	@Test
	void arbolVariosNivelesNodoNoExisteConHijoIzquierda() {
		assertThrows(Exception.class, ()-> arbolVariosNiveles.insert("5",nodoNoEnElArbolHijoIzq , true));
	}
	//content válido, nodo no, tiene hijo, false, varios 
	@Test 
	void arbolVariosNivelesNodoNoExisteConHijoDerecha() {
		assertThrows(Exception.class, ()-> arbolVariosNiveles.insert("5",nodoNoEnElArbolHijoDcha , false));
	}
	//content válido, nodo no, no hijo, true, un nivel
	@Test 
	void arbolSoloRaizNodoNoExisteIzquierda() {
		assertThrows(Exception.class, ()-> arbolSoloRaiz.insert("5", nodoNoEnElArbol, true));
	}
	//content válido, nodo no, no hijo, true, varios
	@Test 
	void arbolVariosNivelesNodoNoExisteIzquierda() {
		assertThrows(Exception.class, ()-> arbolVariosNiveles.insert("5",nodoNoEnElArbol , true));
	}
	//content válido, nodo no, no hijo, false, un nivel
	@Test 
	void arbolSoloRaizNodoNoExisteDerecha() {
		assertThrows(Exception.class, ()-> arbolSoloRaiz.insert("5", nodoNoEnElArbol, false));
	}
	//content válido, nodo no, hijo no, false, varios
	@Test 
	void arbolVariosNivelesNodoNoExisteDerecha() {
		assertThrows(Exception.class, ()-> arbolVariosNiveles.insert("5",nodoNoEnElArbol , false));
	}
	//content válido, nodo si, con hijo donde se quiere, true, varios
	@Test 
	void arbolVariosNivelesConHijoEnLaIzquierda() {
		assertThrows(Exception.class, ()->arbolVariosNiveles.insert("5",nodoArbolVariosNivelesConHijoIzq, true));
	}
	//content válido, nodo si, tiene hijo, false, varios
	@Test 
	void arbolVariosNivelesConHijoEnLaDerecha() {
		assertThrows(Exception.class, ()->arbolVariosNivelesHijoDcha.insert("5",nodoArbolVariosNivelesConHijoDcha, false));
	}
	//content válido, nodo si, no hijo,true, solo raiz
	@Test
	void arbolSoloRaizEnLaIzquierda() {
		arbolSoloRaiz.insert("2", raizArbolSoloRaiz, true);
		assertTrue(Util.arbolesIguales(arbolSoloRaiz, arbolSoloRaizHijoIzq));
	}
	
	//contenido válido, nodo en el árbol, no tiene hijo, atleft = true, arbol con varios niveles
	//contenido válido, nodo en el árbol, no tiene hijo, atleft = false, arbol con varios niveles
	void arbolVariosNivelesValidoEnElArbolIzq() {
		arbolVariosNiveles.insert("5",nodoArbolVariosNiveles, true );
		assertTrue(Util.arbolesIguales(arbolVariosNiveles,arbolVariosNivelesHijoIzq));
	} 
	@Test
	//contenido válido, nodo en el árbol, no tiene hijo, atleft = false, arbol solo raiz
		void arbolSoloRaizValidoEnElArbolDcha() {
			arbolSoloRaiz.insert("2",raizArbolSoloRaiz, false );
			assertTrue(Util.arbolesIguales(arbolSoloRaiz,arbolSoloRaizHijoIzq));
		}
	@Test
		//contenido válido, nodo en el árbol, no tiene hijo, atleft = false, arbol con varios niveles
		void arbolVariosNivelesValidoEnElArbolDcha() {
			arbolVariosNiveles.insert("5",nodoArbolVariosNiveles, false );
			assertTrue(Util.arbolesIguales(arbolVariosNiveles,arbolVariosNivelesHijoDcha));
		}
	@Test
		//contenido no válido, nodo no en el árbol, tiene hijo, atleft = true, arbol varios niveles
				void arbolVariosNivelesNoValidoNoEnElArbolIzq() {
			assertThrows(Exception.class, ()-> arbolVariosNiveles.insert("/", nodoNoEnElArbol, true));
		}
	
}
