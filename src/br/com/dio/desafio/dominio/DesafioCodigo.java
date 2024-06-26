package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioCodigo extends Conteudo{

    private ArrayList<String> questoes;
    private Dev participanteNoDesafio;
    private Curso c;

    private int respostasCorretas;


    public DesafioCodigo(ArrayList<String> questoes) {
        this.questoes = questoes;
    }


    public Dev getParticipanteNoDesafio() {
        return participanteNoDesafio;
    }

    public void setParticipanteNoDesafio(Dev participanteNoDesafio) {
        this.participanteNoDesafio = participanteNoDesafio;
    }

    @Override
    public double calcularXp() {
        if (respostasCorretas == 0) {

            return 0;

        }

        return XP_PADRAO * respostasCorretas;
    }

    public void questionario (Dev desenvolvedor, Curso c) {

        this.setParticipanteNoDesafio(desenvolvedor);
        this.setC(c);

        Scanner input = new Scanner(System.in);

        int resposta;
        int respostasCorretas = 0;
        for (String questao : questoes) {

            System.out.println(questao);
            System.out.println("1 - Resposta correta" + "\t" + "2 - Resposta errada");

            resposta = input.nextInt();

            if (resposta == 1) respostasCorretas++; else if (resposta == 2) System.out.println("Resposta errada!!");

        }

        setRespostasCorretas(respostasCorretas);

    }


    public int getRespostasCorretas() {
        return respostasCorretas;
    }

    public void setRespostasCorretas(int respostasCorretas) {
        this.respostasCorretas = respostasCorretas;
    }

    public List<String> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(ArrayList<String> questoes) {
        this.questoes = questoes;
    }


    public Curso getC() {
        return c;
    }

    public void setC(Curso c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "DesafioCodigo\n Dev " +  getParticipanteNoDesafio().getNome() + "{" +
                "respostasCorretas no curso " + c.getTitulo() + "="  + respostasCorretas +
                "\nXP Adquirido=" + calcularXp() +
                '}';
    }
}
