package it.euris.ires.teams;

public interface Create extends Command {

    Team createTeam(String nome);

    Person createPerson(String nomeTeam, String nomeDipendente);
}
