function Iterative() {

    this.notFound = -1;

    this.chop = function(value, collection) {
        var found = this.notFound;
        var first = 0;
        var last = collection.length - 1;
        var middle = -1;

        while (last >= first) {
            middle = Math.floor((first + last) / 2);
	    var elementFound = (collection[middle] == value);
            if (elementFound) {
                found = middle;
                break;
            }

            var inLeftSide = collection[middle] > value;
	    var inRightSide = collection[middle] < value;
	    
	    if (inLeftSide) {
                last = middle - 1;
            }
	    
	    if (inRightSide){
                first = middle + 1;
            }
        }
        return found;
    }
}