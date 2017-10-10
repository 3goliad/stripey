(set-env!
 :resource-paths #{"src"}
 :dependencies '[[adzerk/boot-cljs "2.1.4"]])

(require
 '[adzerk.boot-cljs :refer [cljs]])

(deftask build []
  (cljs :optimizations :none :compiler-options {:target :nodejs}))
