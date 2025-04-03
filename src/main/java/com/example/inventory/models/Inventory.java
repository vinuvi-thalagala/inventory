package com.example.inventory.models;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Inventory {

    @Id
    private int id;
    private int itemId;
    private int productId;
    private int quantity;
}
