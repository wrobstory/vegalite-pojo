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
    "maxbins"
})
public class Bin___ {

    /**
     * Maximum number of bins.
     * 
     */
    @JsonProperty("maxbins")
    private Integer maxbins = 15;

    /**
     * Maximum number of bins.
     * 
     * @return
     *     The maxbins
     */
    @JsonProperty("maxbins")
    public Integer getMaxbins() {
        return maxbins;
    }

    /**
     * Maximum number of bins.
     * 
     * @param maxbins
     *     The maxbins
     */
    @JsonProperty("maxbins")
    public void setMaxbins(Integer maxbins) {
        this.maxbins = maxbins;
    }

    public Bin___ withMaxbins(Integer maxbins) {
        this.maxbins = maxbins;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxbins).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bin___) == false) {
            return false;
        }
        Bin___ rhs = ((Bin___) other);
        return new EqualsBuilder().append(maxbins, rhs.maxbins).isEquals();
    }

}