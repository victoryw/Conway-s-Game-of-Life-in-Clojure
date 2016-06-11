(ns conway-game.empty-board)
(defn empty-board
  "Create a rectangular empty board of the specified width and height."
  [w h]
  (vec (repeat w (vec (repeat h nil)))))
