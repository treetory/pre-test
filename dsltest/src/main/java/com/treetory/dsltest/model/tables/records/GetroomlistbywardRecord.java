/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getroomlistbyward;

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
public class GetroomlistbywardRecord extends TableRecordImpl<GetroomlistbywardRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -1963209499;

    /**
     * Setter for <code>mplus_test_data.getroomlistbyward.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getroomlistbyward.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.getroomlistbyward.roomCd</code>.
     */
    public void setRoomcd(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.getroomlistbyward.roomCd</code>.
     */
    public String getRoomcd() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.getroomlistbyward.roomNm</code>.
     */
    public void setRoomnm(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.getroomlistbyward.roomNm</code>.
     */
    public String getRoomnm() {
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
        return Getroomlistbyward.GETROOMLISTBYWARD.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Getroomlistbyward.GETROOMLISTBYWARD.ROOMCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Getroomlistbyward.GETROOMLISTBYWARD.ROOMNM;
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
        return getRoomcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRoomnm();
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
        return getRoomcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRoomnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetroomlistbywardRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetroomlistbywardRecord value2(String value) {
        setRoomcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetroomlistbywardRecord value3(String value) {
        setRoomnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetroomlistbywardRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetroomlistbywardRecord
     */
    public GetroomlistbywardRecord() {
        super(Getroomlistbyward.GETROOMLISTBYWARD);
    }

    /**
     * Create a detached, initialised GetroomlistbywardRecord
     */
    public GetroomlistbywardRecord(String hospitalcd, String roomcd, String roomnm) {
        super(Getroomlistbyward.GETROOMLISTBYWARD);

        set(0, hospitalcd);
        set(1, roomcd);
        set(2, roomnm);
    }
}
