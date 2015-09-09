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
    "opacity",
    "sort"
})
public class Color {

    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private Color.Type type;
    @JsonProperty("aggregate")
    private Color.Aggregate aggregate;
    @JsonProperty("timeUnit")
    private Color.TimeUnit timeUnit;
    @JsonProperty("bin")
    private Bin_____ bin = null;
    @JsonProperty("scale")
    private Scale___ scale;
    /**
     * Properties of a legend.
     * 
     */
    @JsonProperty("legend")
    private Legend_ legend;
    /**
     * Color to be used for marks.
     * 
     */
    @JsonProperty("value")
    private String value = "#4682b4";
    @JsonProperty("opacity")
    private Double opacity;
    @JsonProperty("sort")
    private List<Sort_____> sort = new ArrayList<Sort_____>();

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

    public Color withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Color.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Color.Type type) {
        this.type = type;
    }

    public Color withType(Color.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public Color.Aggregate getAggregate() {
        return aggregate;
    }

    /**
     * 
     * @param aggregate
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public void setAggregate(Color.Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Color withAggregate(Color.Aggregate aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    /**
     * 
     * @return
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public Color.TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * 
     * @param timeUnit
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(Color.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Color withTimeUnit(Color.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * 
     * @return
     *     The bin
     */
    @JsonProperty("bin")
    public Bin_____ getBin() {
        return bin;
    }

    /**
     * 
     * @param bin
     *     The bin
     */
    @JsonProperty("bin")
    public void setBin(Bin_____ bin) {
        this.bin = bin;
    }

    public Color withBin(Bin_____ bin) {
        this.bin = bin;
        return this;
    }

    /**
     * 
     * @return
     *     The scale
     */
    @JsonProperty("scale")
    public Scale___ getScale() {
        return scale;
    }

    /**
     * 
     * @param scale
     *     The scale
     */
    @JsonProperty("scale")
    public void setScale(Scale___ scale) {
        this.scale = scale;
    }

    public Color withScale(Scale___ scale) {
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
    public Legend_ getLegend() {
        return legend;
    }

    /**
     * Properties of a legend.
     * 
     * @param legend
     *     The legend
     */
    @JsonProperty("legend")
    public void setLegend(Legend_ legend) {
        this.legend = legend;
    }

    public Color withLegend(Legend_ legend) {
        this.legend = legend;
        return this;
    }

    /**
     * Color to be used for marks.
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Color to be used for marks.
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Color withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 
     * @return
     *     The opacity
     */
    @JsonProperty("opacity")
    public Double getOpacity() {
        return opacity;
    }

    /**
     * 
     * @param opacity
     *     The opacity
     */
    @JsonProperty("opacity")
    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }

    public Color withOpacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    /**
     * 
     * @return
     *     The sort
     */
    @JsonProperty("sort")
    public List<Sort_____> getSort() {
        return sort;
    }

    /**
     * 
     * @param sort
     *     The sort
     */
    @JsonProperty("sort")
    public void setSort(List<Sort_____> sort) {
        this.sort = sort;
    }

    public Color withSort(List<Sort_____> sort) {
        this.sort = sort;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(type).append(aggregate).append(timeUnit).append(bin).append(scale).append(legend).append(value).append(opacity).append(sort).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Color) == false) {
            return false;
        }
        Color rhs = ((Color) other);
        return new EqualsBuilder().append(name, rhs.name).append(type, rhs.type).append(aggregate, rhs.aggregate).append(timeUnit, rhs.timeUnit).append(bin, rhs.bin).append(scale, rhs.scale).append(legend, rhs.legend).append(value, rhs.value).append(opacity, rhs.opacity).append(sort, rhs.sort).isEquals();
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
        private static Map<String, Color.Aggregate> constants = new HashMap<String, Color.Aggregate>();

        static {
            for (Color.Aggregate c: values()) {
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
        public static Color.Aggregate fromValue(String value) {
            Color.Aggregate constant = constants.get(value);
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
        private static Map<String, Color.TimeUnit> constants = new HashMap<String, Color.TimeUnit>();

        static {
            for (Color.TimeUnit c: values()) {
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
        public static Color.TimeUnit fromValue(String value) {
            Color.TimeUnit constant = constants.get(value);
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
        private static Map<String, Color.Type> constants = new HashMap<String, Color.Type>();

        static {
            for (Color.Type c: values()) {
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
        public static Color.Type fromValue(String value) {
            Color.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
