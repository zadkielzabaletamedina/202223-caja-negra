import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;


class ConstructorTest {
	
	String cadenaSoloNumeros;
	String cadenaSoloMinusculas;
	String cadenaSoloMayusculas;
	String cadenaCaracterNoAlfanumerico;
	String cadenaCadenaNull;
	String cadenaNumerosMayMin;
	BinaryTree<String> arbol;
	
	@BeforeEach
	void setUp() {
		cadenaSoloNumeros = "123";
		cadenaSoloMinusculas = "abc";
		cadenaSoloMayusculas = "ABC";
		cadenaCaracterNoAlfanumerico = "Ab_";
		cadenaCadenaNull = null;
		cadenaNumerosMayMin = "Ab1";
		}

	@Test
	void  soloNumeros() {
		arbol = new BinaryTree<String>(cadenaSoloNumeros);
		assertEquals(cadenaSoloNumeros,arbol.getRoot().getContent());
	}
	@Test
	void  soloMinusculas() {
		arbol = new BinaryTree<String>(cadenaSoloMinusculas);
		assertEquals(cadenaSoloMinusculas,arbol.getRoot().getContent());
	}
	@Test
	void  soloMayusculas() {
		arbol = new BinaryTree<String>(cadenaSoloMayusculas);
		assertEquals(cadenaSoloMayusculas,arbol.getRoot().getContent());
	}
	@Test
	void  caracterNoAlfanumerico() {
		assertThrows(Exception.class, () -> new BinaryTree<String>(cadenaCaracterNoAlfanumerico));
	}
	@Test
	void  cadenaNull() {
		assertThrows(Exception.class, () ->  new BinaryTree<String>(cadenaCadenaNull));
	}
	@Test
	void  numerosMayMin() {
		arbol = new BinaryTree<String>(cadenaNumerosMayMin);;
		assertEquals(cadenaNumerosMayMin,arbol.getRoot().getContent());
	}
}
