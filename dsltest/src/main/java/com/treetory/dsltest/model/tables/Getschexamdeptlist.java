/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GetschexamdeptlistRecord;

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
public class Getschexamdeptlist extends TableImpl<GetschexamdeptlistRecord> {

    private static final long serialVersionUID = -1956180291;

    /**
     * The reference instance of <code>mplus_test_data.getschexamdeptlist</code>
     */
    public static final Getschexamdeptlist GETSCHEXAMDEPTLIST = new Getschexamdeptlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetschexamdeptlistRecord> getRecordType() {
        return GetschexamdeptlistRecord.class;
    }

    /**
     * The column <code>mplus_test_data.getschexamdeptlist.hospitalCd</code>.
     */
    public final TableField<GetschexamdeptlistRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getschexamdeptlist.examDeptCd</code>.
     */
    public final TableField<GetschexamdeptlistRecord, String> EXAMDEPTCD = createField("examDeptCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getschexamdeptlist.examDeptNm</code>.
     */
    public final TableField<GetschexamdeptlistRecord, String> EXAMDEPTNM = createField("examDeptNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getschexamdeptlist</code> table reference
     */
    public Getschexamdeptlist() {
        this(DSL.name("getschexamdeptlist"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getschexamdeptlist</code> table reference
     */
    public Getschexamdeptlist(String alias) {
        this(DSL.name(alias), GETSCHEXAMDEPTLIST);
    }

    /**
     * Create an aliased <code>mplus_test_data.getschexamdeptlist</code> table reference
     */
    public Getschexamdeptlist(Name alias) {
        this(alias, GETSCHEXAMDEPTLIST);
    }

    private Getschexamdeptlist(Name alias, Table<GetschexamdeptlistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Getschexamdeptlist(Name alias, Table<GetschexamdeptlistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Getschexamdeptlist(Table<O> child, ForeignKey<O, GetschexamdeptlistRecord> key) {
        super(child, key, GETSCHEXAMDEPTLIST);
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
    public Getschexamdeptlist as(String alias) {
        return new Getschexamdeptlist(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getschexamdeptlist as(Name alias) {
        return new Getschexamdeptlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getschexamdeptlist rename(String name) {
        return new Getschexamdeptlist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getschexamdeptlist rename(Name name) {
        return new Getschexamdeptlist(name, null);
    }
}
