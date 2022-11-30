import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class GetSubtreeTest {
	BinaryTree arbolSoloRaiz;
	BinaryTree arbolVariosNiveles;
	BinaryTree subArbolRaiz;
	BinaryTree subArbolVariosNiveles;
	Node raizArbolSoloRaiz;
	Node nodoArbolVariosNiveles;
	Node nodoNoEnElArbol;
	Node nodoNull;
	
	@BeforeEach
	void setUp() {
	    	
	    	arbolSoloRaiz = Util.crearArbolSoloRaiz();
		raizArbolSoloRaiz = arbolSoloRaiz.getRoot();

		arbolVariosNiveles = Util.crearArbolVariosNiveles();
		nodoArbolVariosNiveles = arbolVariosNiveles.getRoot().getLeftChild();
		subArbolVariosNiveles= new BinaryTree<String>("2");
		Node aux = new Node("4"); 
		aux.setParent(subArbolVariosNiveles.getRoot());
		subArbolVariosNiveles.getRoot().setLeftChild(aux);
		
		nodoNoEnElArbol= new Node("6");
		nodoNull= null;
		
	}
	
	@Test
	void arbolDeUnNodoNodoEnElArbol(){
		assertTrue(Util.arbolesIguales(arbolSoloRaiz, arbolSoloRaiz.getSubTree(raizArbolSoloRaiz)));
	}
	
	@Test
	void arbolDeUnNodoNodoNoEnElArbol() {
		assertThrows(Exception.class, ()-> arbolSoloRaiz.getSubTree(nodoNoEnElArbol));
	}
	
	@Test
	void arbolDeUnNodoNodoNull() {
		assertThrows(Exception.class, ()-> arbolSoloRaiz.getSubTree(nodoNull));
	}
	
	@Test
	void arbolMasUnNivelNodoEnElArbol(){
		assertTrue(Util.arbolesIguales(subArbolVariosNiveles, arbolVariosNiveles.getSubTree(nodoArbolVariosNiveles)));
	}
	
	@Test
	void arbolMasUnNivelNodoNoEnElArbol() {
		assertThrows(Exception.class, ()-> arbolVariosNiveles.getSubTree(nodoNoEnElArbol));
	}
	
	@Test
	void arbolMasUnNivelNodoNull() {
		assertThrows(Exception.class, ()-> arbolVariosNiveles.getSubTree(nodoNull));
	}
}
