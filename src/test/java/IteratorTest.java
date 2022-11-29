import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;


class IteratorTest {
    
    private BinaryTree arbolUnSoloNodo;
    private BinaryTree arbolUnSoloHijo;
    private BinaryTree arbolDosHijos;
    private BinaryTree arbolVariosNiveles;
    
    @BeforeEach
    void setUp() {
	arbolUnSoloNodo = new BinaryTree("1");
	arbolUnSoloHijo = new BinaryTree("1");
	arbolUnSoloHijo.getRoot().setLeftChild(new Node("2"));
	arbolDosHijos = new BinaryTree("1");
	arbolDosHijos.getRoot().setLeftChild(new Node("2"));
	arbolDosHijos.getRoot().setRightChild(new Node("3"));
	arbolVariosNiveles = new BinaryTree("1");
	arbolVariosNiveles.getRoot().setLeftChild(new Node("2"));
	arbolVariosNiveles.getRoot().setRightChild(new Node("3"));
	arbolVariosNiveles.getRoot().getLeftChild().setLeftChild(new Node("4"));
    }

    @Test
    void arbolUnSoloNodo() {
	Iterator it = arbolUnSoloNodo.iterator();
	Integer valorActual = 1;
	while(it.hasNext()) {
	    assertEquals(valorActual.toString(),it.next());
	    valorActual++;
	}
    }
    
    @Test
    void arbolUnSoloHijo() {
	Iterator it = arbolUnSoloHijo.iterator();
	Integer valorActual = 1;
	while(it.hasNext()) {
	    assertEquals(valorActual.toString(),it.next());
	    valorActual++;
	}
    }
    
    @Test
    void arbolDosHijos() {
	Iterator it = arbolDosHijos.iterator();
	Integer valorActual = 1;
	while(it.hasNext()) {
	    assertEquals(valorActual.toString(),it.next());
	    valorActual++;
	}
    }
    
    @Test
    void arbolVariosNiveles() {
	Iterator it = arbolVariosNiveles.iterator();
	Integer valorActual = 1;
	while(it.hasNext()) {
	    assertEquals(valorActual.toString(),it.next());
	    valorActual++;
	}
    }
    
    

}
