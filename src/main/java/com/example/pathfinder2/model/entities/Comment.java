package com.example.pathfinder2.model.entities;


import com.example.pathfinder2.model.entities.BaseEntity;
import com.example.pathfinder2.model.entities.Route;
import com.example.pathfinder2.model.entities.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "comments")
public class Comments extends BaseEntity {

//    private boolean approved;
//    private LocalDateTime created;
//    private String textContent;
//    private User author;
//    private Route route;

    @Basic
    private boolean approved;

    @Column(nullable = false)
    private LocalDateTime created;

    @Column(columnDefinition = "longtext")
    private String textContent;

    @ManyToOne
    private User author;

    @ManyToOne(optional = false)
    private Route route;

}
