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
    "legend",
    "value",
    "sort"
})
public class Size {

    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private Size.Type type;
    @JsonProperty("aggregate")
    private Size.Aggregate aggregate;
    @JsonProperty("timeUnit")
    private Size.TimeUnit timeUnit;
    @JsonProperty("bin")
    private Bin____ bin = null;
    @JsonProperty("scale")
    private Scale__ scale;
    /**
     * Properties of a legend.
     * 
     */
    @JsonProperty("legend")
    private Legend legend;
    /**
     * Size of marks.
     * 
     */
    @JsonProperty("value")
    private Integer value = 30;
    @JsonProperty("sort")
    private List<Sort____> sort = new ArrayList<Sort____>();

    /**
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
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Size withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Size.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Size.Type type) {
        this.type = type;
    }

    public Size withType(Size.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public Size.Aggregate getAggregate() {
        return aggregate;
    }

    /**
     * 
     * @param aggregate
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public void setAggregate(Size.Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Size withAggregate(Size.Aggregate aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    /**
     * 
     * @return
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public Size.TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * 
     * @param timeUnit
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(Size.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Size withTimeUnit(Size.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * 
     * @return
     *     The bin
     */
    @JsonProperty("bin")
    public Bin____ getBin() {
        return bin;
    }

    /**
     * 
     * @param bin
     *     The bin
     */
    @JsonProperty("bin")
    public void setBin(Bin____ bin) {
        this.bin = bin;
    }

    public Size withBin(Bin____ bin) {
        this.bin = bin;
        return this;
    }

    /**
     * 
     * @return
     *     The scale
     */
    @JsonProperty("scale")
    public Scale__ getScale() {
        return scale;
    }

    /**
     * 
     * @param scale
     *     The scale
     */
    @JsonProperty("scale")
    public void setScale(Scale__ scale) {
        this.scale = scale;
    }

    public Size withScale(Scale__ scale) {
        this.scale = scale;
        return this;
    }

    /**
     * Properties of a legend.
     * 
     * @return
     *     The legend
     */
    @JsonProperty("legend")
    public Legend getLegend() {
        return legend;
    }

    /**
     * Properties of a legend.
     * 
     * @param legend
     *     The legend
     */
    @JsonProperty("legend")
    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public Size withLegend(Legend legend) {
        this.legend = legend;
        return this;
    }

    /**
     * Size of marks.
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    /**
     * Size of marks.
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    public Size withValue(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * 
     * @return
     *     The sort
     */
    @JsonProperty("sort")
    public List<Sort____> getSort() {
        return sort;
    }

    /**
     * 
     * @param sort
     *     The sort
     */
    @JsonProperty("sort")
    public void setSort(List<Sort____> sort) {
        this.sort = sort;
    }

    public Size withSort(List<Sort____> sort) {
        this.sort = sort;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(type).append(aggregate).append(timeUnit).append(bin).append(scale).append(legend).append(value).append(sort).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Size) == false) {
            return false;
        }
        Size rhs = ((Size) other);
        return new EqualsBuilder().append(name, rhs.name).append(type, rhs.type).append(aggregate, rhs.aggregate).append(timeUnit, rhs.timeUnit).append(bin, rhs.bin).append(scale, rhs.scale).append(legend, rhs.legend).append(value, rhs.value).append(sort, rhs.sort).isEquals();
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
        private static Map<String, Size.Aggregate> constants = new HashMap<String, Size.Aggregate>();

        static {
            for (Size.Aggregate c: values()) {
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
        public static Size.Aggregate fromValue(String value) {
            Size.Aggregate constant = constants.get(value);
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
        private static Map<String, Size.TimeUnit> constants = new HashMap<String, Size.TimeUnit>();

        static {
            for (Size.TimeUnit c: values()) {
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
        public static Size.TimeUnit fromValue(String value) {
            Size.TimeUnit constant = constants.get(value);
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
        private static Map<String, Size.Type> constants = new HashMap<String, Size.Type>();

        static {
            for (Size.Type c: values()) {
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
        public static Size.Type fromValue(String value) {
            Size.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
