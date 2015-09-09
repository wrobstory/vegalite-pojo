import java.util.HashMap;
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
    "useRawDomain"
})
public class Scale__ {

    @JsonProperty("type")
    private Scale__.Type type = Scale__.Type.fromValue("linear");
    @JsonProperty("reverse")
    private Boolean reverse = false;
    /**
     * Include zero
     * 
     */
    @JsonProperty("zero")
    private Boolean zero = true;
    @JsonProperty("nice")
    private Scale__.Nice nice;
    /**
     * Use the raw data range as scale domain instead of aggregated data for aggregate axis. This option does not work with sum or count aggregateas they might have a substantially larger scale range.By default, use value from config.useRawDomain.
     * 
     */
    @JsonProperty("useRawDomain")
    private Boolean useRawDomain;

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Scale__.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Scale__.Type type) {
        this.type = type;
    }

    public Scale__ withType(Scale__.Type type) {
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

    public Scale__ withReverse(Boolean reverse) {
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

    public Scale__ withZero(Boolean zero) {
        this.zero = zero;
        return this;
    }

    /**
     * 
     * @return
     *     The nice
     */
    @JsonProperty("nice")
    public Scale__.Nice getNice() {
        return nice;
    }

    /**
     * 
     * @param nice
     *     The nice
     */
    @JsonProperty("nice")
    public void setNice(Scale__.Nice nice) {
        this.nice = nice;
    }

    public Scale__ withNice(Scale__.Nice nice) {
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

    public Scale__ withUseRawDomain(Boolean useRawDomain) {
        this.useRawDomain = useRawDomain;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(reverse).append(zero).append(nice).append(useRawDomain).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scale__) == false) {
            return false;
        }
        Scale__ rhs = ((Scale__) other);
        return new EqualsBuilder().append(type, rhs.type).append(reverse, rhs.reverse).append(zero, rhs.zero).append(nice, rhs.nice).append(useRawDomain, rhs.useRawDomain).isEquals();
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
        private static Map<String, Scale__.Nice> constants = new HashMap<String, Scale__.Nice>();

        static {
            for (Scale__.Nice c: values()) {
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
        public static Scale__.Nice fromValue(String value) {
            Scale__.Nice constant = constants.get(value);
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
        private static Map<String, Scale__.Type> constants = new HashMap<String, Scale__.Type>();

        static {
            for (Scale__.Type c: values()) {
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
        public static Scale__.Type fromValue(String value) {
            Scale__.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
