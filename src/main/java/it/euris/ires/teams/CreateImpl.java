package it.euris.ires.teams;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

@AllArgsConstructor
public class CreateImpl implements Create {

    private final Map<String, Team> teams;

    private final List<Person> people;

    private final Scanner scanner;

    @Override
    public Team createTeam(String nome) {
        if (!teams.containsKey(nome)) {
            Team team = new Team(nome);
            teams.put(nome, team);
            System.out.println("New team " + team.getName() + " created");
            return team;
        } else {
            throw new RuntimeException("Team " + nome + " already saved");
        }
    }

    @Override
    public Person createPerson(String nomeTeam, String nomeDipendente) {
        for (Person person : people) {
            if (teams.containsKey(nomeTeam)) {
                if (person.getTeamName().equals(nomeTeam) && person.getName().equals(nomeDipendente)) {
                    throw new RuntimeException("Person already present in team " + nomeTeam);
                }
            } else {
                throw new RuntimeException("Team not found");
            }
        }
        Person newPerson = new Person(nomeDipendente, nomeTeam);
        people.add(newPerson);
        return newPerson;
    }

    @Override
    public void execute() {
        System.out.println("Creation of: Person (p) or Team (t)?");
        switch (scanner.next()) {
            case "p":
                System.out.println("Insert team name");
                String nomeTeam = scanner.next();
                System.out.println("Insert person name");
                String nomeDipendente = scanner.next();
                createPerson(nomeTeam, nomeDipendente);
                break;
            case "t":
                System.out.println("Insert team name");
                nomeTeam = scanner.next();
                createTeam(nomeTeam);
                break;
            default:
                System.out.println("execution failed");
        }

    }
}
