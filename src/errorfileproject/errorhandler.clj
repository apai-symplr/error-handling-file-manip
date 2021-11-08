(ns errorfileproject.errorhandler)
;For better understanding of go through this https://www.braveclojure.com/writing-macros/
(defmacro safe
  [expression]
  `(try ~expression
     (catch Exception e#
       (println (str "caught exception: " (.getMessage e#))))))