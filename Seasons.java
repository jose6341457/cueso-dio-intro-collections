package br.com.dio.collection.list.exercicios;

import java.util.*;




/*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as numa lista.
 * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
 * e em que mês elas ocurreram(mostrar o mês por extenso: 1. Janeiro; 2. Fevereiro; etc). */

public class Seasons {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("\n---\tCrie uma lista e adicione a temperatura média dos 6 primeiros meses do ano\t---");

        List<Temp> meuDia = new ArrayList<>() {{
            add(new Temp("1.Janeiro", 0));
            add(new Temp("2.Fevereiro", 0));
            add(new Temp("3.Março", 0));
            add(new Temp("4.Abril", 0));
            add(new Temp("5.Maio", 0));
            add(new Temp("6.Junho", 0));
        }};

        // Colocar  a temperatura dentro do ArrayList
        // meuDia.set(1, (new Tempo("2.Fevereiro", 12)));
        // String a = meuDia.get(1).getNome();
        // System.out.println(a);

        for (int i = 0; i < meuDia.size(); i++) {

            System.out.println("Adicione a temperatura média por ordem, desde janeiro até junho");
            System.out.println(meuDia.get(i).getNome());
            int temp = in.nextInt();
            String name = meuDia.get(i).getNome();
            meuDia.set(i, (new Temp(name, temp)));
            System.out.println(meuDia.get(i));

        }

        System.out.println("\n---\tLista dos primeiros 6 meses e suas temperaturas foi Criada\t---");
        System.out.println(meuDia);

        double somar = 0;
        double media = 0;

        for (int i = 0; i < meuDia.size(); i++) {

            somar += meuDia.get(i).getTemp();
            //System.out.println(somar);

            if (i == meuDia.size() - 1) {
                media = somar / meuDia.size();
                //System.out.println("soma = " + somar);
                System.out.println("\n---\tmédia semestral das temperaturas: \t--- \nTemperatura média: " + media);
            }
        }
        System.out.println("\n---\tMeses acima da temperatura média: \t---");
        int dado = 0;
        for (int i = 0; i < meuDia.size(); i++) {
            dado = meuDia.get(i).getTemp();
            //System.out.println(dado);
            if (dado > media) {
                System.out.println(meuDia.get(i));
            }
        }

    }
};

class Temp {

    private String nome;
    private Integer temp;

    public Temp(String nome, Integer temp) {
        this.nome = nome;
        this.temp = temp;
    }

    public String getNome() {
        return nome;
    }

    public Integer getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "{" +
                "" + nome + '\'' +
                ", temp=" + temp +
                '}';
    }
}






