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
    "x",
    "y",
    "row",
    "col",
    "size",
    "color",
    "shape",
    "text",
    "detail"
})
public class Encoding {

    /**
     * 
     */
    @JsonProperty("x")
    private X x;
    /**
     * 
     */
    @JsonProperty("y")
    private Y y;
    /**
     * 
     */
    @JsonProperty("row")
    private Row row;
    /**
     * 
     */
    @JsonProperty("col")
    private Col col;
    @JsonProperty("size")
    private Size size;
    @JsonProperty("color")
    private Color color;
    @JsonProperty("shape")
    private Shape shape;
    @JsonProperty("text")
    private Text text;
    @JsonProperty("detail")
    private Detail detail;

    /**
     * 
     * @return
     *     The x
     */
    @JsonProperty("x")
    public X getX() {
        return x;
    }

    /**
     * 
     * @param x
     *     The x
     */
    @JsonProperty("x")
    public void setX(X x) {
        this.x = x;
    }

    public Encoding withX(X x) {
        this.x = x;
        return this;
    }

    /**
     * 
     * @return
     *     The y
     */
    @JsonProperty("y")
    public Y getY() {
        return y;
    }

    /**
     * 
     * @param y
     *     The y
     */
    @JsonProperty("y")
    public void setY(Y y) {
        this.y = y;
    }

    public Encoding withY(Y y) {
        this.y = y;
        return this;
    }

    /**
     * 
     * @return
     *     The row
     */
    @JsonProperty("row")
    public Row getRow() {
        return row;
    }

    /**
     * 
     * @param row
     *     The row
     */
    @JsonProperty("row")
    public void setRow(Row row) {
        this.row = row;
    }

    public Encoding withRow(Row row) {
        this.row = row;
        return this;
    }

    /**
     * 
     * @return
     *     The col
     */
    @JsonProperty("col")
    public Col getCol() {
        return col;
    }

    /**
     * 
     * @param col
     *     The col
     */
    @JsonProperty("col")
    public void setCol(Col col) {
        this.col = col;
    }

    public Encoding withCol(Col col) {
        this.col = col;
        return this;
    }

    /**
     * 
     * @return
     *     The size
     */
    @JsonProperty("size")
    public Size getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    @JsonProperty("size")
    public void setSize(Size size) {
        this.size = size;
    }

    public Encoding withSize(Size size) {
        this.size = size;
        return this;
    }

    /**
     * 
     * @return
     *     The color
     */
    @JsonProperty("color")
    public Color getColor() {
        return color;
    }

    /**
     * 
     * @param color
     *     The color
     */
    @JsonProperty("color")
    public void setColor(Color color) {
        this.color = color;
    }

    public Encoding withColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * 
     * @return
     *     The shape
     */
    @JsonProperty("shape")
    public Shape getShape() {
        return shape;
    }

    /**
     * 
     * @param shape
     *     The shape
     */
    @JsonProperty("shape")
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Encoding withShape(Shape shape) {
        this.shape = shape;
        return this;
    }

    /**
     * 
     * @return
     *     The text
     */
    @JsonProperty("text")
    public Text getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    @JsonProperty("text")
    public void setText(Text text) {
        this.text = text;
    }

    public Encoding withText(Text text) {
        this.text = text;
        return this;
    }

    /**
     * 
     * @return
     *     The detail
     */
    @JsonProperty("detail")
    public Detail getDetail() {
        return detail;
    }

    /**
     * 
     * @param detail
     *     The detail
     */
    @JsonProperty("detail")
    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public Encoding withDetail(Detail detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(x).append(y).append(row).append(col).append(size).append(color).append(shape).append(text).append(detail).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Encoding) == false) {
            return false;
        }
        Encoding rhs = ((Encoding) other);
        return new EqualsBuilder().append(x, rhs.x).append(y, rhs.y).append(row, rhs.row).append(col, rhs.col).append(size, rhs.size).append(color, rhs.color).append(shape, rhs.shape).append(text, rhs.text).append(detail, rhs.detail).isEquals();
    }

}
