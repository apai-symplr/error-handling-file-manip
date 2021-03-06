(ns errorfileproject.customexcep
(:require [clojure.string :as cljstr]
          [clojure.spec.alpha :as s])
(:gen-class :extends java.lang.Exception))

;https://stackoverflow.com/questions/3835331/custom-exceptions-in-clojure refer while creating custom exception
(defn validate-question 
[question]
(if (and (s/valid? string? question) (cljstr/blank? question))
(throw (errorfileproject.customexcep. "Question should be a String and cannot be blank"))
))

(defn validate-option
[options]
(if (< (count options) 2)
(throw (errorfileproject.customexcep. "There should be more than two options"))
))

(defn validate-answer
[answer]
(if (cljstr/blank? answer)
(throw (errorfileproject.customexcep. "Answer Should not be empty"))
))