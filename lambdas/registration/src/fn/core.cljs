(ns fn.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn ^:export mong [& args]
  (println (+ 2 2)))
