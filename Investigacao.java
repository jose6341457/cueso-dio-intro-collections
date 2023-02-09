package br.com.dio.collection.list.exercicios;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*        Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        1. "Telefonou para a vítima?"
        2. "Esteve no local do crime?"
        3. "Mora perto da vítima?"
        4. "Devia para a vítima?"
        5. "Já trabalhou com a vítima?"
        Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
        "Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
        */

public class Investigacao {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<Pesquisa> buscaPessoa = new ArrayList<>(){{
        add(new Pesquisa("1- Telefonou para a vítima?"));
        add(new Pesquisa("2- Esteve no local da vítima?"));
        add(new Pesquisa("3- Mora perto da vítima?"));
        add(new Pesquisa("4- Devia para a vítima?"));
        add(new Pesquisa("5- Já trabalhou com a vítima?"));
        }} ;

        int somar = 0;
        for(int i = 0; i < 5; i++){
            System.out.println(buscaPessoa.get(i));
            System.out.println("Responda com S para sim ou N para não");
            String resposta = in.next();
//            System.out.println(resposta);

            String s = "";
            if(resposta.equalsIgnoreCase("s")){
                somar++;
//                System.out.println(somar);
            }
        }

        switch(somar) {
            case 2:
                System.out.println("\n A pessoa é Suspeita"); break;
            case 3:
            case 4:
                System.out.println("\n A pessoa é Cúmplice"); break;
            case 5:
                System.out.println("\n Essa pessoa é o ASSASSINO"); break;
            default:
                System.out.println("\n A pessoa é Inocente"); break;
        }

      /*  if (somar == 2){
            System.out.println("Suspeita");
        } else if (somar == 3){
            System.out.println("Cumplice");
        } else if (somar == 4){
            System.out.println("Cumplice");
        } else if (somar == 5){
            System.out.println("Assassina");
        } else {
            System.out.println("Inocente");
        }*/

    }
}

class Pesquisa{
    private String pergunta;

    public Pesquisa(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getPergunta() {
        return pergunta;
    }

    @Override
    public String toString() {
        return "" +
                "\n" + pergunta + '\'' +
                '}';
    }
}
