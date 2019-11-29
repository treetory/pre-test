/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getouthistorylist;

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
public class GetouthistorylistRecord extends TableRecordImpl<GetouthistorylistRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = -493982485;

    /**
     * Setter for <code>mplus_test_data.getouthistorylist.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getouthistorylist.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.getouthistorylist.visitDt</code>.
     */
    public void setVisitdt(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.getouthistorylist.visitDt</code>.
     */
    public String getVisitdt() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.getouthistorylist.deptNm</code>.
     */
    public void setDeptnm(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.getouthistorylist.deptNm</code>.
     */
    public String getDeptnm() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mplus_test_data.getouthistorylist.doctorNm</code>.
     */
    public void setDoctornm(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mplus_test_data.getouthistorylist.doctorNm</code>.
     */
    public String getDoctornm() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mplus_test_data.getouthistorylist.diagnosisNm</code>.
     */
    public void setDiagnosisnm(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mplus_test_data.getouthistorylist.diagnosisNm</code>.
     */
    public String getDiagnosisnm() {
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
        return Getouthistorylist.GETOUTHISTORYLIST.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Getouthistorylist.GETOUTHISTORYLIST.VISITDT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Getouthistorylist.GETOUTHISTORYLIST.DEPTNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Getouthistorylist.GETOUTHISTORYLIST.DOCTORNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Getouthistorylist.GETOUTHISTORYLIST.DIAGNOSISNM;
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
        return getVisitdt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDeptnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDoctornm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDiagnosisnm();
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
        return getVisitdt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDeptnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDoctornm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDiagnosisnm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetouthistorylistRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetouthistorylistRecord value2(String value) {
        setVisitdt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetouthistorylistRecord value3(String value) {
        setDeptnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetouthistorylistRecord value4(String value) {
        setDoctornm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetouthistorylistRecord value5(String value) {
        setDiagnosisnm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetouthistorylistRecord values(String value1, String value2, String value3, String value4, String value5) {
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
     * Create a detached GetouthistorylistRecord
     */
    public GetouthistorylistRecord() {
        super(Getouthistorylist.GETOUTHISTORYLIST);
    }

    /**
     * Create a detached, initialised GetouthistorylistRecord
     */
    public GetouthistorylistRecord(String hospitalcd, String visitdt, String deptnm, String doctornm, String diagnosisnm) {
        super(Getouthistorylist.GETOUTHISTORYLIST);

        set(0, hospitalcd);
        set(1, visitdt);
        set(2, deptnm);
        set(3, doctornm);
        set(4, diagnosisnm);
    }
}