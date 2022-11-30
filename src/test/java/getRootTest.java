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
	    	arbolSoloRaiz = Util.crearArbolSoloRaiz();
	    	arbolSoloUnHijo = Util.crearArbolSoloHijoIzquierda();
	    	arbolDosHijos = Util.crearArbolDosHijos();
	    	arbolVariosNiveles = Util.crearArbolVariosNiveles();
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
