import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;


class sizeTest {
	BinaryTree arbolSoloRaiz;
	BinaryTree arbolSoloUnHijo;
	BinaryTree arbolDosHijos;
	BinaryTree arbolVariosNiveles;
	
	@BeforeEach
	void setUp() {
		arbolSoloRaiz = new BinaryTree<String>("1");
		arbolSoloUnHijo = new BinaryTree<String>("1");
		arbolDosHijos = new BinaryTree<String>("1");
		arbolVariosNiveles = new BinaryTree<String>("1");
		
	
		arbolSoloUnHijo.insert("2", arbolSoloUnHijo.getRoot(), false);
		
		
		arbolDosHijos.insert("2", arbolDosHijos.getRoot(), false);
		arbolDosHijos.insert("3", arbolDosHijos.getRoot(), true);


		arbolVariosNiveles.insert("2", arbolVariosNiveles.getRoot(), false);
		arbolVariosNiveles.insert("3", arbolVariosNiveles.getRoot(), true);
		arbolVariosNiveles.insert("4",arbolVariosNiveles.search("3"), false);
		
		
	}
	@Test
	void soloNodoRaiz() {
		assertEquals(arbolSoloRaiz.size(),1);
	}
	@Test
	void soloUnHijo() {
		assertEquals(arbolSoloUnHijo.size(),2);
	}
	@Test
	void dosHijos() {
		assertEquals(arbolDosHijos.size(),3);
	}
	@Test
	void variosNiveles() {
		assertEquals(arbolVariosNiveles.size(),4);
	}

}
