(ns errorfileproject.core
(:require [errorfileproject.jsonhandler :as jsonhandler]
  [errorfileproject.errorhandler :as errorhandler]
          [errorfileproject.basicfilemethods :as basicfile])(:gen-class))


(defn -main
  
  "Main function which calls methods from another namespaces"
  
  [& args]
  ;Basic File Operations
  ;-----------------------

  ; 1.Read Text File
  ;(println (basicfile/read-text-file "text2.txt"))
  
  ; 2.Write to a text file where false is value representing append operation
  ;(println (basicfile/save-to-text-file "text2.txt" "Hello\nAgain\nMore Data" false))

  ;2.1 Extra File Manipulation
   (errorhandler/safe (basicfile/reverse-file-data "text2.txt" "Hello"))
  ; 3.Copy content of one file to another
  ;(basicfile/copy-to-file "text.txt" "text2.txt")

  ;3.1.Copy File Content with some mod
   (basicfile/advanced-copy "text2.txt" "text3.txt" true)

  ; 4.Uses Reader and writer functions to read a binary file and write to file (Image Downloader) 
  ;(basicfile/image-downloader "https://mma.prnewswire.com/media/742257/Tata_Elxsi_Logo.jpg?w=200" "elxsi.jpg")
  
  ; 5.Delete a File 
  ;(println (basicfile/delete-any-file "text.txt"))
  
  ;JSON File Operations (Done using JSON data in data.json )
  ;---------------------------
  
  ; 1.Get a specific type of quiz
  ;(jsonhandler/get-quiz-set "sport" "data.json")
  
  ; 2.Create a quiz of specific type and append it to existing quiz set
  ;(jsonhandler/add-quiz-set "computer" "data.json" {"q1" {"question" "Who owns Windows OS?" "options" ["Microsoft" "Google" "Apple"] "answer" "Microsoft"}})  
  
  ; 3.Test error handling macro 
  ;(jsonhandler/read-json "data.json")

  ;4.Custom Exceptions
  ;(jsonhandler/read-quiz-data)
  
 ;parse xml to edn/json   
 ;jsonschema.org
  )