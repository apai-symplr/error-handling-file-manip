(ns errorfileproject.core
(:require [clojure.java.io :as io]
          [cheshire.core :refer :all]
          [errorfileproject.jsonhandler :as jsonhandler]
          [errorfileproject.basicfilemethods :as basicfile]
          [errorfileproject.errorhandler :as errorhandler]
)(:gen-class))

 ;main function which calls methods from another namespaces

(defn -main
  [& args]
  ;(println (basicfile/read-text-file "text.txt"))
  ;(println (basicfile/save-to-text-file "text.txt" "Hello\nAgain\nMore Data" false))
  ;(println (basicfile/read-text-file "text.txt"))
  ;(basicfile/copy-to-file "text.txt" "text2.txt")
  ;(basicfile/image-downloader "https://mma.prnewswire.com/media/742257/Tata_Elxsi_Logo.jpg?w=200" "elxsi.jpg")
  ;(println (basicfile/delete-any-file "text2.txt"))
  ;(jsonhandler/get-quiz-set "sport" "data.json")
  ;(jsonhandler/add-quiz-set "computer" "data.json" {"q1" {"question" "Who owns Windows OS?" "options" ["Microsoft" "Google" "Apple"] "answer" "Microsoft"}})
  (errorhandler/safe (jsonhandler/read-json "data3.json"))
  )
