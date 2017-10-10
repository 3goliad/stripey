(ns fn.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn ^:export handler [event context callback]
  ;; callback is (Error, Object) => ()
  (println "Hi from lambda!")
  (callback nil "Lambda good return"))
