(ns errorfileproject.errorhandler)

(defmacro safe
  [expression]
  `(try ~expression
     (catch Exception e#
       (str "caught exception: " (.getMessage e#)))))