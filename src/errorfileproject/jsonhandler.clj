(ns errorfileproject.jsonhandler
(:require [cheshire.core :refer :all]
          [clojure.java.io :as io]
          [errorfileproject.customexcep :as customexcep]
          [errorfileproject.errorhandler :as errorhandler]
))

;uses Cheshire Library to decode (change data into Clojure Primitives) takes a Reader type as input  
(defn read-json 
[file-name]
"Function read-json is used to read JSON File :file-name argument takes the file-name"
(errorhandler/safe (parse-stream (io/reader file-name)))
) 

(defn read-quiz-data
"Read Data from console for creating a quiz for in a specific Category"
;{"q1" {"question" "Who owns Windows OS?" "options" ["Microsoft" "Google" "Apple"] "answer" "Microsoft"}}
[]
(println "Enter the question")
(def question (read-line))
(errorhandler/safe (customexcep/validate-question question)) 
(def options [])
(def x (atom true))
(while (= @x true)
(do 
(println "Enter option")
(conj options (read-line))
(println "Continue? Y or N ?")
(def op (read-line))
(if (= op "N") (reset! x false))
))
(errorhandler/safe (customexcep/validate-option options)) 
(println "Enter the answer")
(def answer (read-line))
(errorhandler/safe (customexcep/validate-answer answer))
;(errorhandler/safe (println {"q1" {"question" (customexcep/validate-question question) "options" (customexcep/validate-option options) "answer" (customexcep/validate-answer answer)}}))
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