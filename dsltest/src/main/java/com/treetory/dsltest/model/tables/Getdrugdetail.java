/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GetdrugdetailRecord;

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
 * 복약지도전문
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Getdrugdetail extends TableImpl<GetdrugdetailRecord> {

    private static final long serialVersionUID = 1227822645;

    /**
     * The reference instance of <code>mplus_test_data.getdrugdetail</code>
     */
    public static final Getdrugdetail GETDRUGDETAIL = new Getdrugdetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetdrugdetailRecord> getRecordType() {
        return GetdrugdetailRecord.class;
    }

    /**
     * The column <code>mplus_test_data.getdrugdetail.classCd</code>.
     */
    public final TableField<GetdrugdetailRecord, String> CLASSCD = createField("classCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getdrugdetail.classNm</code>.
     */
    public final TableField<GetdrugdetailRecord, String> CLASSNM = createField("classNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getdrugdetail.drugInfoTxt</code>.
     */
    public final TableField<GetdrugdetailRecord, String> DRUGINFOTXT = createField("drugInfoTxt", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getdrugdetail.viewTy</code>.
     */
    public final TableField<GetdrugdetailRecord, String> VIEWTY = createField("viewTy", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getdrugdetail</code> table reference
     */
    public Getdrugdetail() {
        this(DSL.name("getdrugdetail"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getdrugdetail</code> table reference
     */
    public Getdrugdetail(String alias) {
        this(DSL.name(alias), GETDRUGDETAIL);
    }

    /**
     * Create an aliased <code>mplus_test_data.getdrugdetail</code> table reference
     */
    public Getdrugdetail(Name alias) {
        this(alias, GETDRUGDETAIL);
    }

    private Getdrugdetail(Name alias, Table<GetdrugdetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private Getdrugdetail(Name alias, Table<GetdrugdetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("복약지도전문"));
    }

    public <O extends Record> Getdrugdetail(Table<O> child, ForeignKey<O, GetdrugdetailRecord> key) {
        super(child, key, GETDRUGDETAIL);
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
    public Getdrugdetail as(String alias) {
        return new Getdrugdetail(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getdrugdetail as(Name alias) {
        return new Getdrugdetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getdrugdetail rename(String name) {
        return new Getdrugdetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getdrugdetail rename(Name name) {
        return new Getdrugdetail(name, null);
    }
}
