/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GetmedirecordlistRecord;

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
public class Getmedirecordlist extends TableImpl<GetmedirecordlistRecord> {

    private static final long serialVersionUID = 112036155;

    /**
     * The reference instance of <code>mplus_test_data.getmedirecordlist</code>
     */
    public static final Getmedirecordlist GETMEDIRECORDLIST = new Getmedirecordlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetmedirecordlistRecord> getRecordType() {
        return GetmedirecordlistRecord.class;
    }

    /**
     * The column <code>mplus_test_data.getmedirecordlist.hospitalCd</code>.
     */
    public final TableField<GetmedirecordlistRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getmedirecordlist.medicalRecordSeq</code>.
     */
    public final TableField<GetmedirecordlistRecord, String> MEDICALRECORDSEQ = createField("medicalRecordSeq", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getmedirecordlist.medicalRecordDt</code>.
     */
    public final TableField<GetmedirecordlistRecord, String> MEDICALRECORDDT = createField("medicalRecordDt", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getmedirecordlist.medicalRecordFormNm</code>.
     */
    public final TableField<GetmedirecordlistRecord, String> MEDICALRECORDFORMNM = createField("medicalRecordFormNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getmedirecordlist.medicalRecordSubTitle</code>.
     */
    public final TableField<GetmedirecordlistRecord, String> MEDICALRECORDSUBTITLE = createField("medicalRecordSubTitle", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getmedirecordlist.lastWriter</code>.
     */
    public final TableField<GetmedirecordlistRecord, String> LASTWRITER = createField("lastWriter", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getmedirecordlist</code> table reference
     */
    public Getmedirecordlist() {
        this(DSL.name("getmedirecordlist"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getmedirecordlist</code> table reference
     */
    public Getmedirecordlist(String alias) {
        this(DSL.name(alias), GETMEDIRECORDLIST);
    }

    /**
     * Create an aliased <code>mplus_test_data.getmedirecordlist</code> table reference
     */
    public Getmedirecordlist(Name alias) {
        this(alias, GETMEDIRECORDLIST);
    }

    private Getmedirecordlist(Name alias, Table<GetmedirecordlistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Getmedirecordlist(Name alias, Table<GetmedirecordlistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Getmedirecordlist(Table<O> child, ForeignKey<O, GetmedirecordlistRecord> key) {
        super(child, key, GETMEDIRECORDLIST);
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
    public Getmedirecordlist as(String alias) {
        return new Getmedirecordlist(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getmedirecordlist as(Name alias) {
        return new Getmedirecordlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getmedirecordlist rename(String name) {
        return new Getmedirecordlist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getmedirecordlist rename(Name name) {
        return new Getmedirecordlist(name, null);
    }
}
