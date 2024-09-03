package ValidadorCpf;

public class ValidadorCpf {
    public static boolean validar(String cpf) {
        //se for nulo ou não estiver na máscara 123.456.789-09 (não valida repetidos)
        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            return false;
        }
        //remove máscara
        cpf = cpf.replaceAll("\\D", "");
        //valida repetidos
        if (cpf.chars().distinct().count() == 1) {
            return false;
        }
        int[] pesosPrimeiroDigito = {10, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] pesosSegundoDigito = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
        int primeiroDigito = calcularDigito(cpf.substring(0, 9), pesosPrimeiroDigito);
        int segundoDigito = calcularDigito(cpf.substring(0, 9) + primeiroDigito, pesosSegundoDigito);
        return cpf.equals(cpf.substring(0, 9) + primeiroDigito + segundoDigito);
    }

    private static int calcularDigito(String cpf, int[] pesos) {
        int soma = 0;
        for (int i = 0; i < cpf.length(); i++) {
            soma += (cpf.charAt(i) - '0') * pesos[i];
        }
        int digito = 11 - (soma % 11);
        return digito > 9 ? 0 : digito;
    }
}
