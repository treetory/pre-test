/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getexamreceiptdeptlist;

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
public class GetexamreceiptdeptlistRecord extends TableRecordImpl<GetexamreceiptdeptlistRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -2072677555;

    /**
     * Setter for <code>mplus_test_data.getexamreceiptdeptlist.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getexamreceiptdeptlist.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.getexamreceiptdeptlist.receiptDeptCd</code>.
     */
    public void setReceiptdeptcd(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.getexamreceiptdeptlist.receiptDeptCd</code>.
     */
    public String getReceiptdeptcd() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.getexamreceiptdeptlist.receiptDeptNm</code>.
     */
    public void setReceiptdeptnm(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.getexamreceiptdeptlist.receiptDeptNm</code>.
     */
    public String getReceiptdeptnm() {
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
        return Getexamreceiptdeptlist.GETEXAMRECEIPTDEPTLIST.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Getexamreceiptdeptlist.GETEXAMRECEIPTDEPTLIST.RECEIPTDEPTCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Getexamreceiptdeptlist.GETEXAMRECEIPTDEPTLIST.RECEIPTDEPTNM;
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
        return getReceiptdeptcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getReceiptdeptnm();
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
        return getReceiptdeptcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getReceiptdeptnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetexamreceiptdeptlistRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetexamreceiptdeptlistRecord value2(String value) {
        setReceiptdeptcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetexamreceiptdeptlistRecord value3(String value) {
        setReceiptdeptnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetexamreceiptdeptlistRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetexamreceiptdeptlistRecord
     */
    public GetexamreceiptdeptlistRecord() {
        super(Getexamreceiptdeptlist.GETEXAMRECEIPTDEPTLIST);
    }

    /**
     * Create a detached, initialised GetexamreceiptdeptlistRecord
     */
    public GetexamreceiptdeptlistRecord(String hospitalcd, String receiptdeptcd, String receiptdeptnm) {
        super(Getexamreceiptdeptlist.GETEXAMRECEIPTDEPTLIST);

        set(0, hospitalcd);
        set(1, receiptdeptcd);
        set(2, receiptdeptnm);
    }
}