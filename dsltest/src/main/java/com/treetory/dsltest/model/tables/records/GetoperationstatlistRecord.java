/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getoperationstatlist;

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
public class GetoperationstatlistRecord extends TableRecordImpl<GetoperationstatlistRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -169603598;

    /**
     * Setter for <code>mplus_test_data.getoperationstatlist.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getoperationstatlist.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.getoperationstatlist.operationStatCd</code>.
     */
    public void setOperationstatcd(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.getoperationstatlist.operationStatCd</code>.
     */
    public String getOperationstatcd() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.getoperationstatlist.operationStatNm</code>.
     */
    public void setOperationstatnm(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.getoperationstatlist.operationStatNm</code>.
     */
    public String getOperationstatnm() {
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
        return Getoperationstatlist.GETOPERATIONSTATLIST.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Getoperationstatlist.GETOPERATIONSTATLIST.OPERATIONSTATCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Getoperationstatlist.GETOPERATIONSTATLIST.OPERATIONSTATNM;
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
        return getOperationstatcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOperationstatnm();
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
        return getOperationstatcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOperationstatnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetoperationstatlistRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetoperationstatlistRecord value2(String value) {
        setOperationstatcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetoperationstatlistRecord value3(String value) {
        setOperationstatnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetoperationstatlistRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetoperationstatlistRecord
     */
    public GetoperationstatlistRecord() {
        super(Getoperationstatlist.GETOPERATIONSTATLIST);
    }

    /**
     * Create a detached, initialised GetoperationstatlistRecord
     */
    public GetoperationstatlistRecord(String hospitalcd, String operationstatcd, String operationstatnm) {
        super(Getoperationstatlist.GETOPERATIONSTATLIST);

        set(0, hospitalcd);
        set(1, operationstatcd);
        set(2, operationstatnm);
    }
}