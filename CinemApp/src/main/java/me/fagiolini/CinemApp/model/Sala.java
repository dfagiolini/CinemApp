package me.fagiolini.CinemApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Sala {
    @Id
    private long id;
    private String numero;
    private int capacita;
}
