/*
 * This file is generated by jOOQ.
*/
package box.white.seriwb.api.jooq.information_schema.tables;


import box.white.seriwb.api.jooq.information_schema.InformationSchema;
import box.white.seriwb.api.jooq.information_schema.tables.records.FunctionColumnsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class FunctionColumns extends TableImpl<FunctionColumnsRecord> {

    private static final long serialVersionUID = 1239464781;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code>
     */
    public static final FunctionColumns FUNCTION_COLUMNS = new FunctionColumns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FunctionColumnsRecord> getRecordType() {
        return FunctionColumnsRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_CATALOG</code>.
     */
    public final TableField<FunctionColumnsRecord, String> ALIAS_CATALOG = createField("ALIAS_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_SCHEMA</code>.
     */
    public final TableField<FunctionColumnsRecord, String> ALIAS_SCHEMA = createField("ALIAS_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_NAME</code>.
     */
    public final TableField<FunctionColumnsRecord, String> ALIAS_NAME = createField("ALIAS_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.JAVA_CLASS</code>.
     */
    public final TableField<FunctionColumnsRecord, String> JAVA_CLASS = createField("JAVA_CLASS", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.JAVA_METHOD</code>.
     */
    public final TableField<FunctionColumnsRecord, String> JAVA_METHOD = createField("JAVA_METHOD", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_COUNT</code>.
     */
    public final TableField<FunctionColumnsRecord, Integer> COLUMN_COUNT = createField("COLUMN_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.POS</code>.
     */
    public final TableField<FunctionColumnsRecord, Integer> POS = createField("POS", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_NAME</code>.
     */
    public final TableField<FunctionColumnsRecord, String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.DATA_TYPE</code>.
     */
    public final TableField<FunctionColumnsRecord, Integer> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.TYPE_NAME</code>.
     */
    public final TableField<FunctionColumnsRecord, String> TYPE_NAME = createField("TYPE_NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.PRECISION</code>.
     */
    public final TableField<FunctionColumnsRecord, Integer> PRECISION = createField("PRECISION", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.SCALE</code>.
     */
    public final TableField<FunctionColumnsRecord, Short> SCALE = createField("SCALE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.RADIX</code>.
     */
    public final TableField<FunctionColumnsRecord, Short> RADIX = createField("RADIX", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.NULLABLE</code>.
     */
    public final TableField<FunctionColumnsRecord, Short> NULLABLE = createField("NULLABLE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_TYPE</code>.
     */
    public final TableField<FunctionColumnsRecord, Short> COLUMN_TYPE = createField("COLUMN_TYPE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.REMARKS</code>.
     */
    public final TableField<FunctionColumnsRecord, String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_DEFAULT</code>.
     */
    public final TableField<FunctionColumnsRecord, String> COLUMN_DEFAULT = createField("COLUMN_DEFAULT", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code> table reference
     */
    public FunctionColumns() {
        this(DSL.name("FUNCTION_COLUMNS"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code> table reference
     */
    public FunctionColumns(String alias) {
        this(DSL.name(alias), FUNCTION_COLUMNS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code> table reference
     */
    public FunctionColumns(Name alias) {
        this(alias, FUNCTION_COLUMNS);
    }

    private FunctionColumns(Name alias, Table<FunctionColumnsRecord> aliased) {
        this(alias, aliased, null);
    }

    private FunctionColumns(Name alias, Table<FunctionColumnsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumns as(String alias) {
        return new FunctionColumns(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumns as(Name alias) {
        return new FunctionColumns(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FunctionColumns rename(String name) {
        return new FunctionColumns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FunctionColumns rename(Name name) {
        return new FunctionColumns(name, null);
    }
}
