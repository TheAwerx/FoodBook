package com.akifgumusdag.foodbook.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.akifgumusdag.foodbook.R;

public class FoodDetailFragmentDirections {
  private FoodDetailFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionFoodDetailFragmentToFoodListFragment() {
    return new ActionOnlyNavDirections(R.id.action_foodDetailFragment_to_foodListFragment);
  }
}
