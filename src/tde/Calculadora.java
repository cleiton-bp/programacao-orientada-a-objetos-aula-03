package tde;

import java.util.List;

public class Calculadora implements IOperacao {

    @Override
    public double somar(List<Double> numeros) {
        double resultado = 0.0;
        for (double num : numeros) {
            resultado += num;
        }
        return resultado;
    }

    @Override
    public double subtrair(List<Double> numeros) {
        if (numeros.isEmpty()) {
            return 0.0;
        }
        double resultado = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            resultado -= numeros.get(i);
        }
        return resultado;
    }

    @Override
    public double multiplicar(List<Double> numeros) {
        if (numeros.isEmpty()) {
            return 1.0;
        }
        double resultado = 1.0;
        for (double num : numeros) {
            resultado *= num;
        }
        return resultado;
    }

    @Override
    public double dividir(List<Double> numeros) {
        if (numeros.isEmpty()) {
            return 1.0;
        }
        double resultado = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            resultado /= numeros.get(i);
        }
        return resultado;
    }
}
