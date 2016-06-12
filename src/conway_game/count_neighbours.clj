(ns conway-game.count-neighbours
  (:require [conway-game.neighbours :refer :all]))

(defn count-neighbours
  [board loc]
  (count (filter #(get-in board %) (neighbours loc))))
