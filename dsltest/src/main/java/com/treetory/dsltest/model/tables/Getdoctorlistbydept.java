/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables;


import com.treetory.dsltest.model.MplusTestData;
import com.treetory.dsltest.model.tables.records.GetdoctorlistbydeptRecord;

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
public class Getdoctorlistbydept extends TableImpl<GetdoctorlistbydeptRecord> {

    private static final long serialVersionUID = -1377878468;

    /**
     * The reference instance of <code>mplus_test_data.getdoctorlistbydept</code>
     */
    public static final Getdoctorlistbydept GETDOCTORLISTBYDEPT = new Getdoctorlistbydept();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetdoctorlistbydeptRecord> getRecordType() {
        return GetdoctorlistbydeptRecord.class;
    }

    /**
     * The column <code>mplus_test_data.getdoctorlistbydept.hospitalCd</code>.
     */
    public final TableField<GetdoctorlistbydeptRecord, String> HOSPITALCD = createField("hospitalCd", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getdoctorlistbydept.doctorId</code>.
     */
    public final TableField<GetdoctorlistbydeptRecord, String> DOCTORID = createField("doctorId", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getdoctorlistbydept.doctorNm</code>.
     */
    public final TableField<GetdoctorlistbydeptRecord, String> DOCTORNM = createField("doctorNm", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mplus_test_data.getdoctorlistbydept.staffTy</code>.
     */
    public final TableField<GetdoctorlistbydeptRecord, String> STAFFTY = createField("staffTy", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.inline("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>mplus_test_data.getdoctorlistbydept</code> table reference
     */
    public Getdoctorlistbydept() {
        this(DSL.name("getdoctorlistbydept"), null);
    }

    /**
     * Create an aliased <code>mplus_test_data.getdoctorlistbydept</code> table reference
     */
    public Getdoctorlistbydept(String alias) {
        this(DSL.name(alias), GETDOCTORLISTBYDEPT);
    }

    /**
     * Create an aliased <code>mplus_test_data.getdoctorlistbydept</code> table reference
     */
    public Getdoctorlistbydept(Name alias) {
        this(alias, GETDOCTORLISTBYDEPT);
    }

    private Getdoctorlistbydept(Name alias, Table<GetdoctorlistbydeptRecord> aliased) {
        this(alias, aliased, null);
    }

    private Getdoctorlistbydept(Name alias, Table<GetdoctorlistbydeptRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Getdoctorlistbydept(Table<O> child, ForeignKey<O, GetdoctorlistbydeptRecord> key) {
        super(child, key, GETDOCTORLISTBYDEPT);
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
    public Getdoctorlistbydept as(String alias) {
        return new Getdoctorlistbydept(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Getdoctorlistbydept as(Name alias) {
        return new Getdoctorlistbydept(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Getdoctorlistbydept rename(String name) {
        return new Getdoctorlistbydept(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Getdoctorlistbydept rename(Name name) {
        return new Getdoctorlistbydept(name, null);
    }
}
