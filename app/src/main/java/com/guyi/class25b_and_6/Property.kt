package com.guyi.class25b_and_6

class Property private constructor(
    val name: String?,
    val address: String?,
    val price: Long?,
    val isNew: Boolean,
    val image: String?
) {
    override fun toString(): String {
        return "Property(name=$name, address=$address, price=$price, isNew=$isNew, image=$image)"
    }



    // Builder nested class
    class Builder {
        private var name: String? = null
        private var address: String? = null
        private var price: Long? = null
        private var isNew: Boolean = false
        private var image: String? = null

        fun name(name: String) = apply { this.name = name }
        fun address(address: String) = apply { this.address = address }
        fun price(price: Long) = apply { this.price = price }
        fun isNew(isNew: Boolean) = apply { this.isNew = isNew }
        fun image(image: String) = apply { this.image = image }

        fun build(): Property {
            return Property(
                name = name,
                address = address,
                price = price,
                isNew = isNew,
                image = image
            )
        }
    }
}