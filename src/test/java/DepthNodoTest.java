import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class DepthNodoTest {
	
	BinaryTree arbolSoloRaiz;
	BinaryTree arbolSoloUnHijo;
	BinaryTree arbolDosHijos;
	BinaryTree arbolVariosNiveles;
	Node nodoRaiz;
	Node nodoUnHijo;
	Node nodoArbolDos;
	Node nodoVarios;
	Node noEnArbol;
	//Node nodoNull;
	
	
	@BeforeEach
	void setUp() {
		arbolSoloRaiz = new BinaryTree<String>("1");
		nodoRaiz= arbolSoloRaiz.getRoot();
		
		arbolSoloUnHijo = new BinaryTree<String>("1");
		arbolSoloUnHijo.insert("2",  arbolSoloUnHijo.getRoot(), false);
		nodoUnHijo= arbolSoloUnHijo.getRoot();
		
		arbolDosHijos = new BinaryTree<String>("1");
		arbolDosHijos.insert("2", arbolDosHijos.getRoot(), false);
		arbolDosHijos.insert("3", arbolDosHijos.getRoot(), true);
		nodoArbolDos= arbolDosHijos.getRoot();
		
		arbolVariosNiveles = new BinaryTree<String>("1");
		arbolVariosNiveles.insert("2", arbolVariosNiveles.getRoot(), false);
		arbolVariosNiveles.insert("3", arbolVariosNiveles.getRoot(), true);
		arbolVariosNiveles.insert("4", arbolVariosNiveles.getRoot().getLeftChild(), false);
		nodoVarios= arbolVariosNiveles.getRoot();
		
		noEnArbol=new Node<String>("6");
		//nodoNull=new Node<String>(null);

	
	}
	
	@Test
	void nodoEnArbolYUnSoloNodo() {
		assertEquals(arbolSoloRaiz.depth(nodoRaiz), 1);
	}
	
	@Test
	void nodoEnArbolYUnSoloHijo() {
		assertEquals(arbolSoloUnHijo.depth(nodoUnHijo), 2);
	}
	
	@Test
	void nodoEnArbolYDosHijos() {
		assertEquals(arbolDosHijos.depth(nodoArbolDos), 2);
	}
	
	@Test
	void nodoEnArbolYVariosNiveles() {
		assertEquals(arbolVariosNiveles.depth(nodoVarios), 3);
	}
	@Test
	void nodoNoEnArbolYSoloUnNodo(){
		assertThrows(Exception.class, ()-> arbolSoloRaiz.depth(noEnArbol));
	}
	@Test
	void nodoNoEnArbolYUnSoloHijo(){
		assertThrows(Exception.class, ()-> arbolSoloUnHijo.depth(noEnArbol));
	}
	@Test
	void nodoNoEnArbolYDosHijos(){
		assertThrows(Exception.class, ()-> arbolDosHijos.depth(noEnArbol));
	}
	@Test
	void nodoNoEnArbolYVariosNiveles(){
		assertThrows(Exception.class, ()-> arbolVariosNiveles.depth(noEnArbol));
	}
	/*@Test
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
	*/



}

