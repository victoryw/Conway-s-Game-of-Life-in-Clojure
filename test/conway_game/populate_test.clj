(ns conway-game.populate-test
  (:require [clojure.test :refer :all]
            [conway-game.empty-board :refer :all]
            [conway-game.populate :refer :all]))
(deftest populate-test
  (testing "should get cell [2 0] livings"
    (def glider (populate
                  (empty-board 6 6)
                  #{[2 0]}))
    (is (= (get-in glider [2 0]) :on)))
    (is (empty? (filter
                    #(= % :on)
                    (assoc
                        (vec (flatten glider))
                        12
                        nil))))
    )
