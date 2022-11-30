import java.util.Iterator;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class Util {
    
    public static boolean arbolesIguales(BinaryTree arbol1, BinaryTree arbol2) {
	boolean iguales = true;
	Iterator it1 = arbol1.iterator();
	Iterator it2 = arbol2.iterator();
	while(it1.hasNext()) {
	    if(it2.hasNext()) {
		if(!it1.next().equals(it2.next()))
		    iguales = false;
	    }else {
		iguales = false;
	    }
	}
	if(it2.hasNext())
	    iguales = false;
	return iguales;
    }
    
    public static BinaryTree crearArbolSoloRaiz() {
	return new BinaryTree<String>("1");
    }
    
    public static BinaryTree crearArbolSoloHijoIzquierda() {
	BinaryTree arbolSoloIzquierda = new BinaryTree("1");
	Node aux;
	aux = new Node("2");
	aux.setParent(arbolSoloIzquierda.getRoot());
	arbolSoloIzquierda.getRoot().setLeftChild(aux);
	return arbolSoloIzquierda;
    }
    
    public static BinaryTree crearArbolSoloHijoDerecha() {
	BinaryTree arbolSoloDerecha = new BinaryTree("1");
	Node aux;
	aux = new Node("2");
	aux.setParent(arbolSoloDerecha.getRoot());
	arbolSoloDerecha.getRoot().setRightChild(aux);
	return arbolSoloDerecha;
    }
    
    public static BinaryTree crearArbolDosHijos() {
	BinaryTree arbolDosHijos = new BinaryTree("1");
	Node aux;
	aux = new Node("2");
	aux.setParent(arbolDosHijos.getRoot());
	arbolDosHijos.getRoot().setLeftChild(aux);
	aux = new Node("3");
	aux.setParent(arbolDosHijos.getRoot());
	arbolDosHijos.getRoot().setRightChild(aux);
	return arbolDosHijos;
    }
    
    public static BinaryTree crearArbolVariosNiveles() {
	BinaryTree arbolVariosNiveles;
	Node aux;
	Node aux2;
	arbolVariosNiveles = new BinaryTree<String>("1");
	aux = new Node("2");
	aux.setParent(arbolVariosNiveles.getRoot());
	arbolVariosNiveles.getRoot().setLeftChild(aux);
	aux2 = new Node("4");
	aux2.setParent(aux);
	aux.setLeftChild(aux2);
	aux = new Node("3");
	aux.setParent(arbolVariosNiveles.getRoot());
	arbolVariosNiveles.getRoot().setRightChild(aux);
	return arbolVariosNiveles;
    }
    
    public static BinaryTree crearArbolVariosNivelesIzq() {
    	BinaryTree arbolVariosNiveles;
    	Node aux;
    	Node aux2;
    	Node aux3;
    	arbolVariosNiveles = new BinaryTree<String>("1");
    	aux = new Node("2");
    	aux.setParent(arbolVariosNiveles.getRoot());
    	arbolVariosNiveles.getRoot().setLeftChild(aux);
    	aux2 = new Node("4");
    	aux2.setParent(aux);
    	aux.setLeftChild(aux2);
    	aux = new Node("3");
    	aux.setParent(arbolVariosNiveles.getRoot());
    	arbolVariosNiveles.getRoot().setRightChild(aux);
    	
    	aux3= new Node("5");
    	aux3.setParent(aux2);
    	arbolVariosNiveles.getRoot().getLeftChild().getLeftChild().setLeftChild(aux3);
    	
    	return arbolVariosNiveles;
      }
        
    public static BinaryTree crearArbolVariosNivelesDcha() {
    	BinaryTree arbolVariosNiveles;
    	Node aux;
    	Node aux2;
    	Node aux3;
    	arbolVariosNiveles = new BinaryTree<String>("1");
    	aux = new Node("2");
    	aux.setParent(arbolVariosNiveles.getRoot());
    	arbolVariosNiveles.getRoot().setLeftChild(aux);
    	aux2 = new Node("4");
    	aux2.setParent(aux);
    	aux.setLeftChild(aux2);
    	aux = new Node("3");
    	aux.setParent(arbolVariosNiveles.getRoot());
    	arbolVariosNiveles.getRoot().setRightChild(aux);
    	
    	aux3= new Node("5");
    	aux3.setParent(aux2);
    	arbolVariosNiveles.getRoot().getLeftChild().getLeftChild().setRightChild(aux3);
    	
    	return arbolVariosNiveles;
      }
    
}
