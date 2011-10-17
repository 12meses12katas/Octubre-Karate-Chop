package es.rchavarria.karatechop

class IterativeChop {

    public chop(def target, def values){
        if(!values){
            return -1
        }
        
        def left = 0
        def right = values.size() - 1

        if(target == values[left]) 
            return left
        if(target == values[right])
            return right
        -1
    }
}
