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
    "weight",
    "size",
    "family",
    "style"
})
public class Font {

    @JsonProperty("weight")
    private Font.Weight weight = Font.Weight.fromValue("normal");
    @JsonProperty("size")
    private Integer size = 10;
    @JsonProperty("family")
    private String family = "Helvetica Neue";
    @JsonProperty("style")
    private Font.Style style = Font.Style.fromValue("normal");

    /**
     * 
     * @return
     *     The weight
     */
    @JsonProperty("weight")
    public Font.Weight getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    @JsonProperty("weight")
    public void setWeight(Font.Weight weight) {
        this.weight = weight;
    }

    public Font withWeight(Font.Weight weight) {
        this.weight = weight;
        return this;
    }

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

    public Font withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 
     * @return
     *     The family
     */
    @JsonProperty("family")
    public String getFamily() {
        return family;
    }

    /**
     * 
     * @param family
     *     The family
     */
    @JsonProperty("family")
    public void setFamily(String family) {
        this.family = family;
    }

    public Font withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * 
     * @return
     *     The style
     */
    @JsonProperty("style")
    public Font.Style getStyle() {
        return style;
    }

    /**
     * 
     * @param style
     *     The style
     */
    @JsonProperty("style")
    public void setStyle(Font.Style style) {
        this.style = style;
    }

    public Font withStyle(Font.Style style) {
        this.style = style;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(weight).append(size).append(family).append(style).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Font) == false) {
            return false;
        }
        Font rhs = ((Font) other);
        return new EqualsBuilder().append(weight, rhs.weight).append(size, rhs.size).append(family, rhs.family).append(style, rhs.style).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Style {

        NORMAL("normal"),
        ITALIC("italic");
        private final String value;
        private static Map<String, Font.Style> constants = new HashMap<String, Font.Style>();

        static {
            for (Font.Style c: values()) {
                constants.put(c.value, c);
            }
        }

        private Style(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Font.Style fromValue(String value) {
            Font.Style constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum Weight {

        NORMAL("normal"),
        BOLD("bold");
        private final String value;
        private static Map<String, Font.Weight> constants = new HashMap<String, Font.Weight>();

        static {
            for (Font.Weight c: values()) {
                constants.put(c.value, c);
            }
        }

        private Weight(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Font.Weight fromValue(String value) {
            Font.Weight constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
