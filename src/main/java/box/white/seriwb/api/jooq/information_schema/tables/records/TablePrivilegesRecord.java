/*
 * This file is generated by jOOQ.
*/
package box.white.seriwb.api.jooq.information_schema.tables.records;


import box.white.seriwb.api.jooq.information_schema.tables.TablePrivileges;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TablePrivilegesRecord extends TableRecordImpl<TablePrivilegesRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -965228184;

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.GRANTOR</code>.
     */
    public void setGrantor(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.GRANTOR</code>.
     */
    public String getGrantor() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.GRANTEE</code>.
     */
    public void setGrantee(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.GRANTEE</code>.
     */
    public String getGrantee() {
        return (String) get(1);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(2);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(3);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public void setPrivilegeType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.PRIVILEGE_TYPE</code>.
     */
    public String getPrivilegeType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public void setIsGrantable(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.TABLE_PRIVILEGES.IS_GRANTABLE</code>.
     */
    public String getIsGrantable() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TablePrivileges.TABLE_PRIVILEGES.GRANTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TablePrivileges.TABLE_PRIVILEGES.GRANTEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TablePrivileges.TABLE_PRIVILEGES.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TablePrivileges.TABLE_PRIVILEGES.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TablePrivileges.TABLE_PRIVILEGES.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TablePrivileges.TABLE_PRIVILEGES.PRIVILEGE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TablePrivileges.TABLE_PRIVILEGES.IS_GRANTABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getGrantor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPrivilegeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGrantor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGrantee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPrivilegeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getIsGrantable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablePrivilegesRecord value1(String value) {
        setGrantor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablePrivilegesRecord value2(String value) {
        setGrantee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablePrivilegesRecord value3(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablePrivilegesRecord value4(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablePrivilegesRecord value5(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablePrivilegesRecord value6(String value) {
        setPrivilegeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablePrivilegesRecord value7(String value) {
        setIsGrantable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TablePrivilegesRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TablePrivilegesRecord
     */
    public TablePrivilegesRecord() {
        super(TablePrivileges.TABLE_PRIVILEGES);
    }

    /**
     * Create a detached, initialised TablePrivilegesRecord
     */
    public TablePrivilegesRecord(String grantor, String grantee, String tableCatalog, String tableSchema, String tableName, String privilegeType, String isGrantable) {
        super(TablePrivileges.TABLE_PRIVILEGES);

        set(0, grantor);
        set(1, grantee);
        set(2, tableCatalog);
        set(3, tableSchema);
        set(4, tableName);
        set(5, privilegeType);
        set(6, isGrantable);
    }
}
