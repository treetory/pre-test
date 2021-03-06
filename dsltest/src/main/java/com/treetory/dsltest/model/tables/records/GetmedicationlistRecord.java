/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getmedicationlist;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
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
public class GetmedicationlistRecord extends TableRecordImpl<GetmedicationlistRecord> implements Record18<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -1198504847;

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.prescriptionCd</code>.
     */
    public void setPrescriptioncd(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.prescriptionCd</code>.
     */
    public String getPrescriptioncd() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.prescriptionNm</code>.
     */
    public void setPrescriptionnm(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.prescriptionNm</code>.
     */
    public String getPrescriptionnm() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.prescriptionClsCd</code>.
     */
    public void setPrescriptionclscd(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.prescriptionClsCd</code>.
     */
    public String getPrescriptionclscd() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.prescriptionClsNm</code>.
     */
    public void setPrescriptionclsnm(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.prescriptionClsNm</code>.
     */
    public String getPrescriptionclsnm() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.doseQtyPer1Tim</code>.
     */
    public void setDoseqtyper1tim(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.doseQtyPer1Tim</code>.
     */
    public String getDoseqtyper1tim() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.doseQtyPerDay</code>.
     */
    public void setDoseqtyperday(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.doseQtyPerDay</code>.
     */
    public String getDoseqtyperday() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.doseQtyTotal</code>.
     */
    public void setDoseqtytotal(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.doseQtyTotal</code>.
     */
    public String getDoseqtytotal() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.doseDay</code>.
     */
    public void setDoseday(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.doseDay</code>.
     */
    public String getDoseday() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.doseWay</code>.
     */
    public void setDoseway(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.doseWay</code>.
     */
    public String getDoseway() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.doseYn</code>.
     */
    public void setDoseyn(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.doseYn</code>.
     */
    public String getDoseyn() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.prescriptionNo</code>.
     */
    public void setPrescriptionno(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.prescriptionNo</code>.
     */
    public String getPrescriptionno() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.doseDtTm</code>.
     */
    public void setDosedttm(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.doseDtTm</code>.
     */
    public String getDosedttm() {
        return (String) get(12);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.prescriptionDtTm</code>.
     */
    public void setPrescriptiondttm(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.prescriptionDtTm</code>.
     */
    public String getPrescriptiondttm() {
        return (String) get(13);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.prescriptionDeptNm</code>.
     */
    public void setPrescriptiondeptnm(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.prescriptionDeptNm</code>.
     */
    public String getPrescriptiondeptnm() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.prescriptionDoctorNm</code>.
     */
    public void setPrescriptiondoctornm(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.prescriptionDoctorNm</code>.
     */
    public String getPrescriptiondoctornm() {
        return (String) get(15);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.doseExecutorNm</code>.
     */
    public void setDoseexecutornm(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.doseExecutorNm</code>.
     */
    public String getDoseexecutornm() {
        return (String) get(16);
    }

    /**
     * Setter for <code>mplus_test_data.getmedicationlist.comment</code>.
     */
    public void setComment(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedicationlist.comment</code>.
     */
    public String getComment() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row18<String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Getmedicationlist.GETMEDICATIONLIST.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Getmedicationlist.GETMEDICATIONLIST.PRESCRIPTIONCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Getmedicationlist.GETMEDICATIONLIST.PRESCRIPTIONNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Getmedicationlist.GETMEDICATIONLIST.PRESCRIPTIONCLSCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Getmedicationlist.GETMEDICATIONLIST.PRESCRIPTIONCLSNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Getmedicationlist.GETMEDICATIONLIST.DOSEQTYPER1TIM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Getmedicationlist.GETMEDICATIONLIST.DOSEQTYPERDAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Getmedicationlist.GETMEDICATIONLIST.DOSEQTYTOTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Getmedicationlist.GETMEDICATIONLIST.DOSEDAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Getmedicationlist.GETMEDICATIONLIST.DOSEWAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Getmedicationlist.GETMEDICATIONLIST.DOSEYN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Getmedicationlist.GETMEDICATIONLIST.PRESCRIPTIONNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Getmedicationlist.GETMEDICATIONLIST.DOSEDTTM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Getmedicationlist.GETMEDICATIONLIST.PRESCRIPTIONDTTM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Getmedicationlist.GETMEDICATIONLIST.PRESCRIPTIONDEPTNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Getmedicationlist.GETMEDICATIONLIST.PRESCRIPTIONDOCTORNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Getmedicationlist.GETMEDICATIONLIST.DOSEEXECUTORNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return Getmedicationlist.GETMEDICATIONLIST.COMMENT;
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
        return getPrescriptioncd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPrescriptionnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPrescriptionclscd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPrescriptionclsnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDoseqtyper1tim();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDoseqtyperday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDoseqtytotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getDoseday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getDoseway();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getDoseyn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getPrescriptionno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getDosedttm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getPrescriptiondttm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getPrescriptiondeptnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getPrescriptiondoctornm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getDoseexecutornm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getComment();
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
        return getPrescriptioncd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPrescriptionnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPrescriptionclscd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPrescriptionclsnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDoseqtyper1tim();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDoseqtyperday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDoseqtytotal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDoseday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getDoseway();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDoseyn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPrescriptionno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getDosedttm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getPrescriptiondttm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getPrescriptiondeptnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getPrescriptiondoctornm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getDoseexecutornm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getComment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value2(String value) {
        setPrescriptioncd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value3(String value) {
        setPrescriptionnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value4(String value) {
        setPrescriptionclscd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value5(String value) {
        setPrescriptionclsnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value6(String value) {
        setDoseqtyper1tim(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value7(String value) {
        setDoseqtyperday(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value8(String value) {
        setDoseqtytotal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value9(String value) {
        setDoseday(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value10(String value) {
        setDoseway(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value11(String value) {
        setDoseyn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value12(String value) {
        setPrescriptionno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value13(String value) {
        setDosedttm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value14(String value) {
        setPrescriptiondttm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value15(String value) {
        setPrescriptiondeptnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value16(String value) {
        setPrescriptiondoctornm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value17(String value) {
        setDoseexecutornm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord value18(String value) {
        setComment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedicationlistRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, String value18) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetmedicationlistRecord
     */
    public GetmedicationlistRecord() {
        super(Getmedicationlist.GETMEDICATIONLIST);
    }

    /**
     * Create a detached, initialised GetmedicationlistRecord
     */
    public GetmedicationlistRecord(String hospitalcd, String prescriptioncd, String prescriptionnm, String prescriptionclscd, String prescriptionclsnm, String doseqtyper1tim, String doseqtyperday, String doseqtytotal, String doseday, String doseway, String doseyn, String prescriptionno, String dosedttm, String prescriptiondttm, String prescriptiondeptnm, String prescriptiondoctornm, String doseexecutornm, String comment) {
        super(Getmedicationlist.GETMEDICATIONLIST);

        set(0, hospitalcd);
        set(1, prescriptioncd);
        set(2, prescriptionnm);
        set(3, prescriptionclscd);
        set(4, prescriptionclsnm);
        set(5, doseqtyper1tim);
        set(6, doseqtyperday);
        set(7, doseqtytotal);
        set(8, doseday);
        set(9, doseway);
        set(10, doseyn);
        set(11, prescriptionno);
        set(12, dosedttm);
        set(13, prescriptiondttm);
        set(14, prescriptiondeptnm);
        set(15, prescriptiondoctornm);
        set(16, doseexecutornm);
        set(17, comment);
    }
}
