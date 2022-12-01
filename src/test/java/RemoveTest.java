import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

class RemoveTest {
	private BinaryTree arbolSoloRaiz;
	private BinaryTree arbolVariosNiveles;
	private BinaryTree arbolVariosNiveles1;
	private Node nodoNoEnElArbol;
	private Node nodoNull;
	
	@BeforeEach
	void setUp() {
		arbolSoloRaiz  = Util.crearArbolSoloRaiz();
		arbolVariosNiveles = Util.crearArbolTresNiveles();
		arbolVariosNiveles1 = Util.crearArbolSoloHijoIzquierda();

		nodoNoEnElArbol= new Node("6");
		nodoNull= null;
	}
	
	@Test
	void variosNivelesNodoIntermedio() {
		arbolVariosNiveles.remove(arbolVariosNiveles.getRoot().getLeftChild());
		assertTrue(arbolVariosNiveles.getRoot().getLeftChild() == null);
	}
	@Test
	void soloRaizNodoFueraArbol() {
		assertThrows(Exception.class, () -> arbolSoloRaiz.remove(nodoNoEnElArbol));
	}
	@Test
	void variosNivelesNodoFueraArbol() {
		assertThrows(Exception.class, () -> arbolVariosNiveles.remove(nodoNoEnElArbol));
	}
	@Test
	void soloRaizNodoNulo() {
		assertThrows(Exception.class, () -> arbolSoloRaiz.remove(nodoNull));
	}
	@Test
	void variosNivelesNodoNulo() {
		assertThrows(Exception.class, () -> arbolVariosNiveles.remove(nodoNull));
	}
	@Test
	void soloRaizNodoRaiz() {
		arbolSoloRaiz.remove(arbolSoloRaiz.getRoot());
		assertTrue(arbolSoloRaiz.getRoot() == null);
		
	}
	@Test
	void variosNivelesNodoRaiz() {
		arbolVariosNiveles.remove(arbolVariosNiveles.getRoot());
		assertTrue( arbolVariosNiveles.getRoot() == null);
	}
	@Test
	void variosNivelesNodoHoja() {
		arbolVariosNiveles.remove(arbolVariosNiveles.getRoot().getLeftChild().getLeftChild());
		assertTrue( arbolVariosNiveles.getRoot().getLeftChild().getLeftChild() == null);
	}
	
}



