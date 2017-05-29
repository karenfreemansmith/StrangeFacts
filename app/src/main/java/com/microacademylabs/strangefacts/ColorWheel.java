package com.microacademylabs.strangefacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Karen Freeman-Smith on 5/28/2017.
 */

public class ColorWheel {
  protected String[] mColors = {
      "#546e7a",
      "#757575",
      "#6d4c41",
      "#bf360c",
      "#e65100",
      "#ff6f00",
      "#f57f17",
      "#827717",
      "#33691e",
      "#1b5e20",
      "#004d40",
      "#006064",
      "#01579b",
      "#0d47a1",
      "#1a237e",
      "#311b92",
      "#4a148c",
      "#880e4f",
      "#b71c1c",
      "#90a4ae",
      "#bdbdbd",
      "#a1887f",
      "#ff5722",
      "#ff9800",
      "#ffc107",
      "#ffeb3b",
      "#cddc39",
      "#8bc34a",
      "#4caf50",
      "#009688",
      "#00bcd4",
      "#03a9f4",
      "#2196f3",
      "#3f51b5",
      "#673ab7",
      "#9c27b0",
      "#e91e63",
      "#f44336",
      "#263238",
      "#212121",
      "#3e2723",
      "#dd2c00",
      "#ff6d00",
      "#ffab00",
      "#ffd600",
      "#aeea00",
      "#64dd17",
      "#00c853",
      "#00bfa5",
      "#00b8d4",
      "#0091ea",
      "#2962ff",
      "#304ffe",
      "#6200ea",
      "#aa00ff",
      "#c51162",
      "#d50000"};

  public int getColor() {
    String color;
    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(mColors.length);
    color = mColors[randomNumber];
    int colorAsInt = Color.parseColor(color);
    return colorAsInt;
  }
}
