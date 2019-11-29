/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.CheckaccessrightsRecord;

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
public class Checkaccessrights extends TableImpl<CheckaccessrightsRecord> {

    private static final long serialVersionUID = 2010161077;

    /**
     * The reference instance of <code>mplus_test_data.checkaccessrights</code>
     */
    public static final Checkaccessrights CHECKACCESSRIGHTS = new Checkaccessrights();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CheckaccessrightsRecord> getRecordType() {
        return CheckaccessrightsRecord.class;
    }

    /**
     * The column <code>mplus_test_data.checkaccessrights.hospitalCd</code>.
     */
    public final TableField<CheckaccessrightsRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.checkaccessrights.isAllowed</code>.
     */
    public final TableField<CheckaccessrightsRecord, String> ISALLOWED = createField("isAllowed", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.checkaccessrights.rejectedMsg</code>.
     */
    public final TableField<CheckaccessrightsRecord, String> REJECTEDMSG = createField("rejectedMsg", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.checkaccessrights</code> table reference
     */
    public Checkaccessrights() {
        this(DSL.name("checkaccessrights"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.checkaccessrights</code> table reference
     */
    public Checkaccessrights(String alias) {
        this(DSL.name(alias), CHECKACCESSRIGHTS);
    }

    /**
     * Create an aliased <code>mplus_test_data.checkaccessrights</code> table reference
     */
    public Checkaccessrights(Name alias) {
        this(alias, CHECKACCESSRIGHTS);
    }

    private Checkaccessrights(Name alias, Table<CheckaccessrightsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Checkaccessrights(Name alias, Table<CheckaccessrightsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Checkaccessrights(Table<O> child, ForeignKey<O, CheckaccessrightsRecord> key) {
        super(child, key, CHECKACCESSRIGHTS);
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
    public Checkaccessrights as(String alias) {
        return new Checkaccessrights(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Checkaccessrights as(Name alias) {
        return new Checkaccessrights(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Checkaccessrights rename(String name) {
        return new Checkaccessrights(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Checkaccessrights rename(Name name) {
        return new Checkaccessrights(name, null);
    }
}
