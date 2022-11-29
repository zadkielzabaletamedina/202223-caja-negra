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
		arbolSoloUnHijo.insert("2",  arbolSoloUnHijo.getRoot(), true);
		soloUnHijo= new ArrayList<String>() ;
		soloUnHijo.add("1");
		soloUnHijo.add("2");
		
		arbolDosHijos = new BinaryTree<String>("1");
		arbolDosHijos.insert("2", arbolDosHijos.getRoot(), true);
		arbolDosHijos.insert("3", arbolDosHijos.getRoot(), false);
		dosHijos= new ArrayList<String>() ;
		dosHijos.add("1");
		dosHijos.add("2");
		dosHijos.add("3");

		
		arbolVariosNiveles = new BinaryTree<String>("1");
		arbolVariosNiveles.insert("2", arbolVariosNiveles.getRoot(), true);
		arbolVariosNiveles.insert("3", arbolVariosNiveles.getRoot(), false);
		arbolVariosNiveles.insert("4", arbolVariosNiveles.getRoot().getLeftChild(), true);
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

