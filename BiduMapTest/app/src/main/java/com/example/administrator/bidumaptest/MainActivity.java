package com.example.administrator.bidumaptest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.OverlayOptions;
import com.baidu.mapapi.map.Polyline;
import com.baidu.mapapi.map.PolylineOptions;
import com.baidu.mapapi.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MapView mapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapView = (MapView) findViewById(R.id.map);
        BaiduMap baiduMap = mapView.getMap();
        baiduMap.setMapType(BaiduMap.MAP_TYPE_NORMAL);

        List<LatLng> points = new ArrayList<LatLng>();
        points.add(new LatLng(39.965,116.404));
        points.add(new LatLng(39.925,116.454));
        points.add(new LatLng(39.955,116.494));
        points.add(new LatLng(39.905,116.554));
        points.add(new LatLng(39.965,116.604));

//构建分段颜色索引数组
        List<Integer> colors = new ArrayList<>();
        colors.add(Integer.valueOf(Color.BLUE));

        OverlayOptions ooPolyline = new PolylineOptions().width(10)
                .colorsValues(colors).points(points);
        //添加在地图中
        Polyline  mPolyline = (Polyline) baiduMap.addOverlay(ooPolyline);

    }
}
