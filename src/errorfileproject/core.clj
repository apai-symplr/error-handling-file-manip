(ns errorfileproject.core
(:require [clojure.java.io :as io]
          [cheshire.core :refer :all]
          [errorfileproject.jsonhandler :as jsonhandler]
          [errorfileproject.basicfilemethods :as basicfile]
)(:gen-class))


(defn -main
  [& args]
   "Main function which calls methods from another namespaces"
  
  ;Basic File Operations
  ;-----------------------

  ; 1.Read Text File
  ;(println (basicfile/read-text-file "text.txt"))
  
  ; 2.Write to a text file where false is value representing append operation
  ;(println (basicfile/save-to-text-file "text.txt" "Hello\nAgain\nMore Data" false))
  
  ; 3.Copy content of one file to another
  ;(basicfile/copy-to-file "text.txt" "text2.txt")

  ; 4.Uses Reader and writer functions to read a binary file and write to file (Image Downloader) 
  ;(basicfile/image-downloader "https://mma.prnewswire.com/media/742257/Tata_Elxsi_Logo.jpg?w=200" "elxsi.jpg")
  
  ; 5.Delete a File 
  ;(println (basicfile/delete-any-file "text2.txt"))
  
  ;JSON File Operations (Done using JSON data in data.json )
  ;---------------------------
  
  ; 1.Get a specific type of quiz
  ;(jsonhandler/get-quiz-set "sport" "data3.json")
  
  ; 2.Create a quiz of specific type and append it to existing quiz set
  ;(jsonhandler/add-quiz-set "computer" "data.json" {"q1" {"question" "Who owns Windows OS?" "options" ["Microsoft" "Google" "Apple"] "answer" "Microsoft"}})  
  
  ; 3.Test error handling macro 
  ;(errorhandler/safe (jsonhandler/read-json "data1.json"))

  ;4.Custom Exceptions
  (jsonhandler/read-quiz-data)
  )
