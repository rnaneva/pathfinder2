package com.example.pathfinder2.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "pictures")
public class Pictures extends BaseEntity{

//    private String title;
//    private String Url;
//    private User author;
//    private Route route;


    private String title;

    @Column(nullable = false, unique = true,
    columnDefinition = "longtext")
    private String Url;

    @ManyToOne
    private User author;

    @ManyToOne(optional = false)
    private Route route;


}
