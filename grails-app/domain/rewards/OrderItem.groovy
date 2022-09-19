package rewards

class OrderItem {
    Integer quantity;
    Float total;
    static  belongsTo = [order:OrderOnline, prodict:Product]

    static constraints = {
    }
}
