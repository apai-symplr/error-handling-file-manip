## Error Handling and File Manipulation Tutorial in Clojure 

Demo Covering Error Handling and File Manipulations in Clojure

## Index

- [Usage](#profiles)
- [Files](#Files)
- [FeaturesCovered](#FeaturesCovered)
    
## Usage
1. Project is build using Leiningen Clojure project management tool,Installation instructions can be found [here](https://leiningen.org/)
2. Run the project by using `Lein run`

## Files
- `src/core.clj` core namespace calls main method to run methods in below namespaces
- `src/jsonhandler.clj` namespace covers methods for handling JSON data in a file
- `src/basicfilemethods.clj` namespace covers basic file i/o methods
- `data.json` is the sample json file used in this tutorial for parsing
- `text.txt` is a sample text file used for basic file operations 



## Features Covered
1. Cover Reading and Writing a File using slurp and spit operations.
2. Use clojure.java.io library to check whether the file exist before reading and writing into a file.
3. Go through every file operations methods in clojure.java.io 
4. Then move to JSON handling
5. Learn about filter, map, reduce for handling data collection
