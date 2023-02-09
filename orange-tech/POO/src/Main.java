import java.time.LocalDate;

import br.com.dio.challenge.domain.Bootcamp;
import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Developer;
import br.com.dio.challenge.domain.Mentorship;

public class Main {
    public static void main(String[] args) throws Exception {
        Course collections = new Course();
        Course arrays = new Course();
        Mentorship career = new Mentorship();

        collections.setTitle("Trabalhando com collections");
        collections.setDescription("Curso de collections");
        collections.setWorkload(2);
        arrays.setTitle("Explorando arrays");
        arrays.setDescription("Curso sobre arrays em java");
        arrays.setWorkload(1);
        career.setTitle("Como alavancar sua carreira como dev");
        career.setDescription("Mentoria sobre carreira.");
        career.setMentorshipDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Curso de java do básico ao avançado");
        bootcamp.getContents().add(collections);
        bootcamp.getContents().add(arrays);
        bootcamp.getContents().add(career);

        Developer devAlexandre = new Developer();
        devAlexandre.setName("Alexandre");
        devAlexandre.subscribeToBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Alexandre: " + devAlexandre.getSubscribedContents());
        devAlexandre.toProress();
        System.out.println("Finalizando um conteúdo...");
        System.out.println("Conteúdos Concluídos de Alexandre: " + devAlexandre.getFinishedContents());
        System.out.println("Conteúdos inscritos de Alexandre: " + devAlexandre.getSubscribedContents());
        System.out.println("XP: " + devAlexandre.calculateTotalExperience());

    }
}
