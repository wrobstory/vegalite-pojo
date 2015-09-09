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
    "align",
    "baseline",
    "color",
    "margin",
    "placeholder",
    "font",
    "format",
    "sort"
})
public class Text {

    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private Text.Type type;
    @JsonProperty("aggregate")
    private Text.Aggregate aggregate;
    @JsonProperty("timeUnit")
    private Text.TimeUnit timeUnit;
    @JsonProperty("bin")
    private Bin_______ bin = null;
    @JsonProperty("scale")
    private Scale____ scale;
    @JsonProperty("align")
    private String align = "right";
    @JsonProperty("baseline")
    private String baseline = "middle";
    @JsonProperty("color")
    private String color = "#000000";
    @JsonProperty("margin")
    private Integer margin = 4;
    @JsonProperty("placeholder")
    private String placeholder = "Abc";
    @JsonProperty("font")
    private Font font;
    /**
     * The formatting pattern for text value. If not undefined, this will be determined by small/largeNumberFormat and the max value of the field.
     * 
     */
    @JsonProperty("format")
    private String format;
    @JsonProperty("sort")
    private List<Sort_______> sort = new ArrayList<Sort_______>();

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

    public Text withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Text.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Text.Type type) {
        this.type = type;
    }

    public Text withType(Text.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public Text.Aggregate getAggregate() {
        return aggregate;
    }

    /**
     * 
     * @param aggregate
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public void setAggregate(Text.Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Text withAggregate(Text.Aggregate aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    /**
     * 
     * @return
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public Text.TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * 
     * @param timeUnit
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(Text.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Text withTimeUnit(Text.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * 
     * @return
     *     The bin
     */
    @JsonProperty("bin")
    public Bin_______ getBin() {
        return bin;
    }

    /**
     * 
     * @param bin
     *     The bin
     */
    @JsonProperty("bin")
    public void setBin(Bin_______ bin) {
        this.bin = bin;
    }

    public Text withBin(Bin_______ bin) {
        this.bin = bin;
        return this;
    }

    /**
     * 
     * @return
     *     The scale
     */
    @JsonProperty("scale")
    public Scale____ getScale() {
        return scale;
    }

    /**
     * 
     * @param scale
     *     The scale
     */
    @JsonProperty("scale")
    public void setScale(Scale____ scale) {
        this.scale = scale;
    }

    public Text withScale(Scale____ scale) {
        this.scale = scale;
        return this;
    }

    /**
     * 
     * @return
     *     The align
     */
    @JsonProperty("align")
    public String getAlign() {
        return align;
    }

    /**
     * 
     * @param align
     *     The align
     */
    @JsonProperty("align")
    public void setAlign(String align) {
        this.align = align;
    }

    public Text withAlign(String align) {
        this.align = align;
        return this;
    }

    /**
     * 
     * @return
     *     The baseline
     */
    @JsonProperty("baseline")
    public String getBaseline() {
        return baseline;
    }

    /**
     * 
     * @param baseline
     *     The baseline
     */
    @JsonProperty("baseline")
    public void setBaseline(String baseline) {
        this.baseline = baseline;
    }

    public Text withBaseline(String baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * 
     * @return
     *     The color
     */
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    /**
     * 
     * @param color
     *     The color
     */
    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    public Text withColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * 
     * @return
     *     The margin
     */
    @JsonProperty("margin")
    public Integer getMargin() {
        return margin;
    }

    /**
     * 
     * @param margin
     *     The margin
     */
    @JsonProperty("margin")
    public void setMargin(Integer margin) {
        this.margin = margin;
    }

    public Text withMargin(Integer margin) {
        this.margin = margin;
        return this;
    }

    /**
     * 
     * @return
     *     The placeholder
     */
    @JsonProperty("placeholder")
    public String getPlaceholder() {
        return placeholder;
    }

    /**
     * 
     * @param placeholder
     *     The placeholder
     */
    @JsonProperty("placeholder")
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public Text withPlaceholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    /**
     * 
     * @return
     *     The font
     */
    @JsonProperty("font")
    public Font getFont() {
        return font;
    }

    /**
     * 
     * @param font
     *     The font
     */
    @JsonProperty("font")
    public void setFont(Font font) {
        this.font = font;
    }

    public Text withFont(Font font) {
        this.font = font;
        return this;
    }

    /**
     * The formatting pattern for text value. If not undefined, this will be determined by small/largeNumberFormat and the max value of the field.
     * 
     * @return
     *     The format
     */
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     * The formatting pattern for text value. If not undefined, this will be determined by small/largeNumberFormat and the max value of the field.
     * 
     * @param format
     *     The format
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    public Text withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 
     * @return
     *     The sort
     */
    @JsonProperty("sort")
    public List<Sort_______> getSort() {
        return sort;
    }

    /**
     * 
     * @param sort
     *     The sort
     */
    @JsonProperty("sort")
    public void setSort(List<Sort_______> sort) {
        this.sort = sort;
    }

    public Text withSort(List<Sort_______> sort) {
        this.sort = sort;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(type).append(aggregate).append(timeUnit).append(bin).append(scale).append(align).append(baseline).append(color).append(margin).append(placeholder).append(font).append(format).append(sort).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Text) == false) {
            return false;
        }
        Text rhs = ((Text) other);
        return new EqualsBuilder().append(name, rhs.name).append(type, rhs.type).append(aggregate, rhs.aggregate).append(timeUnit, rhs.timeUnit).append(bin, rhs.bin).append(scale, rhs.scale).append(align, rhs.align).append(baseline, rhs.baseline).append(color, rhs.color).append(margin, rhs.margin).append(placeholder, rhs.placeholder).append(font, rhs.font).append(format, rhs.format).append(sort, rhs.sort).isEquals();
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
        private static Map<String, Text.Aggregate> constants = new HashMap<String, Text.Aggregate>();

        static {
            for (Text.Aggregate c: values()) {
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
        public static Text.Aggregate fromValue(String value) {
            Text.Aggregate constant = constants.get(value);
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
        private static Map<String, Text.TimeUnit> constants = new HashMap<String, Text.TimeUnit>();

        static {
            for (Text.TimeUnit c: values()) {
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
        public static Text.TimeUnit fromValue(String value) {
            Text.TimeUnit constant = constants.get(value);
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
        private static Map<String, Text.Type> constants = new HashMap<String, Text.Type>();

        static {
            for (Text.Type c: values()) {
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
        public static Text.Type fromValue(String value) {
            Text.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
