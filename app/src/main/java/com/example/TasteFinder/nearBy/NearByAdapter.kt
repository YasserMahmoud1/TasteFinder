package com.example.TasteFinder.nearBy

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.TasteFinder.R
import com.example.TasteFinder.data.Restaurant
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.tasks.Task

class NearByAdapter(private val items: List<Restaurant>) : RecyclerView.Adapter<NearByAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val name = itemView.findViewById<TextView>(R.id.NearByName)
        val distance: TextView = itemView.findViewById<TextView>(R.id.NearByDistance)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.nearby_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = items[position].name
        calculateDistanceFromUrlToCurrentLocation(holder.itemView.context, items[position].location){distance -> holder.distance.text = distance.toString() + " m"}

    }

    private fun extractCoordinatesFromUrl(url: String): Pair<Double, Double>? {
        val regex = "@([-\\d.]+),([-\\d.]+)".toRegex()
        val matchResult = regex.find(url)

        return matchResult?.let {
            val (latitude, longitude) = it.destructured
            Log.d("latitude", latitude)
            Log.d("longitude", longitude)
            Pair(latitude.toDouble(), longitude.toDouble())
        }
    }

    private fun calculateDistance(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Float {
        val result = FloatArray(1)
        Location.distanceBetween(lat1, lon1, lat2, lon2, result)
        return result[0] // Distance in meters
    }
    private fun calculateDistanceFromUrlToCurrentLocation(context: Context, url: String, callback: (Float?) -> Unit) {
        val destinationCoordinates = extractCoordinatesFromUrl(url)

        if (destinationCoordinates == null) {
            callback(null)
            return
        }

        getCurrentLocation(context) { currentLocation ->
            if (currentLocation != null) {
                val distance = calculateDistance(
                    currentLocation.latitude,
                    currentLocation.longitude,
                    destinationCoordinates.first,
                    destinationCoordinates.second
                )
                callback(distance)
            } else {
                callback(null)
            }
        }

    }

    private fun getCurrentLocation(context: Context, callback: (Location?) -> Unit) {
        val fusedLocationClient: FusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context)

        if (
            ActivityCompat.checkSelfPermission(
                context,
                Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                context,
                Manifest.permission.ACCESS_COARSE_LOCATION)
            != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }else{
            fusedLocationClient.lastLocation.addOnCompleteListener { task: Task<Location> ->
                if (task.isSuccessful && task.result != null) {
                    callback(task.result)
                } else {
                    callback(null)
                }
            }
        }

    }

}