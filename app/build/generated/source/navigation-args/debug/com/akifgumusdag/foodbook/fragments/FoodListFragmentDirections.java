package com.akifgumusdag.foodbook.fragments;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.akifgumusdag.foodbook.R;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class FoodListFragmentDirections {
  private FoodListFragmentDirections() {
  }

  @NonNull
  public static ActionFoodListFragmentToFoodDetailFragment actionFoodListFragmentToFoodDetailFragment(
      int foodId) {
    return new ActionFoodListFragmentToFoodDetailFragment(foodId);
  }

  public static class ActionFoodListFragmentToFoodDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionFoodListFragmentToFoodDetailFragment(int foodId) {
      this.arguments.put("foodId", foodId);
    }

    @NonNull
    public ActionFoodListFragmentToFoodDetailFragment setFoodId(int foodId) {
      this.arguments.put("foodId", foodId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("foodId")) {
        int foodId = (int) arguments.get("foodId");
        __result.putInt("foodId", foodId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_foodListFragment_to_foodDetailFragment;
    }

    @SuppressWarnings("unchecked")
    public int getFoodId() {
      return (int) arguments.get("foodId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionFoodListFragmentToFoodDetailFragment that = (ActionFoodListFragmentToFoodDetailFragment) object;
      if (arguments.containsKey("foodId") != that.arguments.containsKey("foodId")) {
        return false;
      }
      if (getFoodId() != that.getFoodId()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + getFoodId();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionFoodListFragmentToFoodDetailFragment(actionId=" + getActionId() + "){"
          + "foodId=" + getFoodId()
          + "}";
    }
  }
}
