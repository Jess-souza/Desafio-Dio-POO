import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Curso para aprender os conceitos básicos da linguagem Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de PHP");
        curso2.setDescricao("Curso para aprender os conceitos básicos da linguagem PHP");
        curso2.setCargaHoraria(7);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
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

        Dev devJessica = new Dev();
        devJessica.setNome("Jéssica");
        devJessica.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jéssica:" + devJessica.getConteudosInscritos());
        devJessica.progredir();
        devJessica.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jéssica:" + devJessica.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Jéssica:" + devJessica.getConteudosConcluidos());
        System.out.println("XP:" + devJessica.calcularTotalXp());

        System.out.println("-------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Pedro:" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Pedro:" + devPedro.getConteudosConcluidos());
        System.out.println("XP:" + devPedro.calcularTotalXp());

    }

}
