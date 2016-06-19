(ns conway-game.indexed-step
  (:require [conway-game.count-neighbours :refer :all]))

  (defn indexed-step
    [board]
    (let [w (count board)
          h (count (first board))]
        (reduce
            (fn [new-board x]
              (reduce
                  (fn [new-board y]
                    (let [new-liveness
                            (case (count-neighbours board [x y])
                              2 (get-in board [x y])
                              3 :on
                              nil)]
                     (assoc-in new-board [x y] new-liveness)))
                new-board (range h)))
         board (range w))))
