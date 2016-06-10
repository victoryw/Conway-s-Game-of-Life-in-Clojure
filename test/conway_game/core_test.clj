(ns conway-game.core-test
  (:require [clojure.test :refer :all]
            [conway-game.core :refer :all]))

(deftest a-test
  (testing "moke println."
    (let [result (atom nil)]
    (with-redefs-fn
      {#'println (fn [& more] (reset! result more))}
      (fn []
        (-main)
        (is (= (first @result) "Hello, World!")))))))
