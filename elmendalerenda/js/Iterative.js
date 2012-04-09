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
        }

        var inLeftSide = list.get(middle) > value;
        if (inLeftSide) {
            found = this.chop(value, list.leftArray());
        }

        var inRightSide = list.get(middle) < value;
        if (inRightSide) {
            found = this.chop(value, list.rightArray());
            if (found != this.notFound) found += middle + 1;
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
        return ((this._last - this._first) <= 0);
    };

    this.leftArray = function() {
        return this._collection.slice(0, this.midPosition());
    };

    this.rightArray = function() {
        return this._collection.slice(this.midPosition() + 1, this._last);
    };
}