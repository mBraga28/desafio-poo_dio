import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
    //    Mentoria mentoria = new Mentoria();
        curso1.setTitulo("Curso JS");
        curso1.setDescricao("Descricao Curso JS");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descricao Curso Java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria JS");
        mentoria1.setDescricao("Descricao Mentoria JS");
        mentoria1.setData(LocalDate.now());



        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

    }
}
