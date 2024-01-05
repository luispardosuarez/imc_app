package dev.luispardo.imcapp.models;

import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese su sexo: ");
        String sexo = scanner.next();

       
        Person person = new Person(nombre, edad, sexo);

   
        System.out.println("\nDatos Personales:");
        System.out.println("Nombre: " + person.getNombre());
        System.out.println("Edad: " + person.getEdad());
        System.out.println("Sexo: " + person.getSexo());


        scanner.close();
    }
}

class Person {
    private String nombre;
    private int edad;
    private String sexo;


    public Person(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }
}

