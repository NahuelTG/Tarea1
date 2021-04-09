
/**
 * Write a description of class Androide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Androide
{
    private String nombre;
    private String creacion;
    private double altura;
    private double peso;
    
    public Androide(String nombre, String creacion, double altura, double peso){
        this.nombre   = nombre;
        this.creacion = creacion;
        this.altura   = altura;
        this.peso     = peso;
    }
    public double dividir(double nro1, double nro2){
        double dividir;
        dividir = nro1/nro2;
        return dividir;
    }
    public double AreaCirculo(double Radio){
        double Area;
        Area = Math.PI * Math.sqrt(Radio);
        return Area;
    }
    public String Saludar(String Saludo){
        String Saludar = "";
        if(Saludo == "Hola"||Saludo == "Hola Androide"){
            Saludar = "Hola humano";
        }
        if(Saludo == "Hi"||Saludo == "Hi Android"){
            Saludar = "Hi human";
        }
        return Saludar;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCreacion(){
        return creacion;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public void setCreacion(String creac){
        creacion = creac;
    }
    public void setAltura(double alt){
        altura = alt;
    }
    public void setPeso(double pes){
        peso = pes;
    }
    
    
    
}
