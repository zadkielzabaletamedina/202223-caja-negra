import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class DepthTest {
	
	private BinaryTree arbolSoloRaiz;
	private BinaryTree arbolSoloUnHijo;
	private BinaryTree arbolDosHijos;
	private BinaryTree arbolVariosNiveles;
	
	@BeforeEach
	void setUp() {
	    	arbolSoloRaiz = Util.crearArbolSoloRaiz();
		arbolSoloUnHijo = Util.crearArbolSoloHijoIzquierda();
		arbolDosHijos = Util.crearArbolDosHijos();
		arbolVariosNiveles = Util.crearArbolTresNiveles();
	}
	
	@Test
	void arbolSoloRaiz() {
		assertEquals(arbolSoloRaiz.depth(), 0);
	}
	
	@Test
	void arbolConSoloUnHijo() {
		assertEquals(arbolSoloUnHijo.depth(), 1);
	}
	
	@Test
	void arbolDosHijos() {
		assertEquals(arbolDosHijos.depth(), 1);
	}
	
	@Test
	void arbolVariosNiveles() {
		assertEquals(arbolVariosNiveles.depth(), 2);
	}
	
}

