package com.cybage.junitrestapp;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="book_record")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;


    private String name;


    private String summary;

    private double rating;

}
