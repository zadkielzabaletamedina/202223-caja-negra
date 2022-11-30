import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class EqualsTest {
	
	
	private BinaryTree arbolSoloRaiz;
	private BinaryTree arbolSoloRaiz1;
	private BinaryTree arbolVariosNiveles;
	private BinaryTree arbolVariosNiveles1;
	private BinaryTree arbolNulo;

	
	@BeforeEach
	void setUp() {    
	    	arbolSoloRaiz = Util.crearArbolSoloRaiz();
	    	arbolSoloRaiz1 = Util.crearArbolSoloRaiz();
	    	
		arbolVariosNiveles = Util.crearArbolVariosNiveles();
		arbolVariosNiveles1 = Util.crearArbolVariosNiveles();
		
		arbolNulo= null;
	}
	
	@Test
	void arbolesUnNodoIguales(){
		assertTrue(arbolSoloRaiz.equals(arbolSoloRaiz1));

	}
	@Test
	void arbolesVariosNivelesIguales(){
		assertTrue(arbolVariosNiveles.equals(arbolVariosNiveles1));
	
	}
	@Test
	void arbolUnNodoYDistintos(){
		assertFalse(arbolSoloRaiz.equals(arbolVariosNiveles1));
	
	}
	@Test
	void arbolesVariosNivelesDistintos(){
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