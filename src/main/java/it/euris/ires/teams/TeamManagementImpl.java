package it.euris.ires.teams;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
@AllArgsConstructor
@Getter
public class TeamManagementImpl implements TeamManagement {

    private Map<String, Team> teams;

    private List<Person> people;

    private Scanner scanner;

    @Override
    public void sendCommand(String command) {
        switch (command) {
            case "CREATE":
                Create createCommand = new CreateImpl(teams, people, scanner);
                createCommand.execute();
                break;
            case "DISPLAY":
                Display displayCommand = new DisplayImpl(teams, people, scanner);
                displayCommand.execute();
                break;
            default:
                System.out.println("Command not valid.");
        }
    }
}
