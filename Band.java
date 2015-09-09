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
    "size",
    "padding"
})
public class Band {

    @JsonProperty("size")
    private Integer size;
    @JsonProperty("padding")
    private Integer padding = 1;

    /**
     * 
     * @return
     *     The size
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    public Band withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 
     * @return
     *     The padding
     */
    @JsonProperty("padding")
    public Integer getPadding() {
        return padding;
    }

    /**
     * 
     * @param padding
     *     The padding
     */
    @JsonProperty("padding")
    public void setPadding(Integer padding) {
        this.padding = padding;
    }

    public Band withPadding(Integer padding) {
        this.padding = padding;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(size).append(padding).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Band) == false) {
            return false;
        }
        Band rhs = ((Band) other);
        return new EqualsBuilder().append(size, rhs.size).append(padding, rhs.padding).isEquals();
    }

}
