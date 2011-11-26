function Iterative() {

    this.chop = function(value, collection) {
        if (collection.length == 0) return -1

        var found = -1;

        var first = 0;
        var last = collection.length - 1;
        var middle = Math.floor(last / 2);

        while (last >= first) {

            if (collection[middle] == value) {
                return middle;
                found = middle;
                break;
            }

            var inLeftSide = collection[middle] > value
            if (inLeftSide) {
                last = middle - 1;
            } else {
                var inRightSide = collection[middle] < value

                if (inRightSide) {
                    first = middle + 1;
                }
            }

            middle = Math.floor((first + last) / 2);

        }

        return found;
    }
}