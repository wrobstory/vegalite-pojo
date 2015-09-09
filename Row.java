import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "type",
    "timeUnit",
    "bin",
    "aggregate",
    "padding",
    "sort",
    "axis",
    "height"
})
public class Row {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private Row.Type type;
    @JsonProperty("timeUnit")
    private Row.TimeUnit timeUnit;
    @JsonProperty("bin")
    private Bin__ bin = null;
    @JsonProperty("aggregate")
    private Row.Aggregate aggregate;
    @JsonProperty("padding")
    private Double padding = 0.1D;
    @JsonProperty("sort")
    private List<Sort__> sort = new ArrayList<Sort__>();
    @JsonProperty("axis")
    private Axis__ axis;
    @JsonProperty("height")
    private Double height = 150.0D;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Row withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Row.Type getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Row.Type type) {
        this.type = type;
    }

    public Row withType(Row.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public Row.TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * 
     * @param timeUnit
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(Row.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Row withTimeUnit(Row.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * 
     * @return
     *     The bin
     */
    @JsonProperty("bin")
    public Bin__ getBin() {
        return bin;
    }

    /**
     * 
     * @param bin
     *     The bin
     */
    @JsonProperty("bin")
    public void setBin(Bin__ bin) {
        this.bin = bin;
    }

    public Row withBin(Bin__ bin) {
        this.bin = bin;
        return this;
    }

    /**
     * 
     * @return
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public Row.Aggregate getAggregate() {
        return aggregate;
    }

    /**
     * 
     * @param aggregate
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public void setAggregate(Row.Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Row withAggregate(Row.Aggregate aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    /**
     * 
     * @return
     *     The padding
     */
    @JsonProperty("padding")
    public Double getPadding() {
        return padding;
    }

    /**
     * 
     * @param padding
     *     The padding
     */
    @JsonProperty("padding")
    public void setPadding(Double padding) {
        this.padding = padding;
    }

    public Row withPadding(Double padding) {
        this.padding = padding;
        return this;
    }

    /**
     * 
     * @return
     *     The sort
     */
    @JsonProperty("sort")
    public List<Sort__> getSort() {
        return sort;
    }

    /**
     * 
     * @param sort
     *     The sort
     */
    @JsonProperty("sort")
    public void setSort(List<Sort__> sort) {
        this.sort = sort;
    }

    public Row withSort(List<Sort__> sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 
     * @return
     *     The axis
     */
    @JsonProperty("axis")
    public Axis__ getAxis() {
        return axis;
    }

    /**
     * 
     * @param axis
     *     The axis
     */
    @JsonProperty("axis")
    public void setAxis(Axis__ axis) {
        this.axis = axis;
    }

    public Row withAxis(Axis__ axis) {
        this.axis = axis;
        return this;
    }

    /**
     * 
     * @return
     *     The height
     */
    @JsonProperty("height")
    public Double getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    @JsonProperty("height")
    public void setHeight(Double height) {
        this.height = height;
    }

    public Row withHeight(Double height) {
        this.height = height;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(type).append(timeUnit).append(bin).append(aggregate).append(padding).append(sort).append(axis).append(height).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Row) == false) {
            return false;
        }
        Row rhs = ((Row) other);
        return new EqualsBuilder().append(name, rhs.name).append(type, rhs.type).append(timeUnit, rhs.timeUnit).append(bin, rhs.bin).append(aggregate, rhs.aggregate).append(padding, rhs.padding).append(sort, rhs.sort).append(axis, rhs.axis).append(height, rhs.height).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Aggregate {

        COUNT("count");
        private final String value;
        private static Map<String, Row.Aggregate> constants = new HashMap<String, Row.Aggregate>();

        static {
            for (Row.Aggregate c: values()) {
                constants.put(c.value, c);
            }
        }

        private Aggregate(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Row.Aggregate fromValue(String value) {
            Row.Aggregate constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum TimeUnit {

        YEAR("year"),
        MONTH("month"),
        DAY("day"),
        DATE("date"),
        HOURS("hours"),
        MINUTES("minutes"),
        SECONDS("seconds");
        private final String value;
        private static Map<String, Row.TimeUnit> constants = new HashMap<String, Row.TimeUnit>();

        static {
            for (Row.TimeUnit c: values()) {
                constants.put(c.value, c);
            }
        }

        private TimeUnit(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Row.TimeUnit fromValue(String value) {
            Row.TimeUnit constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        N("N"),
        O("O"),
        Q("Q"),
        T("T");
        private final String value;
        private static Map<String, Row.Type> constants = new HashMap<String, Row.Type>();

        static {
            for (Row.Type c: values()) {
                constants.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Row.Type fromValue(String value) {
            Row.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
