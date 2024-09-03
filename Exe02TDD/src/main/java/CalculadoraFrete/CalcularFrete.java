package CalculadoraFrete;

public class CalcularFrete implements CalculaFrete {
    private static final double taxaFixa = 0.10;

    @Override
    public double calcular(double peso, double distancia) {
        if (peso < 0.5 || distancia < 50){
            return 0;
        }
        return distancia * peso * taxaFixa;
    }
}
