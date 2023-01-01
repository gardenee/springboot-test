package com.test.test.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
@AllArgsConstructor
@Table(name ="article")
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

}
