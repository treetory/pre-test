/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GetinhistorylistRecord;

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
public class Getinhistorylist extends TableImpl<GetinhistorylistRecord> {

    private static final long serialVersionUID = 348037637;

    /**
     * The reference instance of <code>mplus_test_data.getinhistorylist</code>
     */
    public static final Getinhistorylist GETINHISTORYLIST = new Getinhistorylist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetinhistorylistRecord> getRecordType() {
        return GetinhistorylistRecord.class;
    }

    /**
     * The column <code>mplus_test_data.getinhistorylist.hospitalCd</code>.
     */
    public final TableField<GetinhistorylistRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getinhistorylist.hospitalizationDt</code>.
     */
    public final TableField<GetinhistorylistRecord, String> HOSPITALIZATIONDT = createField("hospitalizationDt", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getinhistorylist.dischargeDt</code>.
     */
    public final TableField<GetinhistorylistRecord, String> DISCHARGEDT = createField("dischargeDt", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getinhistorylist.deptNm</code>.
     */
    public final TableField<GetinhistorylistRecord, String> DEPTNM = createField("deptNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getinhistorylist.doctorNm</code>.
     */
    public final TableField<GetinhistorylistRecord, String> DOCTORNM = createField("doctorNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getinhistorylist.diagnosisNm</code>.
     */
    public final TableField<GetinhistorylistRecord, String> DIAGNOSISNM = createField("diagnosisNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getinhistorylist.wardNm</code>.
     */
    public final TableField<GetinhistorylistRecord, String> WARDNM = createField("wardNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getinhistorylist.roomNm</code>.
     */
    public final TableField<GetinhistorylistRecord, String> ROOMNM = createField("roomNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getinhistorylist.bedNm</code>.
     */
    public final TableField<GetinhistorylistRecord, String> BEDNM = createField("bedNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getinhistorylist</code> table reference
     */
    public Getinhistorylist() {
        this(DSL.name("getinhistorylist"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getinhistorylist</code> table reference
     */
    public Getinhistorylist(String alias) {
        this(DSL.name(alias), GETINHISTORYLIST);
    }

    /**
     * Create an aliased <code>mplus_test_data.getinhistorylist</code> table reference
     */
    public Getinhistorylist(Name alias) {
        this(alias, GETINHISTORYLIST);
    }

    private Getinhistorylist(Name alias, Table<GetinhistorylistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Getinhistorylist(Name alias, Table<GetinhistorylistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Getinhistorylist(Table<O> child, ForeignKey<O, GetinhistorylistRecord> key) {
        super(child, key, GETINHISTORYLIST);
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
    public Getinhistorylist as(String alias) {
        return new Getinhistorylist(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getinhistorylist as(Name alias) {
        return new Getinhistorylist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getinhistorylist rename(String name) {
        return new Getinhistorylist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getinhistorylist rename(Name name) {
        return new Getinhistorylist(name, null);
    }
}