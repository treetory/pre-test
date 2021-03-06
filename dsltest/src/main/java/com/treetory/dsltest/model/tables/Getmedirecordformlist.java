/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GetmedirecordformlistRecord;

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
public class Getmedirecordformlist extends TableImpl<GetmedirecordformlistRecord> {

    private static final long serialVersionUID = 1604075999;

    /**
     * The reference instance of <code>mplus_test_data.getmedirecordformlist</code>
     */
    public static final Getmedirecordformlist GETMEDIRECORDFORMLIST = new Getmedirecordformlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetmedirecordformlistRecord> getRecordType() {
        return GetmedirecordformlistRecord.class;
    }

    /**
     * The column <code>mplus_test_data.getmedirecordformlist.hospitalCd</code>.
     */
    public final TableField<GetmedirecordformlistRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getmedirecordformlist.medicalRecordFormCd</code>.
     */
    public final TableField<GetmedirecordformlistRecord, String> MEDICALRECORDFORMCD = createField("medicalRecordFormCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getmedirecordformlist.medicalRecordFormNm</code>.
     */
    public final TableField<GetmedirecordformlistRecord, String> MEDICALRECORDFORMNM = createField("medicalRecordFormNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getmedirecordformlist</code> table reference
     */
    public Getmedirecordformlist() {
        this(DSL.name("getmedirecordformlist"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getmedirecordformlist</code> table reference
     */
    public Getmedirecordformlist(String alias) {
        this(DSL.name(alias), GETMEDIRECORDFORMLIST);
    }

    /**
     * Create an aliased <code>mplus_test_data.getmedirecordformlist</code> table reference
     */
    public Getmedirecordformlist(Name alias) {
        this(alias, GETMEDIRECORDFORMLIST);
    }

    private Getmedirecordformlist(Name alias, Table<GetmedirecordformlistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Getmedirecordformlist(Name alias, Table<GetmedirecordformlistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Getmedirecordformlist(Table<O> child, ForeignKey<O, GetmedirecordformlistRecord> key) {
        super(child, key, GETMEDIRECORDFORMLIST);
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
    public Getmedirecordformlist as(String alias) {
        return new Getmedirecordformlist(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getmedirecordformlist as(Name alias) {
        return new Getmedirecordformlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getmedirecordformlist rename(String name) {
        return new Getmedirecordformlist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getmedirecordformlist rename(Name name) {
        return new Getmedirecordformlist(name, null);
    }
}
