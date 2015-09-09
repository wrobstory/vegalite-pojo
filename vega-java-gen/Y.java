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
public class Y {

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
    private Y.Type type;
    @JsonProperty("aggregate")
    private Y.Aggregate aggregate;
    @JsonProperty("timeUnit")
    private Y.TimeUnit timeUnit;
    @JsonProperty("bin")
    private Bin_ bin = null;
    @JsonProperty("scale")
    private Scale_ scale;
    @JsonProperty("axis")
    private Axis_ axis;
    @JsonProperty("band")
    private Band_ band;
    @JsonProperty("sort")
    private List<Sort_> sort = new ArrayList<Sort_>();

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

    public Y withName(String name) {
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
    public Y.Type getType() {
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
    public void setType(Y.Type type) {
        this.type = type;
    }

    public Y withType(Y.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public Y.Aggregate getAggregate() {
        return aggregate;
    }

    /**
     * 
     * @param aggregate
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public void setAggregate(Y.Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Y withAggregate(Y.Aggregate aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    /**
     * 
     * @return
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public Y.TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * 
     * @param timeUnit
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(Y.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Y withTimeUnit(Y.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * 
     * @return
     *     The bin
     */
    @JsonProperty("bin")
    public Bin_ getBin() {
        return bin;
    }

    /**
     * 
     * @param bin
     *     The bin
     */
    @JsonProperty("bin")
    public void setBin(Bin_ bin) {
        this.bin = bin;
    }

    public Y withBin(Bin_ bin) {
        this.bin = bin;
        return this;
    }

    /**
     * 
     * @return
     *     The scale
     */
    @JsonProperty("scale")
    public Scale_ getScale() {
        return scale;
    }

    /**
     * 
     * @param scale
     *     The scale
     */
    @JsonProperty("scale")
    public void setScale(Scale_ scale) {
        this.scale = scale;
    }

    public Y withScale(Scale_ scale) {
        this.scale = scale;
        return this;
    }

    /**
     * 
     * @return
     *     The axis
     */
    @JsonProperty("axis")
    public Axis_ getAxis() {
        return axis;
    }

    /**
     * 
     * @param axis
     *     The axis
     */
    @JsonProperty("axis")
    public void setAxis(Axis_ axis) {
        this.axis = axis;
    }

    public Y withAxis(Axis_ axis) {
        this.axis = axis;
        return this;
    }

    /**
     * 
     * @return
     *     The band
     */
    @JsonProperty("band")
    public Band_ getBand() {
        return band;
    }

    /**
     * 
     * @param band
     *     The band
     */
    @JsonProperty("band")
    public void setBand(Band_ band) {
        this.band = band;
    }

    public Y withBand(Band_ band) {
        this.band = band;
        return this;
    }

    /**
     * 
     * @return
     *     The sort
     */
    @JsonProperty("sort")
    public List<Sort_> getSort() {
        return sort;
    }

    /**
     * 
     * @param sort
     *     The sort
     */
    @JsonProperty("sort")
    public void setSort(List<Sort_> sort) {
        this.sort = sort;
    }

    public Y withSort(List<Sort_> sort) {
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
        if ((other instanceof Y) == false) {
            return false;
        }
        Y rhs = ((Y) other);
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
        private static Map<String, Y.Aggregate> constants = new HashMap<String, Y.Aggregate>();

        static {
            for (Y.Aggregate c: values()) {
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
        public static Y.Aggregate fromValue(String value) {
            Y.Aggregate constant = constants.get(value);
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
        private static Map<String, Y.TimeUnit> constants = new HashMap<String, Y.TimeUnit>();

        static {
            for (Y.TimeUnit c: values()) {
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
        public static Y.TimeUnit fromValue(String value) {
            Y.TimeUnit constant = constants.get(value);
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
        private static Map<String, Y.Type> constants = new HashMap<String, Y.Type>();

        static {
            for (Y.Type c: values()) {
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
        public static Y.Type fromValue(String value) {
            Y.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
