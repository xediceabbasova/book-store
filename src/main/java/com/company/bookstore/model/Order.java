package com.company.bookstore.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "bookOrder")
@Table
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String userName;

    @Column
    @ElementCollection(targetClass = Integer.class)
    private List<Integer> bookList;

    private Double totalPrice;


}
