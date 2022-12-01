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
	arbolUnSoloNodo = Util.crearArbolSoloRaiz();
	arbolUnSoloHijo = Util.crearArbolSoloHijoIzquierda();
	arbolDosHijos = Util.crearArbolDosHijos();
	arbolVariosNiveles = Util.crearArbolTresNiveles();
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
