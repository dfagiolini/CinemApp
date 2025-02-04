package me.fagiolini.CinemApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Utente {
    @Id
    private long id;
    private String nome;
    private String email;
    private String password;
    private Ruolo ruolo;
}
