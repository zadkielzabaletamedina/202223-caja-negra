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
	Node nodoRaiz;
	Node nodoVarios;
	Node nodoNoEnElArbol;
	Node nodoNull;
	
	@BeforeEach
	void setUp() {
		arbolSoloRaiz = new BinaryTree<String>("1");
		nodoRaiz= arbolSoloRaiz.getRoot();
		subArbolRaiz= new BinaryTree<String>("1");
		
		arbolVariosNiveles = new BinaryTree<String>("1");
		arbolVariosNiveles.getRoot().setLeftChild(new Node("2"));
		arbolVariosNiveles.getRoot().setRightChild(new Node("3"));
		arbolVariosNiveles.getRoot().getLeftChild().setLeftChild(new Node("4"));
		
		nodoVarios=arbolVariosNiveles.getRoot().getLeftChild();
		subArbolVariosNiveles= new BinaryTree<String>("2");
		subArbolVariosNiveles.getRoot().setLeftChild(new Node("3"));
		
		nodoNoEnElArbol= new Node("6");
		nodoNull= null;
		
	}
	
	@Test
	void arbolDeUnNodoNodoEnElArbol(){
		assertTrue(arbolSoloRaiz.getSubTree(nodoRaiz).equals(subArbolRaiz));
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
		assertTrue(arbolVariosNiveles.getSubTree(nodoVarios).equals(subArbolVariosNiveles));
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
