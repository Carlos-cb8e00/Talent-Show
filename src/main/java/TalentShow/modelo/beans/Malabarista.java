package TalentShow.modelo.beans;

import java.util.ArrayList;

public class Malabarista extends Concursante {
    int num_objetos = (int) (Math.random()*10)+3;
    ArrayList<String> objetos = datos.Objetos();
    String objeto = objetos.get((int)(Math.random()*objetos.size()));

    public Malabarista(int num_concursante, String nombre, int edad,  int puntuacion) {
        this.num_concursante=num_concursante;
        this.nombre=nombre;
        this.edad=edad;
        this.puntuacion=puntuacion;
    }

    public void saludar() {
        System.out.println("Hola, me llamo "+nombre+" y voy a hacer malabares con "+num_objetos+" "+objeto);
    }
    public void despedirse() {
        System.out.println("Gracias por escuchar!");
    }
    public void actuar() {
        System.out.println("Haciendo malabares con <"+num_objetos+"> <"+objeto+">");
    }

}
