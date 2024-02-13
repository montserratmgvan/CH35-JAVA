package org.generation.persona;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.generation.persona.Persona;

public class PersonaTest {

    // Método para validar el email con regex
    public static boolean validarEmail(String email) {
        // Definir la expresión regular para validar el dominio @gmail.com
        String patronEmail = "^[a-zA-Z0-9_.+-]+@gmail\\.com$";
        Pattern pattern = Pattern.compile(patronEmail);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        // instanciar los objetos
        Persona Lucero = new Persona("Lucero", "Soriano", "luz@gmail.com", "24");
        Persona Eveida = new Persona("Eveida", "Palos", "eveida@gmail.com", "23");
        Persona Montserrat = new Persona("Montserrat", "Martínez", "montserrat@gmail.com", "23");
        Persona Cindy = new Persona("Cindy", "Rejón", "cindy_rejon@hotmail.com", "32");

        System.out.println(Lucero);
        System.out.println(Eveida);
        System.out.println(Montserrat);
        System.out.println(Cindy);

        // Validar el correo de cada persona
        System.out.println("Validación Lucero: " + validarEmail(Lucero.getEmail()));
        System.out.println("Validación Eveida: " + validarEmail(Eveida.getEmail()));
        System.out.println("Validación Montserrat: " + validarEmail(Montserrat.getEmail()));
        System.out.println("Validación Cindy: " + validarEmail(Cindy.getEmail()));
    }
}

