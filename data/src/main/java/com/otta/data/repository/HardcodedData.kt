package com.otta.data.repository

import com.otta.common.domain.model.Media
import com.otta.common.domain.model.Sneaker

object HardcodedData {

    val sneakerNames = listOf<String>(
        "Nike Air",
        "Vans Mens Old Skool Sneaker",
        "Adidas Men's Game court 2 M Tennis Shoes",
        "Puma Unisex-Adult Rbd",
        "Nike Mens Court",
        "Nike x Sacai Cortez Cool Grey Sneakers",
        "New Balance 9060 'Quartz Grey'",
        "Nike Blazer Low '77 Jumbo",
        "Adidas Stan Smith Shoes"
    )

    val sneakerDetails = listOf<String>(
        "These shoes have sleek and stylish designs. The cushioned insole provides a comfortable fit for all-day wear.",
        "The supportive fit helps reduce fatigue and discomfort during physical activity.",
        "Delivers a responsive feel for improved performance.It provides a comfortable and supportive fit that moulds to the shape of your foot.",
        "The lack of excess cushioning provides a better feeling for the ground and improved stability. Perfect for minimalistic training",
        "Ideal for casual use and light exercise. The ultra-responsive sole offers excellent support and traction.",
        "The supportive fit helps reduce fatigue and discomfort during physical activity.",
        "These shoes have sleek and stylish designs. The cushioned insole provides a comfortable fit for all-day wear.",
        "The lack of excess cushioning provides a better feeling for the ground and improved stability. Perfect for minimalistic training",
        "The supportive fit helps reduce fatigue and discomfort during physical activity."
    )

    fun generate100Sneakers(): List<Sneaker> {
        val list = mutableListOf<Sneaker>()
        var nameIndex = 0
        for (i in 20 until 150) {
            list.add(
                Sneaker(
                    brand = "Adidas",
                    colorway = "White",
                    gender = "Male",
                    id = i.toString(),
                    media = Media(
                        imageUrl = "https://dsadsadsad.co.fds.jf4n5435643.jpg",
                        smallImageUrl = "http://fsa.ci.sasa.jpg",
                        thumbUrl = "http://sasds.co/sdsjd.jpg"
                    ),
                    name = sneakerNames[nameIndex],
                    releaseDate = "2023",
                    retailPrice = i * 32,
                    shoe = sneakerDetails[nameIndex],
                    styleId = "3W24-54D65",
                    title = sneakerDetails[nameIndex],
                    year = 2023
                )
            )
            nameIndex += 1
            if( nameIndex == 8)
                nameIndex = 0
        }

        return list
    }

}