/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.Getvitallistsum2Record;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Getvitallistsum2 extends TableImpl<Getvitallistsum2Record> {

    private static final long serialVersionUID = -553801259;

    /**
     * The reference instance of <code>mplus_test_data.getvitallistsum2</code>
     */
    public static final Getvitallistsum2 GETVITALLISTSUM2 = new Getvitallistsum2();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Getvitallistsum2Record> getRecordType() {
        return Getvitallistsum2Record.class;
    }

    /**
     * The column <code>mplus_test_data.getvitallistsum2.hospitalCd</code>.
     */
    public final TableField<Getvitallistsum2Record, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getvitallistsum2.baseDt</code>.
     */
    public final TableField<Getvitallistsum2Record, String> BASEDT = createField("baseDt", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getvitallistsum2.item</code>.
     */
    public final TableField<Getvitallistsum2Record, String> ITEM = createField("item", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getvitallistsum2.total1DayAgo</code>.
     */
    public final TableField<Getvitallistsum2Record, String> TOTAL1DAYAGO = createField("total1DayAgo", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getvitallistsum2.total2DayAgo</code>.
     */
    public final TableField<Getvitallistsum2Record, String> TOTAL2DAYAGO = createField("total2DayAgo", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getvitallistsum2.totalBaseDay</code>.
     */
    public final TableField<Getvitallistsum2Record, String> TOTALBASEDAY = createField("totalBaseDay", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getvitallistsum2</code> table reference
     */
    public Getvitallistsum2() {
        this(DSL.name("getvitallistsum2"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getvitallistsum2</code> table reference
     */
    public Getvitallistsum2(String alias) {
        this(DSL.name(alias), GETVITALLISTSUM2);
    }

    /**
     * Create an aliased <code>mplus_test_data.getvitallistsum2</code> table reference
     */
    public Getvitallistsum2(Name alias) {
        this(alias, GETVITALLISTSUM2);
    }

    private Getvitallistsum2(Name alias, Table<Getvitallistsum2Record> aliased) {
        this(alias, aliased, null);
    }

    private Getvitallistsum2(Name alias, Table<Getvitallistsum2Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Getvitallistsum2(Table<O> child, ForeignKey<O, Getvitallistsum2Record> key) {
        super(child, key, GETVITALLISTSUM2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return MplusTestData.MPLUS_TEST_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getvitallistsum2 as(String alias) {
        return new Getvitallistsum2(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getvitallistsum2 as(Name alias) {
        return new Getvitallistsum2(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getvitallistsum2 rename(String name) {
        return new Getvitallistsum2(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getvitallistsum2 rename(Name name) {
        return new Getvitallistsum2(name, null);
    }
}
