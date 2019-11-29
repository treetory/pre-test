/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Gettreatmentdetail;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record22;
import org.jooq.Row22;
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
public class GettreatmentdetailRecord extends TableRecordImpl<GettreatmentdetailRecord> implements Record22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1678901036;

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.patientId</code>.
     */
    public void setPatientid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.patientId</code>.
     */
    public String getPatientid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.patientNm</code>.
     */
    public void setPatientnm(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.patientNm</code>.
     */
    public String getPatientnm() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.age</code>.
     */
    public void setAge(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.age</code>.
     */
    public String getAge() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.gender</code>.
     */
    public void setGender(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.gender</code>.
     */
    public String getGender() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.wardNm</code>.
     */
    public void setWardnm(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.wardNm</code>.
     */
    public String getWardnm() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.roomNm</code>.
     */
    public void setRoomnm(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.roomNm</code>.
     */
    public String getRoomnm() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.bedNm</code>.
     */
    public void setBednm(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.bedNm</code>.
     */
    public String getBednm() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.receiptNo</code>.
     */
    public void setReceiptno(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.receiptNo</code>.
     */
    public String getReceiptno() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.treatmentDeptNm</code>.
     */
    public void setTreatmentdeptnm(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.treatmentDeptNm</code>.
     */
    public String getTreatmentdeptnm() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.treatmentDrNm</code>.
     */
    public void setTreatmentdrnm(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.treatmentDrNm</code>.
     */
    public String getTreatmentdrnm() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.birthDt</code>.
     */
    public void setBirthdt(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.birthDt</code>.
     */
    public String getBirthdt() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.treatmentSeq</code>.
     */
    public void setTreatmentseq(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.treatmentSeq</code>.
     */
    public String getTreatmentseq() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.treatmentNm</code>.
     */
    public void setTreatmentnm(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.treatmentNm</code>.
     */
    public String getTreatmentnm() {
        return (String) get(13);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.diagnosisNm</code>.
     */
    public void setDiagnosisnm(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.diagnosisNm</code>.
     */
    public String getDiagnosisnm() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.treatmentStatNm</code>.
     */
    public void setTreatmentstatnm(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.treatmentStatNm</code>.
     */
    public String getTreatmentstatnm() {
        return (String) get(15);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.treatmentStartDt</code>.
     */
    public void setTreatmentstartdt(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.treatmentStartDt</code>.
     */
    public String getTreatmentstartdt() {
        return (String) get(16);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.treatmentStartTm</code>.
     */
    public void setTreatmentstarttm(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.treatmentStartTm</code>.
     */
    public String getTreatmentstarttm() {
        return (String) get(17);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.treatmentEndDt</code>.
     */
    public void setTreatmentenddt(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.treatmentEndDt</code>.
     */
    public String getTreatmentenddt() {
        return (String) get(18);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.treatmentEndTm</code>.
     */
    public void setTreatmentendtm(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.treatmentEndTm</code>.
     */
    public String getTreatmentendtm() {
        return (String) get(19);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.treatmentCntrNm</code>.
     */
    public void setTreatmentcntrnm(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.treatmentCntrNm</code>.
     */
    public String getTreatmentcntrnm() {
        return (String) get(20);
    }

    /**
     * Setter for <code>mplus_test_data.gettreatmentdetail.operationRmk</code>.
     */
    public void setOperationrmk(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>mplus_test_data.gettreatmentdetail.operationRmk</code>.
     */
    public String getOperationrmk() {
        return (String) get(21);
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.PATIENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.PATIENTNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.AGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.GENDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.WARDNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.ROOMNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.BEDNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.RECEIPTNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.TREATMENTDEPTNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.TREATMENTDRNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.BIRTHDT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.TREATMENTSEQ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.TREATMENTNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.DIAGNOSISNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.TREATMENTSTATNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.TREATMENTSTARTDT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.TREATMENTSTARTTM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.TREATMENTENDDT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.TREATMENTENDTM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.TREATMENTCNTRNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field22() {
        return Gettreatmentdetail.GETTREATMENTDETAIL.OPERATIONRMK;
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
        return getPatientid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPatientnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getWardnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getRoomnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getBednm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getReceiptno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getTreatmentdeptnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getTreatmentdrnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getBirthdt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getTreatmentseq();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getTreatmentnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getDiagnosisnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getTreatmentstatnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getTreatmentstartdt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getTreatmentstarttm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getTreatmentenddt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getTreatmentendtm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component21() {
        return getTreatmentcntrnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component22() {
        return getOperationrmk();
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
        return getPatientid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPatientnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getWardnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getRoomnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getBednm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getReceiptno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getTreatmentdeptnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getTreatmentdrnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getBirthdt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getTreatmentseq();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getTreatmentnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getDiagnosisnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getTreatmentstatnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getTreatmentstartdt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getTreatmentstarttm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getTreatmentenddt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getTreatmentendtm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getTreatmentcntrnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value22() {
        return getOperationrmk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value2(String value) {
        setPatientid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value3(String value) {
        setPatientnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value4(String value) {
        setAge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value5(String value) {
        setGender(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value6(String value) {
        setWardnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value7(String value) {
        setRoomnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value8(String value) {
        setBednm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value9(String value) {
        setReceiptno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value10(String value) {
        setTreatmentdeptnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value11(String value) {
        setTreatmentdrnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value12(String value) {
        setBirthdt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value13(String value) {
        setTreatmentseq(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value14(String value) {
        setTreatmentnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value15(String value) {
        setDiagnosisnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value16(String value) {
        setTreatmentstatnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value17(String value) {
        setTreatmentstartdt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value18(String value) {
        setTreatmentstarttm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value19(String value) {
        setTreatmentenddt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value20(String value) {
        setTreatmentendtm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value21(String value) {
        setTreatmentcntrnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord value22(String value) {
        setOperationrmk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GettreatmentdetailRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, String value18, String value19, String value20, String value21, String value22) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GettreatmentdetailRecord
     */
    public GettreatmentdetailRecord() {
        super(Gettreatmentdetail.GETTREATMENTDETAIL);
    }

    /**
     * Create a detached, initialised GettreatmentdetailRecord
     */
    public GettreatmentdetailRecord(String hospitalcd, String patientid, String patientnm, String age, String gender, String wardnm, String roomnm, String bednm, String receiptno, String treatmentdeptnm, String treatmentdrnm, String birthdt, String treatmentseq, String treatmentnm, String diagnosisnm, String treatmentstatnm, String treatmentstartdt, String treatmentstarttm, String treatmentenddt, String treatmentendtm, String treatmentcntrnm, String operationrmk) {
        super(Gettreatmentdetail.GETTREATMENTDETAIL);

        set(0, hospitalcd);
        set(1, patientid);
        set(2, patientnm);
        set(3, age);
        set(4, gender);
        set(5, wardnm);
        set(6, roomnm);
        set(7, bednm);
        set(8, receiptno);
        set(9, treatmentdeptnm);
        set(10, treatmentdrnm);
        set(11, birthdt);
        set(12, treatmentseq);
        set(13, treatmentnm);
        set(14, diagnosisnm);
        set(15, treatmentstatnm);
        set(16, treatmentstartdt);
        set(17, treatmentstarttm);
        set(18, treatmentenddt);
        set(19, treatmentendtm);
        set(20, treatmentcntrnm);
        set(21, operationrmk);
    }
}