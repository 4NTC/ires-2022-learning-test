package it.euris.ires.teams;

public class TeamManagementImpl implements TeamManagement {

    @Override
    public void sendCommand(String command) {
        switch (command) {
            case "CREATE":
                Create createCommand = new CreateImpl();
                createCommand.execute();
                break;
            case "DISPLAY":
                Display displayCommand = new DisplayImpl();
                displayCommand.execute();
                break;
            default:
                System.out.println("Command not valid.");
        }
    }
}
