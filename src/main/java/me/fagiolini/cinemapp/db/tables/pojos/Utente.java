/*
 * This file is generated by jOOQ.
 */
package me.fagiolini.cinemapp.db.tables.pojos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Size;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
@Entity
@Table(
    name = "utente",
    schema = "cinemapp",
    uniqueConstraints = {
        @UniqueConstraint(name = "utente_email_key", columnNames = { "email" }),
        @UniqueConstraint(name = "utente_nome_key", columnNames = { "nome" })
    }
)
public class Utente implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Short ruolo;
    private String email;
    private String nome;
    private String password;

    public Utente() {}

    public Utente(Utente value) {
        this.id = value.id;
        this.ruolo = value.ruolo;
        this.email = value.email;
        this.nome = value.nome;
        this.password = value.password;
    }

    public Utente(
        Long id,
        Short ruolo,
        String email,
        String nome,
        String password
    ) {
        this.id = id;
        this.ruolo = ruolo;
        this.email = email;
        this.nome = nome;
        this.password = password;
    }

    /**
     * Getter for <code>cinemapp.utente.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>cinemapp.utente.id</code>.
     */
    public Utente setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>cinemapp.utente.ruolo</code>.
     */
    @Column(name = "ruolo")
    public Short getRuolo() {
        return this.ruolo;
    }

    /**
     * Setter for <code>cinemapp.utente.ruolo</code>.
     */
    public Utente setRuolo(Short ruolo) {
        this.ruolo = ruolo;
        return this;
    }

    /**
     * Getter for <code>cinemapp.utente.email</code>.
     */
    @Column(name = "email", length = 255)
    @Size(max = 255)
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>cinemapp.utente.email</code>.
     */
    public Utente setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Getter for <code>cinemapp.utente.nome</code>.
     */
    @Column(name = "nome", length = 255)
    @Size(max = 255)
    public String getNome() {
        return this.nome;
    }

    /**
     * Setter for <code>cinemapp.utente.nome</code>.
     */
    public Utente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    /**
     * Getter for <code>cinemapp.utente.password</code>.
     */
    @Column(name = "password", length = 255)
    @Size(max = 255)
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>cinemapp.utente.password</code>.
     */
    public Utente setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Utente other = (Utente) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.ruolo == null) {
            if (other.ruolo != null)
                return false;
        }
        else if (!this.ruolo.equals(other.ruolo))
            return false;
        if (this.email == null) {
            if (other.email != null)
                return false;
        }
        else if (!this.email.equals(other.email))
            return false;
        if (this.nome == null) {
            if (other.nome != null)
                return false;
        }
        else if (!this.nome.equals(other.nome))
            return false;
        if (this.password == null) {
            if (other.password != null)
                return false;
        }
        else if (!this.password.equals(other.password))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.ruolo == null) ? 0 : this.ruolo.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.nome == null) ? 0 : this.nome.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Utente (");

        sb.append(id);
        sb.append(", ").append(ruolo);
        sb.append(", ").append(email);
        sb.append(", ").append(nome);
        sb.append(", ").append(password);

        sb.append(")");
        return sb.toString();
    }
}
