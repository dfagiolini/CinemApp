/*
 * This file is generated by jOOQ.
 */
package me.fagiolini.cinemapp.db.tables;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import me.fagiolini.cinemapp.db.Cinemapp;
import me.fagiolini.cinemapp.db.Keys;
import me.fagiolini.cinemapp.db.tables.Proiezione.ProiezionePath;
import me.fagiolini.cinemapp.db.tables.records.FilmRecord;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Film extends TableImpl<FilmRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>cinemapp.film</code>
     */
    public static final Film FILM = new Film();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmRecord> getRecordType() {
        return FilmRecord.class;
    }

    /**
     * The column <code>cinemapp.film.id</code>.
     */
    public final TableField<FilmRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>cinemapp.film.durata</code>.
     */
    public final TableField<FilmRecord, Integer> DURATA = createField(DSL.name("durata"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>cinemapp.film.copertina</code>.
     */
    public final TableField<FilmRecord, String> COPERTINA = createField(DSL.name("copertina"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>cinemapp.film.descrizione</code>.
     */
    public final TableField<FilmRecord, String> DESCRIZIONE = createField(DSL.name("descrizione"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>cinemapp.film.genere</code>.
     */
    public final TableField<FilmRecord, String> GENERE = createField(DSL.name("genere"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>cinemapp.film.regia</code>.
     */
    public final TableField<FilmRecord, String> REGIA = createField(DSL.name("regia"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>cinemapp.film.titolo</code>.
     */
    public final TableField<FilmRecord, String> TITOLO = createField(DSL.name("titolo"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private Film(Name alias, Table<FilmRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Film(Name alias, Table<FilmRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>cinemapp.film</code> table reference
     */
    public Film(String alias) {
        this(DSL.name(alias), FILM);
    }

    /**
     * Create an aliased <code>cinemapp.film</code> table reference
     */
    public Film(Name alias) {
        this(alias, FILM);
    }

    /**
     * Create a <code>cinemapp.film</code> table reference
     */
    public Film() {
        this(DSL.name("film"), null);
    }

    public <O extends Record> Film(Table<O> path, ForeignKey<O, FilmRecord> childPath, InverseForeignKey<O, FilmRecord> parentPath) {
        super(path, childPath, parentPath, FILM);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class FilmPath extends Film implements Path<FilmRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> FilmPath(Table<O> path, ForeignKey<O, FilmRecord> childPath, InverseForeignKey<O, FilmRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private FilmPath(Name alias, Table<FilmRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public FilmPath as(String alias) {
            return new FilmPath(DSL.name(alias), this);
        }

        @Override
        public FilmPath as(Name alias) {
            return new FilmPath(alias, this);
        }

        @Override
        public FilmPath as(Table<?> alias) {
            return new FilmPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Cinemapp.CINEMAPP;
    }

    @Override
    public Identity<FilmRecord, Long> getIdentity() {
        return (Identity<FilmRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FilmRecord> getPrimaryKey() {
        return Keys.FILM_PKEY;
    }

    @Override
    public List<UniqueKey<FilmRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.FILM_TITOLO_REGIA_KEY);
    }

    private transient ProiezionePath _proiezione;

    /**
     * Get the implicit to-many join path to the
     * <code>cinemapp.proiezione</code> table
     */
    public ProiezionePath proiezione() {
        if (_proiezione == null)
            _proiezione = new ProiezionePath(this, null, Keys.PROIEZIONE__PROIEZIONE_FILM_ID_FKEY.getInverseKey());

        return _proiezione;
    }

    @Override
    public Film as(String alias) {
        return new Film(DSL.name(alias), this);
    }

    @Override
    public Film as(Name alias) {
        return new Film(alias, this);
    }

    @Override
    public Film as(Table<?> alias) {
        return new Film(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(String name) {
        return new Film(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(Name name) {
        return new Film(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(Table<?> name) {
        return new Film(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film where(Condition condition) {
        return new Film(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Film where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Film where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Film where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Film where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
