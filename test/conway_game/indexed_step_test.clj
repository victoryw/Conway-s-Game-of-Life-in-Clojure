(ns conway-game.indexed-step-test
  (:require   [clojure.test :refer :all]
              [conway-game.empty-board :refer :all]
              [conway-game.neighbours :refer :all]
              [conway-game.count-neighbours :refer :all]
              [conway-game.populate :refer :all]
              [conway-game.indexed-step :refer :all]))

(deftest index-step-test
  (testing "should get the next state of the board")
    (def glider  (populate (empty-board 1 6) #{[0 1] [0 2] [0 3]}))
    (-> (iterate indexed-step glider) (nth 1) (#(def a %)))
    (is (= :on (get-in a [0 2]))))
