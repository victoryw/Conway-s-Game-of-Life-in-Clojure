(ns conway-game.neighbours-test
  (:require [clojure.test :refer :all]
            [conway-game.neighbours :refer :all]))

(deftest all-neighbours-test
  (testing "should get 8 six neighbours when i sit in the center"
    (def myNeighbours (neighbours [3 3]))
    (is (= (count myNeighbours) 8))
    (is (= myNeighbours '([2 2] [2 3] [2 4] [3 2] [3 4] [4 2] [4 3] [4 4]))))) 
