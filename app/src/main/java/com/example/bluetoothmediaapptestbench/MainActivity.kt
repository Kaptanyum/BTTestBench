package com.example.bluetoothmediaapptestbench

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.bluetoothmediaapptestbench.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    //BT API Connection
    /*class BluetoothConnectionManager {
        private val bluetoothAdapter: BluetoothAdapter = BluetoothAdapter.getDefaultAdapter()

        fun startDiscovery() {
            if (bluetoothAdapter.isDiscovering) {
                bluetoothAdapter.cancelDiscovery()
            }
            bluetoothAdapter.startDiscovery()
        }

        fun getPairedDevices(): Set<BluetoothDevice> {
            return bluetoothAdapter.bondedDevices
        }

        fun connectToDevice(device: BluetoothDevice) {
            try {
                val socket = device.createRfcommSocketToServiceRecord(UUID.fromString("00001101-0000-1000-8000-00805F9B34FB"))
                socket.connect()
                // Do something with the connected socket
            } catch (e: IOException) {
                // Unable to connect to device
            }
        }
    }

    //Media Player
    class MediaPlayerManager {
        private var mediaPlayer: MediaPlayer? = null

        fun playMedia(context: Context, filePath: String) {
            mediaPlayer = MediaPlayer.create(context, Uri.parse(filePath))
            mediaPlayer?.start()
        }

        fun pauseMedia() {
            mediaPlayer?.pause()
        }

        fun stopMedia() {
            mediaPlayer?.stop()
            mediaPlayer?.release()
            mediaPlayer = null
        }
    }*/






}