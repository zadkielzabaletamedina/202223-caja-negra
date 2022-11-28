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

	BinaryTree arbolSoloRaiz;
	BinaryTree arbolSoloUnHijo;
	BinaryTree arbolDosHijos;
	BinaryTree arbolVariosNiveles;
	String raiz;
	String soloUnHijo;
	String dosHijos;
	String variosNiveles;
	
	@BeforeEach
	void setUp() {
		arbolSoloRaiz = new BinaryTree<String>("1");
		raiz = "1";
		
		arbolSoloUnHijo = new BinaryTree<String>("1");
		arbolSoloUnHijo.insert("2", arbolSoloUnHijo.getRoot(), true);
		soloUnHijo = "1 2";
		
		arbolDosHijos = new BinaryTree<String>("1");
		arbolDosHijos.insert("2", arbolDosHijos.getRoot(), true);
		arbolDosHijos.insert("3", arbolDosHijos.getRoot(), false);
		dosHijos = "1 2 3";
		
		arbolVariosNiveles = new BinaryTree<String>("1");
		arbolVariosNiveles.insert("2", arbolVariosNiveles.getRoot(), true);
		arbolVariosNiveles.insert("3", arbolVariosNiveles.getRoot(), false);
		arbolVariosNiveles.insert("4", arbolVariosNiveles.getRoot().getLeftChild(), false);
		variosNiveles = "1 2 3 4";
	}
	
	
	@Test
	void arbolSoloRaiz() {
		arbolSoloRaiz.toString().equals(raiz);
	}
	
	@Test
	void arbolConSoloUnHijo() {
		arbolSoloUnHijo.toString().equals(soloUnHijo);
	}
	
	@Test
	void arbolDosHijos() {
		arbolDosHijos.toString().equals(dosHijos);
	}
	
	@Test
	void arbolVariosNiveles() {
		arbolVariosNiveles.toString().equals(variosNiveles);
	}
}
