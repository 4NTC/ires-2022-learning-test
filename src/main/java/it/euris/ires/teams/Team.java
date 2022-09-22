package it.euris.ires.teams;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Team {

    private String name;

    private List<Person> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }
}
