package TalentShow.beans;

public abstract class Concursante {
    public int num_concursante;
    public String nombre;
    public int edad;
    public int puntuacion;
    Datos datos = new Datos();


    public abstract void saludar();
    public abstract void despedirse();
    public abstract void actuar();

}
