package it.euris.ires.teams;

public interface Display extends Command {

    void displayTeam(String nomeTeam);

    void displayPerson(String nomeDipendente);

    void displayFull();
}
