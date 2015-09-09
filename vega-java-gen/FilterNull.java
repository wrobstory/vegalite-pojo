import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "O",
    "Q",
    "T"
})
public class FilterNull {

    @JsonProperty("O")
    private Boolean O = false;
    @JsonProperty("Q")
    private Boolean Q = true;
    @JsonProperty("T")
    private Boolean T = true;

    /**
     * 
     * @return
     *     The O
     */
    @JsonProperty("O")
    public Boolean getO() {
        return O;
    }

    /**
     * 
     * @param O
     *     The O
     */
    @JsonProperty("O")
    public void setO(Boolean O) {
        this.O = O;
    }

    public FilterNull withO(Boolean O) {
        this.O = O;
        return this;
    }

    /**
     * 
     * @return
     *     The Q
     */
    @JsonProperty("Q")
    public Boolean getQ() {
        return Q;
    }

    /**
     * 
     * @param Q
     *     The Q
     */
    @JsonProperty("Q")
    public void setQ(Boolean Q) {
        this.Q = Q;
    }

    public FilterNull withQ(Boolean Q) {
        this.Q = Q;
        return this;
    }

    /**
     * 
     * @return
     *     The T
     */
    @JsonProperty("T")
    public Boolean getT() {
        return T;
    }

    /**
     * 
     * @param T
     *     The T
     */
    @JsonProperty("T")
    public void setT(Boolean T) {
        this.T = T;
    }

    public FilterNull withT(Boolean T) {
        this.T = T;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(O).append(Q).append(T).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FilterNull) == false) {
            return false;
        }
        FilterNull rhs = ((FilterNull) other);
        return new EqualsBuilder().append(O, rhs.O).append(Q, rhs.Q).append(T, rhs.T).isEquals();
    }

}
