/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getinhistorylist;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class GetinhistorylistRecord extends TableRecordImpl<GetinhistorylistRecord> implements Record9<String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -43308242;

    /**
     * Setter for <code>mplus_test_data.getinhistorylist.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getinhistorylist.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.getinhistorylist.hospitalizationDt</code>.
     */
    public void setHospitalizationdt(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.getinhistorylist.hospitalizationDt</code>.
     */
    public String getHospitalizationdt() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.getinhistorylist.dischargeDt</code>.
     */
    public void setDischargedt(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.getinhistorylist.dischargeDt</code>.
     */
    public String getDischargedt() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mplus_test_data.getinhistorylist.deptNm</code>.
     */
    public void setDeptnm(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mplus_test_data.getinhistorylist.deptNm</code>.
     */
    public String getDeptnm() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mplus_test_data.getinhistorylist.doctorNm</code>.
     */
    public void setDoctornm(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mplus_test_data.getinhistorylist.doctorNm</code>.
     */
    public String getDoctornm() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mplus_test_data.getinhistorylist.diagnosisNm</code>.
     */
    public void setDiagnosisnm(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mplus_test_data.getinhistorylist.diagnosisNm</code>.
     */
    public String getDiagnosisnm() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mplus_test_data.getinhistorylist.wardNm</code>.
     */
    public void setWardnm(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mplus_test_data.getinhistorylist.wardNm</code>.
     */
    public String getWardnm() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mplus_test_data.getinhistorylist.roomNm</code>.
     */
    public void setRoomnm(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mplus_test_data.getinhistorylist.roomNm</code>.
     */
    public String getRoomnm() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mplus_test_data.getinhistorylist.bedNm</code>.
     */
    public void setBednm(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mplus_test_data.getinhistorylist.bedNm</code>.
     */
    public String getBednm() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Getinhistorylist.GETINHISTORYLIST.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Getinhistorylist.GETINHISTORYLIST.HOSPITALIZATIONDT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Getinhistorylist.GETINHISTORYLIST.DISCHARGEDT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Getinhistorylist.GETINHISTORYLIST.DEPTNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Getinhistorylist.GETINHISTORYLIST.DOCTORNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Getinhistorylist.GETINHISTORYLIST.DIAGNOSISNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Getinhistorylist.GETINHISTORYLIST.WARDNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Getinhistorylist.GETINHISTORYLIST.ROOMNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Getinhistorylist.GETINHISTORYLIST.BEDNM;
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
        return getHospitalizationdt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDischargedt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDeptnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDoctornm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDiagnosisnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getWardnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRoomnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getBednm();
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
        return getHospitalizationdt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDischargedt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDeptnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDoctornm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDiagnosisnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getWardnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRoomnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getBednm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetinhistorylistRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetinhistorylistRecord value2(String value) {
        setHospitalizationdt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetinhistorylistRecord value3(String value) {
        setDischargedt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetinhistorylistRecord value4(String value) {
        setDeptnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetinhistorylistRecord value5(String value) {
        setDoctornm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetinhistorylistRecord value6(String value) {
        setDiagnosisnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetinhistorylistRecord value7(String value) {
        setWardnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetinhistorylistRecord value8(String value) {
        setRoomnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetinhistorylistRecord value9(String value) {
        setBednm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetinhistorylistRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetinhistorylistRecord
     */
    public GetinhistorylistRecord() {
        super(Getinhistorylist.GETINHISTORYLIST);
    }

    /**
     * Create a detached, initialised GetinhistorylistRecord
     */
    public GetinhistorylistRecord(String hospitalcd, String hospitalizationdt, String dischargedt, String deptnm, String doctornm, String diagnosisnm, String wardnm, String roomnm, String bednm) {
        super(Getinhistorylist.GETINHISTORYLIST);

        set(0, hospitalcd);
        set(1, hospitalizationdt);
        set(2, dischargedt);
        set(3, deptnm);
        set(4, doctornm);
        set(5, diagnosisnm);
        set(6, wardnm);
        set(7, roomnm);
        set(8, bednm);
    }
}
