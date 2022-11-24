import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

class getRootTest {
	
	BinaryTree arbolSoloRaiz;
	BinaryTree arbolSoloUnHijo;
	BinaryTree arbolDosHijos;
	BinaryTree arbolVariosNiveles;
	
	@BeforeEach
	void setUp() {
		arbolSoloRaiz = new BinaryTree<String>("1");
		arbolSoloUnHijo = new BinaryTree<String>("1");
		Node nodoRoot = arbolSoloUnHijo.getRoot();
		arbolSoloUnHijo.insert("2", nodoRoot, false);
		arbolDosHijos = new BinaryTree<String>("1");
		nodoRoot = arbolDosHijos.getRoot();
		arbolDosHijos.insert("2", nodoRoot, false);
		arbolDosHijos.insert("3", nodoRoot, true);
		arbolVariosNiveles = new BinaryTree<String>("1");
		nodoRoot = arbolVariosNiveles.getRoot();
		arbolVariosNiveles.insert("2", nodoRoot, false);
		arbolVariosNiveles.insert("3", nodoRoot, true);
		arbolVariosNiveles.insert("4", nodoRoot.getLeftChild(), false);
	}

	@Test
	void arbolSoloRaiz() {
		assertEquals(arbolSoloRaiz.getRoot().getContent(), "1");
	}
	
	@Test
	void arbolConSoloUnHijo() {
		assertEquals(arbolSoloUnHijo.getRoot().getContent(), "1");
	}
	
	@Test
	void arbolDosHijos() {
		assertEquals(arbolDosHijos.getRoot().getContent(), "1");
	}
	
	@Test
	void arbolVariosNiveles() {
		assertEquals(arbolVariosNiveles.getRoot().getContent(), "1");
	}

}
