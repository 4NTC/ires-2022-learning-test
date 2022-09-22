package it.euris.ires.teams;

public class CreateImpl implements Create {

    @Override
    public Team createTeam(String nome) {
        Team team = new Team(nome);
        return null;
    }

    @Override
    public Person createPerson(String nomeTeam, String nomeDipendente) {
        return null;
    }

    @Override
    public void execute() {

    }
}
