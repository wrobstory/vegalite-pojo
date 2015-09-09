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
    "grid",
    "layer",
    "orient",
    "ticks",
    "title",
    "titleMaxLength",
    "titleOffset",
    "format",
    "maxLabelLength",
    "labelAngle"
})
public class Axis_ {

    /**
     * A flag indicate if gridlines should be created in addition to ticks.
     * 
     */
    @JsonProperty("grid")
    private Boolean grid = true;
    /**
     * A string indicating if the axis (and any gridlines) should be placed above or below the data marks.
     * 
     */
    @JsonProperty("layer")
    private String layer = "back";
    /**
     * The orientation of the axis. One of top, bottom, left or right. The orientation can be used to further specialize the axis type (e.g., a y axis oriented for the right edge of the chart).
     * 
     */
    @JsonProperty("orient")
    private Axis_.Orient orient;
    /**
     * A desired number of ticks, for axes visualizing quantitative scales. The resulting number may be different so that values are "nice" (multiples of 2, 5, 10) and lie within the underlying scale's range.
     * 
     */
    @JsonProperty("ticks")
    private Integer ticks = 5;
    /**
     * A title for the axis. (Shows field name and its function by default.)
     * 
     */
    @JsonProperty("title")
    private String title;
    /**
     * Max length for axis title if the title is automatically generated from the field's description
     * 
     */
    @JsonProperty("titleMaxLength")
    private Integer titleMaxLength;
    /**
     * A title offset value for the axis.
     * 
     */
    @JsonProperty("titleOffset")
    private Integer titleOffset;
    /**
     * The formatting pattern for axis labels. If not undefined, this will be determined by small/largeNumberFormat and the max value of the field.
     * 
     */
    @JsonProperty("format")
    private String format;
    /**
     * Truncate labels that are too long.
     * 
     */
    @JsonProperty("maxLabelLength")
    private Integer maxLabelLength = 25;
    /**
     * Angle by which to rotate labels. Set to 0 to force horizontal.
     * 
     */
    @JsonProperty("labelAngle")
    private Integer labelAngle;

    /**
     * A flag indicate if gridlines should be created in addition to ticks.
     * 
     * @return
     *     The grid
     */
    @JsonProperty("grid")
    public Boolean getGrid() {
        return grid;
    }

    /**
     * A flag indicate if gridlines should be created in addition to ticks.
     * 
     * @param grid
     *     The grid
     */
    @JsonProperty("grid")
    public void setGrid(Boolean grid) {
        this.grid = grid;
    }

    public Axis_ withGrid(Boolean grid) {
        this.grid = grid;
        return this;
    }

    /**
     * A string indicating if the axis (and any gridlines) should be placed above or below the data marks.
     * 
     * @return
     *     The layer
     */
    @JsonProperty("layer")
    public String getLayer() {
        return layer;
    }

    /**
     * A string indicating if the axis (and any gridlines) should be placed above or below the data marks.
     * 
     * @param layer
     *     The layer
     */
    @JsonProperty("layer")
    public void setLayer(String layer) {
        this.layer = layer;
    }

    public Axis_ withLayer(String layer) {
        this.layer = layer;
        return this;
    }

    /**
     * The orientation of the axis. One of top, bottom, left or right. The orientation can be used to further specialize the axis type (e.g., a y axis oriented for the right edge of the chart).
     * 
     * @return
     *     The orient
     */
    @JsonProperty("orient")
    public Axis_.Orient getOrient() {
        return orient;
    }

    /**
     * The orientation of the axis. One of top, bottom, left or right. The orientation can be used to further specialize the axis type (e.g., a y axis oriented for the right edge of the chart).
     * 
     * @param orient
     *     The orient
     */
    @JsonProperty("orient")
    public void setOrient(Axis_.Orient orient) {
        this.orient = orient;
    }

    public Axis_ withOrient(Axis_.Orient orient) {
        this.orient = orient;
        return this;
    }

    /**
     * A desired number of ticks, for axes visualizing quantitative scales. The resulting number may be different so that values are "nice" (multiples of 2, 5, 10) and lie within the underlying scale's range.
     * 
     * @return
     *     The ticks
     */
    @JsonProperty("ticks")
    public Integer getTicks() {
        return ticks;
    }

    /**
     * A desired number of ticks, for axes visualizing quantitative scales. The resulting number may be different so that values are "nice" (multiples of 2, 5, 10) and lie within the underlying scale's range.
     * 
     * @param ticks
     *     The ticks
     */
    @JsonProperty("ticks")
    public void setTicks(Integer ticks) {
        this.ticks = ticks;
    }

    public Axis_ withTicks(Integer ticks) {
        this.ticks = ticks;
        return this;
    }

    /**
     * A title for the axis. (Shows field name and its function by default.)
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * A title for the axis. (Shows field name and its function by default.)
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Axis_ withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Max length for axis title if the title is automatically generated from the field's description
     * 
     * @return
     *     The titleMaxLength
     */
    @JsonProperty("titleMaxLength")
    public Integer getTitleMaxLength() {
        return titleMaxLength;
    }

    /**
     * Max length for axis title if the title is automatically generated from the field's description
     * 
     * @param titleMaxLength
     *     The titleMaxLength
     */
    @JsonProperty("titleMaxLength")
    public void setTitleMaxLength(Integer titleMaxLength) {
        this.titleMaxLength = titleMaxLength;
    }

    public Axis_ withTitleMaxLength(Integer titleMaxLength) {
        this.titleMaxLength = titleMaxLength;
        return this;
    }

    /**
     * A title offset value for the axis.
     * 
     * @return
     *     The titleOffset
     */
    @JsonProperty("titleOffset")
    public Integer getTitleOffset() {
        return titleOffset;
    }

    /**
     * A title offset value for the axis.
     * 
     * @param titleOffset
     *     The titleOffset
     */
    @JsonProperty("titleOffset")
    public void setTitleOffset(Integer titleOffset) {
        this.titleOffset = titleOffset;
    }

    public Axis_ withTitleOffset(Integer titleOffset) {
        this.titleOffset = titleOffset;
        return this;
    }

    /**
     * The formatting pattern for axis labels. If not undefined, this will be determined by small/largeNumberFormat and the max value of the field.
     * 
     * @return
     *     The format
     */
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     * The formatting pattern for axis labels. If not undefined, this will be determined by small/largeNumberFormat and the max value of the field.
     * 
     * @param format
     *     The format
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    public Axis_ withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Truncate labels that are too long.
     * 
     * @return
     *     The maxLabelLength
     */
    @JsonProperty("maxLabelLength")
    public Integer getMaxLabelLength() {
        return maxLabelLength;
    }

    /**
     * Truncate labels that are too long.
     * 
     * @param maxLabelLength
     *     The maxLabelLength
     */
    @JsonProperty("maxLabelLength")
    public void setMaxLabelLength(Integer maxLabelLength) {
        this.maxLabelLength = maxLabelLength;
    }

    public Axis_ withMaxLabelLength(Integer maxLabelLength) {
        this.maxLabelLength = maxLabelLength;
        return this;
    }

    /**
     * Angle by which to rotate labels. Set to 0 to force horizontal.
     * 
     * @return
     *     The labelAngle
     */
    @JsonProperty("labelAngle")
    public Integer getLabelAngle() {
        return labelAngle;
    }

    /**
     * Angle by which to rotate labels. Set to 0 to force horizontal.
     * 
     * @param labelAngle
     *     The labelAngle
     */
    @JsonProperty("labelAngle")
    public void setLabelAngle(Integer labelAngle) {
        this.labelAngle = labelAngle;
    }

    public Axis_ withLabelAngle(Integer labelAngle) {
        this.labelAngle = labelAngle;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(grid).append(layer).append(orient).append(ticks).append(title).append(titleMaxLength).append(titleOffset).append(format).append(maxLabelLength).append(labelAngle).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Axis_) == false) {
            return false;
        }
        Axis_ rhs = ((Axis_) other);
        return new EqualsBuilder().append(grid, rhs.grid).append(layer, rhs.layer).append(orient, rhs.orient).append(ticks, rhs.ticks).append(title, rhs.title).append(titleMaxLength, rhs.titleMaxLength).append(titleOffset, rhs.titleOffset).append(format, rhs.format).append(maxLabelLength, rhs.maxLabelLength).append(labelAngle, rhs.labelAngle).isEquals();
    }

    @Generated("org.jsonschema2pojo")
    public static enum Orient {

        TOP("top"),
        RIGHT("right"),
        LEFT("left"),
        BOTTOM("bottom");
        private final String value;
        private static Map<String, Axis_.Orient> constants = new HashMap<String, Axis_.Orient>();

        static {
            for (Axis_.Orient c: values()) {
                constants.put(c.value, c);
            }
        }

        private Orient(String value) {
            this.value = value;
        }

        @JsonValue
        @Override
        public String toString() {
            return this.value;
        }

        @JsonCreator
        public static Axis_.Orient fromValue(String value) {
            Axis_.Orient constant = constants.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
