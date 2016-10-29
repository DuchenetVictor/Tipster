package com.tipster.tipster.Json;

import android.util.Log;

import com.tipster.tipster.Pojo.Rate;
import com.tipster.tipster.Pojo.Tip;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David_tepoche on 29/10/2016.
 */

public class JsonReader {


    public List<Tip> GetTipFromString(String param) {

        List<Tip> Tips = null;

        try {
            JSONObject jsonObj = new JSONObject(param);
            Tips = new ArrayList<>();

            // Getting JSON Array node
            JSONArray jsontip = jsonObj.getJSONArray("Tip");

            // looping through All Contacts
            for (int i = 0; i < jsontip.length(); i++) {

                JSONObject t = jsontip.getJSONObject(i);
                int ID = t.getInt("-ID");

                String title = t.getString("title");
                String author = t.getString("author");
                String date = t.getString("date");

                //on descend dans le noeud rate
                JSONObject r = t.getJSONObject("rate");
                int good = r.getInt("good");
                int bad = r.getInt("bad");

                String message = t.getString("message");
                Rate rate = new Rate(good, bad);

                Tip tip = new Tip(ID, title, author, date, rate, message);

                Tips.add(tip);
            }
        } catch (JSONException e) {
            Log.e("Json/JsonReader", "erreur dans le parsing" + e.getMessage());
        }
        return Tips;
    }
}
