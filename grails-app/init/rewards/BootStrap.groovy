package rewards

class BootStrap {

    def init = { servletContext ->
        new Product(name:"Morning Blend", sku:"MB01", price: 14.95).save()
        new Product(name: "Dark", sku:"CB002", price: 95.8).save()
        new Product(name: "Decaff", sku:"AB003", price: 0.99).save()
    }
    def destroy = {
    }
}
