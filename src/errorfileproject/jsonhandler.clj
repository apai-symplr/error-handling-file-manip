(ns errorfileproject.jsonhandler
(:require [cheshire.core :refer :all]
          [clojure.java.io :as io]
))

;uses Cheshire Library to decode (change data into Clojure Primitives) takes a Reader type as input  
(defn read-json 
[file-name]
"Function read-json is used to write JSON data :file-name argument takes the file-name"
(parse-stream (io/reader file-name))
) 


(defn get-quiz-set
[category filename]
"Returns quiz of specific category(can be sport or math or computer)"
(let [data (get (get (read-json filename) "quiz") category)]
(if (nil? data)
"Ooops value not found"
(println (data))
)))


(defn add-quiz-set
[category filename quiz]
"add-quiz-set function adds a quiz of specific category into a specified file"
"Category takes name of new category to be added"
"Filename is the file to which quiz set is to be added"
"Quiz is quiz object with properties qn,options and answer" 
(let [data (get (read-json "data.json") "quiz")]
 (generate-stream (merge {"quiz" (merge data {category quiz})}) (io/writer filename){:pretty true})
))