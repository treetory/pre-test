/*
 * This file is generated by jOOQ.
 */
package com.treetory.dsltest.model.tables.records;


import com.treetory.dsltest.model.tables.Getmedirecordcontentdetail;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
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
public class GetmedirecordcontentdetailRecord extends TableRecordImpl<GetmedirecordcontentdetailRecord> implements Record1<String> {

    private static final long serialVersionUID = 712757795;

    /**
     * Setter for <code>mplus_test_data.getmedirecordcontentdetail.url</code>.
     */
    public void setUrl(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>mplus_test_data.getmedirecordcontentdetail.url</code>.
     */
    public String getUrl() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Getmedirecordcontentdetail.GETMEDIRECORDCONTENTDETAIL.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedirecordcontentdetailRecord value1(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GetmedirecordcontentdetailRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetmedirecordcontentdetailRecord
     */
    public GetmedirecordcontentdetailRecord() {
        super(Getmedirecordcontentdetail.GETMEDIRECORDCONTENTDETAIL);
    }

    /**
     * Create a detached, initialised GetmedirecordcontentdetailRecord
     */
    public GetmedirecordcontentdetailRecord(String url) {
        super(Getmedirecordcontentdetail.GETMEDIRECORDCONTENTDETAIL);

        set(0, url);
    }
}
