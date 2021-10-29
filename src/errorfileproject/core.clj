(ns errorfileproject.core
(:require [clojure.java.io :as io]
          [errorfileproject.jsonhandler :as jsonhandler]
)(:gen-class))

 (defn read-text-file
 ;Read a text file and output it to console using slurp
 [filename]
 ;Check if file exists for reading file else show a message stating file not found
  (if (.exists (io/as-file filename))
  (slurp filename) 
  "Ooops Such a File doesnt exist"
 )) 

 (defn save-to-text-file
 ;save data to file, where
 ; :filename is name of file
 ; :data is data to be added
 ; :append flag can be used to append data to existing data in file
 [filename data append]
 (if (.exists (io/as-file filename))
  (do (spit filename data :append append) "File Deleted Successfully")
  (do "Ooops Such a File doesnt exist")
 ))

(defn copy-to-file
;copy data from one text file to another text file
[target-file dest-file]
(io/copy (io/file target-file) (io/file dest-file))
)

(defn image-downloader
;download image from provided URI
[uri file-name]
(with-open [in (io/input-stream uri)
            out (io/output-stream file-name)]
    (io/copy in out))   
)

(defn delete-any-file 
;Delete any File
[file-name]
(if (.exists (io/as-file file-name))
 (do (io/delete-file file-name) "File Deleted Successfully")
 (do "Ooops File doesn't exist")
))

(defn -main
  [& args]
  ;(println (read-text-file "text.txt"))
  ;(println (save-to-text-file "text.txt" "Hello\nAgain\nMore Data" false))
  ;(println (read-text-file "text.txt"))
  ;(copy-to-file "text.txt" "text2.txt")
  ;(image-downloader "https://mma.prnewswire.com/media/742257/Tata_Elxsi_Logo.jpg?w=200" "elxsi.jpg")
  ;(println (delete-any-file "text1.txt"))
   (println ((jsonhandler/read-json "data.json"):quiz))
)