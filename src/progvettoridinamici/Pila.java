/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progvettoridinamici;

import java.util.ArrayList;

/**
 *
 * @author gabriel.ricaldone
 */
public class Pila {
    private ArrayList<Object> lista;
    
    Pila() {
        lista = new ArrayList<Object>();
    }
    
    public void push(Object elemento) {
        lista.add(0,elemento);
    }
    
    public Object pop () {
        Object temp;
        if (lista.isEmpty()) {
            return null;
        } else {
            temp = lista.get(0);
            lista.remove(0);
            return temp;
        }
    }
    
}
