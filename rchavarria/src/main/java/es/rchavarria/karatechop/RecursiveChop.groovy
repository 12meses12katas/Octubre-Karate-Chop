package es.rchavarria.karatechop

class RecursiveChop {

    public chop(def target, def values){
        if(!values){
            return -1
        }
        
        chopNotEmptyArray(target, values, 0, values.size() - 1)
    }
    
    private chopNotEmptyArray(def target, def values, def left, def right) {
        if(target == values[left]){
            return left
        } 
        target == values[right] ? right : -1
    }
}
