/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GettreatmentdetailRecord;

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
public class Gettreatmentdetail extends TableImpl<GettreatmentdetailRecord> {

    private static final long serialVersionUID = -1233200537;

    /**
     * The reference instance of <code>mplus_test_data.gettreatmentdetail</code>
     */
    public static final Gettreatmentdetail GETTREATMENTDETAIL = new Gettreatmentdetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GettreatmentdetailRecord> getRecordType() {
        return GettreatmentdetailRecord.class;
    }

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.hospitalCd</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.patientId</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> PATIENTID = createField("patientId", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.patientNm</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> PATIENTNM = createField("patientNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.age</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> AGE = createField("age", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.gender</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> GENDER = createField("gender", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.wardNm</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> WARDNM = createField("wardNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.roomNm</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> ROOMNM = createField("roomNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.bedNm</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> BEDNM = createField("bedNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.receiptNo</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> RECEIPTNO = createField("receiptNo", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.treatmentDeptNm</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> TREATMENTDEPTNM = createField("treatmentDeptNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.treatmentDrNm</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> TREATMENTDRNM = createField("treatmentDrNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.birthDt</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> BIRTHDT = createField("birthDt", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.treatmentSeq</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> TREATMENTSEQ = createField("treatmentSeq", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.treatmentNm</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> TREATMENTNM = createField("treatmentNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.diagnosisNm</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> DIAGNOSISNM = createField("diagnosisNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.treatmentStatNm</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> TREATMENTSTATNM = createField("treatmentStatNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.treatmentStartDt</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> TREATMENTSTARTDT = createField("treatmentStartDt", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.treatmentStartTm</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> TREATMENTSTARTTM = createField("treatmentStartTm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.treatmentEndDt</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> TREATMENTENDDT = createField("treatmentEndDt", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.treatmentEndTm</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> TREATMENTENDTM = createField("treatmentEndTm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.treatmentCntrNm</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> TREATMENTCNTRNM = createField("treatmentCntrNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.gettreatmentdetail.operationRmk</code>.
     */
    public final TableField<GettreatmentdetailRecord, String> OPERATIONRMK = createField("operationRmk", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.gettreatmentdetail</code> table reference
     */
    public Gettreatmentdetail() {
        this(DSL.name("gettreatmentdetail"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.gettreatmentdetail</code> table reference
     */
    public Gettreatmentdetail(String alias) {
        this(DSL.name(alias), GETTREATMENTDETAIL);
    }

    /**
     * Create an aliased <code>mplus_test_data.gettreatmentdetail</code> table reference
     */
    public Gettreatmentdetail(Name alias) {
        this(alias, GETTREATMENTDETAIL);
    }

    private Gettreatmentdetail(Name alias, Table<GettreatmentdetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private Gettreatmentdetail(Name alias, Table<GettreatmentdetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Gettreatmentdetail(Table<O> child, ForeignKey<O, GettreatmentdetailRecord> key) {
        super(child, key, GETTREATMENTDETAIL);
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
    public Gettreatmentdetail as(String alias) {
        return new Gettreatmentdetail(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gettreatmentdetail as(Name alias) {
        return new Gettreatmentdetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Gettreatmentdetail rename(String name) {
        return new Gettreatmentdetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Gettreatmentdetail rename(Name name) {
        return new Gettreatmentdetail(name, null);
    }
}
