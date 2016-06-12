(ns conway-game.count-neighbours-test
  (:require [clojure.test :refer :all]
            [conway-game.empty-board :refer :all]
            [conway-game.count-neighbours :refer :all]
            [conway-game.populate :refer :all]))

(deftest count-neighbours-test
  (testing "count-neighbours when i sit in the center with no one living"
    (def glider (populate
                (empty-board 6 6)
                #{[0 0] [0 1] [0 2] [0 3] [0 4] [0 5]
                   [1 0] [1 1] [1 2] [1 3] [1 4] [1 5]
                   [2 0] [2 1] [2 2] [2 3] [2 4] [2 5]
                   [3 0] [3 1] [3 2] [3 3] [3 4] [3 5]}))
    (def counter (count-neighbours (empty-board 6 6) [2 2]))
    (is (= counter 0)))

  (testing "count-neighbours when i sit in the center with no all living"))
