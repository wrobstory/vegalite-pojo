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
    "width"
})
public class Col {

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
    private Col.Type type;
    @JsonProperty("timeUnit")
    private Col.TimeUnit timeUnit;
    @JsonProperty("bin")
    private Bin___ bin = null;
    @JsonProperty("aggregate")
    private Col.Aggregate aggregate;
    @JsonProperty("padding")
    private Double padding = 0.1D;
    @JsonProperty("sort")
    private List<Sort___> sort = new ArrayList<Sort___>();
    @JsonProperty("axis")
    private Axis___ axis;
    @JsonProperty("width")
    private Double width = 150.0D;

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

    public Col withName(String name) {
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
    public Col.Type getType() {
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
    public void setType(Col.Type type) {
        this.type = type;
    }

    public Col withType(Col.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public Col.TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * 
     * @param timeUnit
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(Col.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Col withTimeUnit(Col.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * 
     * @return
     *     The bin
     */
    @JsonProperty("bin")
    public Bin___ getBin() {
        return bin;
    }

    /**
     * 
     * @param bin
     *     The bin
     */
    @JsonProperty("bin")
    public void setBin(Bin___ bin) {
        this.bin = bin;
    }

    public Col withBin(Bin___ bin) {
        this.bin = bin;
        return this;
    }

    /**
     * 
     * @return
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public Col.Aggregate getAggregate() {
        return aggregate;
    }

    /**
     * 
     * @param aggregate
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public void setAggregate(Col.Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Col withAggregate(Col.Aggregate aggregate) {
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

    public Col withPadding(Double padding) {
        this.padding = padding;
        return this;
    }

    /**
     * 
     * @return
     *     The sort
     */
    @JsonProperty("sort")
    public List<Sort___> getSort() {
        return sort;
    }

    /**
     * 
     * @param sort
     *     The sort
     */
    @JsonProperty("sort")
    public void setSort(List<Sort___> sort) {
        this.sort = sort;
    }

    public Col withSort(List<Sort___> sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 
     * @return
     *     The axis
     */
    @JsonProperty("axis")
    public Axis___ getAxis() {
        return axis;
    }

    /**
     * 
     * @param axis
     *     The axis
     */
    @JsonProperty("axis")
    public void setAxis(Axis___ axis) {
        this.axis = axis;
    }

    public Col withAxis(Axis___ axis) {
        this.axis = axis;
        return this;
    }

    /**
     * 
     * @return
     *     The width
     */
    @JsonProperty("width")
    public Double getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    @JsonProperty("width")
    public void setWidth(Double width) {
        this.width = width;
    }

    public Col withWidth(Double width) {
        this.width = width;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(type).append(timeUnit).append(bin).append(aggregate).append(padding).append(sort).append(axis).append(width).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Col) == false) {
            return false;
        }
        Col rhs = ((Col) other);
        return new EqualsBuilder().append(name, rhs.name).append(type, rhs.type).append(timeUnit, rhs.timeUnit).append(bin, rhs.bin).append(aggregate, rhs.aggregate).append(padding, rhs.padding).append(sort, rhs.sort).append(axis, rhs.axis).append(width, rhs.width).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Aggregate {

        COUNT("count");
        private final String value;
        private static Map<String, Col.Aggregate> constants = new HashMap<String, Col.Aggregate>();

        static {
            for (Col.Aggregate c: values()) {
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
        public static Col.Aggregate fromValue(String value) {
            Col.Aggregate constant = constants.get(value);
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
        private static Map<String, Col.TimeUnit> constants = new HashMap<String, Col.TimeUnit>();

        static {
            for (Col.TimeUnit c: values()) {
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
        public static Col.TimeUnit fromValue(String value) {
            Col.TimeUnit constant = constants.get(value);
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
        private static Map<String, Col.Type> constants = new HashMap<String, Col.Type>();

        static {
            for (Col.Type c: values()) {
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
        public static Col.Type fromValue(String value) {
            Col.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
