package TalentShow.beans;

import java.util.ArrayList;

public class Cantante extends Concursante{
    ArrayList<String> canciones = datos.Canciones();
    String cancion= canciones.get((int)(Math.random()*canciones.size()));

    public Cantante(int num_concursante, String nombre, int edad, int  puntuacion) {
        this.num_concursante=num_concursante;
        this.nombre=nombre;
        this.edad=edad;
        this.puntuacion=puntuacion;
    }

    public void saludar() {
        System.out.println("Hola, me llamo "+nombre+" y voy a cantar "+cancion);
    }
    public void despedirse() {
        System.out.println("Gracias por escuchar!");
    }
    public void actuar() {
        System.out.println("Cantando <"+cancion+">");
    }
}
