(ns errorfileproject.jsonhandler
(:require [cheshire.core :refer :all]
          [clojure.java.io :as io]
))

;uses Cheshire Library to decode (change data into Clojure Primitives) takes a Reader type as input  
(defn read-json 
[file-name]
; :file-name takes the file-name
(parse-stream (io/reader file-name))
) 


(defn get-quiz-set
[category filename]
; Category takes category as sport or math
(let [data (get (get (read-json filename) "quiz") category)]
(if (nil? data)
"Ooops value not found"
(println (data))
)))


(defn add-quiz-set
[category filename]
(let [data (get (read-json filename) "quiz")]
 (generate-stream (merge {"quiz" (merge data {category {"q1" {"question" "Who owns Windows OS?" "options" ["Microsoft" "Google" "Apple"] "answer" "Microsoft"}}})}) (io/writer "data1.json"){:pretty true})
))