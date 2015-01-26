(set-env!
 :source-paths    #{"src"}
 :resource-paths  #{"resources"}
 :dependencies '[[adzerk/boot-cljs      "0.0-2727-0" :scope "test"]
                 [cljsjs/moment "2.6.0-3"]
                 [cljsjs/hammer "2.0.4-2"]
                 [cljsjs/react "0.12.2-4"]
                 [cljsjs/jquery "1.8.2-2"]])

(require '[adzerk.boot-cljs :refer [cljs]])
