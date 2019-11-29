/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GetprescriptionclslistRecord;

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
public class Getprescriptionclslist extends TableImpl<GetprescriptionclslistRecord> {

    private static final long serialVersionUID = -1662209143;

    /**
     * The reference instance of <code>mplus_test_data.getprescriptionclslist</code>
     */
    public static final Getprescriptionclslist GETPRESCRIPTIONCLSLIST = new Getprescriptionclslist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetprescriptionclslistRecord> getRecordType() {
        return GetprescriptionclslistRecord.class;
    }

    /**
     * The column <code>mplus_test_data.getprescriptionclslist.hospitalCd</code>.
     */
    public final TableField<GetprescriptionclslistRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getprescriptionclslist.prescriptionClsCd</code>.
     */
    public final TableField<GetprescriptionclslistRecord, String> PRESCRIPTIONCLSCD = createField("prescriptionClsCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getprescriptionclslist.prescriptionClsNm</code>.
     */
    public final TableField<GetprescriptionclslistRecord, String> PRESCRIPTIONCLSNM = createField("prescriptionClsNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getprescriptionclslist</code> table reference
     */
    public Getprescriptionclslist() {
        this(DSL.name("getprescriptionclslist"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getprescriptionclslist</code> table reference
     */
    public Getprescriptionclslist(String alias) {
        this(DSL.name(alias), GETPRESCRIPTIONCLSLIST);
    }

    /**
     * Create an aliased <code>mplus_test_data.getprescriptionclslist</code> table reference
     */
    public Getprescriptionclslist(Name alias) {
        this(alias, GETPRESCRIPTIONCLSLIST);
    }

    private Getprescriptionclslist(Name alias, Table<GetprescriptionclslistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Getprescriptionclslist(Name alias, Table<GetprescriptionclslistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Getprescriptionclslist(Table<O> child, ForeignKey<O, GetprescriptionclslistRecord> key) {
        super(child, key, GETPRESCRIPTIONCLSLIST);
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
    public Getprescriptionclslist as(String alias) {
        return new Getprescriptionclslist(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getprescriptionclslist as(Name alias) {
        return new Getprescriptionclslist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getprescriptionclslist rename(String name) {
        return new Getprescriptionclslist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getprescriptionclslist rename(Name name) {
        return new Getprescriptionclslist(name, null);
    }
}