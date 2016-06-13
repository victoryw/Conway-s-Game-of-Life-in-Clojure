(ns conway-game.indexed-step
  (:require [conway-game.count-neighbours :refer :all]))

  (defn indexed-step
    ""
    [board]
    (let [w (count board)
          h (count (first board))]
          (loop [new-board board x 0 y 0]
              (cond
                (>= x w) new-board
                (>= y h) (recur new-board (inc x) 0)
                :else
                  (let [new-liveness
                          (case (count-neighbours board [x y])
                                2 (get-in board [x y])
                                3 :on
                                nil )]
                    (recur (assoc-in new-board [x y] new-liveness) x (inc y)))))))
