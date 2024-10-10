package org.example.service;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;



import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceTest {

    private static final Faker faker = new Faker();

    private LibraryService libraryService;
    private int currentYear;

    @BeforeEach
    public void setUp() {
        libraryService = new LibraryService();
        currentYear = LocalDate.now().getYear();
    }

    @Test
    public void testCreateAuthorAndBookInvalidInput() {
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        int age = faker.random().nextInt(20, 80);
        String title = faker.name().title();
        int year = currentYear + 5;
        int issn = faker.random().nextInt(1, 100);

        try {
            libraryService.createAuthorAndBook(firstName, lastName, age, title, year, issn);
        } catch (IllegalArgumentException e) {
            assertEquals("Year in the future", e.getMessage());
        }
    }
}