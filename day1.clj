(defn big 
  "return true if string st is longer than n, else false"
  [st n]
  (if (> (.length st) n) true false))

(defn collection-type 
  "returns :list, :vector or :map depending on the type of col"
  [col]
  (cond
    (list? col) :list
    (vector? col) :vector
    (map? col) :map))
