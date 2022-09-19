package rewards

class InventoryController {

    def index() {
        render "Here is list of all"
    }
    def edit(){
        def productName = "Breakfast Blend"
        def sku = "DD01"
        [product:productName, sku:sku]
    }
    def remove() {
        render "YOU have one fewer"
    }

    def list() {
        def allProducts = Product.list();
        [allProducts: allProducts]

    }
}
