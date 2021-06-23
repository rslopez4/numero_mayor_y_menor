package dominio;

import java.util.Scanner;


public class Estudiante {
    private String nombre;
    private char sexo;
    private double nota;
    public double getNota;

    public Estudiante(String nombre, char sexo, double nota) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getNota() {
        
  
         return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
      
    }
    
    @Override
    public String toString(){
        return this.nombre+"  "+this.nota+"  "+this.sexo;
    }
}