/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getdeptlist;

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
public class GetdeptlistRecord extends TableRecordImpl<GetdeptlistRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = -1730523420;

    /**
     * Setter for <code>mplus_test_data.getdeptlist.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdeptlist.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.getdeptlist.deptCd</code>.
     */
    public void setDeptcd(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdeptlist.deptCd</code>.
     */
    public String getDeptcd() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.getdeptlist.deptNm</code>.
     */
    public void setDeptnm(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdeptlist.deptNm</code>.
     */
    public String getDeptnm() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mplus_test_data.getdeptlist.workingTy</code>.
     */
    public void setWorkingty(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdeptlist.workingTy</code>.
     */
    public String getWorkingty() {
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
        return Getdeptlist.GETDEPTLIST.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Getdeptlist.GETDEPTLIST.DEPTCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Getdeptlist.GETDEPTLIST.DEPTNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Getdeptlist.GETDEPTLIST.WORKINGTY;
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
        return getDeptcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDeptnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getWorkingty();
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
        return getDeptcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDeptnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getWorkingty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdeptlistRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdeptlistRecord value2(String value) {
        setDeptcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdeptlistRecord value3(String value) {
        setDeptnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdeptlistRecord value4(String value) {
        setWorkingty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdeptlistRecord values(String value1, String value2, String value3, String value4) {
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
     * Create a detached GetdeptlistRecord
     */
    public GetdeptlistRecord() {
        super(Getdeptlist.GETDEPTLIST);
    }

    /**
     * Create a detached, initialised GetdeptlistRecord
     */
    public GetdeptlistRecord(String hospitalcd, String deptcd, String deptnm, String workingty) {
        super(Getdeptlist.GETDEPTLIST);

        set(0, hospitalcd);
        set(1, deptcd);
        set(2, deptnm);
        set(3, workingty);
    }
}