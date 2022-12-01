import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class DepthNodoTest {
	
	private BinaryTree arbolSoloRaiz;
	private BinaryTree arbolSoloUnHijo;
	private BinaryTree arbolDosHijos;
	private BinaryTree arbolVariosNiveles;
	private Node raizArbolSoloRaiz;
	private Node raizArbolUnHijo;
	private Node raizArbolDosHijos;
	private Node raizVariosNiveles;
	private Node nodoNoEnArbol;
	private Node nodoNull;
	
	
	@BeforeEach
	void setUp() {
	    	arbolSoloRaiz = Util.crearArbolSoloRaiz();
		raizArbolSoloRaiz = arbolSoloRaiz.getRoot();
		
		arbolSoloUnHijo = Util.crearArbolSoloHijoIzquierda();
		raizArbolUnHijo = arbolSoloUnHijo.getRoot();
		
		arbolDosHijos = Util.crearArbolDosHijos();
		raizArbolDosHijos = arbolDosHijos.getRoot();
		
		arbolVariosNiveles = Util.crearArbolTresNiveles();
		raizVariosNiveles= arbolVariosNiveles.getRoot();
		
		nodoNoEnArbol=new Node<String>("6");
		nodoNull=null;
	}
	
	@Test
	void nodoEnArbolYUnSoloNodo() {
		assertEquals(arbolSoloRaiz.depth(raizArbolSoloRaiz), 0);
	}
	
	@Test
	void nodoEnArbolYUnSoloHijo() {
		assertEquals(arbolSoloUnHijo.depth(raizArbolUnHijo), 1);
	}
	
	@Test
	void nodoEnArbolYDosHijos() {
		assertEquals(arbolDosHijos.depth(raizArbolDosHijos), 1);
	}
	
	@Test
	void nodoEnArbolYVariosNiveles() {
		assertEquals(arbolVariosNiveles.depth(raizVariosNiveles), 2);
	}
	@Test
	void nodoNoEnArbolYSoloUnNodo(){
		assertThrows(Exception.class, ()-> arbolSoloRaiz.depth(nodoNoEnArbol));
	}
	@Test
	void nodoNoEnArbolYUnSoloHijo(){
		assertThrows(Exception.class, ()-> arbolSoloUnHijo.depth(nodoNoEnArbol));
	}
	@Test
	void nodoNoEnArbolYDosHijos(){
		assertThrows(Exception.class, ()-> arbolDosHijos.depth(nodoNoEnArbol));
	}
	@Test
	void nodoNoEnArbolYVariosNiveles(){
		assertThrows(Exception.class, ()-> arbolVariosNiveles.depth(nodoNoEnArbol));
	}
	@Test
	void nodoNullYSoloUnNodo(){
		assertThrows(Exception.class, ()-> arbolSoloRaiz.depth(nodoNull));
	}
	@Test
	void nodoNullYUnSoloHijo(){
		assertThrows(Exception.class, ()-> arbolSoloUnHijo.depth(nodoNull));
	}
	@Test
	void nodoNullYDosHijos(){
		assertThrows(Exception.class, ()-> arbolDosHijos.depth(nodoNull));
	}
	@Test
	void nodoNullYVariosNiveles(){
		assertThrows(Exception.class, ()-> arbolVariosNiveles.depth(nodoNull));
	}



}

