import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class DepthTest {
	
	BinaryTree arbolSoloRaiz;
	BinaryTree arbolSoloUnHijo;
	BinaryTree arbolDosHijos;
	BinaryTree arbolVariosNiveles;
	
	@BeforeEach
	void setUp() {
		arbolSoloRaiz = new BinaryTree<String>("1");
		
		arbolSoloUnHijo = new BinaryTree<String>("1");
		arbolSoloUnHijo.insert("2",  arbolSoloUnHijo.getRoot(), false);
		
		arbolDosHijos = new BinaryTree<String>("1");
		arbolDosHijos.insert("2", arbolDosHijos.getRoot(), false);
		arbolDosHijos.insert("3", arbolDosHijos.getRoot(), true);
		
		arbolVariosNiveles = new BinaryTree<String>("1");
		arbolVariosNiveles.insert("2", arbolVariosNiveles.getRoot(), false);
		arbolVariosNiveles.insert("3", arbolVariosNiveles.getRoot(), true);
		arbolVariosNiveles.insert("4", arbolVariosNiveles.getRoot().getLeftChild(), false);
	
	}
	
	@Test
	void arbolSoloRaiz() {
		assertEquals(arbolSoloRaiz.depth(), 1);
	}
	
	@Test
	void arbolConSoloUnHijo() {
		assertEquals(arbolSoloUnHijo.depth(), 2);
	}
	
	@Test
	void arbolDosHijos() {
		assertEquals(arbolDosHijos.depth(), 2);
	}
	
	@Test
	void arbolVariosNiveles() {
		assertEquals(arbolVariosNiveles.depth(), 3);
	}
	
}

