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
		contenidoValido = "1";
		contenidoNoValido = "abc_";
		arbolUnNodo = new BinaryTree<>("1");
		arbolVariosNiveles = new BinaryTree<>("1");
		Node raiz = arbolVariosNiveles.getRoot();
		raiz.setLeftChild(new Node<>("2"));
		raiz.setRightChild(new Node<>("3"));
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
