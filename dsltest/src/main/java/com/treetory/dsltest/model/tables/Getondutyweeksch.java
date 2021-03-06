/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GetondutyweekschRecord;

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
public class Getondutyweeksch extends TableImpl<GetondutyweekschRecord> {

    private static final long serialVersionUID = -315022908;

    /**
     * The reference instance of <code>mplus_test_data.getondutyweeksch</code>
     */
    public static final Getondutyweeksch GETONDUTYWEEKSCH = new Getondutyweeksch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetondutyweekschRecord> getRecordType() {
        return GetondutyweekschRecord.class;
    }

    /**
     * The column <code>mplus_test_data.getondutyweeksch.hospitalCd</code>.
     */
    public final TableField<GetondutyweekschRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getondutyweeksch.dutyTxt</code>.
     */
    public final TableField<GetondutyweekschRecord, String> DUTYTXT = createField("dutyTxt", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getondutyweeksch.dayCd</code>.
     */
    public final TableField<GetondutyweekschRecord, String> DAYCD = createField("dayCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getondutyweeksch.dutyDt</code>.
     */
    public final TableField<GetondutyweekschRecord, String> DUTYDT = createField("dutyDt", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getondutyweeksch.userId</code>.
     */
    public final TableField<GetondutyweekschRecord, String> USERID = createField("userId", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getondutyweeksch.userNm</code>.
     */
    public final TableField<GetondutyweekschRecord, String> USERNM = createField("userNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getondutyweeksch.workingTy</code>.
     */
    public final TableField<GetondutyweekschRecord, String> WORKINGTY = createField("workingTy", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getondutyweeksch.workingPls</code>.
     */
    public final TableField<GetondutyweekschRecord, String> WORKINGPLS = createField("workingPls", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getondutyweeksch</code> table reference
     */
    public Getondutyweeksch() {
        this(DSL.name("getondutyweeksch"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getondutyweeksch</code> table reference
     */
    public Getondutyweeksch(String alias) {
        this(DSL.name(alias), GETONDUTYWEEKSCH);
    }

    /**
     * Create an aliased <code>mplus_test_data.getondutyweeksch</code> table reference
     */
    public Getondutyweeksch(Name alias) {
        this(alias, GETONDUTYWEEKSCH);
    }

    private Getondutyweeksch(Name alias, Table<GetondutyweekschRecord> aliased) {
        this(alias, aliased, null);
    }

    private Getondutyweeksch(Name alias, Table<GetondutyweekschRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Getondutyweeksch(Table<O> child, ForeignKey<O, GetondutyweekschRecord> key) {
        super(child, key, GETONDUTYWEEKSCH);
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
    public Getondutyweeksch as(String alias) {
        return new Getondutyweeksch(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getondutyweeksch as(Name alias) {
        return new Getondutyweeksch(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getondutyweeksch rename(String name) {
        return new Getondutyweeksch(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getondutyweeksch rename(Name name) {
        return new Getondutyweeksch(name, null);
    }
}
