package com.guyi.class25b_and_6

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.guyi.class25b_and_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PropertyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()

        setContentView(binding.root)

        initList()
    }

    private fun initList() {
        val data = mockProperties()

        adapter = PropertyAdapter(data)
        binding.lstProperties.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = this@MainActivity.adapter
        }
    }

    fun mockProperties(): List<Property> {
        val demoProperties = arrayOf(
            Property.Builder()
                .name("Downtown Loft")
                .address("456 City Center Rd, Metropolis")
                .price(350_000)
                .isNew(false)
                .image("img_property_1")
                .build(),
            Property.Builder()
                .name("Suburban Family Home")
                .address("789 Maple Ave, Pleasantville")
                .price(480_000)
                .isNew(true)
                .image("img_property_2")
                .build(),
            Property.Builder()
                .name("Modern Studio")
                .address("1010 Elm St, Uptown")
                .price(220_000)
                .isNew(true)
                .image("img_property_3")
                .build(),
            Property.Builder()
                .name("Country Cottage")
                .address("55 Greenfield Ln, Woodland Hills")
                .price(310_000)
                .isNew(true)
                .image("img_property_4")
                .build(),
            Property.Builder()
                .name("Beachfront Villa")
                .address("12 Ocean Breeze Blvd, Seaside")
                .price(1_200_000)
                .isNew(true)
                .image("img_property_5")
                .build(),
            Property.Builder()
                .name("Urban Penthouse")
                .address("34 Skyview Terrace, Metro City")
                .price(950_000)
                .isNew(true)
                .image("img_property_6")
                .build(),
            Property.Builder()
                .name("Mountain Cabin")
                .address("88 Pinecrest Rd, Highland Springs")
                .price(425_000)
                .isNew(true)
                .image("img_property_7")
                .build(),
            Property.Builder()
                .name("Lake House")
                .address("22 Serenity Shores Dr, Lakeview")
                .price(780_000)
                .isNew(true)
                .image("img_property_8")
                .build(),
            Property.Builder()
                .name("aaaaa")
                .address("22 Serenity Shores Dr, Lakeview")
                .price(780_000)
                .isNew(true)
                .image("img_property_8")
                .build(),
            Property.Builder()
                .name("bbbbb")
                .address("22 Serenity Shores Dr, Lakeview")
                .price(780_000)
                .isNew(true)
                .image("img_property_8")
                .build()
        )

        return demoProperties.toList()
    }
}