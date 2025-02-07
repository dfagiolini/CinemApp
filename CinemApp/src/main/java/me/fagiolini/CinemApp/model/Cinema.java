package me.fagiolini.CinemApp.model;

import java.util.Set;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "nome","indirizzo" }) })
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String indirizzo;
    private String telefono;
    @OneToMany
    @JoinColumn(name = "cinema_id")
    private Set<Sala> sale;

}
