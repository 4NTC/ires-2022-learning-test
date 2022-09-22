package test;

import it.euris.ires.teams.CreateImpl;
import it.euris.ires.teams.Person;
import it.euris.ires.teams.Team;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class CreateImplTest {

    private Map<String, Team> teams;
    private List<Person> people;
    //@Mock
    private Scanner scanner;
    private CreateImpl create;

    @BeforeEach
    void init() {
        teams = new HashMap<>();
        people = new ArrayList<>();
        scanner = new Scanner(System.in);

        create = new CreateImpl(teams, people, scanner);
    }

    @org.junit.jupiter.api.Test
    void createTeam_success() {
        String nomeTeam = "team1";
        Team response = new Team(nomeTeam);
        create.createTeam(nomeTeam);
        Team team = teams.get(nomeTeam);
        Assertions.assertEquals(response.getName(), team.getName());

    }

    @org.junit.jupiter.api.Test
    void createTeam_fail() {
        String nomeTeam = "team1";
        Team team = new Team(nomeTeam);
        teams.put(team.getName(), team);

        RuntimeException e = assertThrows(RuntimeException.class,
                () -> create.createTeam(nomeTeam));
        assertEquals("Team " + nomeTeam + " already saved", e.getMessage());

    }

    @org.junit.jupiter.api.Test
    void createPerson() {
    }
}