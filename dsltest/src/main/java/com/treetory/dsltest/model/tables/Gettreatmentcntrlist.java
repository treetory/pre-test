/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GettreatmentcntrlistRecord;

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
public class Gettreatmentcntrlist extends TableImpl<GettreatmentcntrlistRecord> {

    private static final long serialVersionUID = 227959446;

    /**
     * The reference instance of <code>mplus_test_data.gettreatmentcntrlist</code>
     */
    public static final Gettreatmentcntrlist GETTREATMENTCNTRLIST = new Gettreatmentcntrlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GettreatmentcntrlistRecord> getRecordType() {
        return GettreatmentcntrlistRecord.class;
    }

    /**
     * The column <code>mplus_test_data.gettreatmentcntrlist.hospitalCd</code>.
     */
    public final TableField<GettreatmentcntrlistRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentcntrlist.treatmentCntrCd</code>.
     */
    public final TableField<GettreatmentcntrlistRecord, String> TREATMENTCNTRCD = createField("treatmentCntrCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentcntrlist.treatmentCntrNm</code>.
     */
    public final TableField<GettreatmentcntrlistRecord, String> TREATMENTCNTRNM = createField("treatmentCntrNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.gettreatmentcntrlist</code> table reference
     */
    public Gettreatmentcntrlist() {
        this(DSL.name("gettreatmentcntrlist"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.gettreatmentcntrlist</code> table reference
     */
    public Gettreatmentcntrlist(String alias) {
        this(DSL.name(alias), GETTREATMENTCNTRLIST);
    }

    /**
     * Create an aliased <code>mplus_test_data.gettreatmentcntrlist</code> table reference
     */
    public Gettreatmentcntrlist(Name alias) {
        this(alias, GETTREATMENTCNTRLIST);
    }

    private Gettreatmentcntrlist(Name alias, Table<GettreatmentcntrlistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Gettreatmentcntrlist(Name alias, Table<GettreatmentcntrlistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Gettreatmentcntrlist(Table<O> child, ForeignKey<O, GettreatmentcntrlistRecord> key) {
        super(child, key, GETTREATMENTCNTRLIST);
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
    public Gettreatmentcntrlist as(String alias) {
        return new Gettreatmentcntrlist(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gettreatmentcntrlist as(Name alias) {
        return new Gettreatmentcntrlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Gettreatmentcntrlist rename(String name) {
        return new Gettreatmentcntrlist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Gettreatmentcntrlist rename(Name name) {
        return new Gettreatmentcntrlist(name, null);
    }
}