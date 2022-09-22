package it.euris.ires.teams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Person {

    private String name;
    @Setter private String teamName;

}
