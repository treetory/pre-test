/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getopdetailhistorylist;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


/**
 * 수술 이력 목록 조회
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetopdetailhistorylistRecord extends TableRecordImpl<GetopdetailhistorylistRecord> implements Record10<String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 572958859;

    /**
     * Setter for <code>mplus_test_data.getopdetailhistorylist.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getopdetailhistorylist.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.getopdetailhistorylist.userId</code>.
     */
    public void setUserid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.getopdetailhistorylist.userId</code>.
     */
    public String getUserid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.getopdetailhistorylist.patientId</code>.
     */
    public void setPatientid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.getopdetailhistorylist.patientId</code>.
     */
    public String getPatientid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mplus_test_data.getopdetailhistorylist.operationDt</code>.
     */
    public void setOperationdt(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mplus_test_data.getopdetailhistorylist.operationDt</code>.
     */
    public String getOperationdt() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mplus_test_data.getopdetailhistorylist.operationDeptCd</code>.
     */
    public void setOperationdeptcd(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mplus_test_data.getopdetailhistorylist.operationDeptCd</code>.
     */
    public String getOperationdeptcd() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mplus_test_data.getopdetailhistorylist.operationDrId</code>.
     */
    public void setOperationdrid(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mplus_test_data.getopdetailhistorylist.operationDrId</code>.
     */
    public String getOperationdrid() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mplus_test_data.getopdetailhistorylist.operationCntrCd</code>.
     */
    public void setOperationcntrcd(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mplus_test_data.getopdetailhistorylist.operationCntrCd</code>.
     */
    public String getOperationcntrcd() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mplus_test_data.getopdetailhistorylist.operationRoomCd</code>.
     */
    public void setOperationroomcd(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mplus_test_data.getopdetailhistorylist.operationRoomCd</code>.
     */
    public String getOperationroomcd() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mplus_test_data.getopdetailhistorylist.operationDeptNm</code>.
     */
    public void setOperationdeptnm(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mplus_test_data.getopdetailhistorylist.operationDeptNm</code>.
     */
    public String getOperationdeptnm() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mplus_test_data.getopdetailhistorylist.operationDrNm</code>.
     */
    public void setOperationdrnm(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mplus_test_data.getopdetailhistorylist.operationDrNm</code>.
     */
    public String getOperationdrnm() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Getopdetailhistorylist.GETOPDETAILHISTORYLIST.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Getopdetailhistorylist.GETOPDETAILHISTORYLIST.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Getopdetailhistorylist.GETOPDETAILHISTORYLIST.PATIENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Getopdetailhistorylist.GETOPDETAILHISTORYLIST.OPERATIONDT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Getopdetailhistorylist.GETOPDETAILHISTORYLIST.OPERATIONDEPTCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Getopdetailhistorylist.GETOPDETAILHISTORYLIST.OPERATIONDRID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Getopdetailhistorylist.GETOPDETAILHISTORYLIST.OPERATIONCNTRCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Getopdetailhistorylist.GETOPDETAILHISTORYLIST.OPERATIONROOMCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Getopdetailhistorylist.GETOPDETAILHISTORYLIST.OPERATIONDEPTNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Getopdetailhistorylist.GETOPDETAILHISTORYLIST.OPERATIONDRNM;
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
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPatientid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getOperationdt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getOperationdeptcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getOperationdrid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getOperationcntrcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getOperationroomcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getOperationdeptnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getOperationdrnm();
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
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPatientid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOperationdt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getOperationdeptcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOperationdrid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOperationcntrcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getOperationroomcd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getOperationdeptnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getOperationdrnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetopdetailhistorylistRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetopdetailhistorylistRecord value2(String value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetopdetailhistorylistRecord value3(String value) {
        setPatientid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetopdetailhistorylistRecord value4(String value) {
        setOperationdt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetopdetailhistorylistRecord value5(String value) {
        setOperationdeptcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetopdetailhistorylistRecord value6(String value) {
        setOperationdrid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetopdetailhistorylistRecord value7(String value) {
        setOperationcntrcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetopdetailhistorylistRecord value8(String value) {
        setOperationroomcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetopdetailhistorylistRecord value9(String value) {
        setOperationdeptnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetopdetailhistorylistRecord value10(String value) {
        setOperationdrnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetopdetailhistorylistRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetopdetailhistorylistRecord
     */
    public GetopdetailhistorylistRecord() {
        super(Getopdetailhistorylist.GETOPDETAILHISTORYLIST);
    }

    /**
     * Create a detached, initialised GetopdetailhistorylistRecord
     */
    public GetopdetailhistorylistRecord(String hospitalcd, String userid, String patientid, String operationdt, String operationdeptcd, String operationdrid, String operationcntrcd, String operationroomcd, String operationdeptnm, String operationdrnm) {
        super(Getopdetailhistorylist.GETOPDETAILHISTORYLIST);

        set(0, hospitalcd);
        set(1, userid);
        set(2, patientid);
        set(3, operationdt);
        set(4, operationdeptcd);
        set(5, operationdrid);
        set(6, operationcntrcd);
        set(7, operationroomcd);
        set(8, operationdeptnm);
        set(9, operationdrnm);
    }
}
