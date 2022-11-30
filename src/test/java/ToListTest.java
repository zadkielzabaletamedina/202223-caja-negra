import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class ToListTest {
	
	BinaryTree arbolSoloRaiz;
	BinaryTree arbolSoloUnHijo;
	BinaryTree arbolDosHijos;
	BinaryTree arbolVariosNiveles;
	List<String> listaArbolSoloRaiz;
	List<String> listaArbolSoloUnHijo;
	List<String> listaArbolDosHijos;
	List<String> listaArbolVariosNiveles;


	
	
	@BeforeEach
	void setUp() {
	    	arbolSoloRaiz = Util.crearArbolSoloRaiz();
		
		listaArbolSoloRaiz= new ArrayList<String>() ;
		listaArbolSoloRaiz.add("1");
		
		arbolSoloUnHijo = Util.crearArbolSoloHijoIzquierda();
		listaArbolSoloUnHijo= new ArrayList<String>() ;
		listaArbolSoloUnHijo.add("1");
		listaArbolSoloUnHijo.add("2");
		
		arbolDosHijos = Util.crearArbolDosHijos();
		listaArbolDosHijos= new ArrayList<String>() ;
		listaArbolDosHijos.add("1");
		listaArbolDosHijos.add("2");
		listaArbolDosHijos.add("3");

		arbolVariosNiveles = Util.crearArbolVariosNiveles();
		listaArbolVariosNiveles= new ArrayList<String>() ;
		listaArbolVariosNiveles.add("1");
		listaArbolVariosNiveles.add("2");
		listaArbolVariosNiveles.add("3");
		listaArbolVariosNiveles.add("4");	
	}
	
	@Test
	void arbolSoloRaiz() {
		assertEquals(arbolSoloRaiz.toList(),listaArbolSoloRaiz);
	}
	
	@Test
	void arbolConSoloUnHijo() {
		assertEquals(arbolSoloUnHijo.toList(), listaArbolSoloUnHijo);
	}
	
	@Test
	void arbolDosHijos() {
		assertEquals(arbolDosHijos.toList(), listaArbolDosHijos);
	}
	
	@Test
	void arbolVariosNiveles() {
		assertEquals(arbolVariosNiveles.toList(), listaArbolVariosNiveles);
	}
	
}

