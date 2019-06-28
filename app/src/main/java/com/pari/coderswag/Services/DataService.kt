package com.pari.coderswag.Services

import com.pari.coderswag.Model.Category
import com.pari.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
                Category("SHIRTS","shirtimage"),
    Category("HOODIES","hoodieimage"),
    Category("HATS","hatimage"),
    Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")

    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","hat1","$18"),
        Product("Devslopes Hat Black","hat2","$20"),
        Product("Devslopes Hat White","hat3","$18"),
        Product("Devslopes Hat Snapback","hat4","$22")

        )
    val hoodies = listOf(
        Product("Devlopes Hoodie Grey","hoodie1","$28"),
        Product("Devlopes Hoodie Red","hoodie2","$32"),
        Product("Devlopes Grey Hoodie","hoodie3","$28"),
        Product("Devlopes black Hoodie","hoodie4","$32")
        )
    val shirts = listOf(
        Product("Devlopes shirt Grey","shirt1","$18"),
        Product("Devlopes light Grey","shirt2","$20"),
        Product("Devlopes Logo shirt","shirt3","$22"),
        Product("Devlopes Hustle","shirt4","$18"),
        Product("kickflip Studios","shirt5","$20")
        )
    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods

        }

    }
}