/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.artifactory.tables.records;


import com.tencent.devops.model.artifactory.tables.TTipelineArtifacetoryInfo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 构建产物信息表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TTipelineArtifacetoryInfoRecord extends UpdatableRecordImpl<TTipelineArtifacetoryInfoRecord> implements Record16<Long, String, String, String, String, Integer, String, String, String, String, Integer, LocalDateTime, String, String, String, Byte> {

    private static final long serialVersionUID = -591676457;

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.ID</code>.
     */
    public TTipelineArtifacetoryInfoRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.PIPELINE_ID</code>. 流水线ID
     */
    public TTipelineArtifacetoryInfoRecord setPipelineId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.PIPELINE_ID</code>. 流水线ID
     */
    public String getPipelineId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.BUILD_ID</code>. 构建ID
     */
    public TTipelineArtifacetoryInfoRecord setBuildId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.BUILD_ID</code>. 构建ID
     */
    public String getBuildId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.PROJECT_ID</code>. 项目ID
     */
    public TTipelineArtifacetoryInfoRecord setProjectId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.PROJECT_ID</code>. 项目ID
     */
    public String getProjectId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.BUNDLE_ID</code>. 归档包ID
     */
    public TTipelineArtifacetoryInfoRecord setBundleId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.BUNDLE_ID</code>. 归档包ID
     */
    public String getBundleId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.BUILD_NUM</code>. 构建号
     */
    public TTipelineArtifacetoryInfoRecord setBuildNum(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.BUILD_NUM</code>. 构建号
     */
    public Integer getBuildNum() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.NAME</code>. 文件名
     */
    public TTipelineArtifacetoryInfoRecord setName(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.NAME</code>. 文件名
     */
    public String getName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.FULL_NAME</code>. 文件全名
     */
    public TTipelineArtifacetoryInfoRecord setFullName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.FULL_NAME</code>. 文件全名
     */
    public String getFullName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.PATH</code>. 文件路径
     */
    public TTipelineArtifacetoryInfoRecord setPath(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.PATH</code>. 文件路径
     */
    public String getPath() {
        return (String) get(8);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.FULL_PATH</code>. 文件全路径
     */
    public TTipelineArtifacetoryInfoRecord setFullPath(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.FULL_PATH</code>. 文件全路径
     */
    public String getFullPath() {
        return (String) get(9);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.SIZE</code>. 文件大小(byte)
     */
    public TTipelineArtifacetoryInfoRecord setSize(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.SIZE</code>. 文件大小(byte)
     */
    public Integer getSize() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.MODIFIED_TIME</code>. 更新时间
     */
    public TTipelineArtifacetoryInfoRecord setModifiedTime(LocalDateTime value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.MODIFIED_TIME</code>. 更新时间
     */
    public LocalDateTime getModifiedTime() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.ARTIFACTORY_TYPE</code>. 仓库类型
     */
    public TTipelineArtifacetoryInfoRecord setArtifactoryType(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.ARTIFACTORY_TYPE</code>. 仓库类型
     */
    public String getArtifactoryType() {
        return (String) get(12);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.PROPERTIES</code>. 元数据
     */
    public TTipelineArtifacetoryInfoRecord setProperties(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.PROPERTIES</code>. 元数据
     */
    public String getProperties() {
        return (String) get(13);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.APP_VERSION</code>. app版本
     */
    public TTipelineArtifacetoryInfoRecord setAppVersion(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.APP_VERSION</code>. app版本
     */
    public String getAppVersion() {
        return (String) get(14);
    }

    /**
     * Setter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.DATA_FROM</code>. 数据来源：0自然数据 1补偿数据
     */
    public TTipelineArtifacetoryInfoRecord setDataFrom(Byte value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_TIPELINE_ARTIFACETORY_INFO.DATA_FROM</code>. 数据来源：0自然数据 1补偿数据
     */
    public Byte getDataFrom() {
        return (Byte) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, String, String, String, String, Integer, String, String, String, String, Integer, LocalDateTime, String, String, String, Byte> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, String, String, String, String, Integer, String, String, String, String, Integer, LocalDateTime, String, String, String, Byte> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.PIPELINE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.BUILD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.BUNDLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.BUILD_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.FULL_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.FULL_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field12() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.MODIFIED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.ARTIFACTORY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.PROPERTIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.APP_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field16() {
        return TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO.DATA_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPipelineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getBuildId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBundleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getBuildNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getFullName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getFullPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value12() {
        return getModifiedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getArtifactoryType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getProperties();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getAppVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value16() {
        return getDataFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value2(String value) {
        setPipelineId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value3(String value) {
        setBuildId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value4(String value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value5(String value) {
        setBundleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value6(Integer value) {
        setBuildNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value7(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value8(String value) {
        setFullName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value9(String value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value10(String value) {
        setFullPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value11(Integer value) {
        setSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value12(LocalDateTime value) {
        setModifiedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value13(String value) {
        setArtifactoryType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value14(String value) {
        setProperties(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value15(String value) {
        setAppVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord value16(Byte value) {
        setDataFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TTipelineArtifacetoryInfoRecord values(Long value1, String value2, String value3, String value4, String value5, Integer value6, String value7, String value8, String value9, String value10, Integer value11, LocalDateTime value12, String value13, String value14, String value15, Byte value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TTipelineArtifacetoryInfoRecord
     */
    public TTipelineArtifacetoryInfoRecord() {
        super(TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO);
    }

    /**
     * Create a detached, initialised TTipelineArtifacetoryInfoRecord
     */
    public TTipelineArtifacetoryInfoRecord(Long id, String pipelineId, String buildId, String projectId, String bundleId, Integer buildNum, String name, String fullName, String path, String fullPath, Integer size, LocalDateTime modifiedTime, String artifactoryType, String properties, String appVersion, Byte dataFrom) {
        super(TTipelineArtifacetoryInfo.T_TIPELINE_ARTIFACETORY_INFO);

        set(0, id);
        set(1, pipelineId);
        set(2, buildId);
        set(3, projectId);
        set(4, bundleId);
        set(5, buildNum);
        set(6, name);
        set(7, fullName);
        set(8, path);
        set(9, fullPath);
        set(10, size);
        set(11, modifiedTime);
        set(12, artifactoryType);
        set(13, properties);
        set(14, appVersion);
        set(15, dataFrom);
    }
}