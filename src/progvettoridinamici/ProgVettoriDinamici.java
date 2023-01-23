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
public class ProgVettoriDinamici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList<String>(); //Capacità iniziale non specificata 
                                                           //perchè il parametro del costruttore è vuoto
        
        System.out.println(lista.size()); //Size fa ritornare indietro sono la quantità di oggetti dentro il vettore
        //Ignorando i null
        
        lista.add("le balls0");
        System.out.println(lista);
        
        lista.add("le balls1");
        System.out.println(lista);
        
        lista.add("le balls2");
        System.out.println(lista);
        
        lista.remove("le balls1");
        System.out.println(lista);
        
        lista.add("le balls1");
        System.out.println(lista);
        
        lista.remove(1);
        System.out.println(lista);
        
        System.out.println(lista.size());
        
        for (String elemento : lista) { //For Each
            System.out.println(elemento);
        }
        
        lista.set(0, "le balline"); //Stessa cosa scritta qui sotto ma è totale senza + 1;
        System.out.println(lista);
        
        lista.add(2,"dove sono"); //Add non va oltre la quantità totale + 1; add(6,qualcosa) va in crash.
        System.out.println(lista);
        
        System.out.println(lista.isEmpty());
        
        lista.clear(); //Clear e removeAll sono uguali
        System.out.println(lista);
        
        System.out.println(lista.isEmpty());
        // La parte 2;
        
        Pila laPila = new Pila();
        
        laPila.push("sium");
        System.out.println(laPila.pop());
        
        laPila.push("sium1");
        laPila.push("sium2");
        laPila.push("sium3");
        laPila.push("sium4");
        System.out.println(laPila.pop());
        System.out.println(laPila.pop());
        System.out.println(laPila.pop());
        System.out.println(laPila.pop());
    }
    
}
