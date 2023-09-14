package fooddelsys.apis;

import fooddelsys.data.CuisineType;
import fooddelsys.data.FoodItem;
import fooddelsys.data.MealType;
import fooddelsys.data.StarRating;

import java.util.List;

public class FoodItemSearcherAPI {

    public List<FoodItem> searchFoodItems(String foodItemName, MealType mealType, List<CuisineType> cuisines,
                                          StarRating rating) {

        return null;
    }

}


//Searcher: Generic - Should use Open close principle
//The query: 
// Get only those food items whose (name matches foodItemName) AND  (MT matches mealType) AND  (cT matches cuisines) AND  (r > rating)
//FETCH : (name matches foodItemName)
//FILTER :  F1 F2 F3
