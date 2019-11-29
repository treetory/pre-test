/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getdoctorlistbydept;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class GetdoctorlistbydeptRecord extends TableRecordImpl<GetdoctorlistbydeptRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 814039628;

    /**
     * Setter for <code>mplus_test_data.getdoctorlistbydept.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdoctorlistbydept.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.getdoctorlistbydept.doctorId</code>.
     */
    public void setDoctorid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdoctorlistbydept.doctorId</code>.
     */
    public String getDoctorid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.getdoctorlistbydept.doctorNm</code>.
     */
    public void setDoctornm(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdoctorlistbydept.doctorNm</code>.
     */
    public String getDoctornm() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mplus_test_data.getdoctorlistbydept.staffTy</code>.
     */
    public void setStaffty(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdoctorlistbydept.staffTy</code>.
     */
    public String getStaffty() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Getdoctorlistbydept.GETDOCTORLISTBYDEPT.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Getdoctorlistbydept.GETDOCTORLISTBYDEPT.DOCTORID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Getdoctorlistbydept.GETDOCTORLISTBYDEPT.DOCTORNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Getdoctorlistbydept.GETDOCTORLISTBYDEPT.STAFFTY;
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
        return getDoctorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDoctornm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getStaffty();
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
        return getDoctorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDoctornm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getStaffty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdoctorlistbydeptRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdoctorlistbydeptRecord value2(String value) {
        setDoctorid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdoctorlistbydeptRecord value3(String value) {
        setDoctornm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdoctorlistbydeptRecord value4(String value) {
        setStaffty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdoctorlistbydeptRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetdoctorlistbydeptRecord
     */
    public GetdoctorlistbydeptRecord() {
        super(Getdoctorlistbydept.GETDOCTORLISTBYDEPT);
    }

    /**
     * Create a detached, initialised GetdoctorlistbydeptRecord
     */
    public GetdoctorlistbydeptRecord(String hospitalcd, String doctorid, String doctornm, String staffty) {
        super(Getdoctorlistbydept.GETDOCTORLISTBYDEPT);

        set(0, hospitalcd);
        set(1, doctorid);
        set(2, doctornm);
        set(3, staffty);
    }
}