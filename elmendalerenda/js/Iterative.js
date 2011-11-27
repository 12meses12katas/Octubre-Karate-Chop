function Iterative() {

    this.notFound = -1;

    this.chop = function(value, collection) {
        var found = this.notFound;
        var list = SortedCollection;
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
}

var SortedCollection = {

    _collection: null,
    _first: null,
    _last: null,

    set: function(col) {
        this._collection = col;
        this._first = 0;
        this._last = this._collection.length;
    },

    get: function(index) {
        return this._collection[index];
    },

    chopLeft: function(end) {
        this._last = end;
    },

    chopRight: function(start) {
        this._first = start;
    },

    midPosition: function() {
        return Math.floor((this._first + this._last) / 2);
    },

    isEmpty: function() {
        return (this.size() <= 0);
    },

    size: function() {
        return (this._last - this._first);
    }
}