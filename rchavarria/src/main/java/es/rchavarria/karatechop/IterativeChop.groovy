package es.rchavarria.karatechop

class IterativeChop {

    public chop(def target, def values){
        if(!values){
            return -1
        }
        
        target == values[0] ? 0 : -1 
    }
}
