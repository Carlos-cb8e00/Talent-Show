package TalentShow.modelo.beans;

import java.util.ArrayList;

public class Poeta extends Concursante {
    ArrayList<String> poemas = datos.Poemas();
    String poema= poemas.get((int)(Math.random()*poemas.size()));

    public Poeta(int num_concursante, String nombre, int edad, int  puntuacion) {
        this.num_concursante=num_concursante;
        this.nombre=nombre;
        this.edad=edad;
        this.puntuacion=puntuacion;
    }

    public void saludar() {
        System.out.println("Hola, me llamo "+nombre+" y voy a recitar "+poema);
    }
    public void despedirse() {
        System.out.println("Gracias por escuchar!");
    }
    public void actuar() {
        System.out.println("Recitando "+poema);
    }

}
