(ns jquery-test
  (:require cljsjs.jquery))

(.log js/console
      (str "jQuery.js: "
           (.-jquery (js/jQuery))))

