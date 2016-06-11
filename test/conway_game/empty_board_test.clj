(ns conway-game.empty-board-test
  (:require [clojure.test :refer :all]
            [conway-game.empty-board :refer :all]))
(deftest emtpy-board-test
  (testing "should get empty borad"
    (def empty-board-instance (empty-board 6 6))
    (is (not (nil? empty-board-instance)))
    (is (= (count empty-board-instance) 6))
    (is (= (count (first empty-board-instance)) 6))
    ))
