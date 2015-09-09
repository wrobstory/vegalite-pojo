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
    "legend",
    "value",
    "filled",
    "sort"
})
public class Shape {

    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private Shape.Type type;
    @JsonProperty("timeUnit")
    private Shape.TimeUnit timeUnit;
    @JsonProperty("bin")
    private Bin______ bin = null;
    @JsonProperty("aggregate")
    private Shape.Aggregate aggregate;
    /**
     * Properties of a legend.
     * 
     */
    @JsonProperty("legend")
    private Legend__ legend;
    /**
     * Mark to be used.
     * 
     */
    @JsonProperty("value")
    private Shape.Value value = Shape.Value.fromValue("circle");
    /**
     * Whether the shape's color should be used as fill color instead of stroke color.
     * 
     */
    @JsonProperty("filled")
    private Boolean filled = false;
    @JsonProperty("sort")
    private List<Sort______> sort = new ArrayList<Sort______>();

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

    public Shape withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Shape.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Shape.Type type) {
        this.type = type;
    }

    public Shape withType(Shape.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public Shape.TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * 
     * @param timeUnit
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(Shape.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Shape withTimeUnit(Shape.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * 
     * @return
     *     The bin
     */
    @JsonProperty("bin")
    public Bin______ getBin() {
        return bin;
    }

    /**
     * 
     * @param bin
     *     The bin
     */
    @JsonProperty("bin")
    public void setBin(Bin______ bin) {
        this.bin = bin;
    }

    public Shape withBin(Bin______ bin) {
        this.bin = bin;
        return this;
    }

    /**
     * 
     * @return
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public Shape.Aggregate getAggregate() {
        return aggregate;
    }

    /**
     * 
     * @param aggregate
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public void setAggregate(Shape.Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Shape withAggregate(Shape.Aggregate aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    /**
     * Properties of a legend.
     * 
     * @return
     *     The legend
     */
    @JsonProperty("legend")
    public Legend__ getLegend() {
        return legend;
    }

    /**
     * Properties of a legend.
     * 
     * @param legend
     *     The legend
     */
    @JsonProperty("legend")
    public void setLegend(Legend__ legend) {
        this.legend = legend;
    }

    public Shape withLegend(Legend__ legend) {
        this.legend = legend;
        return this;
    }

    /**
     * Mark to be used.
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public Shape.Value getValue() {
        return value;
    }

    /**
     * Mark to be used.
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(Shape.Value value) {
        this.value = value;
    }

    public Shape withValue(Shape.Value value) {
        this.value = value;
        return this;
    }

    /**
     * Whether the shape's color should be used as fill color instead of stroke color.
     * 
     * @return
     *     The filled
     */
    @JsonProperty("filled")
    public Boolean getFilled() {
        return filled;
    }

    /**
     * Whether the shape's color should be used as fill color instead of stroke color.
     * 
     * @param filled
     *     The filled
     */
    @JsonProperty("filled")
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Shape withFilled(Boolean filled) {
        this.filled = filled;
        return this;
    }

    /**
     * 
     * @return
     *     The sort
     */
    @JsonProperty("sort")
    public List<Sort______> getSort() {
        return sort;
    }

    /**
     * 
     * @param sort
     *     The sort
     */
    @JsonProperty("sort")
    public void setSort(List<Sort______> sort) {
        this.sort = sort;
    }

    public Shape withSort(List<Sort______> sort) {
        this.sort = sort;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(type).append(timeUnit).append(bin).append(aggregate).append(legend).append(value).append(filled).append(sort).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shape) == false) {
            return false;
        }
        Shape rhs = ((Shape) other);
        return new EqualsBuilder().append(name, rhs.name).append(type, rhs.type).append(timeUnit, rhs.timeUnit).append(bin, rhs.bin).append(aggregate, rhs.aggregate).append(legend, rhs.legend).append(value, rhs.value).append(filled, rhs.filled).append(sort, rhs.sort).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Aggregate {

        COUNT("count");
        private final String value;
        private static Map<String, Shape.Aggregate> constants = new HashMap<String, Shape.Aggregate>();

        static {
            for (Shape.Aggregate c: values()) {
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
        public static Shape.Aggregate fromValue(String value) {
            Shape.Aggregate constant = constants.get(value);
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
        private static Map<String, Shape.TimeUnit> constants = new HashMap<String, Shape.TimeUnit>();

        static {
            for (Shape.TimeUnit c: values()) {
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
        public static Shape.TimeUnit fromValue(String value) {
            Shape.TimeUnit constant = constants.get(value);
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
        private static Map<String, Shape.Type> constants = new HashMap<String, Shape.Type>();

        static {
            for (Shape.Type c: values()) {
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
        public static Shape.Type fromValue(String value) {
            Shape.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum Value {

        CIRCLE("circle"),
        SQUARE("square"),
        CROSS("cross"),
        DIAMOND("diamond"),
        TRIANGLE_UP("triangle-up"),
        TRIANGLE_DOWN("triangle-down");
        private final String value;
        private static Map<String, Shape.Value> constants = new HashMap<String, Shape.Value>();

        static {
            for (Shape.Value c: values()) {
                constants.put(c.value, c);
            }
        }

        private Value(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Shape.Value fromValue(String value) {
            Shape.Value constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
