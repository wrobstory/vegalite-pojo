# vegalite-pojo

```java
/**
 * Schema for Vega-lite specification
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "data",
    "marktype",
    "encoding",
    "filter",
    "config"
})
public class VegaLite {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("data")
    private Data data;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("marktype")
    private VegaLite.Marktype marktype;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("encoding")
    private Encoding encoding;
    @JsonProperty("filter")
    private List<Filter> filter = new ArrayList<Filter>();
    @JsonProperty("config")
    private Config config;
```

An experiment: what does it look like when we use [jsonschema2pojo](http://www.jsonschema2pojo.org/) to generate Java Classes that map to the [vega-lite](https://github.com/uwdata/vega-lite) spec?

## Why?

This would be a nice starting point for Java/Scala/Clojure libraries to wrap logic creating vega-lite charts, then easily serialize them back to the browser. Clojure doesn't have a great charting library right now - one could pretty quickly wrap a handful of basic chart types and have a working vega-lite spec generator. 
