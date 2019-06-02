package pl.sdacademy.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingsTest {
    @Test
    public void greetWithName() {

        Greetings greetings = new Greetings();
        String name = "Ala";

        String result = greetings.greet(name);

        assertEquals("Witaj Ala", result);
    }

    @Test
    public void greetWithFriendWhenNullAsParameter() {
        Greetings greetings = new Greetings();
        String name = null;
        String result = greetings.greet(name);
        assertEquals("Witaj mój przyjacielu", result);
    }

    @Test
    public void greetWithCapitalLetters() {
        Greetings greetings = new Greetings();
        String name = "ADAM";
        String result = greetings.greet(name);
        assertEquals("WITAJ ADAM", result);
    }

    @Test
    public void greetWhenTwoNamesGiven() {
        Greetings greetings = new Greetings();
        String name = "Adam,Iza";
        String result = greetings.greet(name);
        assertEquals("Adam i Iza witajcie!", result);
    }

    @Test
    public void greetWhenThreeNamesGiven() {
        Greetings greetings = new Greetings();
        String name = "Adam,Iza,Robert";
        String result = greetings.greet(name);
        assertEquals("Adam, Iza i Robert witajcie!", result);
    }

    @Test
    public void greetWhenOneOfThreeNamesIsInCapitalLetters() {
        Greetings greetings = new Greetings();
        String name = "Adam,Iza,ROBERT";
        String result = greetings.greet(name);
        assertEquals("Adam i Iza, witajcie! WITAJ ROBERT!", result);
    }


}