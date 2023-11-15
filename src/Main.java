import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer, String> hashTable=new HashMap<>(11);
        hashTable.put(7,"Juan");
        hashTable.put(12,"Ana");
        hashTable.put(24,"Rodrigo");
        if(hashTable.containsKey(12)){
            System.out.println("valor de la clave 12: "+hashTable.get(12));
        }
        if(!hashTable.containsKey(1)){
            System.out.println("clave 1 no está insertada");
        }

        HashMap<Persona, String> T=new HashMap<>();
        Persona p=new Persona(1,"Ana");
        Persona q=new Persona(2,"José");
        T.put(p,"Ana es Chilena");
        T.put(q, "José es Argentino");

        System.out.println(T.get(p));
        System.out.println(T.get(q));

        TablaHashDoble Tabla=new TablaHashDoble(11);
        Tabla.insertar(12, "Hola");
        Tabla.insertar(25,"Que tal");
        System.out.println(Tabla.buscar(12));
        System.out.println(Tabla.buscar(25));

    }
}
