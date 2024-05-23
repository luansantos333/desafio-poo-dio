package br.com.dio.desafio.dominio;

import java.util.List;

public class Curso extends Conteudo{

    private int cargaHoraria;
    private List<DesafioCodigo> listaDeDesafiosDoCurso;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<DesafioCodigo> getListaDeDesafiosDoCurso() {
        return listaDeDesafiosDoCurso;
    }

    public void setListaDeDesafiosDoCurso(List<DesafioCodigo> listaDeDesafiosDoCurso) {
        this.listaDeDesafiosDoCurso = listaDeDesafiosDoCurso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
