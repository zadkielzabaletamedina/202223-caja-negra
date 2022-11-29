import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class EqualsTest {
	
	
	BinaryTree arbolSoloRaiz;
	BinaryTree arbolSoloRaiz1;
	BinaryTree arbolVariosNiveles;
	BinaryTree arbolVariosNiveles1;
	BinaryTree arbolNulo;

	
	@BeforeEach
	void setUp() {
		arbolSoloRaiz = new BinaryTree<String>("1");
		arbolSoloRaiz1 = new BinaryTree<String>("1");

		arbolVariosNiveles = new BinaryTree<String>("1");
		arbolVariosNiveles.getRoot().setLeftChild(new Node("2"));
		arbolVariosNiveles.getRoot().setRightChild(new Node("3"));
		arbolVariosNiveles.getRoot().getLeftChild().setLeftChild(new Node("4"));
		
		
		arbolVariosNiveles1 = new BinaryTree<String>("1");
		arbolVariosNiveles1.getRoot().setLeftChild(new Node("2"));
		arbolVariosNiveles1.getRoot().setRightChild(new Node("3"));
		arbolVariosNiveles1.getRoot().getLeftChild().setLeftChild(new Node("4"));
		
		arbolNulo= null;
		
		
		
	}
	
	@Test
	void arbolesUnNodoIguales(){
		assertTrue(arbolSoloRaiz.equals(arbolSoloRaiz1));

	}
	@Test
	void arbolesMasNiveleIguales(){
		assertTrue(arbolVariosNiveles.equals(arbolVariosNiveles1));
	
	}
	@Test
	void arbolUnNodoYDistintos(){
		assertFalse(arbolSoloRaiz.equals(arbolVariosNiveles1));
	
	}
	@Test
	void arbolesMasNiveleDistintos(){
		assertFalse(arbolVariosNiveles.equals(arbolSoloRaiz1));
	
	}
	@Test
	void arbol1IgualANull(){
		assertThrows(Exception.class, ()-> arbolSoloRaiz.equals(arbolNulo));
	}
	@Test
	void arbol1VariosIgualANull(){
		assertThrows(Exception.class, ()-> arbolVariosNiveles.equals(arbolNulo));
	}
	
	
}