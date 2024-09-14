import tde.Calculadora;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------- tde -----------");

        Calculadora calculadora = new Calculadora();

        List<Double> numeros = Arrays.asList(2.0, 5.0, 3.0);

        System.out.println("Soma: " + calculadora.somar(numeros));
        System.out.println("Subtração: " + calculadora.subtrair(numeros));
        System.out.println("Multiplicação: " + calculadora.multiplicar(numeros));
        System.out.println("Divisão: " + calculadora.dividir(numeros));
    }
}