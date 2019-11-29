/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getdruginfo;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class GetdruginfoRecord extends TableRecordImpl<GetdruginfoRecord> implements Record17<String, String, String, String, String, String, String, String, String, String, String, String, byte[], String, String, String, String> {

    private static final long serialVersionUID = 1965000504;

    /**
     * Setter for <code>mplus_test_data.getdruginfo.hospitalCd</code>.
     */
    public void setHospitalcd(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.hospitalCd</code>.
     */
    public String getHospitalcd() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.drugNmEn</code>.
     */
    public void setDrugnmen(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.drugNmEn</code>.
     */
    public String getDrugnmen() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.drugNmKr</code>.
     */
    public void setDrugnmkr(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.drugNmKr</code>.
     */
    public String getDrugnmkr() {
        return (String) get(2);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.drugMakerNm</code>.
     */
    public void setDrugmakernm(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.drugMakerNm</code>.
     */
    public String getDrugmakernm() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.drugCls</code>.
     */
    public void setDrugcls(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.drugCls</code>.
     */
    public String getDrugcls() {
        return (String) get(4);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.drugIngredient</code>.
     */
    public void setDrugingredient(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.drugIngredient</code>.
     */
    public String getDrugingredient() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.drugAction</code>.
     */
    public void setDrugaction(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.drugAction</code>.
     */
    public String getDrugaction() {
        return (String) get(6);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.drugEffect</code>.
     */
    public void setDrugeffect(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.drugEffect</code>.
     */
    public String getDrugeffect() {
        return (String) get(7);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.drugDosageAdmin</code>.
     */
    public void setDrugdosageadmin(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.drugDosageAdmin</code>.
     */
    public String getDrugdosageadmin() {
        return (String) get(8);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.drugWarnings</code>.
     */
    public void setDrugwarnings(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.drugWarnings</code>.
     */
    public String getDrugwarnings() {
        return (String) get(9);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.drugContraindication</code>.
     */
    public void setDrugcontraindication(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.drugContraindication</code>.
     */
    public String getDrugcontraindication() {
        return (String) get(10);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.drugStorage</code>.
     */
    public void setDrugstorage(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.drugStorage</code>.
     */
    public String getDrugstorage() {
        return (String) get(11);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.drugPhoto</code>.
     */
    public void setDrugphoto(byte... value) {
        set(12, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.drugPhoto</code>.
     */
    public byte[] getDrugphoto() {
        return (byte[]) get(12);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.insurancePrice</code>.
     */
    public void setInsuranceprice(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.insurancePrice</code>.
     */
    public String getInsuranceprice() {
        return (String) get(13);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.regularPrice</code>.
     */
    public void setRegularprice(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.regularPrice</code>.
     */
    public String getRegularprice() {
        return (String) get(14);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.useLocationCls</code>.
     */
    public void setUselocationcls(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.useLocationCls</code>.
     */
    public String getUselocationcls() {
        return (String) get(15);
    }

    /**
     * Setter for <code>mplus_test_data.getdruginfo.welfareCls</code>.
     */
    public void setWelfarecls(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>mplus_test_data.getdruginfo.welfareCls</code>.
     */
    public String getWelfarecls() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, String, String, String, String, String, String, String, String, String, String, byte[], String, String, String, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, String, String, String, String, String, String, String, String, String, String, byte[], String, String, String, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Getdruginfo.GETDRUGINFO.HOSPITALCD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Getdruginfo.GETDRUGINFO.DRUGNMEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Getdruginfo.GETDRUGINFO.DRUGNMKR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Getdruginfo.GETDRUGINFO.DRUGMAKERNM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Getdruginfo.GETDRUGINFO.DRUGCLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Getdruginfo.GETDRUGINFO.DRUGINGREDIENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Getdruginfo.GETDRUGINFO.DRUGACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Getdruginfo.GETDRUGINFO.DRUGEFFECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Getdruginfo.GETDRUGINFO.DRUGDOSAGEADMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Getdruginfo.GETDRUGINFO.DRUGWARNINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Getdruginfo.GETDRUGINFO.DRUGCONTRAINDICATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Getdruginfo.GETDRUGINFO.DRUGSTORAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field13() {
        return Getdruginfo.GETDRUGINFO.DRUGPHOTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Getdruginfo.GETDRUGINFO.INSURANCEPRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Getdruginfo.GETDRUGINFO.REGULARPRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Getdruginfo.GETDRUGINFO.USELOCATIONCLS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Getdruginfo.GETDRUGINFO.WELFARECLS;
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
        return getDrugnmen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDrugnmkr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDrugmakernm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDrugcls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDrugingredient();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDrugaction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDrugeffect();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getDrugdosageadmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getDrugwarnings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getDrugcontraindication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getDrugstorage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component13() {
        return getDrugphoto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getInsuranceprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getRegularprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getUselocationcls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getWelfarecls();
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
        return getDrugnmen();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDrugnmkr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDrugmakernm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDrugcls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDrugingredient();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDrugaction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDrugeffect();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDrugdosageadmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getDrugwarnings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDrugcontraindication();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getDrugstorage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value13() {
        return getDrugphoto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getInsuranceprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getRegularprice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getUselocationcls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getWelfarecls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value1(String value) {
        setHospitalcd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value2(String value) {
        setDrugnmen(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value3(String value) {
        setDrugnmkr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value4(String value) {
        setDrugmakernm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value5(String value) {
        setDrugcls(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value6(String value) {
        setDrugingredient(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value7(String value) {
        setDrugaction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value8(String value) {
        setDrugeffect(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value9(String value) {
        setDrugdosageadmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value10(String value) {
        setDrugwarnings(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value11(String value) {
        setDrugcontraindication(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value12(String value) {
        setDrugstorage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value13(byte... value) {
        setDrugphoto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value14(String value) {
        setInsuranceprice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value15(String value) {
        setRegularprice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value16(String value) {
        setUselocationcls(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord value17(String value) {
        setWelfarecls(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetdruginfoRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, byte[] value13, String value14, String value15, String value16, String value17) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetdruginfoRecord
     */
    public GetdruginfoRecord() {
        super(Getdruginfo.GETDRUGINFO);
    }

    /**
     * Create a detached, initialised GetdruginfoRecord
     */
    public GetdruginfoRecord(String hospitalcd, String drugnmen, String drugnmkr, String drugmakernm, String drugcls, String drugingredient, String drugaction, String drugeffect, String drugdosageadmin, String drugwarnings, String drugcontraindication, String drugstorage, byte[] drugphoto, String insuranceprice, String regularprice, String uselocationcls, String welfarecls) {
        super(Getdruginfo.GETDRUGINFO);

        set(0, hospitalcd);
        set(1, drugnmen);
        set(2, drugnmkr);
        set(3, drugmakernm);
        set(4, drugcls);
        set(5, drugingredient);
        set(6, drugaction);
        set(7, drugeffect);
        set(8, drugdosageadmin);
        set(9, drugwarnings);
        set(10, drugcontraindication);
        set(11, drugstorage);
        set(12, drugphoto);
        set(13, insuranceprice);
        set(14, regularprice);
        set(15, uselocationcls);
        set(16, welfarecls);
    }
}
