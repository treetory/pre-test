/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GetqrpatientlistRecord;

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
public class Getqrpatientlist extends TableImpl<GetqrpatientlistRecord> {

    private static final long serialVersionUID = -517681111;

    /**
     * The reference instance of <code>mplus_test_data.getqrpatientlist</code>
     */
    public static final Getqrpatientlist GETQRPATIENTLIST = new Getqrpatientlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetqrpatientlistRecord> getRecordType() {
        return GetqrpatientlistRecord.class;
    }

    /**
     * The column <code>mplus_test_data.getqrpatientlist.hospitalCd</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.patientId</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> PATIENTID = createField("patientId", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.patientNm</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> PATIENTNM = createField("patientNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.age</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> AGE = createField("age", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.gender</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> GENDER = createField("gender", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.wardNm</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> WARDNM = createField("wardNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.roomNm</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> ROOMNM = createField("roomNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.bedNm</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> BEDNM = createField("bedNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.receiptNo</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> RECEIPTNO = createField("receiptNo", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.deptCd</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> DEPTCD = createField("deptCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.deptNm</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> DEPTNM = createField("deptNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.doctorNm</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> DOCTORNM = createField("doctorNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.doctorId</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> DOCTORID = createField("doctorId", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.birthDt</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> BIRTHDT = createField("birthDt", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.specialistId</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> SPECIALISTID = createField("specialistId", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.specialistNm</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> SPECIALISTNM = createField("specialistNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.hospitalizationDt</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> HOSPITALIZATIONDT = createField("hospitalizationDt", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getqrpatientlist.treatCls</code>.
     */
    public final TableField<GetqrpatientlistRecord, String> TREATCLS = createField("treatCls", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getqrpatientlist</code> table reference
     */
    public Getqrpatientlist() {
        this(DSL.name("getqrpatientlist"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getqrpatientlist</code> table reference
     */
    public Getqrpatientlist(String alias) {
        this(DSL.name(alias), GETQRPATIENTLIST);
    }

    /**
     * Create an aliased <code>mplus_test_data.getqrpatientlist</code> table reference
     */
    public Getqrpatientlist(Name alias) {
        this(alias, GETQRPATIENTLIST);
    }

    private Getqrpatientlist(Name alias, Table<GetqrpatientlistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Getqrpatientlist(Name alias, Table<GetqrpatientlistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Getqrpatientlist(Table<O> child, ForeignKey<O, GetqrpatientlistRecord> key) {
        super(child, key, GETQRPATIENTLIST);
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
    public Getqrpatientlist as(String alias) {
        return new Getqrpatientlist(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getqrpatientlist as(Name alias) {
        return new Getqrpatientlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getqrpatientlist rename(String name) {
        return new Getqrpatientlist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getqrpatientlist rename(Name name) {
        return new Getqrpatientlist(name, null);
    }
}
