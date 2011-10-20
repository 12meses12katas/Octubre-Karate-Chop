package es.rchavarria.karatechop


class ConcurrentChop {

    public chop(def target, def values){
        if(!values){
            return -1
        }
        
        new ConcurrentMatcher(target:target, left:0, right:values.size() - 1, values:values).call()
    }
}
