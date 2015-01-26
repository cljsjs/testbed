(ns react-test
  (:require cljsjs.react))

(.log js/console
      (str "React.js: "
           (.-version js/React)))

