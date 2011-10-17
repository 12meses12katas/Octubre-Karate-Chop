package es.rchavarria.karatechop

class IterativeChop {

    public chop(def target, def values){
        if(!values){
            return -1
        }
        
        def left = 0
        def right = values.size() - 1
        def middle = values.size() / 2 as Integer

        while(left != right){
            if(target < values[middle]){
                right = middle - 1
            } else {
                left = middle
            }
            middle += 1 + (right - left) / 2 as Integer
        }
        
        target == values[left] ? left : -1
    }
}
