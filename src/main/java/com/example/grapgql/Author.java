package com.example.grapgql;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Introspected
@AllArgsConstructor
@Getter
public class Author {

    private final String id;
    private final String firstName;
    private final String lastName;

}
