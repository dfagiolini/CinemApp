package me.fagiolini.CinemApp.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
public class Cinema {
    @Id
    private long id;
    private String nome;
    private String indirizzo;
    private String telefono;
    @ManyToOne
    private List<Sala> sale;

}
