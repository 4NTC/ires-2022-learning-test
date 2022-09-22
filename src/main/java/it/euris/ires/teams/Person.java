package it.euris.ires.teams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Person {

    private final String name;
    @Setter private Team team;


}
