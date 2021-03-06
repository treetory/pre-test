/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GetemtreatstatlistRecord;

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
public class Getemtreatstatlist extends TableImpl<GetemtreatstatlistRecord> {

    private static final long serialVersionUID = -826827609;

    /**
     * The reference instance of <code>mplus_test_data.getemtreatstatlist</code>
     */
    public static final Getemtreatstatlist GETEMTREATSTATLIST = new Getemtreatstatlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetemtreatstatlistRecord> getRecordType() {
        return GetemtreatstatlistRecord.class;
    }

    /**
     * The column <code>mplus_test_data.getemtreatstatlist.hospitalCd</code>.
     */
    public final TableField<GetemtreatstatlistRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getemtreatstatlist.emTreatStatCd</code>.
     */
    public final TableField<GetemtreatstatlistRecord, String> EMTREATSTATCD = createField("emTreatStatCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getemtreatstatlist.emTreatStatNm</code>.
     */
    public final TableField<GetemtreatstatlistRecord, String> EMTREATSTATNM = createField("emTreatStatNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getemtreatstatlist</code> table reference
     */
    public Getemtreatstatlist() {
        this(DSL.name("getemtreatstatlist"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getemtreatstatlist</code> table reference
     */
    public Getemtreatstatlist(String alias) {
        this(DSL.name(alias), GETEMTREATSTATLIST);
    }

    /**
     * Create an aliased <code>mplus_test_data.getemtreatstatlist</code> table reference
     */
    public Getemtreatstatlist(Name alias) {
        this(alias, GETEMTREATSTATLIST);
    }

    private Getemtreatstatlist(Name alias, Table<GetemtreatstatlistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Getemtreatstatlist(Name alias, Table<GetemtreatstatlistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Getemtreatstatlist(Table<O> child, ForeignKey<O, GetemtreatstatlistRecord> key) {
        super(child, key, GETEMTREATSTATLIST);
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
    public Getemtreatstatlist as(String alias) {
        return new Getemtreatstatlist(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getemtreatstatlist as(Name alias) {
        return new Getemtreatstatlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getemtreatstatlist rename(String name) {
        return new Getemtreatstatlist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getemtreatstatlist rename(Name name) {
        return new Getemtreatstatlist(name, null);
    }
}
