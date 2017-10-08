(ns client.events
  (:require [re-frame.core :as re-frame]
            [client.db :as db]
            [day8.re-frame.http-fx]))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))

(re-frame/reg-event-db
 :username
 (fn [db [_ new-username]]
   (assoc db :username new-username)))
