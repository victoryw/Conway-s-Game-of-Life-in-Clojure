(ns conway-game.populate)
(defn populate
    "Turns :on each of the cell specified as [y,x] coordinates"
    [board living-cells]
    (reduce (fn [board coordinates]
              (assoc-in board coordinates :on))
              board
              living-cells))
