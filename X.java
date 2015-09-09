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
    "aggregate",
    "timeUnit",
    "bin",
    "scale",
    "axis",
    "band",
    "sort"
})
public class X {

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
    private X.Type type;
    @JsonProperty("aggregate")
    private X.Aggregate aggregate;
    @JsonProperty("timeUnit")
    private X.TimeUnit timeUnit;
    @JsonProperty("bin")
    private Bin bin = null;
    @JsonProperty("scale")
    private Scale scale;
    @JsonProperty("axis")
    private Axis axis;
    @JsonProperty("band")
    private Band band;
    @JsonProperty("sort")
    private List<Sort> sort = new ArrayList<Sort>();

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

    public X withName(String name) {
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
    public X.Type getType() {
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
    public void setType(X.Type type) {
        this.type = type;
    }

    public X withType(X.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public X.Aggregate getAggregate() {
        return aggregate;
    }

    /**
     * 
     * @param aggregate
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public void setAggregate(X.Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    public X withAggregate(X.Aggregate aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    /**
     * 
     * @return
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public X.TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * 
     * @param timeUnit
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(X.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public X withTimeUnit(X.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * 
     * @return
     *     The bin
     */
    @JsonProperty("bin")
    public Bin getBin() {
        return bin;
    }

    /**
     * 
     * @param bin
     *     The bin
     */
    @JsonProperty("bin")
    public void setBin(Bin bin) {
        this.bin = bin;
    }

    public X withBin(Bin bin) {
        this.bin = bin;
        return this;
    }

    /**
     * 
     * @return
     *     The scale
     */
    @JsonProperty("scale")
    public Scale getScale() {
        return scale;
    }

    /**
     * 
     * @param scale
     *     The scale
     */
    @JsonProperty("scale")
    public void setScale(Scale scale) {
        this.scale = scale;
    }

    public X withScale(Scale scale) {
        this.scale = scale;
        return this;
    }

    /**
     * 
     * @return
     *     The axis
     */
    @JsonProperty("axis")
    public Axis getAxis() {
        return axis;
    }

    /**
     * 
     * @param axis
     *     The axis
     */
    @JsonProperty("axis")
    public void setAxis(Axis axis) {
        this.axis = axis;
    }

    public X withAxis(Axis axis) {
        this.axis = axis;
        return this;
    }

    /**
     * 
     * @return
     *     The band
     */
    @JsonProperty("band")
    public Band getBand() {
        return band;
    }

    /**
     * 
     * @param band
     *     The band
     */
    @JsonProperty("band")
    public void setBand(Band band) {
        this.band = band;
    }

    public X withBand(Band band) {
        this.band = band;
        return this;
    }

    /**
     * 
     * @return
     *     The sort
     */
    @JsonProperty("sort")
    public List<Sort> getSort() {
        return sort;
    }

    /**
     * 
     * @param sort
     *     The sort
     */
    @JsonProperty("sort")
    public void setSort(List<Sort> sort) {
        this.sort = sort;
    }

    public X withSort(List<Sort> sort) {
        this.sort = sort;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(type).append(aggregate).append(timeUnit).append(bin).append(scale).append(axis).append(band).append(sort).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof X) == false) {
            return false;
        }
        X rhs = ((X) other);
        return new EqualsBuilder().append(name, rhs.name).append(type, rhs.type).append(aggregate, rhs.aggregate).append(timeUnit, rhs.timeUnit).append(bin, rhs.bin).append(scale, rhs.scale).append(axis, rhs.axis).append(band, rhs.band).append(sort, rhs.sort).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Aggregate {

        AVG("avg"),
        SUM("sum"),
        MEDIAN("median"),
        MIN("min"),
        MAX("max"),
        COUNT("count");
        private final String value;
        private static Map<String, X.Aggregate> constants = new HashMap<String, X.Aggregate>();

        static {
            for (X.Aggregate c: values()) {
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
        public static X.Aggregate fromValue(String value) {
            X.Aggregate constant = constants.get(value);
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
        private static Map<String, X.TimeUnit> constants = new HashMap<String, X.TimeUnit>();

        static {
            for (X.TimeUnit c: values()) {
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
        public static X.TimeUnit fromValue(String value) {
            X.TimeUnit constant = constants.get(value);
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
        private static Map<String, X.Type> constants = new HashMap<String, X.Type>();

        static {
            for (X.Type c: values()) {
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
        public static X.Type fromValue(String value) {
            X.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
