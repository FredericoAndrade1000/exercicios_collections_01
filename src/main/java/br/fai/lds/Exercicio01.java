package br.fai.lds;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Exercicio01 app = new Exercicio01();
        app.start();
    }

    private void start(){
        List<String> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor: ");
            String valor = obterDados();

            if (valor.isEmpty() || valor.equals("invalido")){
                    continue;
            }

            lista.add(valor);

        }

        System.out.println("Itens da lista:");

        for (String item : lista) {
            System.out.println(item);
        }

        lista.add("item adicionado automaticamente 01");
        lista.add("item adicionado automaticamente 02");

        if (lista.size() >= 2) {
            lista.remove(1);
        }

        try {
            lista.remove(1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Não foi possível remover o segundo item novamente. Índice inválido.");
        }

        System.out.println("\nLista após remoções:");
        for (String item : lista) {
            System.out.println(item);
        }

    }
    private static String obterDados() {
        Scanner scanner = new Scanner(System.in);

        try {
            int valorInteiro = scanner.nextInt();
            return "valor";
        } catch (Exception exception) {
            System.out.println("Erro: " + exception.getMessage());
            return "invalido";
        }


    }


}
