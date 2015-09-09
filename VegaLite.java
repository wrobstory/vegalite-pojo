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


/**
 * Schema for Vega-lite specification
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "data",
    "marktype",
    "encoding",
    "filter",
    "config"
})
public class VegaLite {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    private Data data;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("marktype")
    private VegaLite.Marktype marktype;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("encoding")
    private Encoding encoding;
    @JsonProperty("filter")
    private List<Filter> filter = new ArrayList<Filter>();
    @JsonProperty("config")
    private Config config;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The data
     */
    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    /**
     * 
     * (Required)
     * 
     * @param data
     *     The data
     */
    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    public VegaLite withData(Data data) {
        this.data = data;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The marktype
     */
    @JsonProperty("marktype")
    public VegaLite.Marktype getMarktype() {
        return marktype;
    }

    /**
     * 
     * (Required)
     * 
     * @param marktype
     *     The marktype
     */
    @JsonProperty("marktype")
    public void setMarktype(VegaLite.Marktype marktype) {
        this.marktype = marktype;
    }

    public VegaLite withMarktype(VegaLite.Marktype marktype) {
        this.marktype = marktype;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The encoding
     */
    @JsonProperty("encoding")
    public Encoding getEncoding() {
        return encoding;
    }

    /**
     * 
     * (Required)
     * 
     * @param encoding
     *     The encoding
     */
    @JsonProperty("encoding")
    public void setEncoding(Encoding encoding) {
        this.encoding = encoding;
    }

    public VegaLite withEncoding(Encoding encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * 
     * @return
     *     The filter
     */
    @JsonProperty("filter")
    public List<Filter> getFilter() {
        return filter;
    }

    /**
     * 
     * @param filter
     *     The filter
     */
    @JsonProperty("filter")
    public void setFilter(List<Filter> filter) {
        this.filter = filter;
    }

    public VegaLite withFilter(List<Filter> filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 
     * @return
     *     The config
     */
    @JsonProperty("config")
    public Config getConfig() {
        return config;
    }

    /**
     * 
     * @param config
     *     The config
     */
    @JsonProperty("config")
    public void setConfig(Config config) {
        this.config = config;
    }

    public VegaLite withConfig(Config config) {
        this.config = config;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(data).append(marktype).append(encoding).append(filter).append(config).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VegaLite) == false) {
            return false;
        }
        VegaLite rhs = ((VegaLite) other);
        return new EqualsBuilder().append(data, rhs.data).append(marktype, rhs.marktype).append(encoding, rhs.encoding).append(filter, rhs.filter).append(config, rhs.config).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Marktype {

        POINT("point"),
        TICK("tick"),
        BAR("bar"),
        LINE("line"),
        AREA("area"),
        CIRCLE("circle"),
        SQUARE("square"),
        TEXT("text");
        private final String value;
        private static Map<String, VegaLite.Marktype> constants = new HashMap<String, VegaLite.Marktype>();

        static {
            for (VegaLite.Marktype c: values()) {
                constants.put(c.value, c);
            }
        }

        private Marktype(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static VegaLite.Marktype fromValue(String value) {
            VegaLite.Marktype constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
