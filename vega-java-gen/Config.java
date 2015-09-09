import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    "width",
    "height",
    "viewport",
    "gridColor",
    "gridOpacity",
    "filterNull",
    "toggleSort",
    "autoSortLine",
    "singleHeight",
    "singleWidth",
    "largeBandSize",
    "smallBandSize",
    "largeBandMaxCardinality",
    "cellPadding",
    "cellGridColor",
    "cellGridOpacity",
    "cellBackgroundColor",
    "textCellWidth",
    "strokeWidth",
    "singleBarOffset",
    "timeScaleLabelLength",
    "dayScaleLabel",
    "monthScaleLabel",
    "characterWidth",
    "maxSmallNumber",
    "smallNumberFormat",
    "largeNumberFormat",
    "timeFormat",
    "useRawDomain"
})
public class Config {

    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("viewport")
    private List<Integer> viewport = new ArrayList<Integer>();
    @JsonProperty("gridColor")
    private String gridColor = "#000000";
    @JsonProperty("gridOpacity")
    private Double gridOpacity = 0.08D;
    @JsonProperty("filterNull")
    private FilterNull filterNull;
    @JsonProperty("toggleSort")
    private String toggleSort = "O";
    @JsonProperty("autoSortLine")
    private Boolean autoSortLine = true;
    @JsonProperty("singleHeight")
    private Integer singleHeight = 200;
    @JsonProperty("singleWidth")
    private Integer singleWidth = 200;
    @JsonProperty("largeBandSize")
    private Integer largeBandSize = 21;
    @JsonProperty("smallBandSize")
    private Integer smallBandSize = 12;
    @JsonProperty("largeBandMaxCardinality")
    private Integer largeBandMaxCardinality = 10;
    @JsonProperty("cellPadding")
    private Double cellPadding = 0.1D;
    @JsonProperty("cellGridColor")
    private String cellGridColor = "#000000";
    @JsonProperty("cellGridOpacity")
    private Double cellGridOpacity = 0.15D;
    @JsonProperty("cellBackgroundColor")
    private String cellBackgroundColor = "rgba(0,0,0,0)";
    @JsonProperty("textCellWidth")
    private Integer textCellWidth = 90;
    @JsonProperty("strokeWidth")
    private Integer strokeWidth = 2;
    @JsonProperty("singleBarOffset")
    private Integer singleBarOffset = 5;
    /**
     * Max length for values in dayScaleLabel and monthScaleLabel.  Zero means using full names in dayScaleLabel/monthScaleLabel.
     * 
     */
    @JsonProperty("timeScaleLabelLength")
    private Integer timeScaleLabelLength = 3;
    /**
     * Axis labels for day of week, starting from Sunday.(Consistent with Javascript -- See https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getDay.
     * 
     */
    @JsonProperty("dayScaleLabel")
    private List<String> dayScaleLabel = new ArrayList<String>(Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));
    /**
     * Axis labels for month.
     * 
     */
    @JsonProperty("monthScaleLabel")
    private List<String> monthScaleLabel = new ArrayList<String>(Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
    @JsonProperty("characterWidth")
    private Integer characterWidth = 6;
    /**
     * maximum number that a field will be considered smallNumber.Used for axis labelling.
     * 
     */
    @JsonProperty("maxSmallNumber")
    private Double maxSmallNumber = 10000.0D;
    /**
     * D3 Number format for axis labels and text tables for number <= maxSmallNumber. Used for axis labelling.
     * 
     */
    @JsonProperty("smallNumberFormat")
    private String smallNumberFormat = "";
    /**
     * D3 Number format for axis labels and text tables for number > maxSmallNumber.
     * 
     */
    @JsonProperty("largeNumberFormat")
    private String largeNumberFormat = ".3s";
    /**
     * Date format for axis labels.
     * 
     */
    @JsonProperty("timeFormat")
    private String timeFormat = "%Y-%m-%d";
    /**
     * Use the raw data range as scale domain instead of aggregated data for aggregate axis. This option does not work with sum or count aggregateas they might have a substantially larger scale range.By default, use value from config.useRawDomain.
     * 
     */
    @JsonProperty("useRawDomain")
    private Boolean useRawDomain = false;

    /**
     * 
     * @return
     *     The width
     */
    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    public Config withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 
     * @return
     *     The height
     */
    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    public Config withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 
     * @return
     *     The viewport
     */
    @JsonProperty("viewport")
    public List<Integer> getViewport() {
        return viewport;
    }

    /**
     * 
     * @param viewport
     *     The viewport
     */
    @JsonProperty("viewport")
    public void setViewport(List<Integer> viewport) {
        this.viewport = viewport;
    }

    public Config withViewport(List<Integer> viewport) {
        this.viewport = viewport;
        return this;
    }

    /**
     * 
     * @return
     *     The gridColor
     */
    @JsonProperty("gridColor")
    public String getGridColor() {
        return gridColor;
    }

    /**
     * 
     * @param gridColor
     *     The gridColor
     */
    @JsonProperty("gridColor")
    public void setGridColor(String gridColor) {
        this.gridColor = gridColor;
    }

    public Config withGridColor(String gridColor) {
        this.gridColor = gridColor;
        return this;
    }

    /**
     * 
     * @return
     *     The gridOpacity
     */
    @JsonProperty("gridOpacity")
    public Double getGridOpacity() {
        return gridOpacity;
    }

    /**
     * 
     * @param gridOpacity
     *     The gridOpacity
     */
    @JsonProperty("gridOpacity")
    public void setGridOpacity(Double gridOpacity) {
        this.gridOpacity = gridOpacity;
    }

    public Config withGridOpacity(Double gridOpacity) {
        this.gridOpacity = gridOpacity;
        return this;
    }

    /**
     * 
     * @return
     *     The filterNull
     */
    @JsonProperty("filterNull")
    public FilterNull getFilterNull() {
        return filterNull;
    }

    /**
     * 
     * @param filterNull
     *     The filterNull
     */
    @JsonProperty("filterNull")
    public void setFilterNull(FilterNull filterNull) {
        this.filterNull = filterNull;
    }

    public Config withFilterNull(FilterNull filterNull) {
        this.filterNull = filterNull;
        return this;
    }

    /**
     * 
     * @return
     *     The toggleSort
     */
    @JsonProperty("toggleSort")
    public String getToggleSort() {
        return toggleSort;
    }

    /**
     * 
     * @param toggleSort
     *     The toggleSort
     */
    @JsonProperty("toggleSort")
    public void setToggleSort(String toggleSort) {
        this.toggleSort = toggleSort;
    }

    public Config withToggleSort(String toggleSort) {
        this.toggleSort = toggleSort;
        return this;
    }

    /**
     * 
     * @return
     *     The autoSortLine
     */
    @JsonProperty("autoSortLine")
    public Boolean getAutoSortLine() {
        return autoSortLine;
    }

    /**
     * 
     * @param autoSortLine
     *     The autoSortLine
     */
    @JsonProperty("autoSortLine")
    public void setAutoSortLine(Boolean autoSortLine) {
        this.autoSortLine = autoSortLine;
    }

    public Config withAutoSortLine(Boolean autoSortLine) {
        this.autoSortLine = autoSortLine;
        return this;
    }

    /**
     * 
     * @return
     *     The singleHeight
     */
    @JsonProperty("singleHeight")
    public Integer getSingleHeight() {
        return singleHeight;
    }

    /**
     * 
     * @param singleHeight
     *     The singleHeight
     */
    @JsonProperty("singleHeight")
    public void setSingleHeight(Integer singleHeight) {
        this.singleHeight = singleHeight;
    }

    public Config withSingleHeight(Integer singleHeight) {
        this.singleHeight = singleHeight;
        return this;
    }

    /**
     * 
     * @return
     *     The singleWidth
     */
    @JsonProperty("singleWidth")
    public Integer getSingleWidth() {
        return singleWidth;
    }

    /**
     * 
     * @param singleWidth
     *     The singleWidth
     */
    @JsonProperty("singleWidth")
    public void setSingleWidth(Integer singleWidth) {
        this.singleWidth = singleWidth;
    }

    public Config withSingleWidth(Integer singleWidth) {
        this.singleWidth = singleWidth;
        return this;
    }

    /**
     * 
     * @return
     *     The largeBandSize
     */
    @JsonProperty("largeBandSize")
    public Integer getLargeBandSize() {
        return largeBandSize;
    }

    /**
     * 
     * @param largeBandSize
     *     The largeBandSize
     */
    @JsonProperty("largeBandSize")
    public void setLargeBandSize(Integer largeBandSize) {
        this.largeBandSize = largeBandSize;
    }

    public Config withLargeBandSize(Integer largeBandSize) {
        this.largeBandSize = largeBandSize;
        return this;
    }

    /**
     * 
     * @return
     *     The smallBandSize
     */
    @JsonProperty("smallBandSize")
    public Integer getSmallBandSize() {
        return smallBandSize;
    }

    /**
     * 
     * @param smallBandSize
     *     The smallBandSize
     */
    @JsonProperty("smallBandSize")
    public void setSmallBandSize(Integer smallBandSize) {
        this.smallBandSize = smallBandSize;
    }

    public Config withSmallBandSize(Integer smallBandSize) {
        this.smallBandSize = smallBandSize;
        return this;
    }

    /**
     * 
     * @return
     *     The largeBandMaxCardinality
     */
    @JsonProperty("largeBandMaxCardinality")
    public Integer getLargeBandMaxCardinality() {
        return largeBandMaxCardinality;
    }

    /**
     * 
     * @param largeBandMaxCardinality
     *     The largeBandMaxCardinality
     */
    @JsonProperty("largeBandMaxCardinality")
    public void setLargeBandMaxCardinality(Integer largeBandMaxCardinality) {
        this.largeBandMaxCardinality = largeBandMaxCardinality;
    }

    public Config withLargeBandMaxCardinality(Integer largeBandMaxCardinality) {
        this.largeBandMaxCardinality = largeBandMaxCardinality;
        return this;
    }

    /**
     * 
     * @return
     *     The cellPadding
     */
    @JsonProperty("cellPadding")
    public Double getCellPadding() {
        return cellPadding;
    }

    /**
     * 
     * @param cellPadding
     *     The cellPadding
     */
    @JsonProperty("cellPadding")
    public void setCellPadding(Double cellPadding) {
        this.cellPadding = cellPadding;
    }

    public Config withCellPadding(Double cellPadding) {
        this.cellPadding = cellPadding;
        return this;
    }

    /**
     * 
     * @return
     *     The cellGridColor
     */
    @JsonProperty("cellGridColor")
    public String getCellGridColor() {
        return cellGridColor;
    }

    /**
     * 
     * @param cellGridColor
     *     The cellGridColor
     */
    @JsonProperty("cellGridColor")
    public void setCellGridColor(String cellGridColor) {
        this.cellGridColor = cellGridColor;
    }

    public Config withCellGridColor(String cellGridColor) {
        this.cellGridColor = cellGridColor;
        return this;
    }

    /**
     * 
     * @return
     *     The cellGridOpacity
     */
    @JsonProperty("cellGridOpacity")
    public Double getCellGridOpacity() {
        return cellGridOpacity;
    }

    /**
     * 
     * @param cellGridOpacity
     *     The cellGridOpacity
     */
    @JsonProperty("cellGridOpacity")
    public void setCellGridOpacity(Double cellGridOpacity) {
        this.cellGridOpacity = cellGridOpacity;
    }

    public Config withCellGridOpacity(Double cellGridOpacity) {
        this.cellGridOpacity = cellGridOpacity;
        return this;
    }

    /**
     * 
     * @return
     *     The cellBackgroundColor
     */
    @JsonProperty("cellBackgroundColor")
    public String getCellBackgroundColor() {
        return cellBackgroundColor;
    }

    /**
     * 
     * @param cellBackgroundColor
     *     The cellBackgroundColor
     */
    @JsonProperty("cellBackgroundColor")
    public void setCellBackgroundColor(String cellBackgroundColor) {
        this.cellBackgroundColor = cellBackgroundColor;
    }

    public Config withCellBackgroundColor(String cellBackgroundColor) {
        this.cellBackgroundColor = cellBackgroundColor;
        return this;
    }

    /**
     * 
     * @return
     *     The textCellWidth
     */
    @JsonProperty("textCellWidth")
    public Integer getTextCellWidth() {
        return textCellWidth;
    }

    /**
     * 
     * @param textCellWidth
     *     The textCellWidth
     */
    @JsonProperty("textCellWidth")
    public void setTextCellWidth(Integer textCellWidth) {
        this.textCellWidth = textCellWidth;
    }

    public Config withTextCellWidth(Integer textCellWidth) {
        this.textCellWidth = textCellWidth;
        return this;
    }

    /**
     * 
     * @return
     *     The strokeWidth
     */
    @JsonProperty("strokeWidth")
    public Integer getStrokeWidth() {
        return strokeWidth;
    }

    /**
     * 
     * @param strokeWidth
     *     The strokeWidth
     */
    @JsonProperty("strokeWidth")
    public void setStrokeWidth(Integer strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public Config withStrokeWidth(Integer strokeWidth) {
        this.strokeWidth = strokeWidth;
        return this;
    }

    /**
     * 
     * @return
     *     The singleBarOffset
     */
    @JsonProperty("singleBarOffset")
    public Integer getSingleBarOffset() {
        return singleBarOffset;
    }

    /**
     * 
     * @param singleBarOffset
     *     The singleBarOffset
     */
    @JsonProperty("singleBarOffset")
    public void setSingleBarOffset(Integer singleBarOffset) {
        this.singleBarOffset = singleBarOffset;
    }

    public Config withSingleBarOffset(Integer singleBarOffset) {
        this.singleBarOffset = singleBarOffset;
        return this;
    }

    /**
     * Max length for values in dayScaleLabel and monthScaleLabel.  Zero means using full names in dayScaleLabel/monthScaleLabel.
     * 
     * @return
     *     The timeScaleLabelLength
     */
    @JsonProperty("timeScaleLabelLength")
    public Integer getTimeScaleLabelLength() {
        return timeScaleLabelLength;
    }

    /**
     * Max length for values in dayScaleLabel and monthScaleLabel.  Zero means using full names in dayScaleLabel/monthScaleLabel.
     * 
     * @param timeScaleLabelLength
     *     The timeScaleLabelLength
     */
    @JsonProperty("timeScaleLabelLength")
    public void setTimeScaleLabelLength(Integer timeScaleLabelLength) {
        this.timeScaleLabelLength = timeScaleLabelLength;
    }

    public Config withTimeScaleLabelLength(Integer timeScaleLabelLength) {
        this.timeScaleLabelLength = timeScaleLabelLength;
        return this;
    }

    /**
     * Axis labels for day of week, starting from Sunday.(Consistent with Javascript -- See https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getDay.
     * 
     * @return
     *     The dayScaleLabel
     */
    @JsonProperty("dayScaleLabel")
    public List<String> getDayScaleLabel() {
        return dayScaleLabel;
    }

    /**
     * Axis labels for day of week, starting from Sunday.(Consistent with Javascript -- See https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/getDay.
     * 
     * @param dayScaleLabel
     *     The dayScaleLabel
     */
    @JsonProperty("dayScaleLabel")
    public void setDayScaleLabel(List<String> dayScaleLabel) {
        this.dayScaleLabel = dayScaleLabel;
    }

    public Config withDayScaleLabel(List<String> dayScaleLabel) {
        this.dayScaleLabel = dayScaleLabel;
        return this;
    }

    /**
     * Axis labels for month.
     * 
     * @return
     *     The monthScaleLabel
     */
    @JsonProperty("monthScaleLabel")
    public List<String> getMonthScaleLabel() {
        return monthScaleLabel;
    }

    /**
     * Axis labels for month.
     * 
     * @param monthScaleLabel
     *     The monthScaleLabel
     */
    @JsonProperty("monthScaleLabel")
    public void setMonthScaleLabel(List<String> monthScaleLabel) {
        this.monthScaleLabel = monthScaleLabel;
    }

    public Config withMonthScaleLabel(List<String> monthScaleLabel) {
        this.monthScaleLabel = monthScaleLabel;
        return this;
    }

    /**
     * 
     * @return
     *     The characterWidth
     */
    @JsonProperty("characterWidth")
    public Integer getCharacterWidth() {
        return characterWidth;
    }

    /**
     * 
     * @param characterWidth
     *     The characterWidth
     */
    @JsonProperty("characterWidth")
    public void setCharacterWidth(Integer characterWidth) {
        this.characterWidth = characterWidth;
    }

    public Config withCharacterWidth(Integer characterWidth) {
        this.characterWidth = characterWidth;
        return this;
    }

    /**
     * maximum number that a field will be considered smallNumber.Used for axis labelling.
     * 
     * @return
     *     The maxSmallNumber
     */
    @JsonProperty("maxSmallNumber")
    public Double getMaxSmallNumber() {
        return maxSmallNumber;
    }

    /**
     * maximum number that a field will be considered smallNumber.Used for axis labelling.
     * 
     * @param maxSmallNumber
     *     The maxSmallNumber
     */
    @JsonProperty("maxSmallNumber")
    public void setMaxSmallNumber(Double maxSmallNumber) {
        this.maxSmallNumber = maxSmallNumber;
    }

    public Config withMaxSmallNumber(Double maxSmallNumber) {
        this.maxSmallNumber = maxSmallNumber;
        return this;
    }

    /**
     * D3 Number format for axis labels and text tables for number <= maxSmallNumber. Used for axis labelling.
     * 
     * @return
     *     The smallNumberFormat
     */
    @JsonProperty("smallNumberFormat")
    public String getSmallNumberFormat() {
        return smallNumberFormat;
    }

    /**
     * D3 Number format for axis labels and text tables for number <= maxSmallNumber. Used for axis labelling.
     * 
     * @param smallNumberFormat
     *     The smallNumberFormat
     */
    @JsonProperty("smallNumberFormat")
    public void setSmallNumberFormat(String smallNumberFormat) {
        this.smallNumberFormat = smallNumberFormat;
    }

    public Config withSmallNumberFormat(String smallNumberFormat) {
        this.smallNumberFormat = smallNumberFormat;
        return this;
    }

    /**
     * D3 Number format for axis labels and text tables for number > maxSmallNumber.
     * 
     * @return
     *     The largeNumberFormat
     */
    @JsonProperty("largeNumberFormat")
    public String getLargeNumberFormat() {
        return largeNumberFormat;
    }

    /**
     * D3 Number format for axis labels and text tables for number > maxSmallNumber.
     * 
     * @param largeNumberFormat
     *     The largeNumberFormat
     */
    @JsonProperty("largeNumberFormat")
    public void setLargeNumberFormat(String largeNumberFormat) {
        this.largeNumberFormat = largeNumberFormat;
    }

    public Config withLargeNumberFormat(String largeNumberFormat) {
        this.largeNumberFormat = largeNumberFormat;
        return this;
    }

    /**
     * Date format for axis labels.
     * 
     * @return
     *     The timeFormat
     */
    @JsonProperty("timeFormat")
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * Date format for axis labels.
     * 
     * @param timeFormat
     *     The timeFormat
     */
    @JsonProperty("timeFormat")
    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public Config withTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
        return this;
    }

    /**
     * Use the raw data range as scale domain instead of aggregated data for aggregate axis. This option does not work with sum or count aggregateas they might have a substantially larger scale range.By default, use value from config.useRawDomain.
     * 
     * @return
     *     The useRawDomain
     */
    @JsonProperty("useRawDomain")
    public Boolean getUseRawDomain() {
        return useRawDomain;
    }

    /**
     * Use the raw data range as scale domain instead of aggregated data for aggregate axis. This option does not work with sum or count aggregateas they might have a substantially larger scale range.By default, use value from config.useRawDomain.
     * 
     * @param useRawDomain
     *     The useRawDomain
     */
    @JsonProperty("useRawDomain")
    public void setUseRawDomain(Boolean useRawDomain) {
        this.useRawDomain = useRawDomain;
    }

    public Config withUseRawDomain(Boolean useRawDomain) {
        this.useRawDomain = useRawDomain;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(width).append(height).append(viewport).append(gridColor).append(gridOpacity).append(filterNull).append(toggleSort).append(autoSortLine).append(singleHeight).append(singleWidth).append(largeBandSize).append(smallBandSize).append(largeBandMaxCardinality).append(cellPadding).append(cellGridColor).append(cellGridOpacity).append(cellBackgroundColor).append(textCellWidth).append(strokeWidth).append(singleBarOffset).append(timeScaleLabelLength).append(dayScaleLabel).append(monthScaleLabel).append(characterWidth).append(maxSmallNumber).append(smallNumberFormat).append(largeNumberFormat).append(timeFormat).append(useRawDomain).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Config) == false) {
            return false;
        }
        Config rhs = ((Config) other);
        return new EqualsBuilder().append(width, rhs.width).append(height, rhs.height).append(viewport, rhs.viewport).append(gridColor, rhs.gridColor).append(gridOpacity, rhs.gridOpacity).append(filterNull, rhs.filterNull).append(toggleSort, rhs.toggleSort).append(autoSortLine, rhs.autoSortLine).append(singleHeight, rhs.singleHeight).append(singleWidth, rhs.singleWidth).append(largeBandSize, rhs.largeBandSize).append(smallBandSize, rhs.smallBandSize).append(largeBandMaxCardinality, rhs.largeBandMaxCardinality).append(cellPadding, rhs.cellPadding).append(cellGridColor, rhs.cellGridColor).append(cellGridOpacity, rhs.cellGridOpacity).append(cellBackgroundColor, rhs.cellBackgroundColor).append(textCellWidth, rhs.textCellWidth).append(strokeWidth, rhs.strokeWidth).append(singleBarOffset, rhs.singleBarOffset).append(timeScaleLabelLength, rhs.timeScaleLabelLength).append(dayScaleLabel, rhs.dayScaleLabel).append(monthScaleLabel, rhs.monthScaleLabel).append(characterWidth, rhs.characterWidth).append(maxSmallNumber, rhs.maxSmallNumber).append(smallNumberFormat, rhs.smallNumberFormat).append(largeNumberFormat, rhs.largeNumberFormat).append(timeFormat, rhs.timeFormat).append(useRawDomain, rhs.useRawDomain).isEquals();
    }

}
