(defproject domesday "0.1.2-SNAPSHOT"
  :description "Experience API (xAPI) Tabulation Reports Script"
  :url "https://github.com/Saltbox/domesday"
  :license {:name "Apache License"
            :url "http://www.apache.org/licenses/LICENSE-2.0.html"}
  :profiles {:uberjar {:aot :all}}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.taoensso/timbre "3.1.2"]
                 [org.clojure/tools.cli "0.3.1"]
                 [clj-time "0.7.0"]
                 [joda-time "2.3"]
                 [http-kit "2.1.16"]
                 [clojurewerkz/urly "1.0.0"]
                 [cheshire "5.3.1"]
                 [clojure-csv/clojure-csv "2.0.1"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]
  :main domesday.core)
