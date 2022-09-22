package it.euris.ires.teams;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

@AllArgsConstructor
@Getter
public class DisplayImpl implements Display {

    private final Map<String, Team> teams;

    private final List<Person> people;

    private final Scanner scanner;

    @Override
    public void displayTeam(String nomeTeam) {

        Team team = teams.get(nomeTeam);

        System.out.println("TEAM " + nomeTeam + ", members:");

        team.getMembers().forEach(person -> System.out.println(person.getName()));

    }

    @Override
    public void displayPerson(String nomeDipendente) {

        for (Person person : people) {
            if (person.getName().equals(nomeDipendente)) {
                System.out.println("Dipendente :" + person.getName() + " Team: " +  person.getTeamName());
            }
        }

    }

    @Override
    public void displayFull() {

    }

    @Override
    public void execute() {
        System.out.println("Display Person (p), Team (t), All (a)");
        String nome;
        switch (scanner.next()) {
            case "p":
                System.out.println("Inserire nome Dipendente:");
                nome = scanner.next();
                displayPerson(nome);
            case "t":
                System.out.println("Inserire nome Team:");
                nome = scanner.next();
                displayTeam(nome);
            case "a":
                displayFull();
            default:
        }

    }
}
