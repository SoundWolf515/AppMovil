package com.group.t1_app

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var items: ArrayList<String>
    private lateinit var itemsAdapter: ArrayAdapter<String>
    private lateinit var listView: ListView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            addItem(it)
        }

        items = ArrayList()
        itemsAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = itemsAdapter

        setUpListViewListener()
    }

    private fun setUpListViewListener() {
        listView.setOnItemLongClickListener { adapterView, view, i, l ->
            val context = applicationContext
            Toast.makeText(context, "Item Removed", Toast.LENGTH_LONG).show()

            items.removeAt(i)
            itemsAdapter.notifyDataSetChanged()
            true
        }
    }

    private fun addItem(view: View) {
        val input = findViewById<EditText>(R.id.editTextText)
        val itemText = input.text.toString()

        if (itemText.isNotEmpty()) {
            itemsAdapter.add(itemText)
            input.text.clear()
        } else {
            Toast.makeText(applicationContext, "Please enter text...", Toast.LENGTH_LONG).show()
        }
    }
}
