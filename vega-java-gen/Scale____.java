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
public class Scale____ {

    @JsonProperty("type")
    private Scale____.Type type = Scale____.Type.fromValue("linear");
    @JsonProperty("reverse")
    private Boolean reverse = false;
    /**
     * Include zero
     * 
     */
    @JsonProperty("zero")
    private Boolean zero = true;
    @JsonProperty("nice")
    private Scale____.Nice nice;
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
    public Scale____.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Scale____.Type type) {
        this.type = type;
    }

    public Scale____ withType(Scale____.Type type) {
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

    public Scale____ withReverse(Boolean reverse) {
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

    public Scale____ withZero(Boolean zero) {
        this.zero = zero;
        return this;
    }

    /**
     * 
     * @return
     *     The nice
     */
    @JsonProperty("nice")
    public Scale____.Nice getNice() {
        return nice;
    }

    /**
     * 
     * @param nice
     *     The nice
     */
    @JsonProperty("nice")
    public void setNice(Scale____.Nice nice) {
        this.nice = nice;
    }

    public Scale____ withNice(Scale____.Nice nice) {
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

    public Scale____ withUseRawDomain(Boolean useRawDomain) {
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
        if ((other instanceof Scale____) == false) {
            return false;
        }
        Scale____ rhs = ((Scale____) other);
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
        private static Map<String, Scale____.Nice> constants = new HashMap<String, Scale____.Nice>();

        static {
            for (Scale____.Nice c: values()) {
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
        public static Scale____.Nice fromValue(String value) {
            Scale____.Nice constant = constants.get(value);
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
        private static Map<String, Scale____.Type> constants = new HashMap<String, Scale____.Type>();

        static {
            for (Scale____.Type c: values()) {
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
        public static Scale____.Type fromValue(String value) {
            Scale____.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
