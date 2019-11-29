/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GetdeptlistRecord;

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
public class Getdeptlist extends TableImpl<GetdeptlistRecord> {

    private static final long serialVersionUID = -829512231;

    /**
     * The reference instance of <code>mplus_test_data.getdeptlist</code>
     */
    public static final Getdeptlist GETDEPTLIST = new Getdeptlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetdeptlistRecord> getRecordType() {
        return GetdeptlistRecord.class;
    }

    /**
     * The column <code>mplus_test_data.getdeptlist.hospitalCd</code>.
     */
    public final TableField<GetdeptlistRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getdeptlist.deptCd</code>.
     */
    public final TableField<GetdeptlistRecord, String> DEPTCD = createField("deptCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getdeptlist.deptNm</code>.
     */
    public final TableField<GetdeptlistRecord, String> DEPTNM = createField("deptNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getdeptlist.workingTy</code>.
     */
    public final TableField<GetdeptlistRecord, String> WORKINGTY = createField("workingTy", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getdeptlist</code> table reference
     */
    public Getdeptlist() {
        this(DSL.name("getdeptlist"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getdeptlist</code> table reference
     */
    public Getdeptlist(String alias) {
        this(DSL.name(alias), GETDEPTLIST);
    }

    /**
     * Create an aliased <code>mplus_test_data.getdeptlist</code> table reference
     */
    public Getdeptlist(Name alias) {
        this(alias, GETDEPTLIST);
    }

    private Getdeptlist(Name alias, Table<GetdeptlistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Getdeptlist(Name alias, Table<GetdeptlistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Getdeptlist(Table<O> child, ForeignKey<O, GetdeptlistRecord> key) {
        super(child, key, GETDEPTLIST);
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
    public Getdeptlist as(String alias) {
        return new Getdeptlist(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getdeptlist as(Name alias) {
        return new Getdeptlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getdeptlist rename(String name) {
        return new Getdeptlist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getdeptlist rename(Name name) {
        return new Getdeptlist(name, null);
    }
}