(ns errorfileproject.core
(:require [clojure.java.io :as io]
          [errorfileproject.jsonhandler :as jsonhandler]
          [errorfileproject.basicfilemethods :as basicfile]
)(:gen-class))

 

(defn -main
  [& args]
  ;(println (basicfile/read-text-file "text.txt"))
  ;(println (basicfile/save-to-text-file "text.txt" "Hello\nAgain\nMore Data" false))
  ;(println (basicfile/read-text-file "text.txt"))
  ;(basicfile/copy-to-file "text.txt" "text2.txt")
  ;(basicfile/image-downloader "https://mma.prnewswire.com/media/742257/Tata_Elxsi_Logo.jpg?w=200" "elxsi.jpg")
  ;(println (basicfile/delete-any-file "text2.txt"))
  ;(println ((jsonhandler/read-json "data.json")"quiz"))
)
