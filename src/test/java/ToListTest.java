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
	List<String> raiz;
	List<String> soloUnHijo;
	List<String> dosHijos;
	List<String> variosNiveles;


	
	
	@BeforeEach
	void setUp() {
		arbolSoloRaiz = new BinaryTree<String>("1");
		raiz= new ArrayList<String>() ;
		raiz.add("1");
		
		arbolSoloUnHijo = new BinaryTree<String>("1");
		arbolSoloUnHijo.getRoot().setLeftChild(new Node("2"));
		soloUnHijo= new ArrayList<String>() ;
		soloUnHijo.add("1");
		soloUnHijo.add("2");
		
		arbolDosHijos = new BinaryTree<String>("1");
		arbolDosHijos.getRoot().setLeftChild(new Node("2"));
		arbolDosHijos.getRoot().setRightChild(new Node("3"));
		dosHijos= new ArrayList<String>() ;
		dosHijos.add("1");
		dosHijos.add("2");
		dosHijos.add("3");

		
		arbolVariosNiveles = new BinaryTree<String>("1");
		arbolVariosNiveles.getRoot().setLeftChild(new Node("2"));
		arbolVariosNiveles.getRoot().setRightChild(new Node("3"));
		arbolVariosNiveles.getRoot().getLeftChild().setLeftChild(new Node("4"));
		variosNiveles= new ArrayList<String>() ;
		variosNiveles.add("1");
		variosNiveles.add("2");
		variosNiveles.add("3");
		variosNiveles.add("4");


	
	}
	
	@Test
	void arbolSoloRaiz() {
		assertEquals(arbolSoloRaiz.toList(),raiz);
	}
	
	@Test
	void arbolConSoloUnHijo() {
		assertEquals(arbolSoloUnHijo.toList(), soloUnHijo);
	}
	
	@Test
	void arbolDosHijos() {
		assertEquals(arbolDosHijos.toList(), dosHijos);
	}
	
	@Test
	void arbolVariosNiveles() {
		assertEquals(arbolVariosNiveles.toList(), variosNiveles);
	}
	
}

