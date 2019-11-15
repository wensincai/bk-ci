/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.project.tables.records;


import com.tencent.devops.model.project.tables.TProjectLabelRel;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 项目与标签关联关系表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TProjectLabelRelRecord extends UpdatableRecordImpl<TProjectLabelRelRecord> implements Record5<String, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -983723225;

    /**
     * Setter for <code>devops_project.T_PROJECT_LABEL_REL.ID</code>. 主键
     */
    public TProjectLabelRelRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.T_PROJECT_LABEL_REL.ID</code>. 主键
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>devops_project.T_PROJECT_LABEL_REL.LABEL_ID</code>. 项目标签ID
     */
    public TProjectLabelRelRecord setLabelId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.T_PROJECT_LABEL_REL.LABEL_ID</code>. 项目标签ID
     */
    public String getLabelId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_project.T_PROJECT_LABEL_REL.PROJECT_ID</code>. 项目ID
     */
    public TProjectLabelRelRecord setProjectId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.T_PROJECT_LABEL_REL.PROJECT_ID</code>. 项目ID
     */
    public String getProjectId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_project.T_PROJECT_LABEL_REL.CREATE_TIME</code>. 创建时间
     */
    public TProjectLabelRelRecord setCreateTime(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.T_PROJECT_LABEL_REL.CREATE_TIME</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>devops_project.T_PROJECT_LABEL_REL.UPDATE_TIME</code>. 更新时间
     */
    public TProjectLabelRelRecord setUpdateTime(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_project.T_PROJECT_LABEL_REL.UPDATE_TIME</code>. 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TProjectLabelRel.T_PROJECT_LABEL_REL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TProjectLabelRel.T_PROJECT_LABEL_REL.LABEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TProjectLabelRel.T_PROJECT_LABEL_REL.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return TProjectLabelRel.T_PROJECT_LABEL_REL.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return TProjectLabelRel.T_PROJECT_LABEL_REL.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLabelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProjectLabelRelRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProjectLabelRelRecord value2(String value) {
        setLabelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProjectLabelRelRecord value3(String value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProjectLabelRelRecord value4(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProjectLabelRelRecord value5(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProjectLabelRelRecord values(String value1, String value2, String value3, LocalDateTime value4, LocalDateTime value5) {
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
     * Create a detached TProjectLabelRelRecord
     */
    public TProjectLabelRelRecord() {
        super(TProjectLabelRel.T_PROJECT_LABEL_REL);
    }

    /**
     * Create a detached, initialised TProjectLabelRelRecord
     */
    public TProjectLabelRelRecord(String id, String labelId, String projectId, LocalDateTime createTime, LocalDateTime updateTime) {
        super(TProjectLabelRel.T_PROJECT_LABEL_REL);

        set(0, id);
        set(1, labelId);
        set(2, projectId);
        set(3, createTime);
        set(4, updateTime);
    }
}