
karateChop.simpleChop = function(item, list){
    var positionForItem = 0;
    while (list.length > 0){
        if (list.isItemInMiddlePositionEqual(item)){
            return positionForItem + list.getMiddlePosition();
        } else if (list.isItemInMiddlePositionGreaterThan(item)){
            list = list.getLeftSlice();
        } else {
            positionForItem += list.getMiddlePosition() + 1;
            list = list.getRightSlice();
        }
    }
    return -1;
}

Array.prototype.getMiddlePosition = function(){
    return Math.floor(this.length / 2);
}
Array.prototype.isItemInMiddlePositionEqual = function(item){
    return (this[this.getMiddlePosition()] == item);
}
Array.prototype.isItemInMiddlePositionGreaterThan = function(item){
    return (this[this.getMiddlePosition()] > item);
}
Array.prototype.getLeftSlice = function(){
    return this.slice(0, this.getMiddlePosition());
}
Array.prototype.getRightSlice = function(){
    return this.slice(this.getMiddlePosition() + 1);
}