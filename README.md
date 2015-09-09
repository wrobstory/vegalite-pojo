# vegalite-pojo

An experiment: what does it look like when we use [jsonschema2pojo](http://www.jsonschema2pojo.org/) to generate Java Classes that map to the [vega-lite](https://github.com/uwdata/vega-lite) spec?

## Why?

This would be a nice starting point for Java/Scala/Clojure libraries to wrap logic creating vega-lite charts, then easily serialize them back to the browser. Clojure doesn't have a great charting library right now - one could pretty quickly wrap a handful of basic chart types and have a working vega-lite spec generator. 
