package TalentShow.beans;

import java.util.ArrayList;

public class Datos{
    public ArrayList<String> Nombres() {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("María");
        nombres.add("José");
        nombres.add("Josefa");
        nombres.add("Carlota");
        nombres.add("Mari Ángeles");
        nombres.add("Eugenio");
        nombres.add("Francisco José");
        nombres.add("Carolina");
        nombres.add("Laura");
        nombres.add("Iván");
        nombres.add("Ángela");
        nombres.add("Pepe");
        nombres.add("Charlie");
        return nombres;
    }

    public ArrayList<Concursante> crearConcursante(int tamanio_concurso){
        ArrayList<Concursante> concursantes= new ArrayList<>();
        ArrayList<String> nombres = Nombres();
        for (int i=1;i < tamanio_concurso*3;i+=3) {
            concursantes.add(new Malabarista(i,nombres.get((int)(Math.random()*nombres.size())),((int)(Math.random()*92+8)),0)); //por eso de que no puedan asistir bebés
            concursantes.add(new Cantante(i+1,nombres.get((int)(Math.random()*nombres.size())),((int)(Math.random()*92+8)),0));
            concursantes.add(new Poeta(i+2,nombres.get((int)(Math.random()*nombres.size())),((int)(Math.random()*92+8)),0));
        }

        return concursantes;
    }

    public ArrayList<String> Poemas() {
        ArrayList<String> poemas = new ArrayList<>();
        poemas.add("Mio Cid");
        poemas.add("A un olmo seco");
        poemas.add("Rima LIII");
        poemas.add("Tú me quieres alba");
        poemas.add("La canción del pirata");
        poemas.add("Oda a la cebolla");
        poemas.add("The Raven");
        poemas.add("Poema 20");
        poemas.add("La Odisea");
        poemas.add("El camino no elegido");
        poemas.add("Beowulf");
        poemas.add("Coplas a la muerte de su padre");

        return poemas;
    }

    public ArrayList<String> Objetos() {
        ArrayList<String> objetos = new ArrayList<>();
        objetos.add("pelotas");
        objetos.add("macetas");
        objetos.add("bolas");
        objetos.add("papeles higiénicos");
        objetos.add("cabezas");
        objetos.add("cebollas");
        objetos.add("hámsters");
        objetos.add("extintores");

        return objetos;
    }

    public ArrayList<String> Canciones() {
        ArrayList<String> canciones = new ArrayList<>();
        canciones.add("Like a Rolling Stone");
        canciones.add("Imagine");
        canciones.add("Claro de Luna");
        canciones.add("Superestrella");
        canciones.add("Für Elise");
        canciones.add("Despacito");
        canciones.add("Shape of You");
        canciones.add("Respect");
        canciones.add("Cumpleaños feliz");
        canciones.add("A quién le importa");
        canciones.add("No Dudaría");
        canciones.add("Fiesta pagana");
        canciones.add("Vivir así es Morir de amor");

        return canciones;
    }
}
