function Iterative() {

    this.notFound = -1;

    this.chop = function(value, collection) {
        var found = this.notFound;
        var list = new SortedCollection();
        list.set(collection);

        if (list.isEmpty()) return this.notFound;

        var middle = list.midPosition();

        while (!list.isEmpty()) {
            var inLeftSide = list.get(middle) > value;
            var inRightSide = list.get(middle) < value;

            if (inLeftSide) {
                list.chopLeft(middle - 1);
            }

            if (inRightSide) {
                list.chopRight(middle + 1);
            }

            middle = list.midPosition();
            var elementFound = (list.get(middle) == value);
            if (elementFound) {
                found = middle;
                break;
            }
        }
        return found;
    }
};

function Recursive() {

    this.notFound = -1;

    this.chop = function(value, collection) {
        var found = this.notFound;
        var list = new SortedCollection();
        list.set(collection);

        if (list.isEmpty()) return this.notFound;

        var middle = list.midPosition();

        var elementFound = (list.get(middle) == value);
        if (elementFound) {
            found = middle;
            return found;
        }


        var inLeftSide = list.get(middle) > value;

        if (inLeftSide) {
            var leftPart = collection.slice(0, middle);
            found = this.chop(value, leftPart);
        }

        var inRightSide = list.get(middle) < value;

        if (inRightSide) {
            var rightPart = collection.slice(middle + 1, collection.length);

            found = this.chop(value, rightPart);

            if (found > -1) found += middle + 1;

        }


        return found;
    }
};



function SortedCollection() {

    this._collection = null;
    this._first = null;
    this._last = null;

    this.set = function(col) {
        this._collection = col;
        this._first = 0;
        this._last = this._collection.length;
    };

    this.get = function(index) {
        return this._collection[index];
    };

    this.chopLeft = function(end) {
        this._last = end;
    };

    this.chopRight = function(start) {
        this._first = start;
    };

    this.midPosition = function() {
        return Math.floor((this._first + this._last) / 2);
    };

    this.isEmpty = function() {
        return (this.size() <= 0);
    };

    this.size = function() {
        return (this._last - this._first);
    };
}