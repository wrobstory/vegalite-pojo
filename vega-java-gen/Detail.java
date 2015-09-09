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
    "name",
    "type",
    "timeUnit",
    "bin",
    "aggregate",
    "sort"
})
public class Detail {

    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private Detail.Type type;
    @JsonProperty("timeUnit")
    private Detail.TimeUnit timeUnit;
    @JsonProperty("bin")
    private Bin________ bin = null;
    @JsonProperty("aggregate")
    private Detail.Aggregate aggregate;
    @JsonProperty("sort")
    private List<Sort________> sort = new ArrayList<Sort________>();

    /**
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
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Detail withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public Detail.Type getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(Detail.Type type) {
        this.type = type;
    }

    public Detail withType(Detail.Type type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public Detail.TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * 
     * @param timeUnit
     *     The timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(Detail.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Detail withTimeUnit(Detail.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * 
     * @return
     *     The bin
     */
    @JsonProperty("bin")
    public Bin________ getBin() {
        return bin;
    }

    /**
     * 
     * @param bin
     *     The bin
     */
    @JsonProperty("bin")
    public void setBin(Bin________ bin) {
        this.bin = bin;
    }

    public Detail withBin(Bin________ bin) {
        this.bin = bin;
        return this;
    }

    /**
     * 
     * @return
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public Detail.Aggregate getAggregate() {
        return aggregate;
    }

    /**
     * 
     * @param aggregate
     *     The aggregate
     */
    @JsonProperty("aggregate")
    public void setAggregate(Detail.Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Detail withAggregate(Detail.Aggregate aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    /**
     * 
     * @return
     *     The sort
     */
    @JsonProperty("sort")
    public List<Sort________> getSort() {
        return sort;
    }

    /**
     * 
     * @param sort
     *     The sort
     */
    @JsonProperty("sort")
    public void setSort(List<Sort________> sort) {
        this.sort = sort;
    }

    public Detail withSort(List<Sort________> sort) {
        this.sort = sort;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(type).append(timeUnit).append(bin).append(aggregate).append(sort).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Detail) == false) {
            return false;
        }
        Detail rhs = ((Detail) other);
        return new EqualsBuilder().append(name, rhs.name).append(type, rhs.type).append(timeUnit, rhs.timeUnit).append(bin, rhs.bin).append(aggregate, rhs.aggregate).append(sort, rhs.sort).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Aggregate {

        COUNT("count");
        private final String value;
        private static Map<String, Detail.Aggregate> constants = new HashMap<String, Detail.Aggregate>();

        static {
            for (Detail.Aggregate c: values()) {
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
        public static Detail.Aggregate fromValue(String value) {
            Detail.Aggregate constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum TimeUnit {

        YEAR("year"),
        MONTH("month"),
        DAY("day"),
        DATE("date"),
        HOURS("hours"),
        MINUTES("minutes"),
        SECONDS("seconds");
        private final String value;
        private static Map<String, Detail.TimeUnit> constants = new HashMap<String, Detail.TimeUnit>();

        static {
            for (Detail.TimeUnit c: values()) {
                constants.put(c.value, c);
            }
        }

        private TimeUnit(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Detail.TimeUnit fromValue(String value) {
            Detail.TimeUnit constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum Type {

        N("N"),
        O("O"),
        Q("Q"),
        T("T");
        private final String value;
        private static Map<String, Detail.Type> constants = new HashMap<String, Detail.Type>();

        static {
            for (Detail.Type c: values()) {
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
        public static Detail.Type fromValue(String value) {
            Detail.Type constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
