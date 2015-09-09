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
    "formatType",
    "url",
    "values"
})
public class Data {

    @JsonProperty("formatType")
    private Data.FormatType formatType = Data.FormatType.fromValue("json");
    @JsonProperty("url")
    private String url;
    /**
     * Pass array of objects instead of a url to a file.
     * 
     */
    @JsonProperty("values")
    private List<Value> values = new ArrayList<Value>();

    /**
     * 
     * @return
     *     The formatType
     */
    @JsonProperty("formatType")
    public Data.FormatType getFormatType() {
        return formatType;
    }

    /**
     * 
     * @param formatType
     *     The formatType
     */
    @JsonProperty("formatType")
    public void setFormatType(Data.FormatType formatType) {
        this.formatType = formatType;
    }

    public Data withFormatType(Data.FormatType formatType) {
        this.formatType = formatType;
        return this;
    }

    /**
     * 
     * @return
     *     The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Data withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Pass array of objects instead of a url to a file.
     * 
     * @return
     *     The values
     */
    @JsonProperty("values")
    public List<Value> getValues() {
        return values;
    }

    /**
     * Pass array of objects instead of a url to a file.
     * 
     * @param values
     *     The values
     */
    @JsonProperty("values")
    public void setValues(List<Value> values) {
        this.values = values;
    }

    public Data withValues(List<Value> values) {
        this.values = values;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(formatType).append(url).append(values).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return new EqualsBuilder().append(formatType, rhs.formatType).append(url, rhs.url).append(values, rhs.values).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum FormatType {

        JSON("json"),
        CSV("csv");
        private final String value;
        private static Map<String, Data.FormatType> constants = new HashMap<String, Data.FormatType>();

        static {
            for (Data.FormatType c: values()) {
                constants.put(c.value, c);
            }
        }

        private FormatType(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Data.FormatType fromValue(String value) {
            Data.FormatType constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
