(ns client.views
  (:require [re-frame.core :as re-frame]
            [re-com.core :as re-com]))

(defn title []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      [re-com/title
       :label (str "Hello from " @name)
       :level :level1])))

(defn login []
  (let [username (re-frame/subscribe [:username])]
    (fn []
      [re-com/input-text
       :model username
       :on-change #(re-frame/dispatch [:username %])
       :placeholder "Username"]
      )))

(defn main-panel []
  (fn []
    [re-com/v-box
     :height "100%"
     :children [[title]
                [login]]]))
