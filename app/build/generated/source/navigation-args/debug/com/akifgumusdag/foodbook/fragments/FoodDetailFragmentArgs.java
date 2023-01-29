package com.akifgumusdag.foodbook.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FoodDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private FoodDetailFragmentArgs() {
  }

  private FoodDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static FoodDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    FoodDetailFragmentArgs __result = new FoodDetailFragmentArgs();
    bundle.setClassLoader(FoodDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("foodId")) {
      int foodId;
      foodId = bundle.getInt("foodId");
      __result.arguments.put("foodId", foodId);
    } else {
      throw new IllegalArgumentException("Required argument \"foodId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getFoodId() {
    return (int) arguments.get("foodId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("foodId")) {
      int foodId = (int) arguments.get("foodId");
      __result.putInt("foodId", foodId);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    FoodDetailFragmentArgs that = (FoodDetailFragmentArgs) object;
    if (arguments.containsKey("foodId") != that.arguments.containsKey("foodId")) {
      return false;
    }
    if (getFoodId() != that.getFoodId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getFoodId();
    return result;
  }

  @Override
  public String toString() {
    return "FoodDetailFragmentArgs{"
        + "foodId=" + getFoodId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(FoodDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(int foodId) {
      this.arguments.put("foodId", foodId);
    }

    @NonNull
    public FoodDetailFragmentArgs build() {
      FoodDetailFragmentArgs result = new FoodDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setFoodId(int foodId) {
      this.arguments.put("foodId", foodId);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getFoodId() {
      return (int) arguments.get("foodId");
    }
  }
}
