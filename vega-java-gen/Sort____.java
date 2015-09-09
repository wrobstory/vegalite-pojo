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
    "name",
    "aggregate",
    "reverse"
})
public class Sort____ {

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
    @JsonProperty("aggregate")
    private Sort____.Aggregate aggregate;
    @JsonProperty("reverse")
    private Boolean reverse = false;

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

    public Sort____ withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public Sort____.Aggregate getAggregate() {
        return aggregate;
    }

    /**
     * 
     * (Required)
     * 
     * @param aggregate
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public void setAggregate(Sort____.Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Sort____ withAggregate(Sort____.Aggregate aggregate) {
        this.aggregate = aggregate;
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

    public Sort____ withReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(aggregate).append(reverse).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sort____) == false) {
            return false;
        }
        Sort____ rhs = ((Sort____) other);
        return new EqualsBuilder().append(name, rhs.name).append(aggregate, rhs.aggregate).append(reverse, rhs.reverse).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Aggregate {

        AVG("avg"),
        SUM("sum"),
        MIN("min"),
        MAX("max"),
        COUNT("count");
        private final String value;
        private static Map<String, Sort____.Aggregate> constants = new HashMap<String, Sort____.Aggregate>();

        static {
            for (Sort____.Aggregate c: values()) {
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
        public static Sort____.Aggregate fromValue(String value) {
            Sort____.Aggregate constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
