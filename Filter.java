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
    "operands",
    "operator"
})
public class Filter {

    @JsonProperty("operands")
    private List<String> operands = new ArrayList<String>();
    @JsonProperty("operator")
    private Filter.Operator operator;

    /**
     * 
     * @return
     *     The operands
     */
    @JsonProperty("operands")
    public List<String> getOperands() {
        return operands;
    }

    /**
     * 
     * @param operands
     *     The operands
     */
    @JsonProperty("operands")
    public void setOperands(List<String> operands) {
        this.operands = operands;
    }

    public Filter withOperands(List<String> operands) {
        this.operands = operands;
        return this;
    }

    /**
     * 
     * @return
     *     The operator
     */
    @JsonProperty("operator")
    public Filter.Operator getOperator() {
        return operator;
    }

    /**
     * 
     * @param operator
     *     The operator
     */
    @JsonProperty("operator")
    public void setOperator(Filter.Operator operator) {
        this.operator = operator;
    }

    public Filter withOperator(Filter.Operator operator) {
        this.operator = operator;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(operands).append(operator).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Filter) == false) {
            return false;
        }
        Filter rhs = ((Filter) other);
        return new EqualsBuilder().append(operands, rhs.operands).append(operator, rhs.operator).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Operator {

        __EMPTY__(">", ">=", "=", "!=", "<", "<="),
        NOT_NULL("notNull");
        private final String value;
        private static Map<String, Filter.Operator> constants = new HashMap<String, Filter.Operator>();

        static {
            for (Filter.Operator c: values()) {
                constants.put(c.value, c);
            }
        }

        private Operator(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Filter.Operator fromValue(String value) {
            Filter.Operator constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
