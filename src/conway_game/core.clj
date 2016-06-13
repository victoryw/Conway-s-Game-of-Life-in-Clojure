(ns conway-game.core
  (:gen-class)
  (:require [conway-game.empty-board :refer :all]
            [conway-game.neighbours :refer :all]
            [conway-game.count-neighbours :refer :all]
            [conway-game.populate :refer :all]
            [conway-game.indexed-step :refer :all]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def glider (populate (empty-board 6 6) #{[2 0] [2 1] [2 2] [1 2] [0 1]}))
  (println glider)
  (-> (iterate indexed-step glider) (nth 8) println)
  (println "Hello, World!"))
