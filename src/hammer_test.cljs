(ns hammer-test
  (:require cljsjs.hammer))

(.log js/console
      (str "Hammer.js: "
           (.-VERSION js/Hammer)))

