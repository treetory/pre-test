/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getondutyweeksch;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class GetondutyweekschRecord extends TableRecordImpl<GetondutyweekschRecord> implements Record8<String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -642368864;

    /**
     * Setter for <code>mplus_test_data.getondutyweeksch.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getondutyweeksch.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.getondutyweeksch.dutyTxt</code>.
     */
    public void setDutytxt(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.getondutyweeksch.dutyTxt</code>.
     */
    public String getDutytxt() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.getondutyweeksch.dayCd</code>.
     */
    public void setDaycd(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.getondutyweeksch.dayCd</code>.
     */
    public String getDaycd() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mplus_test_data.getondutyweeksch.dutyDt</code>.
     */
    public void setDutydt(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mplus_test_data.getondutyweeksch.dutyDt</code>.
     */
    public String getDutydt() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mplus_test_data.getondutyweeksch.userId</code>.
     */
    public void setUserid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mplus_test_data.getondutyweeksch.userId</code>.
     */
    public String getUserid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mplus_test_data.getondutyweeksch.userNm</code>.
     */
    public void setUsernm(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mplus_test_data.getondutyweeksch.userNm</code>.
     */
    public String getUsernm() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mplus_test_data.getondutyweeksch.workingTy</code>.
     */
    public void setWorkingty(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mplus_test_data.getondutyweeksch.workingTy</code>.
     */
    public String getWorkingty() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mplus_test_data.getondutyweeksch.workingPls</code>.
     */
    public void setWorkingpls(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mplus_test_data.getondutyweeksch.workingPls</code>.
     */
    public String getWorkingpls() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Getondutyweeksch.GETONDUTYWEEKSCH.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Getondutyweeksch.GETONDUTYWEEKSCH.DUTYTXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Getondutyweeksch.GETONDUTYWEEKSCH.DAYCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Getondutyweeksch.GETONDUTYWEEKSCH.DUTYDT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Getondutyweeksch.GETONDUTYWEEKSCH.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Getondutyweeksch.GETONDUTYWEEKSCH.USERNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Getondutyweeksch.GETONDUTYWEEKSCH.WORKINGTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Getondutyweeksch.GETONDUTYWEEKSCH.WORKINGPLS;
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
        return getDutytxt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDaycd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDutydt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUsernm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getWorkingty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getWorkingpls();
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
        return getDutytxt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDaycd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDutydt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUsernm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getWorkingty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getWorkingpls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetondutyweekschRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetondutyweekschRecord value2(String value) {
        setDutytxt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetondutyweekschRecord value3(String value) {
        setDaycd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetondutyweekschRecord value4(String value) {
        setDutydt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetondutyweekschRecord value5(String value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetondutyweekschRecord value6(String value) {
        setUsernm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetondutyweekschRecord value7(String value) {
        setWorkingty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetondutyweekschRecord value8(String value) {
        setWorkingpls(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetondutyweekschRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetondutyweekschRecord
     */
    public GetondutyweekschRecord() {
        super(Getondutyweeksch.GETONDUTYWEEKSCH);
    }

    /**
     * Create a detached, initialised GetondutyweekschRecord
     */
    public GetondutyweekschRecord(String hospitalcd, String dutytxt, String daycd, String dutydt, String userid, String usernm, String workingty, String workingpls) {
        super(Getondutyweeksch.GETONDUTYWEEKSCH);

        set(0, hospitalcd);
        set(1, dutytxt);
        set(2, daycd);
        set(3, dutydt);
        set(4, userid);
        set(5, usernm);
        set(6, workingty);
        set(7, workingpls);
    }
}