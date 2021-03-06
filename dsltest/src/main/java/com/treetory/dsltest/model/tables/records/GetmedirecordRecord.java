/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getmedirecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class GetmedirecordRecord extends TableRecordImpl<GetmedirecordRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -1382665082;

    /**
     * Setter for <code>mplus_test_data.getmedirecord.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedirecord.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.getmedirecord.resultTxt</code>.
     */
    public void setResulttxt(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedirecord.resultTxt</code>.
     */
    public String getResulttxt() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Getmedirecord.GETMEDIRECORD.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Getmedirecord.GETMEDIRECORD.RESULTTXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getHospitalcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getResulttxt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getHospitalcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getResulttxt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedirecordRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedirecordRecord value2(String value) {
        setResulttxt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedirecordRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetmedirecordRecord
     */
    public GetmedirecordRecord() {
        super(Getmedirecord.GETMEDIRECORD);
    }

    /**
     * Create a detached, initialised GetmedirecordRecord
     */
    public GetmedirecordRecord(String hospitalcd, String resulttxt) {
        super(Getmedirecord.GETMEDIRECORD);

        set(0, hospitalcd);
        set(1, resulttxt);
    }
}
