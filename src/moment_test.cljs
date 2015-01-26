(ns moment-test
  (:require cljsjs.moment))

(.log js/console
      (str "Moment.js: "
           (.format (.endOf (js/moment) "day") "LLLL")))

