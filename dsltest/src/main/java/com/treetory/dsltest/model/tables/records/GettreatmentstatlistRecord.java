/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Gettreatmentstatlist;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class GettreatmentstatlistRecord extends TableRecordImpl<GettreatmentstatlistRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1408355039;

    /**
     * Setter for <code>mplus_test_data.gettreatmentstatlist.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentstatlist.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentstatlist.treatmentStatCd</code>.
     */
    public void setTreatmentstatcd(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentstatlist.treatmentStatCd</code>.
     */
    public String getTreatmentstatcd() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentstatlist.treatmentStatNm</code>.
     */
    public void setTreatmentstatnm(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentstatlist.treatmentStatNm</code>.
     */
    public String getTreatmentstatnm() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Gettreatmentstatlist.GETTREATMENTSTATLIST.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Gettreatmentstatlist.GETTREATMENTSTATLIST.TREATMENTSTATCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Gettreatmentstatlist.GETTREATMENTSTATLIST.TREATMENTSTATNM;
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
        return getTreatmentstatcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTreatmentstatnm();
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
        return getTreatmentstatcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTreatmentstatnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentstatlistRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentstatlistRecord value2(String value) {
        setTreatmentstatcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentstatlistRecord value3(String value) {
        setTreatmentstatnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentstatlistRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GettreatmentstatlistRecord
     */
    public GettreatmentstatlistRecord() {
        super(Gettreatmentstatlist.GETTREATMENTSTATLIST);
    }

    /**
     * Create a detached, initialised GettreatmentstatlistRecord
     */
    public GettreatmentstatlistRecord(String hospitalcd, String treatmentstatcd, String treatmentstatnm) {
        super(Gettreatmentstatlist.GETTREATMENTSTATLIST);

        set(0, hospitalcd);
        set(1, treatmentstatcd);
        set(2, treatmentstatnm);
    }
}