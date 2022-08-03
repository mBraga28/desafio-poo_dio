import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao Curso JS");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now());



        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarco = new Dev();
        devMarco.setNome("Marco");
        devMarco.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos - Marco: " + devMarco.getConteudosInscritos());
        devMarco.progredir();
        devMarco.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos - Marco: " + devMarco.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos - Marco: " + devMarco.getConteudosConcluidos());
        System.out.println();
        System.out.println("XP: " + devMarco.calcularTotalXp());

        System.out.println("-----------------------");

        Dev devBianca = new Dev();
        devBianca.setNome("Bianca");
        devBianca.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos - Bianca: " + devBianca.getConteudosInscritos());
        devBianca.progredir();
        devBianca.progredir();
        devBianca.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos - Bianca: " + devBianca.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos - Bianca: " + devBianca.getConteudosConcluidos());
        System.out.println("XP: " + devBianca.calcularTotalXp());


    }
}
