/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GetmedirecordcontentdetailRecord;

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
public class Getmedirecordcontentdetail extends TableImpl<GetmedirecordcontentdetailRecord> {

    private static final long serialVersionUID = 49967533;

    /**
     * The reference instance of <code>mplus_test_data.getmedirecordcontentdetail</code>
     */
    public static final Getmedirecordcontentdetail GETMEDIRECORDCONTENTDETAIL = new Getmedirecordcontentdetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetmedirecordcontentdetailRecord> getRecordType() {
        return GetmedirecordcontentdetailRecord.class;
    }

    /**
     * The column <code>mplus_test_data.getmedirecordcontentdetail.url</code>.
     */
    public final TableField<GetmedirecordcontentdetailRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getmedirecordcontentdetail</code> table reference
     */
    public Getmedirecordcontentdetail() {
        this(DSL.name("getmedirecordcontentdetail"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getmedirecordcontentdetail</code> table reference
     */
    public Getmedirecordcontentdetail(String alias) {
        this(DSL.name(alias), GETMEDIRECORDCONTENTDETAIL);
    }

    /**
     * Create an aliased <code>mplus_test_data.getmedirecordcontentdetail</code> table reference
     */
    public Getmedirecordcontentdetail(Name alias) {
        this(alias, GETMEDIRECORDCONTENTDETAIL);
    }

    private Getmedirecordcontentdetail(Name alias, Table<GetmedirecordcontentdetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private Getmedirecordcontentdetail(Name alias, Table<GetmedirecordcontentdetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Getmedirecordcontentdetail(Table<O> child, ForeignKey<O, GetmedirecordcontentdetailRecord> key) {
        super(child, key, GETMEDIRECORDCONTENTDETAIL);
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
    public Getmedirecordcontentdetail as(String alias) {
        return new Getmedirecordcontentdetail(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getmedirecordcontentdetail as(Name alias) {
        return new Getmedirecordcontentdetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getmedirecordcontentdetail rename(String name) {
        return new Getmedirecordcontentdetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getmedirecordcontentdetail rename(Name name) {
        return new Getmedirecordcontentdetail(name, null);
    }
}