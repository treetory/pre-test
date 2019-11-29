/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getpatientnotice;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class GetpatientnoticeRecord extends TableRecordImpl<GetpatientnoticeRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = -463034910;

    /**
     * Setter for <code>mplus_test_data.getpatientnotice.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getpatientnotice.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.getpatientnotice.isNoticeFlag</code>.
     */
    public void setIsnoticeflag(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.getpatientnotice.isNoticeFlag</code>.
     */
    public String getIsnoticeflag() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.getpatientnotice.noticeTxt</code>.
     */
    public void setNoticetxt(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.getpatientnotice.noticeTxt</code>.
     */
    public String getNoticetxt() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mplus_test_data.getpatientnotice.noticeWriter</code>.
     */
    public void setNoticewriter(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mplus_test_data.getpatientnotice.noticeWriter</code>.
     */
    public String getNoticewriter() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mplus_test_data.getpatientnotice.writeDtTm</code>.
     */
    public void setWritedttm(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mplus_test_data.getpatientnotice.writeDtTm</code>.
     */
    public String getWritedttm() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Getpatientnotice.GETPATIENTNOTICE.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Getpatientnotice.GETPATIENTNOTICE.ISNOTICEFLAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Getpatientnotice.GETPATIENTNOTICE.NOTICETXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Getpatientnotice.GETPATIENTNOTICE.NOTICEWRITER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Getpatientnotice.GETPATIENTNOTICE.WRITEDTTM;
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
        return getIsnoticeflag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getNoticetxt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getNoticewriter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getWritedttm();
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
        return getIsnoticeflag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNoticetxt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNoticewriter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getWritedttm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetpatientnoticeRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetpatientnoticeRecord value2(String value) {
        setIsnoticeflag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetpatientnoticeRecord value3(String value) {
        setNoticetxt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetpatientnoticeRecord value4(String value) {
        setNoticewriter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetpatientnoticeRecord value5(String value) {
        setWritedttm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetpatientnoticeRecord values(String value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetpatientnoticeRecord
     */
    public GetpatientnoticeRecord() {
        super(Getpatientnotice.GETPATIENTNOTICE);
    }

    /**
     * Create a detached, initialised GetpatientnoticeRecord
     */
    public GetpatientnoticeRecord(String hospitalcd, String isnoticeflag, String noticetxt, String noticewriter, String writedttm) {
        super(Getpatientnotice.GETPATIENTNOTICE);

        set(0, hospitalcd);
        set(1, isnoticeflag);
        set(2, noticetxt);
        set(3, noticewriter);
        set(4, writedttm);
    }
}
