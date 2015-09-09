import java.util.ArrayList;
import java.util.Arrays;
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
    "type",
    "reverse",
    "zero",
    "nice",
    "useRawDomain",
    "range",
    "c10palette",
    "c20palette",
    "ordinalPalette",
    "quantitativeRange"
})
public class Scale___ {

    @JsonProperty("type")
    private Scale___.Type type = Scale___.Type.fromValue("linear");
    @JsonProperty("reverse")
    private Boolean reverse = false;
    /**
     * Include zero
     * 
     */
    @JsonProperty("zero")
    private Boolean zero = true;
    @JsonProperty("nice")
    private Scale___.Nice nice;
    /**
     * Use the raw data range as scale domain instead of aggregated data for aggregate axis. This option does not work with sum or count aggregateas they might have a substantially larger scale range.By default, use value from config.useRawDomain.
     * 
     */
    @JsonProperty("useRawDomain")
    private Boolean useRawDomain;
    /**
     * Color palette, if undefined vega-lite will use data propertyto pick one from c10palette, c20palette, or ordinalPalette.
     * 
     */
    @JsonProperty("range")
    private String range;
    @JsonProperty("c10palette")
    private Scale___.C10palette c10palette = Scale___.C10palette.fromValue("category10");
    @JsonProperty("c20palette")
    private Scale___.C20palette c20palette = Scale___.C20palette.fromValue("category20");
    /**
     * Color palette to encode ordinal variables.
     * 
     */
    @JsonProperty("ordinalPalette")
    private Scale___.OrdinalPalette ordinalPalette;
    /**
     * Color range to encode quantitative variables.
     * 
     */
    @JsonProperty("quantitativeRange")
    private List<String> quantitativeRange = new ArrayList<String>(Arrays.asList("#AFC6A3", "#09622A"));

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Scale___.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Scale___.Type type) {
        this.type = type;
    }

    public Scale___ withType(Scale___.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The reverse
     */
    @JsonProperty("reverse")
    public Boolean getReverse() {
        return reverse;
    }

    /**
     * 
     * @param reverse
     *     The reverse
     */
    @JsonProperty("reverse")
    public void setReverse(Boolean reverse) {
        this.reverse = reverse;
    }

    public Scale___ withReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }

    /**
     * Include zero
     * 
     * @return
     *     The zero
     */
    @JsonProperty("zero")
    public Boolean getZero() {
        return zero;
    }

    /**
     * Include zero
     * 
     * @param zero
     *     The zero
     */
    @JsonProperty("zero")
    public void setZero(Boolean zero) {
        this.zero = zero;
    }

    public Scale___ withZero(Boolean zero) {
        this.zero = zero;
        return this;
    }

    /**
     * 
     * @return
     *     The nice
     */
    @JsonProperty("nice")
    public Scale___.Nice getNice() {
        return nice;
    }

    /**
     * 
     * @param nice
     *     The nice
     */
    @JsonProperty("nice")
    public void setNice(Scale___.Nice nice) {
        this.nice = nice;
    }

    public Scale___ withNice(Scale___.Nice nice) {
        this.nice = nice;
        return this;
    }

    /**
     * Use the raw data range as scale domain instead of aggregated data for aggregate axis. This option does not work with sum or count aggregateas they might have a substantially larger scale range.By default, use value from config.useRawDomain.
     * 
     * @return
     *     The useRawDomain
     */
    @JsonProperty("useRawDomain")
    public Boolean getUseRawDomain() {
        return useRawDomain;
    }

    /**
     * Use the raw data range as scale domain instead of aggregated data for aggregate axis. This option does not work with sum or count aggregateas they might have a substantially larger scale range.By default, use value from config.useRawDomain.
     * 
     * @param useRawDomain
     *     The useRawDomain
     */
    @JsonProperty("useRawDomain")
    public void setUseRawDomain(Boolean useRawDomain) {
        this.useRawDomain = useRawDomain;
    }

    public Scale___ withUseRawDomain(Boolean useRawDomain) {
        this.useRawDomain = useRawDomain;
        return this;
    }

    /**
     * Color palette, if undefined vega-lite will use data propertyto pick one from c10palette, c20palette, or ordinalPalette.
     * 
     * @return
     *     The range
     */
    @JsonProperty("range")
    public String getRange() {
        return range;
    }

    /**
     * Color palette, if undefined vega-lite will use data propertyto pick one from c10palette, c20palette, or ordinalPalette.
     * 
     * @param range
     *     The range
     */
    @JsonProperty("range")
    public void setRange(String range) {
        this.range = range;
    }

    public Scale___ withRange(String range) {
        this.range = range;
        return this;
    }

    /**
     * 
     * @return
     *     The c10palette
     */
    @JsonProperty("c10palette")
    public Scale___.C10palette getC10palette() {
        return c10palette;
    }

    /**
     * 
     * @param c10palette
     *     The c10palette
     */
    @JsonProperty("c10palette")
    public void setC10palette(Scale___.C10palette c10palette) {
        this.c10palette = c10palette;
    }

    public Scale___ withC10palette(Scale___.C10palette c10palette) {
        this.c10palette = c10palette;
        return this;
    }

    /**
     * 
     * @return
     *     The c20palette
     */
    @JsonProperty("c20palette")
    public Scale___.C20palette getC20palette() {
        return c20palette;
    }

    /**
     * 
     * @param c20palette
     *     The c20palette
     */
    @JsonProperty("c20palette")
    public void setC20palette(Scale___.C20palette c20palette) {
        this.c20palette = c20palette;
    }

    public Scale___ withC20palette(Scale___.C20palette c20palette) {
        this.c20palette = c20palette;
        return this;
    }

    /**
     * Color palette to encode ordinal variables.
     * 
     * @return
     *     The ordinalPalette
     */
    @JsonProperty("ordinalPalette")
    public Scale___.OrdinalPalette getOrdinalPalette() {
        return ordinalPalette;
    }

    /**
     * Color palette to encode ordinal variables.
     * 
     * @param ordinalPalette
     *     The ordinalPalette
     */
    @JsonProperty("ordinalPalette")
    public void setOrdinalPalette(Scale___.OrdinalPalette ordinalPalette) {
        this.ordinalPalette = ordinalPalette;
    }

    public Scale___ withOrdinalPalette(Scale___.OrdinalPalette ordinalPalette) {
        this.ordinalPalette = ordinalPalette;
        return this;
    }

    /**
     * Color range to encode quantitative variables.
     * 
     * @return
     *     The quantitativeRange
     */
    @JsonProperty("quantitativeRange")
    public List<String> getQuantitativeRange() {
        return quantitativeRange;
    }

    /**
     * Color range to encode quantitative variables.
     * 
     * @param quantitativeRange
     *     The quantitativeRange
     */
    @JsonProperty("quantitativeRange")
    public void setQuantitativeRange(List<String> quantitativeRange) {
        this.quantitativeRange = quantitativeRange;
    }

    public Scale___ withQuantitativeRange(List<String> quantitativeRange) {
        this.quantitativeRange = quantitativeRange;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(reverse).append(zero).append(nice).append(useRawDomain).append(range).append(c10palette).append(c20palette).append(ordinalPalette).append(quantitativeRange).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scale___) == false) {
            return false;
        }
        Scale___ rhs = ((Scale___) other);
        return new EqualsBuilder().append(type, rhs.type).append(reverse, rhs.reverse).append(zero, rhs.zero).append(nice, rhs.nice).append(useRawDomain, rhs.useRawDomain).append(range, rhs.range).append(c10palette, rhs.c10palette).append(c20palette, rhs.c20palette).append(ordinalPalette, rhs.ordinalPalette).append(quantitativeRange, rhs.quantitativeRange).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum C10palette {

        CATEGORY_10("category10"),
        CATEGORY_10_K("category10k"),
        PASTEL_1("Pastel1"),
        PASTEL_2("Pastel2"),
        SET_1("Set1"),
        SET_2("Set2"),
        SET_3("Set3");
        private final String value;
        private static Map<String, Scale___.C10palette> constants = new HashMap<String, Scale___.C10palette>();

        static {
            for (Scale___.C10palette c: values()) {
                constants.put(c.value, c);
            }
        }

        private C10palette(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Scale___.C10palette fromValue(String value) {
            Scale___.C10palette constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum C20palette {

        CATEGORY_20("category20"),
        CATEGORY_20_B("category20b"),
        CATEGORY_20_C("category20c");
        private final String value;
        private static Map<String, Scale___.C20palette> constants = new HashMap<String, Scale___.C20palette>();

        static {
            for (Scale___.C20palette c: values()) {
                constants.put(c.value, c);
            }
        }

        private C20palette(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Scale___.C20palette fromValue(String value) {
            Scale___.C20palette constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum Nice {

        SECOND("second"),
        MINUTE("minute"),
        HOUR("hour"),
        DAY("day"),
        WEEK("week"),
        MONTH("month"),
        YEAR("year");
        private final String value;
        private static Map<String, Scale___.Nice> constants = new HashMap<String, Scale___.Nice>();

        static {
            for (Scale___.Nice c: values()) {
                constants.put(c.value, c);
            }
        }

        private Nice(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Scale___.Nice fromValue(String value) {
            Scale___.Nice constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum OrdinalPalette {

        YL_GN("YlGn"),
        YL_GN_BU("YlGnBu"),
        GN_BU("GnBu"),
        BU_GN("BuGn"),
        PU_BU_GN("PuBuGn"),
        PU_BU("PuBu"),
        BU_PU("BuPu"),
        RD_PU("RdPu"),
        PU_RD("PuRd"),
        OR_RD("OrRd"),
        YL_OR_RD("YlOrRd"),
        YL_OR_BR("YlOrBr"),
        PURPLES("Purples"),
        BLUES("Blues"),
        GREENS("Greens"),
        ORANGES("Oranges"),
        REDS("Reds"),
        GREYS("Greys"),
        PU_OR("PuOr"),
        BR_BG("BrBG"),
        PR_GN("PRGn"),
        PI_YG("PiYG"),
        RD_BU("RdBu"),
        RD_GY("RdGy"),
        RD_YL_BU("RdYlBu"),
        SPECTRAL("Spectral"),
        RD_YL_GN("RdYlGn"),
        ACCENT("Accent"),
        DARK_2("Dark2"),
        PAIRED("Paired"),
        PASTEL_1("Pastel1"),
        PASTEL_2("Pastel2"),
        SET_1("Set1"),
        SET_2("Set2"),
        SET_3("Set3");
        private final String value;
        private static Map<String, Scale___.OrdinalPalette> constants = new HashMap<String, Scale___.OrdinalPalette>();

        static {
            for (Scale___.OrdinalPalette c: values()) {
                constants.put(c.value, c);
            }
        }

        private OrdinalPalette(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Scale___.OrdinalPalette fromValue(String value) {
            Scale___.OrdinalPalette constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        LINEAR("linear"),
        LOG("log"),
        POW("pow"),
        SQRT("sqrt"),
        QUANTILE("quantile");
        private final String value;
        private static Map<String, Scale___.Type> constants = new HashMap<String, Scale___.Type>();

        static {
            for (Scale___.Type c: values()) {
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
        public static Scale___.Type fromValue(String value) {
            Scale___.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
