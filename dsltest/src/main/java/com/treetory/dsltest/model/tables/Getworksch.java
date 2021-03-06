/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GetworkschRecord;

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
public class Getworksch extends TableImpl<GetworkschRecord> {

    private static final long serialVersionUID = -1542332492;

    /**
     * The reference instance of <code>mplus_test_data.getworksch</code>
     */
    public static final Getworksch GETWORKSCH = new Getworksch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetworkschRecord> getRecordType() {
        return GetworkschRecord.class;
    }

    /**
     * The column <code>mplus_test_data.getworksch.hospitalCd</code>.
     */
    public final TableField<GetworkschRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getworksch.deptCd</code>.
     */
    public final TableField<GetworkschRecord, String> DEPTCD = createField("deptCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getworksch.deptNm</code>.
     */
    public final TableField<GetworkschRecord, String> DEPTNM = createField("deptNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getworksch.doctorId</code>.
     */
    public final TableField<GetworkschRecord, String> DOCTORID = createField("doctorId", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getworksch.doctorNm</code>.
     */
    public final TableField<GetworkschRecord, String> DOCTORNM = createField("doctorNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getworksch.workingDt</code>.
     */
    public final TableField<GetworkschRecord, String> WORKINGDT = createField("workingDt", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getworksch.dayCd</code>.
     */
    public final TableField<GetworkschRecord, String> DAYCD = createField("dayCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getworksch.workingInfo</code>.
     */
    public final TableField<GetworkschRecord, String> WORKINGINFO = createField("workingInfo", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getworksch</code> table reference
     */
    public Getworksch() {
        this(DSL.name("getworksch"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getworksch</code> table reference
     */
    public Getworksch(String alias) {
        this(DSL.name(alias), GETWORKSCH);
    }

    /**
     * Create an aliased <code>mplus_test_data.getworksch</code> table reference
     */
    public Getworksch(Name alias) {
        this(alias, GETWORKSCH);
    }

    private Getworksch(Name alias, Table<GetworkschRecord> aliased) {
        this(alias, aliased, null);
    }

    private Getworksch(Name alias, Table<GetworkschRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Getworksch(Table<O> child, ForeignKey<O, GetworkschRecord> key) {
        super(child, key, GETWORKSCH);
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
    public Getworksch as(String alias) {
        return new Getworksch(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getworksch as(Name alias) {
        return new Getworksch(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getworksch rename(String name) {
        return new Getworksch(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getworksch rename(Name name) {
        return new Getworksch(name, null);
    }
}
