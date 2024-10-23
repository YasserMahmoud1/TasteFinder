package com.example.TasteFinder.nearBy

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.TasteFinder.R
import com.example.TasteFinder.data.Restaurant
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class NearbyFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val view = inflater.inflate(R.layout.fragment_nearby, container, false)
//
////        private val LOCATION_PERMISSION_REQUEST_CODE = 1
////        val restaurants = mutableListOf()
//        val nearByRecyclerView =view.findViewById<RecyclerView>(R.id.nearByRecyclerView)
//            nearByRecyclerView.layoutManager = LinearLayoutManager(requireContext())
////            nearByRecyclerView.adapter = NearByAdapter(restaurants)
//////        Firebase
////            db = Firebase.firestore
////
////            db.collection("Restaurants").get().addOnSuccessListener { result ->
////                for(document in result){
////                    val resurant = document.toObject(Restaurant::class.java)
////
////                }
////            }
//
////            if (!isLocationPermissionGranted()) {
////
////                requestLocationPermission()
////            }
////
////            val restaurants = listOf(
////                Restaurant("Afandina","https://www.google.com/maps/place/%D8%A7%D8%B3%D9%85%D8%A7%D9%83+%D8%A7%D9%81%D9%86%D8%AF%D9%8A%D9%86%D8%A7%E2%80%AD/@29.3158752,30.8475191,17z/data=!4m9!1m2!2m1!1sPharmacies!3m5!1s0x1459794a247c8fd9:0x2ba68d3730445a28!8m2!3d29.3148712!4d30.8521208!16s%2Fg%2F11gbkrmwgx?entry=ttu&g_ep=EgoyMDI0MTAxNi4wIKXMDSoASAFQAw%3D%3D","",""),
////                Restaurant("Afandina","https://www.google.com/maps/place/%D8%A7%D8%B3%D9%85%D8%A7%D9%83+%D8%A7%D9%81%D9%86%D8%AF%D9%8A%D9%86%D8%A7%E2%80%AD/@29.3158752,30.8475191,17z/data=!4m9!1m2!2m1!1sPharmacies!3m5!1s0x1459794a247c8fd9:0x2ba68d3730445a28!8m2!3d29.3148712!4d30.8521208!16s%2Fg%2F11gbkrmwgx?entry=ttu&g_ep=EgoyMDI0MTAxNi4wIKXMDSoASAFQAw%3D%3D","",""),
////                Restaurant("Afandina","https://www.google.com/maps/place/%D8%A7%D8%B3%D9%85%D8%A7%D9%83+%D8%A7%D9%81%D9%86%D8%AF%D9%8A%D9%86%D8%A7%E2%80%AD/@29.3158752,30.8475191,17z/data=!4m9!1m2!2m1!1sPharmacies!3m5!1s0x1459794a247c8fd9:0x2ba68d3730445a28!8m2!3d29.3148712!4d30.8521208!16s%2Fg%2F11gbkrmwgx?entry=ttu&g_ep=EgoyMDI0MTAxNi4wIKXMDSoASAFQAw%3D%3D","",""),
////                Restaurant("Afandina","https://www.google.com/maps/place/%D8%A7%D8%B3%D9%85%D8%A7%D9%83+%D8%A7%D9%81%D9%86%D8%AF%D9%8A%D9%86%D8%A7%E2%80%AD/@29.3158752,30.8475191,17z/data=!4m9!1m2!2m1!1sPharmacies!3m5!1s0x1459794a247c8fd9:0x2ba68d3730445a28!8m2!3d29.3148712!4d30.8521208!16s%2Fg%2F11gbkrmwgx?entry=ttu&g_ep=EgoyMDI0MTAxNi4wIKXMDSoASAFQAw%3D%3D","",""),
////                Restaurant("Afandina","https://www.google.com/maps/place/%D8%A7%D8%B3%D9%85%D8%A7%D9%83+%D8%A7%D9%81%D9%86%D8%AF%D9%8A%D9%86%D8%A7%E2%80%AD/@29.3158752,30.8475191,17z/data=!4m9!1m2!2m1!1sPharmacies!3m5!1s0x1459794a247c8fd9:0x2ba68d3730445a28!8m2!3d29.3148712!4d30.8521208!16s%2Fg%2F11gbkrmwgx?entry=ttu&g_ep=EgoyMDI0MTAxNi4wIKXMDSoASAFQAw%3D%3D","",""),
////            )
//
//
//
//
//        private fun isLocationPermissionGranted(): Boolean {
//            return ContextCompat.checkSelfPermission(
//                requireContext(),
//                Manifest.permission.ACCESS_FINE_LOCATION
//            ) == PackageManager.PERMISSION_GRANTED
//        }
//
//        private fun requestLocationPermission() {
//            ActivityCompat.requestPermissions(
//                requireContext(),
//                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
////                LOCATION_PERMISSION_REQUEST_CODE
//            )
//        }
//

        return view
    }

}