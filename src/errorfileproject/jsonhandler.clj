(ns errorfileproject.jsonhandler
(:require [cheshire.core :refer :all]))

(defn read-json 
[file-name]
; :file-name takes the file-name
(parse-stream (clojure.java.io/reader file-name))
) 