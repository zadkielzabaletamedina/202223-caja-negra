import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

class SearchTest {
	
	private BinaryTree arbolUnNodo;
	private BinaryTree arbolVariosNiveles;
	private String contenidoValido;
	private String contenidoNoValido;
	
	
	@BeforeEach
	void setUp() {
	    	arbolUnNodo = Util.crearArbolSoloRaiz();
	    	arbolVariosNiveles = Util.crearArbolTresNiveles();
		contenidoValido = "1";
		contenidoNoValido = "abc_";
	}
	
	@Test
	void arbolUnNivelExisteNodo() {
		Node resultado = arbolUnNodo.search("1");
		assertEquals(resultado.getContent(),"1");
	}
	
	@Test
	void arbolVariosNivelesExisteNodo() {
		Node resultado = arbolVariosNiveles.search("1");
		assertEquals(resultado.getContent(),"1");
	}
	
	@Test
	void arbolUnNivelNoExisteNodo() {
		Node resultado = arbolUnNodo.search("6");
		assertEquals(resultado,null);
	}
	
	@Test
	void arbolVariosNivelesNoExisteNodo() {
		Node resultado = arbolVariosNiveles.search("7");
		assertEquals(resultado,null);
	}
}
