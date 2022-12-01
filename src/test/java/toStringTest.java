import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

import com.binarytree.BinaryTree;

public class toStringTest {

	private BinaryTree arbolSoloRaiz;
	private BinaryTree arbolSoloUnHijo;
	private BinaryTree arbolDosHijos;
	private BinaryTree arbolVariosNiveles;
	private String stringArbolSoloRaiz;
	private String stringArbolSoloUnHijo;
	private String stringArbolDosHijos;
	private String stringArbolVariosNiveles;
	
	@BeforeEach
	void setUp() {
	    	
	    	arbolSoloRaiz = Util.crearArbolSoloRaiz();
		arbolSoloUnHijo = Util.crearArbolSoloHijoIzquierda();
		arbolDosHijos = Util.crearArbolDosHijos();
		arbolVariosNiveles = Util.crearArbolTresNiveles();
		
		stringArbolSoloRaiz = "1";
		stringArbolSoloUnHijo = "1 2";
		stringArbolDosHijos = "1 2 3";
		stringArbolVariosNiveles = "1 2 3 4";
	}
	
	
	@Test
	void arbolSoloRaiz() {
		arbolSoloRaiz.toString().equals(stringArbolSoloRaiz);
	}
	
	@Test
	void arbolConSoloUnHijo() {
		arbolSoloUnHijo.toString().equals(stringArbolSoloUnHijo);
	}
	
	@Test
	void arbolDosHijos() {
		arbolDosHijos.toString().equals(stringArbolDosHijos);
	}
	
	@Test
	void arbolVariosNiveles() {
		arbolVariosNiveles.toString().equals(stringArbolVariosNiveles);
	}
}
