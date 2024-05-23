import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Bootcamp oferecido pela Santander em parceria com a Digital Innovation One");
        curso1.setCargaHoraria(8);
        curso1.setListaDeDesafiosDoCurso(new ArrayList<>());
        curso1.getListaDeDesafiosDoCurso().add(new DesafioCodigo(new ArrayList<>(List.of("Questão 1", "Questão 2", "Questão 3"))));


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuan = new Dev();
        devLuan.setNome("Luan");
        devLuan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Luan:" + devLuan.getConteudosInscritos());
        devLuan.progredir();
        devLuan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Luan:" + devLuan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Luan:" + devLuan.getConteudosConcluidos());
        System.out.println("XP:" + devLuan.calcularTotalXp() + "\n");

        bootcamp.getConteudos().forEach(c -> {




            if (c instanceof Curso) {

                System.out.println("Desafio Curso");

                Curso b = (Curso) c;

                for (DesafioCodigo d : b.getListaDeDesafiosDoCurso()) {

                    d.questionario(devLuan, curso1);
                    System.out.println(d.toString() + "\n");

                }
            }

        });


    }

}

