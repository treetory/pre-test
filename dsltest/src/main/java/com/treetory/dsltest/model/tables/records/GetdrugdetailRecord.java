/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getdrugdetail;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * 복약지도전문
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetdrugdetailRecord extends TableRecordImpl<GetdrugdetailRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = -1659274685;

    /**
     * Setter for <code>mplus_test_data.getdrugdetail.classCd</code>.
     */
    public void setClasscd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdrugdetail.classCd</code>.
     */
    public String getClasscd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.getdrugdetail.classNm</code>.
     */
    public void setClassnm(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdrugdetail.classNm</code>.
     */
    public String getClassnm() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.getdrugdetail.drugInfoTxt</code>.
     */
    public void setDruginfotxt(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdrugdetail.drugInfoTxt</code>.
     */
    public String getDruginfotxt() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mplus_test_data.getdrugdetail.viewTy</code>.
     */
    public void setViewty(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdrugdetail.viewTy</code>.
     */
    public String getViewty() {
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
        return Getdrugdetail.GETDRUGDETAIL.CLASSCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Getdrugdetail.GETDRUGDETAIL.CLASSNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Getdrugdetail.GETDRUGDETAIL.DRUGINFOTXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Getdrugdetail.GETDRUGDETAIL.VIEWTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getClasscd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getClassnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDruginfotxt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getViewty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getClasscd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getClassnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDruginfotxt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getViewty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdrugdetailRecord value1(String value) {
        setClasscd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdrugdetailRecord value2(String value) {
        setClassnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdrugdetailRecord value3(String value) {
        setDruginfotxt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdrugdetailRecord value4(String value) {
        setViewty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdrugdetailRecord values(String value1, String value2, String value3, String value4) {
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
     * Create a detached GetdrugdetailRecord
     */
    public GetdrugdetailRecord() {
        super(Getdrugdetail.GETDRUGDETAIL);
    }

    /**
     * Create a detached, initialised GetdrugdetailRecord
     */
    public GetdrugdetailRecord(String classcd, String classnm, String druginfotxt, String viewty) {
        super(Getdrugdetail.GETDRUGDETAIL);

        set(0, classcd);
        set(1, classnm);
        set(2, druginfotxt);
        set(3, viewty);
    }
}
