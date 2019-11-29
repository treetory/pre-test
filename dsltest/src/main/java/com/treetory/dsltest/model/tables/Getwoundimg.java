/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GetwoundimgRecord;

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
public class Getwoundimg extends TableImpl<GetwoundimgRecord> {

    private static final long serialVersionUID = 1976010992;

    /**
     * The reference instance of <code>mplus_test_data.getwoundimg</code>
     */
    public static final Getwoundimg GETWOUNDIMG = new Getwoundimg();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetwoundimgRecord> getRecordType() {
        return GetwoundimgRecord.class;
    }

    /**
     * The column <code>mplus_test_data.getwoundimg.hospitalCd</code>.
     */
    public final TableField<GetwoundimgRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getwoundimg.userId</code>.
     */
    public final TableField<GetwoundimgRecord, String> USERID = createField("userId", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getwoundimg.patientId</code>.
     */
    public final TableField<GetwoundimgRecord, String> PATIENTID = createField("patientId", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getwoundimg.deptCd</code>.
     */
    public final TableField<GetwoundimgRecord, String> DEPTCD = createField("deptCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getwoundimg.doctorId</code>.
     */
    public final TableField<GetwoundimgRecord, String> DOCTORID = createField("doctorId", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getwoundimg.searchCls</code>.
     */
    public final TableField<GetwoundimgRecord, String> SEARCHCLS = createField("searchCls", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getwoundimg.image</code>.
     */
    public final TableField<GetwoundimgRecord, String> IMAGE = createField("image", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getwoundimg.thumbnail</code>.
     */
    public final TableField<GetwoundimgRecord, String> THUMBNAIL = createField("thumbnail", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getwoundimg.excutionDtTm</code>.
     */
    public final TableField<GetwoundimgRecord, String> EXCUTIONDTTM = createField("excutionDtTm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getwoundimg</code> table reference
     */
    public Getwoundimg() {
        this(DSL.name("getwoundimg"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getwoundimg</code> table reference
     */
    public Getwoundimg(String alias) {
        this(DSL.name(alias), GETWOUNDIMG);
    }

    /**
     * Create an aliased <code>mplus_test_data.getwoundimg</code> table reference
     */
    public Getwoundimg(Name alias) {
        this(alias, GETWOUNDIMG);
    }

    private Getwoundimg(Name alias, Table<GetwoundimgRecord> aliased) {
        this(alias, aliased, null);
    }

    private Getwoundimg(Name alias, Table<GetwoundimgRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Getwoundimg(Table<O> child, ForeignKey<O, GetwoundimgRecord> key) {
        super(child, key, GETWOUNDIMG);
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
    public Getwoundimg as(String alias) {
        return new Getwoundimg(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getwoundimg as(Name alias) {
        return new Getwoundimg(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getwoundimg rename(String name) {
        return new Getwoundimg(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getwoundimg rename(Name name) {
        return new Getwoundimg(name, null);
    }
}