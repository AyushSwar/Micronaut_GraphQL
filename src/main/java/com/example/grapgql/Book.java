package com.example.grapgql;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Introspected
public class Book {

    private final String id;
    private final String name;
    private final int pageCount;
    private final Author author;
}
