(ns heroku-test.core
  (:use ring.util.response
        ring.adapter.jetty))

(defn app [req]
  (response "Hello World"))

(defn -main []
  
  (run-jetty app {:port 8080}))