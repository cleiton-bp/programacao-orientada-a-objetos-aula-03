package tde;

import java.util.List;

public interface IOperacao {
    double somar(List<Double> numeros);
    double subtrair(List<Double> numeros);
    double multiplicar(List<Double> numeros);
    double dividir(List<Double> numeros);
}