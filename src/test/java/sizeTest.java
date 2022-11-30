import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;


class sizeTest {
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
	void soloNodoRaiz() {
		assertEquals(arbolSoloRaiz.size(),1);
	}
	@Test
	void soloUnHijo() {
		assertEquals(arbolSoloUnHijo.size(),2);
	}
	@Test
	void dosHijos() {
		assertEquals(arbolDosHijos.size(),3);
	}
	@Test
	void variosNiveles() {
		assertEquals(arbolVariosNiveles.size(),4);
	}

}
